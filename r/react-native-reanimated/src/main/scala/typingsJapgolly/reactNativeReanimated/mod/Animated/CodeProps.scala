package typingsJapgolly.reactNativeReanimated.mod.Animated

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeProps extends StObject {
  
  var children: js.UndefOr[js.Function0[AnimatedNode[Double]]] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[Any]] = js.undefined
  
  var exec: js.UndefOr[AnimatedNode[Double]] = js.undefined
}
object CodeProps {
  
  inline def apply(): CodeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeProps]
  }
  
  extension [Self <: CodeProps](x: Self) {
    
    inline def setChildren(value: CallbackTo[AnimatedNode[Double]]): Self = StObject.set(x, "children", value.toJsFn)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDependencies(value: js.Array[Any]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: Any*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setExec(value: AnimatedNode[Double]): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
  }
}
