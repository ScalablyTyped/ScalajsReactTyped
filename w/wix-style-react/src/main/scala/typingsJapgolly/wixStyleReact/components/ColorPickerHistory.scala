package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.Previous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPickerHistory {
  
  inline def apply(current: Any, onClick: Any, previous: Any, show: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(current = current.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Previous]))
  }
  
  @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHistory", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Previous): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
