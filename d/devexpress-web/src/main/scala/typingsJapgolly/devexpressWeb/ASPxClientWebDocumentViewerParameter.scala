package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientWebDocumentViewerParameter extends StObject {
  
  def getParameterDescriptor(): ASPxDesignerElementParameterDescriptor
  
  var isMultiValue: Boolean
  
  var `type`: Any
  
  var value: Any
}
object ASPxClientWebDocumentViewerParameter {
  
  inline def apply(
    getParameterDescriptor: CallbackTo[ASPxDesignerElementParameterDescriptor],
    isMultiValue: Boolean,
    `type`: Any,
    value: Any
  ): ASPxClientWebDocumentViewerParameter = {
    val __obj = js.Dynamic.literal(getParameterDescriptor = getParameterDescriptor.toJsFn, isMultiValue = isMultiValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerParameter]
  }
  
  extension [Self <: ASPxClientWebDocumentViewerParameter](x: Self) {
    
    inline def setGetParameterDescriptor(value: CallbackTo[ASPxDesignerElementParameterDescriptor]): Self = StObject.set(x, "getParameterDescriptor", value.toJsFn)
    
    inline def setIsMultiValue(value: Boolean): Self = StObject.set(x, "isMultiValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
