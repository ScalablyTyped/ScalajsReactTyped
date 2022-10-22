package typingsJapgolly.nivoChord.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoChord.distTypesTypesMod.RibbonDatum
import typingsJapgolly.nivoChord.distTypesTypesMod.RibbonTooltipComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChordRibbonTooltip {
  
  inline def apply(ribbon: RibbonDatum): Default[js.Object] = {
    val __props = js.Dynamic.literal(ribbon = ribbon.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* hasRibbon */ RibbonTooltipComponentProps]))
  }
  
  @JSImport("@nivo/chord/dist/types/ChordRibbonTooltip", "ChordRibbonTooltip")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasRibbon */ RibbonTooltipComponentProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
