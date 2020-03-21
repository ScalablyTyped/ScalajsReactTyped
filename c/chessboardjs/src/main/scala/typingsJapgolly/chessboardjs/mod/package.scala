package typingsJapgolly.chessboardjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoardPositionType = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in chessboardjs.chessboardjs.Square ]:? chessboardjs.chessboardjs.Piece}
    */ typingsJapgolly.chessboardjs.chessboardjsStrings.BoardPositionType with js.Any
  type Callback = js.Function0[scala.Unit]
  type OrientationFlipType = typingsJapgolly.chessboardjs.chessboardjsStrings.flip
  type PositionFenType = typingsJapgolly.chessboardjs.chessboardjsStrings.fen
  type PositionType = typingsJapgolly.chessboardjs.chessboardjsStrings.start | java.lang.String | typingsJapgolly.chessboardjs.mod.BoardPositionType
}
