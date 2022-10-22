package typingsJapgolly.reactNativeSensorManager.mod

import typingsJapgolly.reactNative.mod.DeviceEventEmitterStatic
import typingsJapgolly.reactNative.mod.RCTNativeAppEventEmitter
import typingsJapgolly.reactNativeSensorManager.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("react-native-sensor-manager", "NativeAppEventEmitter")
@js.native
open class NativeAppEventEmitter ()
  extends StObject
     with DeviceEventEmitterStatic
object NativeAppEventEmitter {
  
  inline def apply: RCTNativeAppEventEmitter = ^.asInstanceOf[js.Dynamic].selectDynamic("NativeAppEventEmitter").asInstanceOf[RCTNativeAppEventEmitter]
}
