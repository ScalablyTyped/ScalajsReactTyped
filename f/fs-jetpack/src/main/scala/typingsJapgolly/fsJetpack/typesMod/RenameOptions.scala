package typingsJapgolly.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameOptions extends StObject {
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object RenameOptions {
  
  inline def apply(): RenameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameOptions]
  }
  
  extension [Self <: RenameOptions](x: Self) {
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
