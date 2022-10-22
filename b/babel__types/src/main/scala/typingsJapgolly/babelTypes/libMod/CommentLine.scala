package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentLine
  extends StObject
     with BaseComment
     with Comment {
  
  @JSName("type")
  var type_CommentLine: typingsJapgolly.babelTypes.babelTypesStrings.CommentLine
}
object CommentLine {
  
  inline def apply(value: String): CommentLine = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentLine")
    __obj.asInstanceOf[CommentLine]
  }
  
  extension [Self <: CommentLine](x: Self) {
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.CommentLine): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
