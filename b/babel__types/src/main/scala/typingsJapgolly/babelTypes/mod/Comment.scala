package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.CommentBlock
  - typingsJapgolly.babelTypes.mod.CommentLine
*/
trait Comment extends StObject
object Comment {
  
  inline def CommentBlock(end: Double, loc: SourceLocation, start: Double, value: String): typingsJapgolly.babelTypes.mod.CommentBlock = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentBlock")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.CommentBlock]
  }
  
  inline def CommentLine(end: Double, loc: SourceLocation, start: Double, value: String): typingsJapgolly.babelTypes.mod.CommentLine = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentLine")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.CommentLine]
  }
}
