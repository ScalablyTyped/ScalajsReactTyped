package typingsJapgolly.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PdlInitFile extends StObject {
  
  var `pdl-init-file-entry`: js.UndefOr[String] = js.undefined
  
  var `pdl-init-file-location`: js.UndefOr[String] = js.undefined
  
  var `pdl-init-file-name`: js.UndefOr[String] = js.undefined
}
object PdlInitFile {
  
  inline def apply(): PdlInitFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdlInitFile]
  }
  
  extension [Self <: PdlInitFile](x: Self) {
    
    inline def `setPdl-init-file-entry`(value: String): Self = StObject.set(x, "pdl-init-file-entry", value.asInstanceOf[js.Any])
    
    inline def `setPdl-init-file-entryUndefined`: Self = StObject.set(x, "pdl-init-file-entry", js.undefined)
    
    inline def `setPdl-init-file-location`(value: String): Self = StObject.set(x, "pdl-init-file-location", value.asInstanceOf[js.Any])
    
    inline def `setPdl-init-file-locationUndefined`: Self = StObject.set(x, "pdl-init-file-location", js.undefined)
    
    inline def `setPdl-init-file-name`(value: String): Self = StObject.set(x, "pdl-init-file-name", value.asInstanceOf[js.Any])
    
    inline def `setPdl-init-file-nameUndefined`: Self = StObject.set(x, "pdl-init-file-name", js.undefined)
  }
}
