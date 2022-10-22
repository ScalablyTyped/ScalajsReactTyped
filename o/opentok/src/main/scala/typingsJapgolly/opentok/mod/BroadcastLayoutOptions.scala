package typingsJapgolly.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastLayoutOptions
  extends StObject
     with BroadcastLayout {
  
  var `type`: js.UndefOr[BroadcastLayoutType] = js.undefined
}
object BroadcastLayoutOptions {
  
  inline def apply(): BroadcastLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastLayoutOptions]
  }
  
  extension [Self <: BroadcastLayoutOptions](x: Self) {
    
    inline def setType(value: BroadcastLayoutType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
