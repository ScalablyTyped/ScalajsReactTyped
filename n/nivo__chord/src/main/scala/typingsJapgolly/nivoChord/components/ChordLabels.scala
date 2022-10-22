package typingsJapgolly.nivoChord.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoChord.distTypesChordLabelsMod.ChordLabelsProps
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcDatum
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChordLabels {
  
  inline def apply(arcs: js.Array[ArcDatum], color: InheritedColorConfig[ArcDatum], radius: Double, rotation: Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* hasArcsRadiusRotationColor */ ChordLabelsProps]))
  }
  
  @JSImport("@nivo/chord/dist/types/ChordLabels", "ChordLabels")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasArcsRadiusRotationColor */ ChordLabelsProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
