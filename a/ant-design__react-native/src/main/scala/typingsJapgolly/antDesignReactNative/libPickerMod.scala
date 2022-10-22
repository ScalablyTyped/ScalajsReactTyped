package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.anon.Cascade
import typingsJapgolly.antDesignReactNative.anon.Cascader
import typingsJapgolly.antDesignReactNative.libPickerPropsTypeMod.PickerData
import typingsJapgolly.antDesignReactNative.libPickerPropsTypeMod.PickerPropsType
import typingsJapgolly.antDesignReactNative.libPickerStyleMod.PickerStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerMod {
  
  @JSImport("@ant-design/react-native/lib/picker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native/lib/picker", JSImport.Default)
  @js.native
  open class default () extends Picker
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/picker", "default.contextType")
    @js.native
    def contextType: Context[js.Object] = js.native
    inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/picker", "default.defaultProps")
    @js.native
    def defaultProps: Cascade = js.native
    inline def defaultProps_=(x: Cascade): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def getDefaultProps(): Cascade = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProps")().asInstanceOf[Cascade]
  
  @js.native
  trait Picker extends Component[PickerProps, Any, Any] {
    
    def fixOnOk(cascader: Any): Unit = js.native
    
    def getCascade(
      cascade: Boolean,
      data: js.Array[js.Array[PickerData] | PickerData],
      cols: Double,
      itemStyle: Any,
      indicatorStyle: Any
    ): Cascader = js.native
    def getCascade(
      cascade: Boolean,
      data: js.Array[js.Array[PickerData] | PickerData],
      cols: Unit,
      itemStyle: Any,
      indicatorStyle: Any
    ): Cascader = js.native
    def getCascade(
      cascade: Unit,
      data: js.Array[js.Array[PickerData] | PickerData],
      cols: Double,
      itemStyle: Any,
      indicatorStyle: Any
    ): Cascader = js.native
    def getCascade(
      cascade: Unit,
      data: js.Array[js.Array[PickerData] | PickerData],
      cols: Unit,
      itemStyle: Any,
      indicatorStyle: Any
    ): Cascader = js.native
    
    def getPickerCol(): js.Array[Element] = js.native
    
    def getSel(): js.UndefOr[String] = js.native
    
    def onOk(v: Any): Unit = js.native
    
    def onPickerChange(v: Any): Unit = js.native
    
    def onVisibleChange(visible: Boolean): Unit = js.native
    
    /* private */ var scrollValue: Any = js.native
    
    def setCasecadeScrollValue(v: Any): Unit = js.native
    
    def setScrollValue(v: Any): Unit = js.native
  }
  
  trait PickerProps
    extends StObject
       with PickerPropsType
       with WithThemeStyles[PickerStyle] {
    
    var children: Node
    
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    var popupPrefixCls: js.UndefOr[String] = js.undefined
  }
  object PickerProps {
    
    inline def apply(data: js.Array[js.Array[PickerData] | PickerData]): PickerProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[PickerProps]
    }
    
    extension [Self <: PickerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      inline def setPopupPrefixCls(value: String): Self = StObject.set(x, "popupPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPopupPrefixClsUndefined: Self = StObject.set(x, "popupPrefixCls", js.undefined)
    }
  }
}
