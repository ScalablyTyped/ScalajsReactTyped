package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.hr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait HrToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_HrToken: hr
}
object HrToken {
  
  inline def apply(level: Double): HrToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hr")
    __obj.asInstanceOf[HrToken]
  }
  
  extension [Self <: HrToken](x: Self) {
    
    inline def setType(value: hr): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
