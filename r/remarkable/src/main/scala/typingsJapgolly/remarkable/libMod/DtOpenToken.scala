package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.dt_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait DtOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_DtOpenToken: dt_open
}
object DtOpenToken {
  
  inline def apply(level: Double): DtOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dt_open")
    __obj.asInstanceOf[DtOpenToken]
  }
  
  extension [Self <: DtOpenToken](x: Self) {
    
    inline def setType(value: dt_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
