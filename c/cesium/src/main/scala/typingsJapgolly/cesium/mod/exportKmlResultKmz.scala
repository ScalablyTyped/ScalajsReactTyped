package typingsJapgolly.cesium.mod

import org.scalajs.dom.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait exportKmlResultKmz extends StObject {
  
  var kmz: Blob
}
object exportKmlResultKmz {
  
  inline def apply(kmz: Blob): exportKmlResultKmz = {
    val __obj = js.Dynamic.literal(kmz = kmz.asInstanceOf[js.Any])
    __obj.asInstanceOf[exportKmlResultKmz]
  }
  
  extension [Self <: exportKmlResultKmz](x: Self) {
    
    inline def setKmz(value: Blob): Self = StObject.set(x, "kmz", value.asInstanceOf[js.Any])
  }
}
