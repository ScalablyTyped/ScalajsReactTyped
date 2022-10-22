package typingsJapgolly.blueprintjsCore.components

import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object AbstractPureComponent {
  
  def apply[P, S](p: P): Builder[P, S] = new Builder[P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@blueprintjs/core", "AbstractPureComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P, S] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.AbstractPureComponent[P, S]]
  
  implicit def make[P, S](companion: AbstractPureComponent.type): Builder[P, S] = new Builder[P, S](js.Array(this.component, js.Dictionary.empty))()
}
