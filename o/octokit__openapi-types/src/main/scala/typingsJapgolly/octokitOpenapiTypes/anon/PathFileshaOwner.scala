package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathFileshaOwner extends StObject {
  
  var path: FileshaOwner
}
object PathFileshaOwner {
  
  inline def apply(path: FileshaOwner): PathFileshaOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathFileshaOwner]
  }
  
  extension [Self <: PathFileshaOwner](x: Self) {
    
    inline def setPath(value: FileshaOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
