package typingsJapgolly.nivoAnnotations.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAnnotations.anon.Note
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.NoteSvg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnnotationNote {
  
  inline def apply[Datum](datum: Datum, note: NoteSvg[Datum], x: Double, y: Double): Builder[Datum] = {
    val __props = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder[Datum](js.Array(this.component, __props.asInstanceOf[Note[Datum]]))
  }
  
  @JSImport("@nivo/annotations/dist/types/AnnotationNote", "AnnotationNote")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[Datum](p: Note[Datum]): Builder[Datum] = new Builder[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
