package typingsJapgolly.activexLibreoffice.com_.sun.star.deployment

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.ucb.XCommandEnvironment
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to bind an UNO package.
  * @since OOo 2.0
  */
trait XPackageRegistry extends StObject {
  
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  val SupportedPackageTypes: SafeArray[XPackageTypeInfo]
  
  /**
    * binds a package URL to a {@link XPackage} handle. The returned UNO package handle ought to late-initialize itself, thus the process of binding must
    * not be an expensive operation, because it is not abortable.
    *
    * Calling the function several time with the same parameters must result in returning the same object.
    *
    * The file or folder at the location where url points to may not exist or it was replaced. This can happen, for example, when a bundled extension was
    * removed by the setup and a user later starts OOo. Then the user data may still contain all registration data of that extension, but the actual
    * extension files do not exist anymore. The registration data must then be cleaned of all the remains of that extension. To do that one creates an
    * {@link XPackage} object on behalf of that extension and calls XPackage::revokePakage(). The parameter `removed` indicates this case. The returned
    * object may not rely on the file or folder to which refers `url` . Instead it must use previously saved data to successfully carry out the revocation
    * of this object ( {@link XPackage.revokePackage()} ).
    *
    * The implementation must ensure that there is only one instance of {@link XPackage} for the same `url` at any time. Therefore calling {@link
    * bindPackage()} again with the same `url` but different `mediaType` (the exception is, if previously an empty string was provided to cause the
    * determination of the media type) or `removed` parameters will cause an exception. An {@link com.sun.star.lang.IllegalArgumentException} will be thrown
    * in case of a different `mediaType` parameter and a {@link InvalidRemovedParameterException} is thrown if the `removed` parameter is different.
    *
    * The `identifier` parameter must be provided when `removed` = true. If not, then an {@link com.sun.star.lang.IllegalArgumentException} will be thrown.
    * @param url package URL, must be UCB conform
    * @param mediaType media type of package, empty string if to be detected
    * @param removed
    * @param identifier the identifier of the extension
    * @param xCmdEnv command environment for error and progress handling
    * @returns handle
    */
  def bindPackage(url: String, mediaType: String, removed: Boolean, identifier: String, xCmdEnv: XCommandEnvironment): XPackage
  
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  def getSupportedPackageTypes(): SafeArray[XPackageTypeInfo]
  
  def packageRemoved(url: String, mediaType: String): Unit
}
object XPackageRegistry {
  
  inline def apply(
    SupportedPackageTypes: SafeArray[XPackageTypeInfo],
    bindPackage: (String, String, Boolean, String, XCommandEnvironment) => XPackage,
    getSupportedPackageTypes: CallbackTo[SafeArray[XPackageTypeInfo]],
    packageRemoved: (String, String) => Callback
  ): XPackageRegistry = {
    val __obj = js.Dynamic.literal(SupportedPackageTypes = SupportedPackageTypes.asInstanceOf[js.Any], bindPackage = js.Any.fromFunction5(bindPackage), getSupportedPackageTypes = getSupportedPackageTypes.toJsFn, packageRemoved = js.Any.fromFunction2((t0: String, t1: String) => (packageRemoved(t0, t1)).runNow()))
    __obj.asInstanceOf[XPackageRegistry]
  }
  
  extension [Self <: XPackageRegistry](x: Self) {
    
    inline def setBindPackage(value: (String, String, Boolean, String, XCommandEnvironment) => XPackage): Self = StObject.set(x, "bindPackage", js.Any.fromFunction5(value))
    
    inline def setGetSupportedPackageTypes(value: CallbackTo[SafeArray[XPackageTypeInfo]]): Self = StObject.set(x, "getSupportedPackageTypes", value.toJsFn)
    
    inline def setPackageRemoved(value: (String, String) => Callback): Self = StObject.set(x, "packageRemoved", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSupportedPackageTypes(value: SafeArray[XPackageTypeInfo]): Self = StObject.set(x, "SupportedPackageTypes", value.asInstanceOf[js.Any])
  }
}
