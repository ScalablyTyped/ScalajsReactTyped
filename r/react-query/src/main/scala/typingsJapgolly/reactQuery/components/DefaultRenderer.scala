package typingsJapgolly.reactQuery.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactQuery.typesDevtoolsExplorerMod.RendererProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultRenderer {
  
  inline def apply(
    HandleEntry: /* props */ typingsJapgolly.reactQuery.anon.Entry => Element,
    expanded: Boolean,
    pageSize: Double,
    subEntries: js.Array[typingsJapgolly.reactQuery.typesDevtoolsExplorerMod.Entry],
    subEntryPages: js.Array[js.Array[typingsJapgolly.reactQuery.typesDevtoolsExplorerMod.Entry]],
    toggleExpanded: Callback,
    `type`: String,
    value: Any
  ): Builder = {
    val __props = js.Dynamic.literal(HandleEntry = js.Any.fromFunction1(HandleEntry), expanded = expanded.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], subEntries = subEntries.asInstanceOf[js.Any], subEntryPages = subEntryPages.asInstanceOf[js.Any], toggleExpanded = toggleExpanded.toJsFn, value = value.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* props */ RendererProps]))
  }
  
  @JSImport("react-query/types/devtools/Explorer", "DefaultRenderer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: /* props */ RendererProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
