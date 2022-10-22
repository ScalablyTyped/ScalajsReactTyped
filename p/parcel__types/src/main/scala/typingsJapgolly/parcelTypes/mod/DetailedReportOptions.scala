package typingsJapgolly.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedReportOptions extends StObject {
  
  var assetsPerBundle: js.UndefOr[Double] = js.undefined
}
object DetailedReportOptions {
  
  inline def apply(): DetailedReportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailedReportOptions]
  }
  
  extension [Self <: DetailedReportOptions](x: Self) {
    
    inline def setAssetsPerBundle(value: Double): Self = StObject.set(x, "assetsPerBundle", value.asInstanceOf[js.Any])
    
    inline def setAssetsPerBundleUndefined: Self = StObject.set(x, "assetsPerBundle", js.undefined)
  }
}
