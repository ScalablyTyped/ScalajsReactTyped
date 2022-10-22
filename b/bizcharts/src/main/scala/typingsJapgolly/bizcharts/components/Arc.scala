package typingsJapgolly.bizcharts.components

import typingsJapgolly.antvG2.libInterfaceMod.AnnotationPosition
import typingsJapgolly.bizcharts.libComponentsAnnotationArcMod.AnnotationArcProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Arc {
  
  inline def apply(end: AnnotationPosition, start: AnnotationPosition): SharedBuilder_AnnotationArcProps14962334[typingsJapgolly.bizcharts.mod.Annotation.Arc] = {
    val __props = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    new SharedBuilder_AnnotationArcProps14962334[typingsJapgolly.bizcharts.mod.Annotation.Arc](js.Array(this.component, __props.asInstanceOf[AnnotationArcProps]))
  }
  
  @JSImport("bizcharts", "Annotation.Arc")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AnnotationArcProps): SharedBuilder_AnnotationArcProps14962334[typingsJapgolly.bizcharts.mod.Annotation.Arc] = new SharedBuilder_AnnotationArcProps14962334[typingsJapgolly.bizcharts.mod.Annotation.Arc](js.Array(this.component, p.asInstanceOf[js.Any]))
}
