package typingsJapgolly.sqltoolsFormatter

import typingsJapgolly.sqltoolsFormatter.libCoreTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreParamsMod {
  
  @JSImport("@sqltools/formatter/lib/core/Params", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Params {
    def this(params: js.Object) = this()
    
    /* CompleteClass */
    override def get(hasKeyValue: Token): Any = js.native
    
    /* private */ /* CompleteClass */
    var index: Any = js.native
    
    /* CompleteClass */
    var params: js.Object = js.native
  }
  
  trait Params extends StObject {
    
    def get(hasKeyValue: Token): Any
    
    /* private */ var index: Any
    
    var params: js.Object
  }
  object Params {
    
    inline def apply(get: Token => Any, index: Any, params: js.Object): Params = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), index = index.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setGet(value: Token => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
}
