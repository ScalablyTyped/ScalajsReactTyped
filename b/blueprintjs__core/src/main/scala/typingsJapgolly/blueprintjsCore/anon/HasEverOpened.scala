package typingsJapgolly.blueprintjsCore.anon

import typingsJapgolly.blueprintjsCore.blueprintjsCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasEverOpened extends StObject {
  
  var hasEverOpened: `true`
}
object HasEverOpened {
  
  inline def apply(): HasEverOpened = {
    val __obj = js.Dynamic.literal(hasEverOpened = true)
    __obj.asInstanceOf[HasEverOpened]
  }
  
  extension [Self <: HasEverOpened](x: Self) {
    
    inline def setHasEverOpened(value: `true`): Self = StObject.set(x, "hasEverOpened", value.asInstanceOf[js.Any])
  }
}
