package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSelectorListToggleAllCheckboxMod.ToggleAllCheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToggleAllCheckbox {
  
  inline def apply(
    deselectAll: Callback,
    enabledItemsAmount: Double,
    selectAll: Callback,
    selectedEnabledItemsAmount: Double
  ): Builder = {
    val __props = js.Dynamic.literal(deselectAll = deselectAll.toJsFn, enabledItemsAmount = enabledItemsAmount.asInstanceOf[js.Any], selectAll = selectAll.toJsFn, selectedEnabledItemsAmount = selectedEnabledItemsAmount.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToggleAllCheckboxProps]))
  }
  
  @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def deselectAllText(value: String): this.type = set("deselectAllText", value.asInstanceOf[js.Any])
    
    inline def selectAllText(value: String): this.type = set("selectAllText", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToggleAllCheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
