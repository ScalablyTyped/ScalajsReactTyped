package typingsJapgolly.twig.mod

import typingsJapgolly.twig.anon.Twigoptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileOptions extends StObject {
  
  var filename: String
  
  var settings: Twigoptions
}
object CompileOptions {
  
  inline def apply(filename: String, settings: Twigoptions): CompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileOptions]
  }
  
  extension [Self <: CompileOptions](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Twigoptions): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
