package typingsJapgolly.winrtUwp.Windows.Services.Store

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Package
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides license info for a downloadable content (DLC) package for the current app. */
trait StorePackageLicense extends StObject {
  
  /** Gets the downloadable content (DLC) package that is associated with the license. */
  @JSName("package")
  var _package: Package
  
  /** Closes and releases any resources used by this StorePackageLicense. */
  def close(): Unit
  
  /** Gets a value that indicates whether the license is valid. */
  var isValid: Boolean
  
  /** Raised when user no longer has rights to the license on the current device (for example, the user has acquired the license on a different device). */
  def onlicenselost(ev: js.Object & WinRTEvent[StorePackageLicense]): Unit
  /** Raised when user no longer has rights to the license on the current device (for example, the user has acquired the license on a different device). */
  @JSName("onlicenselost")
  var onlicenselost_Original: TypedEventHandler[StorePackageLicense, js.Object]
  
  /** Releases the license for the downloadable content (DLC) package. */
  def releaseLicense(): Unit
}
object StorePackageLicense {
  
  inline def apply(
    _package: Package,
    close: Callback,
    isValid: Boolean,
    onlicenselost: /* ev */ js.Object & WinRTEvent[StorePackageLicense] => Callback,
    releaseLicense: Callback
  ): StorePackageLicense = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, isValid = isValid.asInstanceOf[js.Any], onlicenselost = js.Any.fromFunction1((t0: /* ev */ js.Object & WinRTEvent[StorePackageLicense]) => onlicenselost(t0).runNow()), releaseLicense = releaseLicense.toJsFn)
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePackageLicense]
  }
  
  extension [Self <: StorePackageLicense](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setOnlicenselost(value: /* ev */ js.Object & WinRTEvent[StorePackageLicense] => Callback): Self = StObject.set(x, "onlicenselost", js.Any.fromFunction1((t0: /* ev */ js.Object & WinRTEvent[StorePackageLicense]) => value(t0).runNow()))
    
    inline def setReleaseLicense(value: Callback): Self = StObject.set(x, "releaseLicense", value.toJsFn)
    
    inline def set_package(value: Package): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
