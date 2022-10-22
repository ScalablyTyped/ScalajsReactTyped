package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.abbr_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait AbbrCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_AbbrCloseToken: abbr_close
}
object AbbrCloseToken {
  
  inline def apply(level: Double): AbbrCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("abbr_close")
    __obj.asInstanceOf[AbbrCloseToken]
  }
  
  extension [Self <: AbbrCloseToken](x: Self) {
    
    inline def setType(value: abbr_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
