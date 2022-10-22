package typingsJapgolly.reachDescendants.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachDescendants.anon.Children
import typingsJapgolly.reachDescendants.mod.Descendant
import typingsJapgolly.reachDescendants.mod.DescendantContextValue
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DescendantProvider {
  
  inline def apply[DescendantType /* <: Descendant[HTMLElement] */](
    context: Context[DescendantContextValue[DescendantType]],
    items: js.Array[DescendantType],
    set: SetStateAction[js.Array[DescendantType]] => Callback
  ): Builder[DescendantType] = {
    val __props = js.Dynamic.literal(context = context.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], set = js.Any.fromFunction1((t0: SetStateAction[js.Array[DescendantType]]) => set(t0).runNow()))
    new Builder[DescendantType](js.Array(this.component, __props.asInstanceOf[Children[DescendantType]]))
  }
  
  @JSImport("@reach/descendants", "DescendantProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[DescendantType /* <: Descendant[HTMLElement] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[DescendantType /* <: Descendant[HTMLElement] */](p: Children[DescendantType]): Builder[DescendantType] = new Builder[DescendantType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
