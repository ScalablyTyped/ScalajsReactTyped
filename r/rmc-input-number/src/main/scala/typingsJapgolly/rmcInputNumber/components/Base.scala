package typingsJapgolly.rmcInputNumber.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rmcInputNumber.libBaseMod.PropsType
import typingsJapgolly.rmcInputNumber.libBaseMod.StateType
import typingsJapgolly.rmcInputNumber.libBaseMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Base {
  
  def apply[P /* <: PropsType */, S /* <: StateType */](p: P): Builder[P, S] = new Builder[P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("rmc-input-number/lib/base", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: PropsType */, S /* <: StateType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[P, S]]
  
  implicit def make[P /* <: PropsType */, S /* <: StateType */](companion: Base.type): Builder[P, S] = new Builder[P, S](js.Array(this.component, js.Dictionary.empty))()
}
