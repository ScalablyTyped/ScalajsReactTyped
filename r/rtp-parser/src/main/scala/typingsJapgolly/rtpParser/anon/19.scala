package typingsJapgolly.rtpParser.anon

import typingsJapgolly.rtpParser.rtpParserStrings.dynamic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var name: dynamic
}
object `19` {
  
  inline def apply(): `19` = {
    val __obj = js.Dynamic.literal(name = "dynamic")
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setName(value: dynamic): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
