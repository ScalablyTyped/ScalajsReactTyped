package typingsJapgolly.reactNativeNavigation.anon

import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.Interpolation
import typingsJapgolly.reactNativeNavigation.reactNativeNavigationStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`
  extends StObject
     with Interpolation {
  
  var `type`: linear
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("linear")
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setType(value: linear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
