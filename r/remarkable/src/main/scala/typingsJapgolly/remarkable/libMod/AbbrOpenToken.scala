package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.abbr_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait AbbrOpenToken
  extends StObject
     with TagToken {
  
  /**
    * Abbreviation title.
    */
  var title: String
  
  @JSName("type")
  var type_AbbrOpenToken: abbr_open
}
object AbbrOpenToken {
  
  inline def apply(level: Double, title: String): AbbrOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("abbr_open")
    __obj.asInstanceOf[AbbrOpenToken]
  }
  
  extension [Self <: AbbrOpenToken](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: abbr_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
