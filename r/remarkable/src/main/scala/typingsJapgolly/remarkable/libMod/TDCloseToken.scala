package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.td_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait TDCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_TDCloseToken: td_close
}
object TDCloseToken {
  
  inline def apply(level: Double): TDCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("td_close")
    __obj.asInstanceOf[TDCloseToken]
  }
  
  extension [Self <: TDCloseToken](x: Self) {
    
    inline def setType(value: td_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
