package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.tr_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait TROpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_TROpenToken: tr_open
}
object TROpenToken {
  
  inline def apply(level: Double): TROpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tr_open")
    __obj.asInstanceOf[TROpenToken]
  }
  
  extension [Self <: TROpenToken](x: Self) {
    
    inline def setType(value: tr_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
