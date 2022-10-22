package typingsJapgolly.fsJetpack.typesMod

import typingsJapgolly.fsJetpack.fsJetpackStrings.follow
import typingsJapgolly.fsJetpack.fsJetpackStrings.report
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectOptions extends StObject {
  
  var absolutePath: js.UndefOr[Boolean] = js.undefined
  
  var checksum: js.UndefOr[Checksum] = js.undefined
  
  var mode: js.UndefOr[Boolean] = js.undefined
  
  var symlinks: js.UndefOr[report | follow] = js.undefined
  
  var times: js.UndefOr[Boolean] = js.undefined
}
object InspectOptions {
  
  inline def apply(): InspectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectOptions]
  }
  
  extension [Self <: InspectOptions](x: Self) {
    
    inline def setAbsolutePath(value: Boolean): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
    
    inline def setChecksum(value: Checksum): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setMode(value: Boolean): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSymlinks(value: report | follow): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    
    inline def setTimes(value: Boolean): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
  }
}
