package typingsJapgolly.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum string of a display item.
  *
  * Options:
  *
  * - `LINE_ITEM`:
  *   Regular line item.
  *
  * - `SUBTOTAL`:
  *   Subtotal of all regular items.
  *
  * - `TAX`:
  *   Item for the collected tax.
  *
  * - `DISCOUNT`:
  *   Item for a discount.
  *
  * - `SHIPPING_OPTION`:
  *   Item for shipping option.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.LINE_ITEM
  - typingsJapgolly.googlepay.googlepayStrings.SUBTOTAL
  - typingsJapgolly.googlepay.googlepayStrings.TAX
  - typingsJapgolly.googlepay.googlepayStrings.DISCOUNT
  - typingsJapgolly.googlepay.googlepayStrings.SHIPPING_OPTION
*/
trait DisplayItemType extends StObject
object DisplayItemType {
  
  inline def DISCOUNT: typingsJapgolly.googlepay.googlepayStrings.DISCOUNT = "DISCOUNT".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.DISCOUNT]
  
  inline def LINE_ITEM: typingsJapgolly.googlepay.googlepayStrings.LINE_ITEM = "LINE_ITEM".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.LINE_ITEM]
  
  inline def SHIPPING_OPTION: typingsJapgolly.googlepay.googlepayStrings.SHIPPING_OPTION = "SHIPPING_OPTION".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.SHIPPING_OPTION]
  
  inline def SUBTOTAL: typingsJapgolly.googlepay.googlepayStrings.SUBTOTAL = "SUBTOTAL".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.SUBTOTAL]
  
  inline def TAX: typingsJapgolly.googlepay.googlepayStrings.TAX = "TAX".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.TAX]
}
