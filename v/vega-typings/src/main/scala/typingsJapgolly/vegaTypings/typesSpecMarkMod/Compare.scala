package typingsJapgolly.vegaTypings.typesSpecMarkMod

import typingsJapgolly.vegaTypings.typesSpecExprMod.ExprRef
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.anon.Order
  - typingsJapgolly.vegaTypings.anon.FieldOrder
*/
trait Compare extends StObject
object Compare {
  
  inline def FieldOrder(field: js.Array[String | ExprRef | SignalRef]): typingsJapgolly.vegaTypings.anon.FieldOrder = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.FieldOrder]
  }
  
  inline def Order(field: String | ExprRef | SignalRef): typingsJapgolly.vegaTypings.anon.Order = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.Order]
  }
}
