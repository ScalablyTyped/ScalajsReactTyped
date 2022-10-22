package typingsJapgolly.reactSpringCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSpringCore.anon.ToState
import typingsJapgolly.reactSpringCore.distDeclarationsSrcComponentsSpringMod.SpringComponentProps
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.to
import typingsJapgolly.reactSpringTypes.utilMod.NoInfer
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.reactSpringCore.anon.ToState[State] & (typingsJapgolly.std.Omit[
typingsJapgolly.reactSpringCore.distDeclarationsSrcComponentsSpringMod.SpringComponentProps[typingsJapgolly.reactSpringTypes.utilMod.NoInfer[State]], 
typingsJapgolly.reactSpringCore.reactSpringCoreStrings.to]) because: IArray(Could't extract props from scala.Any because couldn't resolve ClassTree.) */
object SpringTo {
  
  def apply[State /* <: js.Object */](p: ToState[State] & (Omit[SpringComponentProps[NoInfer[State]], to])): Builder[State] = new Builder[State](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@react-spring/core/dist/declarations/src", "Spring_to")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[State /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  implicit def make[State /* <: js.Object */](companion: SpringTo.type): Builder[State] = new Builder[State](js.Array(this.component, js.Dictionary.empty))()
}
