package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.dl_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait DlOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_DlOpenToken: dl_open
}
object DlOpenToken {
  
  inline def apply(level: Double): DlOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dl_open")
    __obj.asInstanceOf[DlOpenToken]
  }
  
  extension [Self <: DlOpenToken](x: Self) {
    
    inline def setType(value: dl_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
