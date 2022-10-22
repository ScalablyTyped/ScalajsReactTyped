package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemGetFileOptions extends StObject {
  
  /* standard dom */
  var create: js.UndefOr[scala.Boolean] = js.undefined
}
object FileSystemGetFileOptions {
  
  inline def apply(): FileSystemGetFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemGetFileOptions]
  }
  
  extension [Self <: FileSystemGetFileOptions](x: Self) {
    
    inline def setCreate(value: scala.Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
