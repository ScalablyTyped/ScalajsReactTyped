package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CDO
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_CDO: typingsJapgolly.cssTree.cssTreeStrings.CDO
}
object CDO {
  
  inline def apply(): CDO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CDO")
    __obj.asInstanceOf[CDO]
  }
  
  extension [Self <: CDO](x: Self) {
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.CDO): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
