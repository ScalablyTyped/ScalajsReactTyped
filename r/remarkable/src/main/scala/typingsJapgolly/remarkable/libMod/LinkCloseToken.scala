package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.link_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait LinkCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_LinkCloseToken: link_close
}
object LinkCloseToken {
  
  inline def apply(level: Double): LinkCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("link_close")
    __obj.asInstanceOf[LinkCloseToken]
  }
  
  extension [Self <: LinkCloseToken](x: Self) {
    
    inline def setType(value: link_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
