package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.AmountOfHiddenTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToggleMoreButton {
  
  inline def apply(amountOfHiddenTags: Any, dataHook: Any, isExpanded: Any, onClick: Any, toggleMoreButton: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(amountOfHiddenTags = amountOfHiddenTags.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], toggleMoreButton = toggleMoreButton.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[AmountOfHiddenTags]))
  }
  
  @JSImport("wix-style-react/dist/types/TagList/ToggleMoreButton", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AmountOfHiddenTags): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
