package typingsJapgolly.webpack.mod

import typingsJapgolly.webpack.anon.PartialResolveOptionsWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithOptions extends StObject {
  
  /**
  	 * create a resolver with additional/different options
  	 */
  def withOptions(arg0: PartialResolveOptionsWith): ResolverWithOptions
}
object WithOptions {
  
  inline def apply(withOptions: PartialResolveOptionsWith => ResolverWithOptions): WithOptions = {
    val __obj = js.Dynamic.literal(withOptions = js.Any.fromFunction1(withOptions))
    __obj.asInstanceOf[WithOptions]
  }
  
  extension [Self <: WithOptions](x: Self) {
    
    inline def setWithOptions(value: PartialResolveOptionsWith => ResolverWithOptions): Self = StObject.set(x, "withOptions", js.Any.fromFunction1(value))
  }
}
