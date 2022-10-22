package typingsJapgolly.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareDBSourceOptions extends StObject {
  
  var source: js.UndefOr[Any] = js.undefined
}
object ShareDBSourceOptions {
  
  inline def apply(): ShareDBSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareDBSourceOptions]
  }
  
  extension [Self <: ShareDBSourceOptions](x: Self) {
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
