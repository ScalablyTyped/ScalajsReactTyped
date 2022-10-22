package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptClass extends StObject {
  
  /**
    * The bundle name for this extra entry point.
    */
  var bundleName: js.UndefOr[String] = js.undefined
  
  /**
    * If the bundle will be referenced in the HTML file.
    */
  var inject: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The file to include.
    */
  var input: String
}
object ScriptClass {
  
  inline def apply(input: String): ScriptClass = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptClass]
  }
  
  extension [Self <: ScriptClass](x: Self) {
    
    inline def setBundleName(value: String): Self = StObject.set(x, "bundleName", value.asInstanceOf[js.Any])
    
    inline def setBundleNameUndefined: Self = StObject.set(x, "bundleName", js.undefined)
    
    inline def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
    
    inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
