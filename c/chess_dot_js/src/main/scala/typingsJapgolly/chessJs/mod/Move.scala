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

trait Move extends ShortMove {
  /**
    * If an enemy piece was captured this is their type.
    * - "p" for Pawn
    * - "n" for Knight
    * - "b" for Bishop
    * - "r" for Rook
    * - "q" for Queen
    */
  var captured: js.UndefOr[p | n | b | r | q] = js.undefined
  /**
    * The color of the piece that moved
    * - "b" for Black
    * - "w" for White
    */
  var color: b | w
  /** Flags indicating what occurred, combined into one string */
  var flags: String
  /**
    * The type of the piece that moved
    * - "p" for Pawn
    * - "n" for Knight
    * - "b" for Bishop
    * - "r" for Rook
    * - "q" for Queen
    * - "k" for King
    */
  var piece: p | n | b | r | q | k
  /** The Standard Algebraic Notation (SAN) representation of the move */
  var san: String
}

object Move {
  @scala.inline
  def apply(
    color: b | w,
    flags: String,
    from: Square,
    piece: p | n | b | r | q | k,
    san: String,
    to: Square,
    captured: p | n | b | r | q = null,
    promotion: n | b | r | q = null
  ): Move = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], piece = piece.asInstanceOf[js.Any], san = san.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (captured != null) __obj.updateDynamic("captured")(captured.asInstanceOf[js.Any])
    if (promotion != null) __obj.updateDynamic("promotion")(promotion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
}

