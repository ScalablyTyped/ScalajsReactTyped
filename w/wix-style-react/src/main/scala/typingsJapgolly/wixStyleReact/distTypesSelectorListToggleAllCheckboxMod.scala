package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorListToggleAllCheckboxMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox", JSImport.Default)
  @js.native
  val default: FC[ToggleAllCheckboxProps] = js.native
  
  trait ToggleAllCheckboxProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    def deselectAll(): Unit
    
    var deselectAllText: js.UndefOr[String] = js.undefined
    
    var enabledItemsAmount: Double
    
    def selectAll(): Unit
    
    var selectAllText: js.UndefOr[String] = js.undefined
    
    var selectedEnabledItemsAmount: Double
  }
  object ToggleAllCheckboxProps {
    
    inline def apply(
      deselectAll: Callback,
      enabledItemsAmount: Double,
      selectAll: Callback,
      selectedEnabledItemsAmount: Double
    ): ToggleAllCheckboxProps = {
      val __obj = js.Dynamic.literal(deselectAll = deselectAll.toJsFn, enabledItemsAmount = enabledItemsAmount.asInstanceOf[js.Any], selectAll = selectAll.toJsFn, selectedEnabledItemsAmount = selectedEnabledItemsAmount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleAllCheckboxProps]
    }
    
    extension [Self <: ToggleAllCheckboxProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDeselectAll(value: Callback): Self = StObject.set(x, "deselectAll", value.toJsFn)
      
      inline def setDeselectAllText(value: String): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
      
      inline def setDeselectAllTextUndefined: Self = StObject.set(x, "deselectAllText", js.undefined)
      
      inline def setEnabledItemsAmount(value: Double): Self = StObject.set(x, "enabledItemsAmount", value.asInstanceOf[js.Any])
      
      inline def setSelectAll(value: Callback): Self = StObject.set(x, "selectAll", value.toJsFn)
      
      inline def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
      
      inline def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
      
      inline def setSelectedEnabledItemsAmount(value: Double): Self = StObject.set(x, "selectedEnabledItemsAmount", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[ToggleAllCheckboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSelectorListToggleAllCheckboxMod.foo` */
  override def _to: FC[ToggleAllCheckboxProps] = default
}
