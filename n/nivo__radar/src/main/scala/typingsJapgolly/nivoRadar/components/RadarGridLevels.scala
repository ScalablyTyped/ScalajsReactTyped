package typingsJapgolly.nivoRadar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoRadar.distTypesRadarGridLevelsMod.RadarGridLevelsProps
import typingsJapgolly.nivoRadar.nivoRadarStrings.circular
import typingsJapgolly.nivoRadar.nivoRadarStrings.linear
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadarGridLevels {
  
  inline def apply[D /* <: Record[String, Any] */](angleStep: Double, dataLength: Double, radius: Double, rotation: Double, shape: circular | linear): Builder[D] = {
    val __props = js.Dynamic.literal(angleStep = angleStep.asInstanceOf[js.Any], dataLength = dataLength.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    new Builder[D](js.Array(this.component, __props.asInstanceOf[RadarGridLevelsProps[D]]))
  }
  
  @JSImport("@nivo/radar/dist/types/RadarGridLevels", "RadarGridLevels")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[D /* <: Record[String, Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[D /* <: Record[String, Any] */](p: RadarGridLevelsProps[D]): Builder[D] = new Builder[D](js.Array(this.component, p.asInstanceOf[js.Any]))
}
