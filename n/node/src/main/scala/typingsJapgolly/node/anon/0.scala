package typingsJapgolly.node.anon

import typingsJapgolly.node.nodeStrings.pkcs8
import typingsJapgolly.node.nodeStrings.sec1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var `type`: sec1 | pkcs8
}
object `0` {
  
  inline def apply(`type`: sec1 | pkcs8): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setType(value: sec1 | pkcs8): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
