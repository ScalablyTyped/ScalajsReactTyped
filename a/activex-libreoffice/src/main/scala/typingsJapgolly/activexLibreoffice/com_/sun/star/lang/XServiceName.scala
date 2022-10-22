package typingsJapgolly.activexLibreoffice.com_.sun.star.lang

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** identifies the object with a service name which can be used to create such an object by a factory. */
trait XServiceName
  extends StObject
     with XInterface {
  
  /**
    * @returns the service name that can be used to create such an object by a factory.
    * @see com.sun.star.io.XPersistObject.getServiceName
    */
  val ServiceName: String
  
  /**
    * @returns the service name that can be used to create such an object by a factory.
    * @see com.sun.star.io.XPersistObject.getServiceName
    */
  def getServiceName(): String
}
object XServiceName {
  
  inline def apply(
    ServiceName: String,
    acquire: Callback,
    getServiceName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XServiceName = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getServiceName = getServiceName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XServiceName]
  }
  
  extension [Self <: XServiceName](x: Self) {
    
    inline def setGetServiceName(value: CallbackTo[String]): Self = StObject.set(x, "getServiceName", value.toJsFn)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
  }
}
