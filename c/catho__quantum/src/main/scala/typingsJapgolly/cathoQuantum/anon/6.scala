package typingsJapgolly.cathoQuantum.anon

import typingsJapgolly.cathoQuantum.cathoQuantumStrings.CardDotHeaderText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var displayName: CardDotHeaderText
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(displayName = "Card.HeaderText")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setDisplayName(value: CardDotHeaderText): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
