package typingsJapgolly.reactNativeElements

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.TouchableOpacityProps
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.anon.PickTouchableOpacityProps
import typingsJapgolly.reactNativeElements.anon.TouchableOpacityPropsChec
import typingsJapgolly.reactNativeElements.anon.TypeofComponent
import typingsJapgolly.reactNativeElements.distCheckboxCheckBoxIconMod.CheckBoxIconProps
import typingsJapgolly.reactNativeElements.distHelpersMod.RneFunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCheckboxCheckBoxMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/checkbox/CheckBox", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickTouchableOpacityProps] | ForwardRefExoticComponent[TouchableOpacityPropsChec] = js.native
  
  @JSImport("react-native-elements/dist/checkbox/CheckBox", "CheckBox")
  @js.native
  val CheckBox: RneFunctionComponent[CheckBoxProps] = js.native
  
  trait CheckBoxProps
    extends StObject
       with TouchableOpacityProps
       with CheckBoxIconProps {
    
    var Component: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]
        ])
      ] = js.undefined
    
    var center: js.UndefOr[Boolean] = js.undefined
    
    var checkedTitle: js.UndefOr[String] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var iconRight: js.UndefOr[Boolean] = js.undefined
    
    var right: js.UndefOr[Boolean] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var title: js.UndefOr[String | Element] = js.undefined
    
    var titleProps: js.UndefOr[TextProps] = js.undefined
    
    var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object CheckBoxProps {
    
    inline def apply(): CheckBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckBoxProps]
    }
    
    extension [Self <: CheckBoxProps](x: Self) {
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setCheckedTitle(value: String): Self = StObject.set(x, "checkedTitle", value.asInstanceOf[js.Any])
      
      inline def setCheckedTitleUndefined: Self = StObject.set(x, "checkedTitle", js.undefined)
      
      inline def setComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setIconRight(value: Boolean): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
      
      inline def setIconRightUndefined: Self = StObject.set(x, "iconRight", js.undefined)
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleProps(value: TextProps): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
      
      inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickTouchableOpacityProps] | ForwardRefExoticComponent[TouchableOpacityPropsChec]
  
  /* This means you don't have to write `default`, but can instead just say `distCheckboxCheckBoxMod.foo` */
  override def _to: FunctionComponent[PickTouchableOpacityProps] | ForwardRefExoticComponent[TouchableOpacityPropsChec] = default
}
