package typingsJapgolly.activexLibreoffice.com_.sun.star.deployment

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.ucb.XCommandEnvironment
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link PackageRegistryBackend} service is used to bind a specific type of {@link XPackage} which can be registered or revoked.
  *
  * All {@link PackageRegistryBackend} objects are related to a {@link XPackageManager} instance.
  * @since OOo 2.0
  */
trait PackageRegistryBackend
  extends StObject
     with XPackageRegistry {
  
  /**
    * Creates a persistent registry.
    * @param context context of registry, e.g. user, shared
    * @param cacheDirectory cache directory that the registry has to use
    * @param readOnly reflects whether writing to cache directory is allowed
    */
  def createPersistent(context: String, cacheDirectory: String, readOnly: Boolean): Unit
  
  /**
    * Creates a transient registry.
    * @param context context of registry, e.g. user, shared
    */
  def createTransient(context: String): Unit
}
object PackageRegistryBackend {
  
  inline def apply(
    SupportedPackageTypes: SafeArray[XPackageTypeInfo],
    bindPackage: (String, String, Boolean, String, XCommandEnvironment) => XPackage,
    createPersistent: (String, String, Boolean) => Callback,
    createTransient: String => Callback,
    getSupportedPackageTypes: CallbackTo[SafeArray[XPackageTypeInfo]],
    packageRemoved: (String, String) => Callback
  ): PackageRegistryBackend = {
    val __obj = js.Dynamic.literal(SupportedPackageTypes = SupportedPackageTypes.asInstanceOf[js.Any], bindPackage = js.Any.fromFunction5(bindPackage), createPersistent = js.Any.fromFunction3((t0: String, t1: String, t2: Boolean) => (createPersistent(t0, t1, t2)).runNow()), createTransient = js.Any.fromFunction1((t0: String) => createTransient(t0).runNow()), getSupportedPackageTypes = getSupportedPackageTypes.toJsFn, packageRemoved = js.Any.fromFunction2((t0: String, t1: String) => (packageRemoved(t0, t1)).runNow()))
    __obj.asInstanceOf[PackageRegistryBackend]
  }
  
  extension [Self <: PackageRegistryBackend](x: Self) {
    
    inline def setCreatePersistent(value: (String, String, Boolean) => Callback): Self = StObject.set(x, "createPersistent", js.Any.fromFunction3((t0: String, t1: String, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setCreateTransient(value: String => Callback): Self = StObject.set(x, "createTransient", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
