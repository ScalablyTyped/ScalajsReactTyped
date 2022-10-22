package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ascending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionHeader
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var direction: ascending | descending
  
  var header: org.scalajs.dom.Element
}
object DirectionHeader {
  
  inline def apply(direction: ascending | descending, header: org.scalajs.dom.Element): DirectionHeader = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionHeader]
  }
  
  extension [Self <: DirectionHeader](x: Self) {
    
    inline def setDirection(value: ascending | descending): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: org.scalajs.dom.Element): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
