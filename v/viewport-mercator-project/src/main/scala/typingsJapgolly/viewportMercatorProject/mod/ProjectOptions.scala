package typingsJapgolly.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectOptions extends StObject {
  
  var topLeft: js.UndefOr[Boolean] = js.undefined
}
object ProjectOptions {
  
  inline def apply(): ProjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectOptions]
  }
  
  extension [Self <: ProjectOptions](x: Self) {
    
    inline def setTopLeft(value: Boolean): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
    
    inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
  }
}
