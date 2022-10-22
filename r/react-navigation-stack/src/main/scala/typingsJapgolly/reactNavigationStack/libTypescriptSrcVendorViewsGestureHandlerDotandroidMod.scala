package typingsJapgolly.reactNavigationStack

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeGestureHandler.libTypescriptGestureHandlerRootViewMod.GestureHandlerRootViewProps
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerTypesCompatMod.PanGestureHandlerProperties
import typingsJapgolly.reactNavigationStack.reactNavigationStackInts.`0`
import typingsJapgolly.reactNavigationStack.reactNavigationStackInts.`1`
import typingsJapgolly.reactNavigationStack.reactNavigationStackInts.`2`
import typingsJapgolly.reactNavigationStack.reactNavigationStackInts.`3`
import typingsJapgolly.reactNavigationStack.reactNavigationStackInts.`4`
import typingsJapgolly.reactNavigationStack.reactNavigationStackInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsGestureHandlerDotandroidMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.android", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GestureHandlerRootView(props: GestureHandlerRootViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GestureHandlerRootView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object GestureState {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.android", "GestureState.ACTIVE")
    @js.native
    val ACTIVE: `4` = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.android", "GestureState.BEGAN")
    @js.native
    val BEGAN: `2` = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.android", "GestureState.CANCELLED")
    @js.native
    val CANCELLED: `3` = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.android", "GestureState.END")
    @js.native
    val END: `5` = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.android", "GestureState.FAILED")
    @js.native
    val FAILED: `1` = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.android", "GestureState.UNDETERMINED")
    @js.native
    val UNDETERMINED: `0` = js.native
  }
  
  inline def PanGestureHandler(props: PanGestureHandlerProperties): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PanGestureHandler")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
