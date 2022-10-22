package typingsJapgolly.playable

import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsProgressUtilsGetProgressTimeTooltipPositionMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/progress/utils/getProgressTimeTooltipPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(progressPercent: Double, progressElement: HTMLElement, tooltipContainer: HTMLElement): ITooltipPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(progressPercent.asInstanceOf[js.Any], progressElement.asInstanceOf[js.Any], tooltipContainer.asInstanceOf[js.Any])).asInstanceOf[ITooltipPosition]
}
