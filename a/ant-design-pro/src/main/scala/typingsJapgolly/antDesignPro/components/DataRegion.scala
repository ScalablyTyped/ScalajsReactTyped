package typingsJapgolly.antDesignPro.components

import typingsJapgolly.antvG2.libInterfaceMod.AnnotationPosition
import typingsJapgolly.bizcharts.libComponentsAnnotationDataRegionMod.AnnotationDataRegionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataRegion {
  
  inline def apply(end: AnnotationPosition, start: AnnotationPosition): SharedBuilder_AnnotationDataRegionProps_1097696747[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.DataRegion] = {
    val __props = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    new SharedBuilder_AnnotationDataRegionProps_1097696747[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.DataRegion](js.Array(this.component, __props.asInstanceOf[AnnotationDataRegionProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Annotation.DataRegion")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AnnotationDataRegionProps): SharedBuilder_AnnotationDataRegionProps_1097696747[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.DataRegion] = new SharedBuilder_AnnotationDataRegionProps_1097696747[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.DataRegion](js.Array(this.component, p.asInstanceOf[js.Any]))
}
