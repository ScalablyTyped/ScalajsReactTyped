package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.list_item_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait ListItemCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_ListItemCloseToken: list_item_close
}
object ListItemCloseToken {
  
  inline def apply(level: Double): ListItemCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list_item_close")
    __obj.asInstanceOf[ListItemCloseToken]
  }
  
  extension [Self <: ListItemCloseToken](x: Self) {
    
    inline def setType(value: list_item_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
