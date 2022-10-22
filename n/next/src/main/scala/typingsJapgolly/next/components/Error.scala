package typingsJapgolly.next.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.next.distPagesErrorMod.ErrorProps
import typingsJapgolly.next.errorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for P & typingsJapgolly.next.distPagesErrorMod.ErrorProps because: IArray(Could't extract props from P because couldn't resolve ClassTree.) */
object Error {
  
  def apply[P](p: P & ErrorProps): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("next/error", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[P]]
  
  implicit def make[P](companion: Error.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}
