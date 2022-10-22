package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XServiceInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XTypeProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides documentation for UNO services
  * @since LibreOffice 5.1
  */
trait XServiceDocumenter extends StObject {
  
  var CoreBaseUrl: String
  
  var ServiceBaseUrl: String
  
  def showCoreDocs(xService: XServiceInfo): Unit
  
  def showInterfaceDocs(xTypeProvider: XTypeProvider): Unit
  
  def showServiceDocs(xService: XServiceInfo): Unit
}
object XServiceDocumenter {
  
  inline def apply(
    CoreBaseUrl: String,
    ServiceBaseUrl: String,
    showCoreDocs: XServiceInfo => Callback,
    showInterfaceDocs: XTypeProvider => Callback,
    showServiceDocs: XServiceInfo => Callback
  ): XServiceDocumenter = {
    val __obj = js.Dynamic.literal(CoreBaseUrl = CoreBaseUrl.asInstanceOf[js.Any], ServiceBaseUrl = ServiceBaseUrl.asInstanceOf[js.Any], showCoreDocs = js.Any.fromFunction1((t0: XServiceInfo) => showCoreDocs(t0).runNow()), showInterfaceDocs = js.Any.fromFunction1((t0: XTypeProvider) => showInterfaceDocs(t0).runNow()), showServiceDocs = js.Any.fromFunction1((t0: XServiceInfo) => showServiceDocs(t0).runNow()))
    __obj.asInstanceOf[XServiceDocumenter]
  }
  
  extension [Self <: XServiceDocumenter](x: Self) {
    
    inline def setCoreBaseUrl(value: String): Self = StObject.set(x, "CoreBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setServiceBaseUrl(value: String): Self = StObject.set(x, "ServiceBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setShowCoreDocs(value: XServiceInfo => Callback): Self = StObject.set(x, "showCoreDocs", js.Any.fromFunction1((t0: XServiceInfo) => value(t0).runNow()))
    
    inline def setShowInterfaceDocs(value: XTypeProvider => Callback): Self = StObject.set(x, "showInterfaceDocs", js.Any.fromFunction1((t0: XTypeProvider) => value(t0).runNow()))
    
    inline def setShowServiceDocs(value: XServiceInfo => Callback): Self = StObject.set(x, "showServiceDocs", js.Any.fromFunction1((t0: XServiceInfo) => value(t0).runNow()))
  }
}
