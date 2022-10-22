package typingsJapgolly.reduxLogicTest

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reduxLogicTest.reduxLogicTestBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Enumerable[Actions /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any */] extends StObject {
    
    var enumerable: `true`
    
    def get(): js.Array[Actions]
  }
  object Enumerable {
    
    inline def apply[Actions /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any */](get: CallbackTo[js.Array[Actions]]): Enumerable[Actions] = {
      val __obj = js.Dynamic.literal(enumerable = true, get = get.toJsFn)
      __obj.asInstanceOf[Enumerable[Actions]]
    }
    
    extension [Self <: Enumerable[?], Actions /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any */](x: Self & Enumerable[Actions]) {
      
      inline def setEnumerable(value: `true`): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
      
      inline def setGet(value: CallbackTo[js.Array[Actions]]): Self = StObject.set(x, "get", value.toJsFn)
    }
  }
}
