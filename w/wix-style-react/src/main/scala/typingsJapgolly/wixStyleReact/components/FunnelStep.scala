package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.CurrentBarData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FunnelStep {
  
  inline def apply(
    currentBarData: Any,
    currentBarHeight: Any,
    currentBarIndex: Any,
    getTooltipContent: Any,
    hideDifferenceBadge: Any,
    nextBarData: Any,
    nextBarHeight: Any,
    onTooltipShow: Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(currentBarData = currentBarData.asInstanceOf[js.Any], currentBarHeight = currentBarHeight.asInstanceOf[js.Any], currentBarIndex = currentBarIndex.asInstanceOf[js.Any], getTooltipContent = getTooltipContent.asInstanceOf[js.Any], hideDifferenceBadge = hideDifferenceBadge.asInstanceOf[js.Any], nextBarData = nextBarData.asInstanceOf[js.Any], nextBarHeight = nextBarHeight.asInstanceOf[js.Any], onTooltipShow = onTooltipShow.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[CurrentBarData]))
  }
  
  @JSImport("wix-style-react/dist/types/FunnelChart/FunnelStep", "FunnelStep")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CurrentBarData): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
