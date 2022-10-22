package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.softbreak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait SoftbreakToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_SoftbreakToken: softbreak
}
object SoftbreakToken {
  
  inline def apply(level: Double): SoftbreakToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("softbreak")
    __obj.asInstanceOf[SoftbreakToken]
  }
  
  extension [Self <: SoftbreakToken](x: Self) {
    
    inline def setType(value: softbreak): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
