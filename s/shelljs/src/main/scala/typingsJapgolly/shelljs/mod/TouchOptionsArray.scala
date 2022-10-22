package typingsJapgolly.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchOptionsArray extends StObject {
  
  var `-d`: js.UndefOr[String] = js.undefined
  
  var `-r`: js.UndefOr[String] = js.undefined
}
object TouchOptionsArray {
  
  inline def apply(): TouchOptionsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchOptionsArray]
  }
  
  extension [Self <: TouchOptionsArray](x: Self) {
    
    inline def `set-d`(value: String): Self = StObject.set(x, "-d", value.asInstanceOf[js.Any])
    
    inline def `set-dUndefined`: Self = StObject.set(x, "-d", js.undefined)
    
    inline def `set-r`(value: String): Self = StObject.set(x, "-r", value.asInstanceOf[js.Any])
    
    inline def `set-rUndefined`: Self = StObject.set(x, "-r", js.undefined)
  }
}
