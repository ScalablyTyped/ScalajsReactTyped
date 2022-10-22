package typingsJapgolly.nivoBar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typingsJapgolly.nivoBar.distTypesTypesMod.BarAnnotationsProps
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedBarDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BarAnnotations {
  
  inline def apply[RawDatum](
    annotations: js.Array[AnnotationMatcher[ComputedBarDatum[RawDatum]]],
    bars: js.Array[ComputedBarDatum[RawDatum]]
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], bars = bars.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[BarAnnotationsProps[RawDatum]]))
  }
  
  @JSImport("@nivo/bar/dist/types/BarAnnotations", "BarAnnotations")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[RawDatum](p: BarAnnotationsProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
