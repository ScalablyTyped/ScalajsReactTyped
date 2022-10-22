package typingsJapgolly.nivoAnnotations.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.BoundAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Annotation {
  
  def apply[Datum](p: BoundAnnotation[Datum]): Builder[Datum] = new Builder[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@nivo/annotations", "Annotation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  implicit def make[Datum](companion: Annotation.type): Builder[Datum] = new Builder[Datum](js.Array(this.component, js.Dictionary.empty))()
}
