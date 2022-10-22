package typingsJapgolly.storybookAddonA11y

import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsA11YPanelMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsReportItemMod {
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/Item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Item(props: ItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ItemProps extends StObject {
    
    var item: Result
    
    var `type`: RuleType
  }
  object ItemProps {
    
    inline def apply(item: Result, `type`: RuleType): ItemProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemProps]
    }
    
    extension [Self <: ItemProps](x: Self) {
      
      inline def setItem(value: Result): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
