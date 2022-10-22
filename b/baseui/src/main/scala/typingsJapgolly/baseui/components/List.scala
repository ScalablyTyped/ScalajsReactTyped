package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.NewIndex
import typingsJapgolly.baseui.dndListTypesMod.ListOverrides
import typingsJapgolly.baseui.dndListTypesMod.ListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  inline def apply(items: js.Array[Node], onChange: NewIndex => Any): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[ListProps]))
  }
  
  @JSImport("baseui/dnd-list", "List")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.dndListMod.List] {
    
    inline def overrides(value: ListOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def removable(value: Boolean): this.type = set("removable", value.asInstanceOf[js.Any])
    
    inline def removableByMove(value: Boolean): this.type = set("removableByMove", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
