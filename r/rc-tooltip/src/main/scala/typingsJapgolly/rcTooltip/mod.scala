package typingsJapgolly.rcTooltip

import typingsJapgolly.rcTooltip.esPopupMod.ContentProps
import typingsJapgolly.rcTooltip.esTooltipMod.TooltipProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-tooltip", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TooltipProps & RefAttributes[Any]] = js.native
  
  inline def Popup(props: ContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Popup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
