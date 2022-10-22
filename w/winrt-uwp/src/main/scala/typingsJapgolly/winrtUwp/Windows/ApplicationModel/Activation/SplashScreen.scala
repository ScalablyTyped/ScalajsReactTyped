package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.dismissed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a dismissal event and image location information for the app's splash screen. */
@js.native
trait SplashScreen extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dismissed(`type`: dismissed, listener: TypedEventHandler[SplashScreen, Any]): Unit = js.native
  
  /** The coordinates of the app's splash screen image relative to the window. */
  var imageLocation: Rect = js.native
  
  /** Fires when the app's splash screen is dismissed. */
  def ondismissed(ev: Any & WinRTEvent[SplashScreen]): Unit = js.native
  /** Fires when the app's splash screen is dismissed. */
  @JSName("ondismissed")
  var ondismissed_Original: TypedEventHandler[SplashScreen, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dismissed(`type`: dismissed, listener: TypedEventHandler[SplashScreen, Any]): Unit = js.native
}
