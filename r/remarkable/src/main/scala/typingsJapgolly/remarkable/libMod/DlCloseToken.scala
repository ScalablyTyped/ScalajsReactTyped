package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.dl_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait DlCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_DlCloseToken: dl_close
}
object DlCloseToken {
  
  inline def apply(level: Double): DlCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dl_close")
    __obj.asInstanceOf[DlCloseToken]
  }
  
  extension [Self <: DlCloseToken](x: Self) {
    
    inline def setType(value: dl_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
