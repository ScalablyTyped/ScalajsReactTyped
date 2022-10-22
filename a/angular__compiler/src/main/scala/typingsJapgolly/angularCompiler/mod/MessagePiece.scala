package typingsJapgolly.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompiler.mod.LiteralPiece
  - typingsJapgolly.angularCompiler.mod.PlaceholderPiece
*/
trait MessagePiece extends StObject
object MessagePiece {
  
  inline def LiteralPiece(sourceSpan: ParseSourceSpan, text: String): typingsJapgolly.angularCompiler.mod.LiteralPiece = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.LiteralPiece]
  }
  
  inline def PlaceholderPiece(sourceSpan: ParseSourceSpan, text: String): typingsJapgolly.angularCompiler.mod.PlaceholderPiece = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.PlaceholderPiece]
  }
}
