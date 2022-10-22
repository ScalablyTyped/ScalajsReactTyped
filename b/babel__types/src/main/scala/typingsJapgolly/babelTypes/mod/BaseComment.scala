package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseComment extends StObject {
  
  var end: Double
  
  var loc: SourceLocation
  
  var start: Double
  
  var `type`: typingsJapgolly.babelTypes.babelTypesStrings.CommentBlock | typingsJapgolly.babelTypes.babelTypesStrings.CommentLine
  
  var value: String
}
object BaseComment {
  
  inline def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.CommentBlock | typingsJapgolly.babelTypes.babelTypesStrings.CommentLine,
    value: String
  ): BaseComment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseComment]
  }
  
  extension [Self <: BaseComment](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: typingsJapgolly.babelTypes.babelTypesStrings.CommentBlock | typingsJapgolly.babelTypes.babelTypesStrings.CommentLine
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
