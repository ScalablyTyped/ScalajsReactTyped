package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertElement extends StObject {
  
  var insert: org.scalajs.dom.Element
}
object InsertElement {
  
  inline def apply(insert: org.scalajs.dom.Element): InsertElement = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertElement]
  }
  
  extension [Self <: InsertElement](x: Self) {
    
    inline def setInsert(value: org.scalajs.dom.Element): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
  }
}
