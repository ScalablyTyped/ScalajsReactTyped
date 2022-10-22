package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.DownDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ticker {
  
  inline def apply(dataHook: Any, downDisabled: Any, onDown: Any, onMouseDown: Any, onUp: Any, upDisabled: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], downDisabled = downDisabled.asInstanceOf[js.Any], onDown = onDown.asInstanceOf[js.Any], onMouseDown = onMouseDown.asInstanceOf[js.Any], onUp = onUp.asInstanceOf[js.Any], upDisabled = upDisabled.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[DownDisabled]))
  }
  
  @JSImport("wix-style-react/dist/types/Input/Ticker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DownDisabled): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
