package typingsJapgolly.reactNativeNavigation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.NativeTouchEvent
import typingsJapgolly.reactNative.mod.TouchableHighlight
import typingsJapgolly.reactNative.mod.TouchableNativeFeedback
import typingsJapgolly.reactNative.mod.TouchableOpacity
import typingsJapgolly.reactNative.mod.TouchableWithoutFeedback
import typingsJapgolly.reactNativeNavigation.anon.Children
import typingsJapgolly.reactNativeNavigation.anon.ReactTag
import typingsJapgolly.reactNativeNavigation.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcAdaptersTouchablePreviewMod {
  
  @JSImport("react-native-navigation/lib/dist/src/adapters/TouchablePreview", "TouchablePreview")
  @js.native
  open class TouchablePreview protected ()
    extends PureComponent[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
    
    def onPress(): Unit = js.native
    
    def onPressIn(): Unit | Null = js.native
    
    /* private */ var onRef: Any = js.native
    
    def onTouchEnd(): Unit = js.native
    
    def onTouchMove(event: GestureResponderEventWithForce): Unit = js.native
    
    def onTouchStart(event: GestureResponderEvent): Unit = js.native
    
    /* private */ var timeout: Any = js.native
    
    /* private */ var touchStartedAt: Any = js.native
  }
  /* static members */
  object TouchablePreview {
    
    @JSImport("react-native-navigation/lib/dist/src/adapters/TouchablePreview", "TouchablePreview")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-navigation/lib/dist/src/adapters/TouchablePreview", "TouchablePreview.defaultProps")
    @js.native
    def defaultProps: `0` = js.native
    inline def defaultProps_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-navigation/lib/dist/src/adapters/TouchablePreview", "TouchablePreview.peeking")
    @js.native
    def peeking: Boolean = js.native
    inline def peeking_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peeking")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-navigation/lib/dist/src/adapters/TouchablePreview", "TouchablePreview.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type GestureResponderEventWithForce = NativeSyntheticEvent[NativeTouchEventWithForce]
  
  trait NativeTouchEventWithForce
    extends StObject
       with NativeTouchEvent {
    
    @JSName("force")
    var force_NativeTouchEventWithForce: Double
  }
  object NativeTouchEventWithForce {
    
    inline def apply(
      changedTouches: js.Array[NativeTouchEvent],
      force: Double,
      identifier: String,
      locationX: Double,
      locationY: Double,
      pageX: Double,
      pageY: Double,
      target: String,
      timestamp: Double,
      touches: js.Array[NativeTouchEvent]
    ): NativeTouchEventWithForce = {
      val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], locationX = locationX.asInstanceOf[js.Any], locationY = locationY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeTouchEventWithForce]
    }
    
    extension [Self <: NativeTouchEventWithForce](x: Self) {
      
      inline def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var onPeekIn: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPeekOut: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressIn: js.UndefOr[js.Function1[/* payload */ ReactTag, Unit]] = js.undefined
    
    var touchableComponent: js.UndefOr[
        TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | Node
      ] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnPeekIn(value: Callback): Self = StObject.set(x, "onPeekIn", value.toJsFn)
      
      inline def setOnPeekInUndefined: Self = StObject.set(x, "onPeekIn", js.undefined)
      
      inline def setOnPeekOut(value: Callback): Self = StObject.set(x, "onPeekOut", value.toJsFn)
      
      inline def setOnPeekOutUndefined: Self = StObject.set(x, "onPeekOut", js.undefined)
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
      
      inline def setOnPressIn(value: /* payload */ ReactTag => Callback): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1((t0: /* payload */ ReactTag) => value(t0).runNow()))
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setTouchableComponent(
        value: TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | Node
      ): Self = StObject.set(x, "touchableComponent", value.asInstanceOf[js.Any])
      
      inline def setTouchableComponentNull: Self = StObject.set(x, "touchableComponent", null)
      
      inline def setTouchableComponentUndefined: Self = StObject.set(x, "touchableComponent", js.undefined)
      
      inline def setTouchableComponentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "touchableComponent", js.Array(value*))
      
      inline def setTouchableComponentVdomElement(value: VdomElement): Self = StObject.set(x, "touchableComponent", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
