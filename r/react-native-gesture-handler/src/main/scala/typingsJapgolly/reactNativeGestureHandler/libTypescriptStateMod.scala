package typingsJapgolly.reactNativeGestureHandler

import typingsJapgolly.reactNativeGestureHandler.libTypescriptWebInterfacesMod._TouchNativeArgs
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`0`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`1`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`2`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`3`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`4`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptStateMod {
  
  /* Inlined { readonly UNDETERMINED :0,  readonly FAILED :1,  readonly BEGAN :2,  readonly CANCELLED :3,  readonly ACTIVE :4,  readonly END :5}[keyof { readonly UNDETERMINED :0,  readonly FAILED :1,  readonly BEGAN :2,  readonly CANCELLED :3,  readonly ACTIVE :4,  readonly END :5}] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`3`
    - typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`2`
    - typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`4`
    - typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`0`
    - typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`5`
    - typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerInts.`1`
  */
  trait State
    extends StObject
       with _TouchNativeArgs
  object State {
    
    @JSImport("react-native-gesture-handler/lib/typescript/State", "State.ACTIVE")
    @js.native
    val ACTIVE: `4` = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/State", "State.BEGAN")
    @js.native
    val BEGAN: `2` = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/State", "State.CANCELLED")
    @js.native
    val CANCELLED: `3` = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/State", "State.END")
    @js.native
    val END: `5` = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/State", "State.FAILED")
    @js.native
    val FAILED: `1` = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/State", "State.UNDETERMINED")
    @js.native
    val UNDETERMINED: `0` = js.native
  }
}
