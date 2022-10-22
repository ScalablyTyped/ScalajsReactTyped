package typingsJapgolly.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parcelTypes.mod.FileInvalidation
  - typingsJapgolly.parcelTypes.mod.GlobInvalidation
  - typingsJapgolly.parcelTypes.mod.FileAboveInvalidation
*/
trait FileCreateInvalidation extends StObject
object FileCreateInvalidation {
  
  inline def FileAboveInvalidation(aboveFilePath: FilePath, fileName: String): typingsJapgolly.parcelTypes.mod.FileAboveInvalidation = {
    val __obj = js.Dynamic.literal(aboveFilePath = aboveFilePath.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.FileAboveInvalidation]
  }
  
  inline def FileInvalidation(filePath: FilePath): typingsJapgolly.parcelTypes.mod.FileInvalidation = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.FileInvalidation]
  }
  
  inline def GlobInvalidation(glob: Glob): typingsJapgolly.parcelTypes.mod.GlobInvalidation = {
    val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.GlobInvalidation]
  }
}
