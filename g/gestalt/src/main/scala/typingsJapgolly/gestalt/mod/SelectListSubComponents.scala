package typingsJapgolly.gestalt.mod

import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectListSubComponents extends StObject {
  
  var Group: FC[SelectListGroupProps]
  
  var Option: FC[SelectListOptionProps]
}
object SelectListSubComponents {
  
  inline def apply(Group: FC[SelectListGroupProps], Option: FC[SelectListOptionProps]): SelectListSubComponents = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectListSubComponents]
  }
  
  extension [Self <: SelectListSubComponents](x: Self) {
    
    inline def setGroup(value: FC[SelectListGroupProps]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setOption(value: FC[SelectListOptionProps]): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
  }
}
