package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeWindows.anon.Screen
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.change
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.screen
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimensions extends StObject {
  
  /**
    * Add an event listener for dimension changes
    *
    * @param type the type of event to listen to
    * @param handler the event handler
    */
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, handler: js.Function1[/* hasWindowScreen */ Screen, Unit]): EmitterSubscription
  
  /**
    * Initial dimensions are set before runApplication is called so they
    * should be available before any other require's are run, but may be
    * updated later.
    * Note: Although dimensions are available immediately, they may
    * change (e.g due to device rotation) so any rendering logic or
    * styles that depend on these constants should try to call this
    * function on every render, rather than caching the value (for
    * example, using inline styles rather than setting a value in a
    * StyleSheet).
    * Example: const {height, width} = Dimensions.get('window');
    @param dim Name of dimension as defined when calling set.
    @returns Value for the dimension.
    */
  def get(dim: window | screen): ScaledSize
  
  /**
    * Remove an event listener
    * @deprecated Use `remove` on the EventSubscription from `addEventListener`.
    *
    * @param type the type of event
    * @param handler the event handler
    */
  @JSName("removeEventListener")
  def removeEventListener_change(`type`: change, handler: js.Function1[/* hasWindowScreen */ Screen, Unit]): Unit
  
  /**
    * This should only be called from native code by sending the didUpdateDimensions event.
    * @param dims Simple string-keyed object of dimensions to set
    */
  def set(dims: StringDictionary[Any]): Unit
}
object Dimensions {
  
  @JSImport("react-native-windows/rntypes", "Dimensions")
  @js.native
  val ^ : Dimensions = js.native
  
  extension [Self <: Dimensions](x: Self) {
    
    inline def setAddEventListener(value: (change, js.Function1[/* hasWindowScreen */ Screen, Unit]) => EmitterSubscription): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setGet(value: window | screen => ScaledSize): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: (change, js.Function1[/* hasWindowScreen */ Screen, Unit]) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: change, t1: js.Function1[/* hasWindowScreen */ Screen, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSet(value: StringDictionary[Any] => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: StringDictionary[Any]) => value(t0).runNow()))
  }
}
