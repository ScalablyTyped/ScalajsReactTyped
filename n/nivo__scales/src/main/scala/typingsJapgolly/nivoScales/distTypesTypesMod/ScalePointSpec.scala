package typingsJapgolly.nivoScales.distTypesTypesMod

import typingsJapgolly.nivoScales.nivoScalesStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalePointSpec extends StObject {
  
  var `type`: point
}
object ScalePointSpec {
  
  inline def apply(): ScalePointSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("point")
    __obj.asInstanceOf[ScalePointSpec]
  }
  
  extension [Self <: ScalePointSpec](x: Self) {
    
    inline def setType(value: point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
