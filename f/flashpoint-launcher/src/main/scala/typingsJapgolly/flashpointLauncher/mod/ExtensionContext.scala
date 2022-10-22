package typingsJapgolly.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionContext extends StObject {
  
  /** Put all extension disposables on here with registerDisposable */
  var subscriptions: Disposable
}
object ExtensionContext {
  
  inline def apply(subscriptions: Disposable): ExtensionContext = {
    val __obj = js.Dynamic.literal(subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionContext]
  }
  
  extension [Self <: ExtensionContext](x: Self) {
    
    inline def setSubscriptions(value: Disposable): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
  }
}
