package typingsJapgolly.tablestore.anon

import typingsJapgolly.tablestore.tablestoreInts.`0`
import typingsJapgolly.tablestore.tablestoreInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SORTORDERASC extends StObject {
  
  var SORT_ORDER_ASC: `0`
  
  var SORT_ORDER_DESC: `1`
}
object SORTORDERASC {
  
  inline def apply(): SORTORDERASC = {
    val __obj = js.Dynamic.literal(SORT_ORDER_ASC = 0, SORT_ORDER_DESC = 1)
    __obj.asInstanceOf[SORTORDERASC]
  }
  
  extension [Self <: SORTORDERASC](x: Self) {
    
    inline def setSORT_ORDER_ASC(value: `0`): Self = StObject.set(x, "SORT_ORDER_ASC", value.asInstanceOf[js.Any])
    
    inline def setSORT_ORDER_DESC(value: `1`): Self = StObject.set(x, "SORT_ORDER_DESC", value.asInstanceOf[js.Any])
  }
}
