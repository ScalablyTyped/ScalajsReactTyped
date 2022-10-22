package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CDC
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_CDC: typingsJapgolly.cssTree.cssTreeStrings.CDC
}
object CDC {
  
  inline def apply(): CDC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CDC")
    __obj.asInstanceOf[CDC]
  }
  
  extension [Self <: CDC](x: Self) {
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.CDC): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
