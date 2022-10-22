package typingsJapgolly.activexLibreoffice.com_.sun.star.lang

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information regarding the implementation: which services are implemented and the name of the implementation. */
trait XServiceInfo
  extends StObject
     with XInterface {
  
  /**
    * Provides the implementation name of the service implementation.
    * @returns unique name of the implementation
    */
  val ImplementationName: String
  
  /**
    * Provides the supported service names of the implementation, including also indirect service names.
    * @returns sequence of service names that are supported
    */
  val SupportedServiceNames: SafeArray[String]
  
  /**
    * Provides the implementation name of the service implementation.
    * @returns unique name of the implementation
    */
  def getImplementationName(): String
  
  /**
    * Provides the supported service names of the implementation, including also indirect service names.
    * @returns sequence of service names that are supported
    */
  def getSupportedServiceNames(): SafeArray[String]
  
  /**
    * Tests whether the specified service is supported, i.e. implemented by the implementation.
    * @param ServiceName name of service to be tested
    * @returns true, if service is supported, false otherwise
    */
  def supportsService(ServiceName: String): Boolean
}
object XServiceInfo {
  
  inline def apply(
    ImplementationName: String,
    SupportedServiceNames: SafeArray[String],
    acquire: Callback,
    getImplementationName: CallbackTo[String],
    getSupportedServiceNames: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback,
    supportsService: String => Boolean
  ): XServiceInfo = {
    val __obj = js.Dynamic.literal(ImplementationName = ImplementationName.asInstanceOf[js.Any], SupportedServiceNames = SupportedServiceNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, getImplementationName = getImplementationName.toJsFn, getSupportedServiceNames = getSupportedServiceNames.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, supportsService = js.Any.fromFunction1(supportsService))
    __obj.asInstanceOf[XServiceInfo]
  }
  
  extension [Self <: XServiceInfo](x: Self) {
    
    inline def setGetImplementationName(value: CallbackTo[String]): Self = StObject.set(x, "getImplementationName", value.toJsFn)
    
    inline def setGetSupportedServiceNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getSupportedServiceNames", value.toJsFn)
    
    inline def setImplementationName(value: String): Self = StObject.set(x, "ImplementationName", value.asInstanceOf[js.Any])
    
    inline def setSupportedServiceNames(value: SafeArray[String]): Self = StObject.set(x, "SupportedServiceNames", value.asInstanceOf[js.Any])
    
    inline def setSupportsService(value: String => Boolean): Self = StObject.set(x, "supportsService", js.Any.fromFunction1(value))
  }
}
