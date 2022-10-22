package typingsJapgolly.reactNativeGestureHandler

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.reactNativeGestureHandler.libTypescriptActionTypeMod.ActionType
import typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default
import typingsJapgolly.reactNativeGestureHandler.libTypescriptWebInterfacesMod.Config
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.FlingGestureHandler
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.LongPressGestureHandler
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.ManualGestureHandler
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.NativeViewGestureHandler
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.PanGestureHandler
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.PinchGestureHandler
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.RotationGestureHandler
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.TapGestureHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptRngesturehandlermoduleDotwebMod {
  
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachGestureHandler(handlerTag: Double, newView: Any, _actionType: ActionType, propsRef: RefHandle[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachGestureHandler")(handlerTag.asInstanceOf[js.Any], newView.asInstanceOf[js.Any], _actionType.asInstanceOf[js.Any], propsRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def createGestureHandler[T](
      handlerName: /* keyof react-native-gesture-handler.anon.FlingGestureHandler */ NativeViewGestureHandler | PanGestureHandler | TapGestureHandler | LongPressGestureHandler | PinchGestureHandler | RotationGestureHandler | FlingGestureHandler | ManualGestureHandler,
      handlerTag: Double,
      config: T
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGestureHandler")(handlerName.asInstanceOf[js.Any], handlerTag.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def dropGestureHandler(handlerTag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dropGestureHandler")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def flushOperations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushOperations")().asInstanceOf[Unit]
    
    inline def getGestureHandlerNode(handlerTag: Double): typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerNativeViewGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerPanGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerTapGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerLongPressGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerPinchGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerRotationGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerFlingGestureHandlerMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getGestureHandlerNode")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerNativeViewGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerPanGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerTapGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerLongPressGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerPinchGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerRotationGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerFlingGestureHandlerMod.default]
    
    inline def handleClearJSResponder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleClearJSResponder")().asInstanceOf[Unit]
    
    inline def handleSetJSResponder(tag: Double, blockNativeResponder: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleSetJSResponder")(tag.asInstanceOf[js.Any], blockNativeResponder.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateGestureHandler(handlerTag: Double, newConfig: Config): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateGestureHandler")(handlerTag.asInstanceOf[js.Any], newConfig.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object Gestures {
    
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.FlingGestureHandler")
    @js.native
    open class FlingGestureHandler () extends default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.FlingGestureHandler")
    @js.native
    def FlingGestureHandler: Instantiable0[default] = js.native
    inline def FlingGestureHandler_=(x: Instantiable0[default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FlingGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.LongPressGestureHandler")
    @js.native
    open class LongPressGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.LongPressGestureHandler")
    @js.native
    def LongPressGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default
      ] = js.native
    inline def LongPressGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LongPressGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.ManualGestureHandler")
    @js.native
    open class ManualGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.ManualGestureHandler")
    @js.native
    def ManualGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default
      ] = js.native
    inline def ManualGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ManualGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.NativeViewGestureHandler")
    @js.native
    open class NativeViewGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.NativeViewGestureHandler")
    @js.native
    def NativeViewGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default
      ] = js.native
    inline def NativeViewGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NativeViewGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.PanGestureHandler")
    @js.native
    open class PanGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.PanGestureHandler")
    @js.native
    def PanGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default
      ] = js.native
    inline def PanGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PanGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.PinchGestureHandler")
    @js.native
    open class PinchGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.PinchGestureHandler")
    @js.native
    def PinchGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default
      ] = js.native
    inline def PinchGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PinchGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.RotationGestureHandler")
    @js.native
    open class RotationGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.RotationGestureHandler")
    @js.native
    def RotationGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default
      ] = js.native
    inline def RotationGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotationGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.TapGestureHandler")
    @js.native
    open class TapGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "Gestures.TapGestureHandler")
    @js.native
    def TapGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default
      ] = js.native
    inline def TapGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TapGestureHandler")(x.asInstanceOf[js.Any])
  }
  
  object HammerGestures {
    
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.FlingGestureHandler")
    @js.native
    open class FlingGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerFlingGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.FlingGestureHandler")
    @js.native
    def FlingGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerFlingGestureHandlerMod.default
      ] = js.native
    inline def FlingGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerFlingGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FlingGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.LongPressGestureHandler")
    @js.native
    open class LongPressGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerLongPressGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.LongPressGestureHandler")
    @js.native
    def LongPressGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerLongPressGestureHandlerMod.default
      ] = js.native
    inline def LongPressGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerLongPressGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LongPressGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.NativeViewGestureHandler")
    @js.native
    open class NativeViewGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerNativeViewGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.NativeViewGestureHandler")
    @js.native
    def NativeViewGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerNativeViewGestureHandlerMod.default
      ] = js.native
    inline def NativeViewGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerNativeViewGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NativeViewGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.PanGestureHandler")
    @js.native
    open class PanGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerPanGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.PanGestureHandler")
    @js.native
    def PanGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerPanGestureHandlerMod.default
      ] = js.native
    inline def PanGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerPanGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PanGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.PinchGestureHandler")
    @js.native
    open class PinchGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerPinchGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.PinchGestureHandler")
    @js.native
    def PinchGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerPinchGestureHandlerMod.default
      ] = js.native
    inline def PinchGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerPinchGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PinchGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.RotationGestureHandler")
    @js.native
    open class RotationGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerRotationGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.RotationGestureHandler")
    @js.native
    def RotationGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerRotationGestureHandlerMod.default
      ] = js.native
    inline def RotationGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerRotationGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotationGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.TapGestureHandler")
    @js.native
    open class TapGestureHandler ()
      extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerTapGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.web", "HammerGestures.TapGestureHandler")
    @js.native
    def TapGestureHandler: Instantiable0[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerTapGestureHandlerMod.default
      ] = js.native
    inline def TapGestureHandler_=(
      x: Instantiable0[
          typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHammerTapGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TapGestureHandler")(x.asInstanceOf[js.Any])
  }
}
