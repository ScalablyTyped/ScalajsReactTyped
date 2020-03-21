package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemStyles
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ActivityItem/ActivityItem.styles", JSImport.Namespace)
@js.native
object activityItemStylesMod extends js.Object {
  def getStyles(
    theme: js.UndefOr[ITheme],
    customStyles: js.UndefOr[IActivityItemStyles],
    animateBeaconSignal: js.UndefOr[Boolean],
    beaconColorOne: js.UndefOr[String],
    beaconColorTwo: js.UndefOr[String],
    isCompact: js.UndefOr[Boolean]
  ): IActivityItemStyles = js.native
}

