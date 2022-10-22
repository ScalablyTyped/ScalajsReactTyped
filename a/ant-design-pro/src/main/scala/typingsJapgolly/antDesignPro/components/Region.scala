package typingsJapgolly.antDesignPro.components

import typingsJapgolly.antvG2.libInterfaceMod.AnnotationPosition
import typingsJapgolly.bizcharts.libComponentsAnnotationRegionMod.AnnotationRegionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Region {
  
  inline def apply(end: AnnotationPosition, start: AnnotationPosition): SharedBuilder_AnnotationRegionProps91096462[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.Region] = {
    val __props = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    new SharedBuilder_AnnotationRegionProps91096462[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.Region](js.Array(this.component, __props.asInstanceOf[AnnotationRegionProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Annotation.Region")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AnnotationRegionProps): SharedBuilder_AnnotationRegionProps91096462[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.Region] = new SharedBuilder_AnnotationRegionProps91096462[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.Region](js.Array(this.component, p.asInstanceOf[js.Any]))
}
