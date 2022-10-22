package typingsJapgolly.naja.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultOptions extends StObject {
  
  var defaultOptions: typingsJapgolly.naja.distNajaMod.Options
}
object DefaultOptions {
  
  inline def apply(defaultOptions: typingsJapgolly.naja.distNajaMod.Options): DefaultOptions = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
  
  extension [Self <: DefaultOptions](x: Self) {
    
    inline def setDefaultOptions(value: typingsJapgolly.naja.distNajaMod.Options): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
  }
}
