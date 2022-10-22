package typingsJapgolly.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hide extends StObject {
  
  var hide: Double
  
  var show: Double
}
object Hide {
  
  inline def apply(hide: Double, show: Double): Hide = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hide]
  }
  
  extension [Self <: Hide](x: Self) {
    
    inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
