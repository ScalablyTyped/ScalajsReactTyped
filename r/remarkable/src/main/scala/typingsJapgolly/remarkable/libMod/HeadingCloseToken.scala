package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.heading_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait HeadingCloseToken
  extends StObject
     with HeadingToken {
  
  @JSName("type")
  var type_HeadingCloseToken: heading_close
}
object HeadingCloseToken {
  
  inline def apply(hLevel: HeadingValue, level: Double): HeadingCloseToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heading_close")
    __obj.asInstanceOf[HeadingCloseToken]
  }
  
  extension [Self <: HeadingCloseToken](x: Self) {
    
    inline def setType(value: heading_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
