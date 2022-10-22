package typingsJapgolly.ipfsCoreTypes.distSrcRootMod

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.PreloadOptions
import typingsJapgolly.ipfsCoreTypes.ipfsCoreTypesInts.`-1`
import typingsJapgolly.ipfsCoreTypes.ipfsCoreTypesInts.`0`
import typingsJapgolly.ipfsCoreTypes.ipfsCoreTypesInts.`1`
import typingsJapgolly.ipfsCoreTypes.ipfsCoreTypesInts.`2`
import typingsJapgolly.ipfsCoreTypes.ipfsCoreTypesInts.`3`
import typingsJapgolly.ipfsCoreTypes.ipfsCoreTypesInts.`4`
import typingsJapgolly.ipfsCoreTypes.ipfsCoreTypesInts.`5`
import typingsJapgolly.ipfsCoreTypes.ipfsCoreTypesInts.`6`
import typingsJapgolly.ipfsCoreTypes.ipfsCoreTypesInts.`7`
import typingsJapgolly.ipfsCoreTypes.ipfsCoreTypesInts.`8`
import typingsJapgolly.ipfsCoreTypes.ipfsCoreTypesInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOptions
  extends StObject
     with AbortOptions
     with PreloadOptions {
  
  var archive: js.UndefOr[Boolean] = js.undefined
  
  var compress: js.UndefOr[Boolean] = js.undefined
  
  var compressionLevel: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
}
object GetOptions {
  
  inline def apply(): GetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOptions]
  }
  
  extension [Self <: GetOptions](x: Self) {
    
    inline def setArchive(value: Boolean): Self = StObject.set(x, "archive", value.asInstanceOf[js.Any])
    
    inline def setArchiveUndefined: Self = StObject.set(x, "archive", js.undefined)
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setCompressionLevel(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "compressionLevel", value.asInstanceOf[js.Any])
    
    inline def setCompressionLevelUndefined: Self = StObject.set(x, "compressionLevel", js.undefined)
  }
}
