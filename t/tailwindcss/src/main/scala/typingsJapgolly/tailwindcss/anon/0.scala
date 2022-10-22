package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var config: String | typingsJapgolly.tailwindcss.typesConfigMod.Config
}
object `0` {
  
  inline def apply(config: String | typingsJapgolly.tailwindcss.typesConfigMod.Config): `0` = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setConfig(value: String | typingsJapgolly.tailwindcss.typesConfigMod.Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
