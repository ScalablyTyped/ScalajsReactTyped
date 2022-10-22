package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexObject extends StObject {
  
  /**
    * The path of a file to use for the application's generated HTML index.
    */
  var input: String
  
  /**
    * The output path of the application's generated HTML index file. The full provided path
    * will be used and will be considered relative to the application's configured output path.
    */
  var output: js.UndefOr[String] = js.undefined
}
object IndexObject {
  
  inline def apply(input: String): IndexObject = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexObject]
  }
  
  extension [Self <: IndexObject](x: Self) {
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
