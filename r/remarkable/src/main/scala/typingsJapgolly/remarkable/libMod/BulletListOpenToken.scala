package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.bullet_list_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait BulletListOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_BulletListOpenToken: bullet_list_open
}
object BulletListOpenToken {
  
  inline def apply(level: Double): BulletListOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bullet_list_open")
    __obj.asInstanceOf[BulletListOpenToken]
  }
  
  extension [Self <: BulletListOpenToken](x: Self) {
    
    inline def setType(value: bullet_list_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
