package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.td_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait TDOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_TDOpenToken: td_open
}
object TDOpenToken {
  
  inline def apply(level: Double): TDOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("td_open")
    __obj.asInstanceOf[TDOpenToken]
  }
  
  extension [Self <: TDOpenToken](x: Self) {
    
    inline def setType(value: td_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
