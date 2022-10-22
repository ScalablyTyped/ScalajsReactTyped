package typingsJapgolly.antdMobileRn

import typingsJapgolly.antdMobileRn.anon.OnChange
import typingsJapgolly.antdMobileRn.libSegmentedControlPropsTypeMod.SegmentedControlPropsType
import typingsJapgolly.antdMobileRn.libSegmentedControlStyleIndexDotnativeMod.ISegmentControlStyle
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSegmentedControlSegmentedDotandroidMod {
  
  @JSImport("antd-mobile-rn/lib/segmented-control/segmented.android", JSImport.Default)
  @js.native
  open class default protected () extends SegmentedControl {
    def this(props: SegmentControlNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/segmented-control/segmented.android", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/segmented-control/segmented.android", "default.defaultProps")
    @js.native
    def defaultProps: OnChange = js.native
    inline def defaultProps_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait SegmentControlNativeProps
    extends StObject
       with SegmentedControlPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[ISegmentControlStyle] = js.undefined
  }
  object SegmentControlNativeProps {
    
    inline def apply(): SegmentControlNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentControlNativeProps]
    }
    
    extension [Self <: SegmentControlNativeProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: ISegmentControlStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait SegmentedControl extends Component[SegmentControlNativeProps, Any, Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MSegmentedControl(nextProps: SegmentControlNativeProps): Unit = js.native
    
    def onPress(e: Any, index: Double, value: String): Unit = js.native
  }
}
