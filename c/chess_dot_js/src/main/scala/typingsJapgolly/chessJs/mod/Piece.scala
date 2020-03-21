package typingsJapgolly.chessJs.mod

import typingsJapgolly.chessJs.chessJsStrings.b
import typingsJapgolly.chessJs.chessJsStrings.k
import typingsJapgolly.chessJs.chessJsStrings.n
import typingsJapgolly.chessJs.chessJsStrings.p
import typingsJapgolly.chessJs.chessJsStrings.q
import typingsJapgolly.chessJs.chessJsStrings.r
import typingsJapgolly.chessJs.chessJsStrings.w
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Piece extends js.Object {
  /**
    * The color of the piece
    * - "b" for Black
    * - "w" for White
    */
  var color: b | w
  /**
    * The type of the piece to place
    * - "p" for Pawn
    * - "n" for Knight
    * - "b" for Bishop
    * - "r" for Rook
    * - "q" for Queen
    * - "k" for King
    */
  var `type`: p | n | b | r | q | k
}

object Piece {
  @scala.inline
  def apply(color: b | w, `type`: p | n | b | r | q | k): Piece = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Piece]
  }
}

