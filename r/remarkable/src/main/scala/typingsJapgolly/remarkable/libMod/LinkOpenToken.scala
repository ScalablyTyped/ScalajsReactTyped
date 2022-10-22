package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.link_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait LinkOpenToken
  extends StObject
     with TagToken {
  
  /**
    * Link url.
    */
  var href: String
  
  /**
    * Link title.
    */
  var title: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_LinkOpenToken: link_open
}
object LinkOpenToken {
  
  inline def apply(href: String, level: Double): LinkOpenToken = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("link_open")
    __obj.asInstanceOf[LinkOpenToken]
  }
  
  extension [Self <: LinkOpenToken](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: link_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
