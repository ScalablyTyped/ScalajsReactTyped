package typingsJapgolly.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  /**
    * default = 'DefaultLayout'
    */
  var default: String
  
  /**
    * Array of base paths for the layouts.
    *  basePaths = ['../src/client/js/Layouts']
    * 
    * @type {string[]}
    */
  var basePaths: js.Array[String]
}
object Default {
  
  inline def apply(basePaths: js.Array[String], default: String): Default = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  extension [Self <: Default](x: Self) {
    
    inline def setBasePaths(value: js.Array[String]): Self = StObject.set(x, "basePaths", value.asInstanceOf[js.Any])
    
    inline def setBasePathsVarargs(value: String*): Self = StObject.set(x, "basePaths", js.Array(value*))
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
