package typingsJapgolly.expressValidator.anon

import typingsJapgolly.expressValidator.srcValidationResultMod.ResultFactory
import typingsJapgolly.expressValidator.srcValidationResultMod.ResultFactoryBuilderOptions
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithDefaults extends StObject {
  
  def withDefaults[T](): ResultFactory[T]
  def withDefaults[T](options: Partial[ResultFactoryBuilderOptions[T]]): ResultFactory[T]
  @JSName("withDefaults")
  var withDefaults_Original: FnCall
}
object WithDefaults {
  
  inline def apply(withDefaults: FnCall): WithDefaults = {
    val __obj = js.Dynamic.literal(withDefaults = withDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithDefaults]
  }
  
  extension [Self <: WithDefaults](x: Self) {
    
    inline def setWithDefaults(value: FnCall): Self = StObject.set(x, "withDefaults", value.asInstanceOf[js.Any])
  }
}
