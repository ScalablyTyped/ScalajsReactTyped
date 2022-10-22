package typingsJapgolly.paypalPaypalJs.anon

import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.alternative
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.inline_
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.left
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.none_
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.primary
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.right
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var position: js.UndefOr[left | right | top] = js.undefined
  
  var `type`: js.UndefOr[primary | alternative | inline_ | none_] = js.undefined
}
object Position {
  
  inline def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setPosition(value: left | right | top): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setType(value: primary | alternative | inline_ | none_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
