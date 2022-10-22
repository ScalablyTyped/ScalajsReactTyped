package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.anon.SelectedTextColor
import typingsJapgolly.antDesignReactNative.libSegmentedControlPropsTypeMod.SegmentedControlPropsType
import typingsJapgolly.antDesignReactNative.libSegmentedControlStyleMod.SegmentControlStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSegmentedControlSegmentedDotandroidMod {
  
  @JSImport("@ant-design/react-native/lib/segmented-control/segmented.android", JSImport.Default)
  @js.native
  open class default protected () extends SegmentedControl {
    def this(props: SegmentControlProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/segmented-control/segmented.android", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/segmented-control/segmented.android", "default.defaultProps")
    @js.native
    def defaultProps: SelectedTextColor = js.native
    inline def defaultProps_=(x: SelectedTextColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait SegmentControlProps
    extends StObject
       with SegmentedControlPropsType
       with WithThemeStyles[SegmentControlStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object SegmentControlProps {
    
    inline def apply(): SegmentControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentControlProps]
    }
    
    extension [Self <: SegmentControlProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait SegmentedControl extends Component[SegmentControlProps, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MSegmentedControl(nextProps: SegmentControlProps): Unit = js.native
    
    def onPress(e: Any, index: Double, value: String): Unit = js.native
  }
}
