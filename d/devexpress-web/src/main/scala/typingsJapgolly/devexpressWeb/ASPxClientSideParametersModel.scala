package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientSideParametersModel extends StObject {
  
  def serializeParameters(): Unit
  
  def submit(): Unit
  
  var tabInfo: ASPxClientDocumentPreviewTab
}
object ASPxClientSideParametersModel {
  
  inline def apply(serializeParameters: Callback, submit: Callback, tabInfo: ASPxClientDocumentPreviewTab): ASPxClientSideParametersModel = {
    val __obj = js.Dynamic.literal(serializeParameters = serializeParameters.toJsFn, submit = submit.toJsFn, tabInfo = tabInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSideParametersModel]
  }
  
  extension [Self <: ASPxClientSideParametersModel](x: Self) {
    
    inline def setSerializeParameters(value: Callback): Self = StObject.set(x, "serializeParameters", value.toJsFn)
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "submit", value.toJsFn)
    
    inline def setTabInfo(value: ASPxClientDocumentPreviewTab): Self = StObject.set(x, "tabInfo", value.asInstanceOf[js.Any])
  }
}
