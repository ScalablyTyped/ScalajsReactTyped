package typingsJapgolly.atlaskitTokens.anon

import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.dark
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HardcodedSurface extends StObject {
  
  var hardcodedSurface: js.UndefOr[light | dark] = js.undefined
}
object HardcodedSurface {
  
  inline def apply(): HardcodedSurface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HardcodedSurface]
  }
  
  extension [Self <: HardcodedSurface](x: Self) {
    
    inline def setHardcodedSurface(value: light | dark): Self = StObject.set(x, "hardcodedSurface", value.asInstanceOf[js.Any])
    
    inline def setHardcodedSurfaceUndefined: Self = StObject.set(x, "hardcodedSurface", js.undefined)
  }
}
