package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.large
import typingsJapgolly.electron.electronStrings.normal
import typingsJapgolly.electron.electronStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileIconOptions extends StObject {
  
  var size: small | normal | large
}
object FileIconOptions {
  
  inline def apply(size: small | normal | large): FileIconOptions = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileIconOptions]
  }
  
  extension [Self <: FileIconOptions](x: Self) {
    
    inline def setSize(value: small | normal | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
