package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Insert extends StObject {
  
  var insert: org.scalajs.dom.Element | String
}
object Insert {
  
  inline def apply(insert: org.scalajs.dom.Element | String): Insert = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insert]
  }
  
  extension [Self <: Insert](x: Self) {
    
    inline def setInsert(value: org.scalajs.dom.Element | String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
  }
}
