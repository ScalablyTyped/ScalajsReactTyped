package typingsJapgolly.slateReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.slate.distInterfacesRangeMod.Range
import typingsJapgolly.slateReact.anon.Decorations
import typingsJapgolly.slateReact.distComponentsEditableMod.RenderElementProps
import typingsJapgolly.slateReact.distComponentsEditableMod.RenderLeafProps
import typingsJapgolly.slateReact.distComponentsEditableMod.RenderPlaceholderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Element {
  
  inline def apply(
    decorations: js.Array[Range],
    element: typingsJapgolly.slate.distInterfacesElementMod.Element,
    renderPlaceholder: RenderPlaceholderProps => typingsJapgolly.react.mod.global.JSX.Element
  ): Builder = {
    val __props = js.Dynamic.literal(decorations = decorations.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], renderPlaceholder = js.Any.fromFunction1(renderPlaceholder))
    new Builder(js.Array(this.component, __props.asInstanceOf[/* props */ Decorations]))
  }
  
  @JSImport("slate-react/dist/components/element", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def renderElement(value: /* props */ RenderElementProps => typingsJapgolly.react.mod.global.JSX.Element): this.type = set("renderElement", js.Any.fromFunction1(value))
    
    inline def renderLeaf(value: /* props */ RenderLeafProps => typingsJapgolly.react.mod.global.JSX.Element): this.type = set("renderLeaf", js.Any.fromFunction1(value))
    
    inline def selection(value: Range): this.type = set("selection", value.asInstanceOf[js.Any])
    
    inline def selectionNull: this.type = set("selection", null)
  }
  
  def withProps(p: /* props */ Decorations): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
