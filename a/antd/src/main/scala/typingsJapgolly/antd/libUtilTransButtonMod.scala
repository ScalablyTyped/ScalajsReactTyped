package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilTransButtonMod extends Shortcut {
  
  @JSImport("antd/lib/_util/transButton", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TransButtonProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait TransButtonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var noStyle: js.UndefOr[Boolean] = js.undefined
    
    @JSName("onClick")
    var onClick_TransButtonProps: js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]], Unit]] = js.undefined
  }
  object TransButtonProps {
    
    inline def apply(): TransButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransButtonProps]
    }
    
    extension [Self <: TransButtonProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setNoStyle(value: Boolean): Self = StObject.set(x, "noStyle", value.asInstanceOf[js.Any])
      
      inline def setNoStyleUndefined: Self = StObject.set(x, "noStyle", js.undefined)
      
      inline def setOnClick(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[TransButtonProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libUtilTransButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[TransButtonProps & RefAttributes[HTMLDivElement]] = default
}
