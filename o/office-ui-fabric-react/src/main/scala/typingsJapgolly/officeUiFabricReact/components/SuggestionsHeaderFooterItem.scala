package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsDottypesMod.ISuggestionsHeaderFooterItemProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SuggestionsHeaderFooterItem {
  
  inline def apply(id: String, isSelected: Boolean, renderItem: CallbackTo[Element]): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], renderItem = renderItem.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[ISuggestionsHeaderFooterItemProps]))
  }
  
  @JSImport("office-ui-fabric-react", "SuggestionsHeaderFooterItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.SuggestionsHeaderFooterItem] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[js.Object]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ js.Object | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ js.Object | Null) => value(t0).runNow()))
    
    inline def onExecute(value: Callback): this.type = set("onExecute", value.toJsFn)
  }
  
  def withProps(p: ISuggestionsHeaderFooterItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
