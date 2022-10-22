package typingsJapgolly.gestalt.mod

import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleSubComponents extends StObject {
  
  var Expandable: FC[ModuleExpandableProps]
}
object ModuleSubComponents {
  
  inline def apply(Expandable: FC[ModuleExpandableProps]): ModuleSubComponents = {
    val __obj = js.Dynamic.literal(Expandable = Expandable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSubComponents]
  }
  
  extension [Self <: ModuleSubComponents](x: Self) {
    
    inline def setExpandable(value: FC[ModuleExpandableProps]): Self = StObject.set(x, "Expandable", value.asInstanceOf[js.Any])
  }
}
