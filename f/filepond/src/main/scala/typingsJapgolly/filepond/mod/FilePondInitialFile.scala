package typingsJapgolly.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePondInitialFile extends StObject {
  
  var options: typingsJapgolly.filepond.anon.File
  
  /** The server file reference. */
  var source: String
}
object FilePondInitialFile {
  
  inline def apply(options: typingsJapgolly.filepond.anon.File, source: String): FilePondInitialFile = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondInitialFile]
  }
  
  extension [Self <: FilePondInitialFile](x: Self) {
    
    inline def setOptions(value: typingsJapgolly.filepond.anon.File): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
