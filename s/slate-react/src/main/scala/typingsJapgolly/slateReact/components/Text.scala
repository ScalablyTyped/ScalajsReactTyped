package typingsJapgolly.slateReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.slate.distInterfacesRangeMod.Range
import typingsJapgolly.slateReact.anon.Parent
import typingsJapgolly.slateReact.distComponentsEditableMod.RenderLeafProps
import typingsJapgolly.slateReact.distComponentsEditableMod.RenderPlaceholderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  inline def apply(
    decorations: js.Array[Range],
    isLast: Boolean,
    parent: typingsJapgolly.slate.distInterfacesElementMod.Element,
    renderPlaceholder: RenderPlaceholderProps => typingsJapgolly.react.mod.global.JSX.Element,
    text: typingsJapgolly.slate.distInterfacesTextMod.Text
  ): Builder = {
    val __props = js.Dynamic.literal(decorations = decorations.asInstanceOf[js.Any], isLast = isLast.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], renderPlaceholder = js.Any.fromFunction1(renderPlaceholder), text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* props */ Parent]))
  }
  
  @JSImport("slate-react/dist/components/text", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def renderLeaf(value: /* props */ RenderLeafProps => typingsJapgolly.react.mod.global.JSX.Element): this.type = set("renderLeaf", js.Any.fromFunction1(value))
  }
  
  def withProps(p: /* props */ Parent): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
