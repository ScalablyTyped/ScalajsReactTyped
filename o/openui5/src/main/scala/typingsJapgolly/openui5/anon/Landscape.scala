package typingsJapgolly.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Landscape extends StObject {
  
  /**
    * Returns true if the device is in landscape mode.
    */
  var landscape: js.UndefOr[Boolean] = js.undefined
}
object Landscape {
  
  inline def apply(): Landscape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Landscape]
  }
  
  extension [Self <: Landscape](x: Self) {
    
    inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    inline def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
  }
}
