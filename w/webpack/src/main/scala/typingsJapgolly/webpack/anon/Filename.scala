package typingsJapgolly.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filename extends StObject {
  
  var filename: String
  
  var module: typingsJapgolly.webpack.mod.Module
}
object Filename {
  
  inline def apply(filename: String, module: typingsJapgolly.webpack.mod.Module): Filename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filename]
  }
  
  extension [Self <: Filename](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setModule(value: typingsJapgolly.webpack.mod.Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
  }
}
