package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.heading_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait HeadingOpenToken
  extends StObject
     with HeadingToken {
  
  @JSName("type")
  var type_HeadingOpenToken: heading_open
}
object HeadingOpenToken {
  
  inline def apply(hLevel: HeadingValue, level: Double): HeadingOpenToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heading_open")
    __obj.asInstanceOf[HeadingOpenToken]
  }
  
  extension [Self <: HeadingOpenToken](x: Self) {
    
    inline def setType(value: heading_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
