package typingsJapgolly.bizcharts.components

import typingsJapgolly.antvG2.libInterfaceMod.AnnotationPosition
import typingsJapgolly.bizcharts.libComponentsAnnotationTextMod.AnnotationTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  inline def apply(position: AnnotationPosition): SharedBuilder_AnnotationTextProps_441524409[typingsJapgolly.bizcharts.mod.Annotation.Text] = {
    val __props = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    new SharedBuilder_AnnotationTextProps_441524409[typingsJapgolly.bizcharts.mod.Annotation.Text](js.Array(this.component, __props.asInstanceOf[AnnotationTextProps]))
  }
  
  @JSImport("bizcharts", "Annotation.Text")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AnnotationTextProps): SharedBuilder_AnnotationTextProps_441524409[typingsJapgolly.bizcharts.mod.Annotation.Text] = new SharedBuilder_AnnotationTextProps_441524409[typingsJapgolly.bizcharts.mod.Annotation.Text](js.Array(this.component, p.asInstanceOf[js.Any]))
}
