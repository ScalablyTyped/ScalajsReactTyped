package typingsJapgolly.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlyFromCamera extends StObject {
  
  var onlyFromCamera: js.UndefOr[Boolean] = js.undefined
  
  var scanType: js.UndefOr[js.Array[String]] = js.undefined
}
object OnlyFromCamera {
  
  inline def apply(): OnlyFromCamera = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlyFromCamera]
  }
  
  extension [Self <: OnlyFromCamera](x: Self) {
    
    inline def setOnlyFromCamera(value: Boolean): Self = StObject.set(x, "onlyFromCamera", value.asInstanceOf[js.Any])
    
    inline def setOnlyFromCameraUndefined: Self = StObject.set(x, "onlyFromCamera", js.undefined)
    
    inline def setScanType(value: js.Array[String]): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
    
    inline def setScanTypeVarargs(value: String*): Self = StObject.set(x, "scanType", js.Array(value*))
  }
}
