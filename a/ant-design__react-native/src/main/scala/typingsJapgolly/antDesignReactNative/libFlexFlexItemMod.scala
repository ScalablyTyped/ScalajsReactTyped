package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignReactNative.anon.Flex
import typingsJapgolly.antDesignReactNative.libFlexPropsTypeMod.FlexItemPropsType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFlexFlexItemMod {
  
  @JSImport("@ant-design/react-native/lib/flex/FlexItem", JSImport.Default)
  @js.native
  open class default () extends FlexItem
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/flex/FlexItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/flex/FlexItem", "default.defaultProps")
    @js.native
    def defaultProps: Flex = js.native
    inline def defaultProps_=(x: Flex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FlexItem extends Component[FlexItemProps, Any, Any]
  
  trait FlexItemProps
    extends StObject
       with FlexItemPropsType {
    
    var flex: js.UndefOr[Double] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object FlexItemProps {
    
    inline def apply(): FlexItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexItemProps]
    }
    
    extension [Self <: FlexItemProps](x: Self) {
      
      inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setOnLongPress(value: Callback): Self = StObject.set(x, "onLongPress", value.toJsFn)
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
      
      inline def setOnPressIn(value: Callback): Self = StObject.set(x, "onPressIn", value.toJsFn)
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressOut(value: Callback): Self = StObject.set(x, "onPressOut", value.toJsFn)
      
      inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
