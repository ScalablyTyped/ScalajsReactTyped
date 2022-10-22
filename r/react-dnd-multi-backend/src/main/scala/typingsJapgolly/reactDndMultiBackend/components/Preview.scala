package typingsJapgolly.reactDndMultiBackend.components

import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PreviewProps<T, El> * / scala.Any because couldn't resolve ClassTree. */
object Preview {
  
  def apply[T, El /* <: Element */](
    p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PreviewProps<T, El> */ Any
  ): Builder[T, El] = new Builder[T, El](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-dnd-multi-backend/dist/esm", "Preview")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T, El /* <: Element */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  implicit def make[T, El /* <: Element */](companion: Preview.type): Builder[T, El] = new Builder[T, El](js.Array(this.component, js.Dictionary.empty))()
}
