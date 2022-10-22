package typingsJapgolly.antd

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.libInputInputMod.InputProps
import typingsJapgolly.rcInput.esInterfaceMod.InputRef
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputPasswordMod extends Shortcut {
  
  @JSImport("antd/lib/input/Password", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PasswordProps & RefAttributes[InputRef]] = js.native
  
  trait PasswordProps
    extends StObject
       with InputProps {
    
    val action: js.UndefOr[String] = js.undefined
    
    var iconRender: js.UndefOr[js.Function1[/* visible */ Boolean, Node]] = js.undefined
    
    val inputPrefixCls: js.UndefOr[String] = js.undefined
    
    var visibilityToggle: js.UndefOr[Boolean] = js.undefined
  }
  object PasswordProps {
    
    inline def apply(): PasswordProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasswordProps]
    }
    
    extension [Self <: PasswordProps](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setIconRender(value: /* visible */ Boolean => Node): Self = StObject.set(x, "iconRender", js.Any.fromFunction1(value))
      
      inline def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
      
      inline def setInputPrefixCls(value: String): Self = StObject.set(x, "inputPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setInputPrefixClsUndefined: Self = StObject.set(x, "inputPrefixCls", js.undefined)
      
      inline def setVisibilityToggle(value: Boolean): Self = StObject.set(x, "visibilityToggle", value.asInstanceOf[js.Any])
      
      inline def setVisibilityToggleUndefined: Self = StObject.set(x, "visibilityToggle", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PasswordProps & RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libInputPasswordMod.foo` */
  override def _to: ForwardRefExoticComponent[PasswordProps & RefAttributes[InputRef]] = default
}
