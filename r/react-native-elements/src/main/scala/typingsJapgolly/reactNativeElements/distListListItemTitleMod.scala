package typingsJapgolly.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.reactNativeElements.anon.PickTextPropsrightboolean
import typingsJapgolly.reactNativeElements.anon.TextPropsrightbooleanundeAccessibilityActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListListItemTitleMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/list/ListItemTitle", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickTextPropsrightboolean] | ForwardRefExoticComponent[TextPropsrightbooleanundeAccessibilityActions] = js.native
  
  trait TitleProps
    extends StObject
       with TextProps {
    
    var right: js.UndefOr[Boolean] = js.undefined
  }
  object TitleProps {
    
    inline def apply(): TitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleProps]
    }
    
    extension [Self <: TitleProps](x: Self) {
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickTextPropsrightboolean] | ForwardRefExoticComponent[TextPropsrightbooleanundeAccessibilityActions]
  
  /* This means you don't have to write `default`, but can instead just say `distListListItemTitleMod.foo` */
  override def _to: FunctionComponent[PickTextPropsrightboolean] | ForwardRefExoticComponent[TextPropsrightbooleanundeAccessibilityActions] = default
}
