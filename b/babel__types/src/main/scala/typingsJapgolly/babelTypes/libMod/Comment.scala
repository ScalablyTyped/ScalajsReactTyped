package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.CommentBlock
  - typingsJapgolly.babelTypes.libMod.CommentLine
*/
trait Comment extends StObject
object Comment {
  
  inline def CommentBlock(value: String): typingsJapgolly.babelTypes.libMod.CommentBlock = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentBlock")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.CommentBlock]
  }
  
  inline def CommentLine(value: String): typingsJapgolly.babelTypes.libMod.CommentLine = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentLine")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.CommentLine]
  }
}
