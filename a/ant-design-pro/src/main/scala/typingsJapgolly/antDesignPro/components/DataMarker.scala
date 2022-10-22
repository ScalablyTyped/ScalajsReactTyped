package typingsJapgolly.antDesignPro.components

import typingsJapgolly.antvG2.libInterfaceMod.AnnotationPosition
import typingsJapgolly.bizcharts.libComponentsAnnotationDataMarkerMod.AnnotationDataMarkerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataMarker {
  
  inline def apply(position: AnnotationPosition): SharedBuilder_AnnotationDataMarkerProps1028542433[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.DataMarker] = {
    val __props = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    new SharedBuilder_AnnotationDataMarkerProps1028542433[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.DataMarker](js.Array(this.component, __props.asInstanceOf[AnnotationDataMarkerProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Annotation.DataMarker")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AnnotationDataMarkerProps): SharedBuilder_AnnotationDataMarkerProps1028542433[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.DataMarker] = new SharedBuilder_AnnotationDataMarkerProps1028542433[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.DataMarker](js.Array(this.component, p.asInstanceOf[js.Any]))
}
