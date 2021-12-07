# 2단계 - 지뢰 찾기(지뢰 개수)

## 기능 요구사항

> 지뢰 찾기를 변형한 프로그램을 구현한다.

* 높이와 너비, 지뢰 개수를 입력받을 수 있다.
* 지뢰는 눈에 잘 띄는 것으로 표기한다.
* 지뢰는 가급적 랜덤에 가깝게 배치한다.
* 각 사각형에 표시될 숫자는 자신을 제외한 주변 8개 사각형에 포함된 지뢰의 개수다.

## 클래스 설계

* [] 방향
    * [] 8방향을 나타내는 enum 타입
    * [] 현재 위치에서 8방향에 대한 좌표값을 계산해준다.

## 하드 코딩

```kotlin
// private fun getMineNumber(
//     row: Int,
//     column: Int,
//     width: Int,
//     height: Int,
//     board: MutableList<MutableList<Int>>
// ): Int {
//     var mineCnt = 0
//     if (isExistMine(row - 1, column - 1, width, height, board)) mineCnt++
//     if (isExistMine(row - 1, column, width, height, board)) mineCnt++
//     if (isExistMine(row - 1, column + 1, width, height, board)) mineCnt++
//     if (isExistMine(row, column - 1, width, height, board)) mineCnt++
//     if (isExistMine(row, column + 1, width, height, board)) mineCnt++
//     if (isExistMine(row + 1, column - 1, width, height, board)) mineCnt++
//     if (isExistMine(row + 1, column, width, height, board)) mineCnt++
//     if (isExistMine(row + 1, column + 1, width, height, board)) mineCnt++
//     return mineCnt
// }
//
// private fun isExistMine(
//     row: Int,
//     column: Int,
//     width: Int,
//     height: Int,
//     board: MutableList<MutableList<Int>>
// ): Boolean {
//     if (row < 0 || row >= width || column < 0 || column >= height) {
//         return false
//     }
//
//     return board[row][column] == -1
// }
```