package typingsJapgolly.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseImage extends StObject {
  
  var baseImage: js.UndefOr[Any] = js.undefined
  
  var baseImageRemediation: js.UndefOr[typingsJapgolly.snyk.distLibSnykTestLegacyMod.BaseImageRemediation] = js.undefined
  
  var binariesVulns: js.UndefOr[Any] = js.undefined
}
object BaseImage {
  
  inline def apply(): BaseImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseImage]
  }
  
  extension [Self <: BaseImage](x: Self) {
    
    inline def setBaseImage(value: Any): Self = StObject.set(x, "baseImage", value.asInstanceOf[js.Any])
    
    inline def setBaseImageRemediation(value: typingsJapgolly.snyk.distLibSnykTestLegacyMod.BaseImageRemediation): Self = StObject.set(x, "baseImageRemediation", value.asInstanceOf[js.Any])
    
    inline def setBaseImageRemediationUndefined: Self = StObject.set(x, "baseImageRemediation", js.undefined)
    
    inline def setBaseImageUndefined: Self = StObject.set(x, "baseImage", js.undefined)
    
    inline def setBinariesVulns(value: Any): Self = StObject.set(x, "binariesVulns", value.asInstanceOf[js.Any])
    
    inline def setBinariesVulnsUndefined: Self = StObject.set(x, "binariesVulns", js.undefined)
  }
}
