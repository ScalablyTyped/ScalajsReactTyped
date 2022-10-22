package typingsJapgolly.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZIndex extends StObject {
  
  var zIndex: js.UndefOr[String] = js.undefined
}
object ZIndex {
  
  inline def apply(): ZIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndex]
  }
  
  extension [Self <: ZIndex](x: Self) {
    
    inline def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
