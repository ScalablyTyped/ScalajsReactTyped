package typingsJapgolly.gestalt.anon

import typingsJapgolly.gestalt.gestaltStrings.`100`
import typingsJapgolly.gestalt.gestaltStrings.`200`
import typingsJapgolly.gestalt.gestaltStrings.`300`
import typingsJapgolly.gestalt.gestaltStrings.`400`
import typingsJapgolly.gestalt.gestaltStrings.`500`
import typingsJapgolly.gestalt.gestaltStrings.`600`
import typingsJapgolly.gestalt.gestaltStrings.brandPrimary
import typingsJapgolly.gestalt.gestaltStrings.dark
import typingsJapgolly.gestalt.gestaltStrings.default
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.info
import typingsJapgolly.gestalt.gestaltStrings.inverse
import typingsJapgolly.gestalt.gestaltStrings.light
import typingsJapgolly.gestalt.gestaltStrings.shopping
import typingsJapgolly.gestalt.gestaltStrings.subtle
import typingsJapgolly.gestalt.gestaltStrings.success
import typingsJapgolly.gestalt.gestaltStrings.warning
import typingsJapgolly.gestalt.mod.ExternalLinkIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color
  extends StObject
     with ExternalLinkIcon {
  
  var color: js.UndefOr[
    default | subtle | success | error | warning | info | inverse | shopping | brandPrimary | light | dark
  ] = js.undefined
  
  var size: js.UndefOr[`100` | `200` | `300` | `400` | `500` | `600`] = js.undefined
}
object Color {
  
  inline def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(
      value: default | subtle | success | error | warning | info | inverse | shopping | brandPrimary | light | dark
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: `100` | `200` | `300` | `400` | `500` | `600`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
