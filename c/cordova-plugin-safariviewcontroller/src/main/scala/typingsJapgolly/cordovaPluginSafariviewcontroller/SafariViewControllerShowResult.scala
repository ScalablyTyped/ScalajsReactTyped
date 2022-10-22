package typingsJapgolly.cordovaPluginSafariviewcontroller

import typingsJapgolly.cordovaPluginSafariviewcontroller.cordovaPluginSafariviewcontrollerStrings.closed
import typingsJapgolly.cordovaPluginSafariviewcontroller.cordovaPluginSafariviewcontrollerStrings.loaded
import typingsJapgolly.cordovaPluginSafariviewcontroller.cordovaPluginSafariviewcontrollerStrings.opened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a `SafariViewController.show()` call.
  */
trait SafariViewControllerShowResult extends StObject {
  
  /**
    * The event that describes what happened in the `SafariViewController`/custom tab view.
    * Only `'loaded'` and `'closed'` events will be dispatched on Android.
    */
  var event: opened | loaded | closed
}
object SafariViewControllerShowResult {
  
  inline def apply(event: opened | loaded | closed): SafariViewControllerShowResult = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariViewControllerShowResult]
  }
  
  extension [Self <: SafariViewControllerShowResult](x: Self) {
    
    inline def setEvent(value: opened | loaded | closed): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
