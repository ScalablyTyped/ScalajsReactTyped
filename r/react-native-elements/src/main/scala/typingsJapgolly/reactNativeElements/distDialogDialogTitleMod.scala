package typingsJapgolly.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativeElements.anon.PickDialogTitlePropstitle
import typingsJapgolly.reactNativeElements.distTextTextMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDialogDialogTitleMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/dialog/DialogTitle", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickDialogTitlePropstitle] | ForwardRefExoticComponent[DialogTitleProps] = js.native
  
  trait DialogTitleProps extends StObject {
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleProps: js.UndefOr[TextProps] = js.undefined
    
    var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object DialogTitleProps {
    
    inline def apply(): DialogTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogTitleProps]
    }
    
    extension [Self <: DialogTitleProps](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleProps(value: TextProps): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
      
      inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
      
      inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickDialogTitlePropstitle] | ForwardRefExoticComponent[DialogTitleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distDialogDialogTitleMod.foo` */
  override def _to: FunctionComponent[PickDialogTitlePropstitle] | ForwardRefExoticComponent[DialogTitleProps] = default
}
