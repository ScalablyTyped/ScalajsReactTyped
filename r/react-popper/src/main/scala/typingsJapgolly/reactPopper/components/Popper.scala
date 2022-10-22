package typingsJapgolly.reactPopper.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactPopper.mod.Modifier
import typingsJapgolly.reactPopper.mod.PopperChildrenProps
import typingsJapgolly.reactPopper.mod.PopperProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popper {
  
  inline def apply[Modifiers](children: PopperChildrenProps => Node): Builder[Modifiers] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder[Modifiers](js.Array(this.component, __props.asInstanceOf[PopperProps[Modifiers]]))
  }
  
  @JSImport("react-popper", "Popper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Modifiers] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactPopper.mod.Popper[Modifiers]] {
    
    inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def modifiers(value: js.Array[Modifier[Modifiers, js.Object]]): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    inline def modifiersVarargs(value: (Modifier[Modifiers, js.Object])*): this.type = set("modifiers", js.Array(value*))
    
    inline def onFirstUpdate(
      value: /* state */ Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any
        ] => Callback
    ): this.type = set("onFirstUpdate", js.Any.fromFunction1((t0: /* state */ Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any
        ]) => value(t0).runNow()))
    
    inline def placement(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any
    ): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def referenceElement(
      value: HTMLElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.VirtualElement */ Any)
    ): this.type = set("referenceElement", value.asInstanceOf[js.Any])
    
    inline def strategy(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.PositioningStrategy */ Any
    ): this.type = set("strategy", value.asInstanceOf[js.Any])
  }
  
  def withProps[Modifiers](p: PopperProps[Modifiers]): Builder[Modifiers] = new Builder[Modifiers](js.Array(this.component, p.asInstanceOf[js.Any]))
}
