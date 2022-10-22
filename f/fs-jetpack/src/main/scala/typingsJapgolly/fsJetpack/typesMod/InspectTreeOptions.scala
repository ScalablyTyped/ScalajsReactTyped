package typingsJapgolly.fsJetpack.typesMod

import typingsJapgolly.fsJetpack.fsJetpackStrings.follow
import typingsJapgolly.fsJetpack.fsJetpackStrings.report
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectTreeOptions extends StObject {
  
  var checksum: js.UndefOr[Checksum] = js.undefined
  
  var relativePath: js.UndefOr[Boolean] = js.undefined
  
  var symlinks: js.UndefOr[report | follow] = js.undefined
  
  var times: js.UndefOr[Boolean] = js.undefined
}
object InspectTreeOptions {
  
  inline def apply(): InspectTreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectTreeOptions]
  }
  
  extension [Self <: InspectTreeOptions](x: Self) {
    
    inline def setChecksum(value: Checksum): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setRelativePath(value: Boolean): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    
    inline def setSymlinks(value: report | follow): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    
    inline def setTimes(value: Boolean): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
  }
}
