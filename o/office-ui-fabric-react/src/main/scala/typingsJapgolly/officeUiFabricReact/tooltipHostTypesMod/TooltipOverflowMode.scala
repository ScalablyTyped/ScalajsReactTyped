package typingsJapgolly.officeUiFabricReact.tooltipHostTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TooltipOverflowMode extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.types", "TooltipOverflowMode")
@js.native
object TooltipOverflowMode extends js.Object {
  /** Only show tooltip if parent DOM element is overflowing */
  @js.native
  sealed trait Parent extends TooltipOverflowMode
  
  /**
    * Only show tooltip if tooltip host's content is overflowing.
    * Note that this does not check the children for overflow, only the TooltipHost root.
    */
  @js.native
  sealed trait Self extends TooltipOverflowMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TooltipOverflowMode with Double] = js.native
  /* 0 */ @js.native
  object Parent extends TopLevel[Parent with Double]
  
  /* 1 */ @js.native
  object Self extends TopLevel[Self with Double]
  
}

