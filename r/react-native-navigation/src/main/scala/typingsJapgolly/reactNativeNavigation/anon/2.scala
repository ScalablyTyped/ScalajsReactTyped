package typingsJapgolly.reactNativeNavigation.anon

import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.Interpolation
import typingsJapgolly.reactNativeNavigation.reactNativeNavigationStrings.accelerateDecelerate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with Interpolation {
  
  var `type`: accelerateDecelerate
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("accelerateDecelerate")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setType(value: accelerateDecelerate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
