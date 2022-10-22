package typingsJapgolly.chessboardjs.mod

import typingsJapgolly.chessboardjs.chessboardjsStrings.fen
import typingsJapgolly.chessboardjs.chessboardjsStrings.flip
import typingsJapgolly.chessboardjs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ChessBoard: ChessBoardFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ChessBoard").asInstanceOf[ChessBoardFactory]

type Callback = js.Function0[Unit]

type OrientationFlipType = flip

type PositionFenType = fen

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chessboardjs.chessboardjsStrings.start
  - java.lang.String
  - typingsJapgolly.chessboardjs.mod.BoardPositionType
*/
type PositionType = _PositionType | String
