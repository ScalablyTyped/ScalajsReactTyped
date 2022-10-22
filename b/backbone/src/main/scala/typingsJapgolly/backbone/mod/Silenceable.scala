package typingsJapgolly.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Silenceable extends StObject {
  
  var silent: js.UndefOr[Boolean] = js.undefined
}
object Silenceable {
  
  inline def apply(): Silenceable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Silenceable]
  }
  
  extension [Self <: Silenceable](x: Self) {
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
