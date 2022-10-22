package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.CurrentBarData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFunnelChartFunnelStepFunnelStepMod {
  
  @JSImport("wix-style-react/dist/types/FunnelChart/FunnelStep/FunnelStep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def EmptyFunnelStep(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("EmptyFunnelStep")().asInstanceOf[Element]
  
  inline def FunnelStep(
    hasCurrentBarIndexCurrentBarDataNextBarDataCurrentBarHeightNextBarHeightHideDifferenceBadgeGetTooltipContentOnTooltipShow: CurrentBarData
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FunnelStep")(hasCurrentBarIndexCurrentBarDataNextBarDataCurrentBarHeightNextBarHeightHideDifferenceBadgeGetTooltipContentOnTooltipShow.asInstanceOf[js.Any]).asInstanceOf[Element]
}
