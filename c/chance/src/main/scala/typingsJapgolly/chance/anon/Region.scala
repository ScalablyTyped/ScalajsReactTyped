package typingsJapgolly.chance.anon

import typingsJapgolly.chance.chanceBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  var region: `true`
}
object Region {
  
  inline def apply(): Region = {
    val __obj = js.Dynamic.literal(region = true)
    __obj.asInstanceOf[Region]
  }
  
  extension [Self <: Region](x: Self) {
    
    inline def setRegion(value: `true`): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
