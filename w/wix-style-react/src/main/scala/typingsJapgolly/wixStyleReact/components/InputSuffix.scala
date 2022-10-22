package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.ClearButtonSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputSuffix {
  
  inline def apply(
    clearButtonSize: Any,
    disabled: Any,
    isClearButtonVisible: Any,
    menuArrow: Any,
    onClear: Any,
    onIconClicked: Any,
    status: Any,
    statusMessage: Any,
    suffix: Any,
    tooltipPlacement: Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(clearButtonSize = clearButtonSize.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], isClearButtonVisible = isClearButtonVisible.asInstanceOf[js.Any], menuArrow = menuArrow.asInstanceOf[js.Any], onClear = onClear.asInstanceOf[js.Any], onIconClicked = onIconClicked.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], tooltipPlacement = tooltipPlacement.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ClearButtonSize]))
  }
  
  @JSImport("wix-style-react/dist/types/Input/InputSuffix", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ClearButtonSize): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
