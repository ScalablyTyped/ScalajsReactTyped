package typingsJapgolly.reactMosaicComponent.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMosaicComponent.libSplitMod.SplitProps
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicDirection
import typingsJapgolly.reactMosaicComponent.libUtilBoundingBoxMod.BoundingBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Split {
  
  inline def apply(boundingBox: BoundingBox, direction: MosaicDirection, splitPercentage: Double): Builder = {
    val __props = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], splitPercentage = splitPercentage.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SplitProps]))
  }
  
  @JSImport("react-mosaic-component/lib/Split", "Split")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMosaicComponent.libSplitMod.Split] {
    
    inline def minimumPaneSizePercentage(value: Double): this.type = set("minimumPaneSizePercentage", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* percentOfParent */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* percentOfParent */ Double) => value(t0).runNow()))
    
    inline def onRelease(value: /* percentOfParent */ Double => Callback): this.type = set("onRelease", js.Any.fromFunction1((t0: /* percentOfParent */ Double) => value(t0).runNow()))
  }
  
  def withProps(p: SplitProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
