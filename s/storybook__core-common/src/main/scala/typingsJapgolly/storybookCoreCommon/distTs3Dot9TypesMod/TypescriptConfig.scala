package typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod

import typingsJapgolly.storybookCoreCommon.anon.PropFilter
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypescriptConfig extends StObject {
  
  var check: Boolean
  
  var reactDocgen: `false` | String
  
  var reactDocgenTypescriptOptions: PropFilter
}
object TypescriptConfig {
  
  inline def apply(check: Boolean, reactDocgen: `false` | String, reactDocgenTypescriptOptions: PropFilter): TypescriptConfig = {
    val __obj = js.Dynamic.literal(check = check.asInstanceOf[js.Any], reactDocgen = reactDocgen.asInstanceOf[js.Any], reactDocgenTypescriptOptions = reactDocgenTypescriptOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypescriptConfig]
  }
  
  extension [Self <: TypescriptConfig](x: Self) {
    
    inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    inline def setReactDocgen(value: `false` | String): Self = StObject.set(x, "reactDocgen", value.asInstanceOf[js.Any])
    
    inline def setReactDocgenTypescriptOptions(value: PropFilter): Self = StObject.set(x, "reactDocgenTypescriptOptions", value.asInstanceOf[js.Any])
  }
}
