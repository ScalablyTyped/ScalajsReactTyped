package typingsJapgolly.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveOptions extends StObject {
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object MoveOptions {
  
  inline def apply(): MoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveOptions]
  }
  
  extension [Self <: MoveOptions](x: Self) {
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
