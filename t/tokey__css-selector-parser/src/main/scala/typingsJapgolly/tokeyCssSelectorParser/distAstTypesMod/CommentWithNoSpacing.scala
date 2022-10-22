package typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod

import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentWithNoSpacing
  extends StObject
     with Comment {
  
  @JSName("after")
  var after_CommentWithNoSpacing: _empty
  
  @JSName("before")
  var before_CommentWithNoSpacing: _empty
}
object CommentWithNoSpacing {
  
  inline def apply(end: Double, start: Double, value: String): CommentWithNoSpacing = {
    val __obj = js.Dynamic.literal(after = "", before = "", end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("comment")
    __obj.asInstanceOf[CommentWithNoSpacing]
  }
  
  extension [Self <: CommentWithNoSpacing](x: Self) {
    
    inline def setAfter(value: _empty): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: _empty): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
  }
}
