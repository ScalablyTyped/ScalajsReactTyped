package typingsJapgolly.atlaskitPopper.components

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitPopper.distTypesPopperMod.CustomPopperProps
import typingsJapgolly.atlaskitPopper.distTypesPopperMod.Offset
import typingsJapgolly.reactPopper.mod.Modifier
import typingsJapgolly.reactPopper.mod.PopperChildrenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popper {
  
  inline def apply[CustomModifiers](): Builder[CustomModifiers] = {
    val __props = js.Dynamic.literal()
    new Builder[CustomModifiers](js.Array(this.component, __props.asInstanceOf[CustomPopperProps[CustomModifiers]]))
  }
  
  @JSImport("@atlaskit/popper", "Popper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[CustomModifiers] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: /* childrenProps */ PopperChildrenProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def modifiers(value: js.Array[Modifier[CustomModifiers, js.Object]]): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    inline def modifiersVarargs(value: (Modifier[CustomModifiers, js.Object])*): this.type = set("modifiers", js.Array(value*))
    
    inline def offset(value: Offset): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def placement(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
    ): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def referenceElement(
      value: HTMLElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any)
    ): this.type = set("referenceElement", value.asInstanceOf[js.Any])
    
    inline def strategy(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.PositioningStrategy */ Any
    ): this.type = set("strategy", value.asInstanceOf[js.Any])
  }
  
  implicit def make[CustomModifiers](companion: Popper.type): Builder[CustomModifiers] = new Builder[CustomModifiers](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[CustomModifiers](p: CustomPopperProps[CustomModifiers]): Builder[CustomModifiers] = new Builder[CustomModifiers](js.Array(this.component, p.asInstanceOf[js.Any]))
}
