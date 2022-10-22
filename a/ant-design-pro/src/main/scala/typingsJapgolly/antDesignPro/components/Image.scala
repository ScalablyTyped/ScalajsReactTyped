package typingsJapgolly.antDesignPro.components

import typingsJapgolly.antvG2.libInterfaceMod.AnnotationPosition
import typingsJapgolly.bizcharts.libComponentsAnnotationImageMod.AnnotationImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  inline def apply(end: AnnotationPosition, src: String, start: AnnotationPosition): SharedBuilder_AnnotationImageProps_224323215[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.Image] = {
    val __props = js.Dynamic.literal(end = end.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    new SharedBuilder_AnnotationImageProps_224323215[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.Image](js.Array(this.component, __props.asInstanceOf[AnnotationImageProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Annotation.Image")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AnnotationImageProps): SharedBuilder_AnnotationImageProps_224323215[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.Image] = new SharedBuilder_AnnotationImageProps_224323215[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.Image](js.Array(this.component, p.asInstanceOf[js.Any]))
}
