package typingsJapgolly.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputAsset
  extends StObject
     with PreRenderedAsset {
  
  var fileName: String
}
object OutputAsset {
  
  inline def apply(fileName: String, source: String | js.typedarray.Uint8Array): OutputAsset = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[OutputAsset]
  }
  
  extension [Self <: OutputAsset](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
