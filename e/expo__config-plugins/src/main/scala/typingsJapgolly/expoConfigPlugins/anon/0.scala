package typingsJapgolly.expoConfigPlugins.anon

import typingsJapgolly.expoConfigPlugins.buildAndroidPropertiesMod.PropertiesItem
import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with PropertiesItem {
  
  var `type`: empty
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("empty")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setType(value: empty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
