package typingsJapgolly.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerOptions
  extends StObject
     with ListOptions[ListElementStyle] {
  
  /**
    * Current working directory.
    */
  var cwd: js.UndefOr[String] = js.undefined
}
object FileManagerOptions {
  
  inline def apply(): FileManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerOptions]
  }
  
  extension [Self <: FileManagerOptions](x: Self) {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
  }
}
