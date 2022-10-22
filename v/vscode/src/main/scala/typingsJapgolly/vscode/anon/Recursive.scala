package typingsJapgolly.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recursive extends StObject {
  
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  var useTrash: js.UndefOr[Boolean] = js.undefined
}
object Recursive {
  
  inline def apply(): Recursive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recursive]
  }
  
  extension [Self <: Recursive](x: Self) {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setUseTrash(value: Boolean): Self = StObject.set(x, "useTrash", value.asInstanceOf[js.Any])
    
    inline def setUseTrashUndefined: Self = StObject.set(x, "useTrash", js.undefined)
  }
}
