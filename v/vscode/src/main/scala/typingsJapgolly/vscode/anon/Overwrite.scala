package typingsJapgolly.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overwrite extends StObject {
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object Overwrite {
  
  inline def apply(): Overwrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overwrite]
  }
  
  extension [Self <: Overwrite](x: Self) {
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
