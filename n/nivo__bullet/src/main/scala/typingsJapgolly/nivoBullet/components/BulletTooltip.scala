package typingsJapgolly.nivoBullet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulletTooltip {
  
  inline def apply(color: String, v0: Double): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any], v0 = v0.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BulletTooltipProps]))
  }
  
  @JSImport("@nivo/bullet/dist/types/BulletTooltip", "BulletTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def v1(value: Double): this.type = set("v1", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BulletTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
