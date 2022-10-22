package typingsJapgolly.blueprintjsTable.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmLayersGuidesMod.IGuideLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GuideLayer {
  
  inline def apply(horizontalGuides: js.Array[Double], verticalGuides: js.Array[Double]): Builder = {
    val __props = js.Dynamic.literal(horizontalGuides = horizontalGuides.asInstanceOf[js.Any], verticalGuides = verticalGuides.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IGuideLayerProps]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/layers/guides", "GuideLayer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.libEsmLayersGuidesMod.GuideLayer] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IGuideLayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
