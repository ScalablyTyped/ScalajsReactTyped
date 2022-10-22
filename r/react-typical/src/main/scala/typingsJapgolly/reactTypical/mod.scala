package typingsJapgolly.reactTypical

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-typical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ReactTypicalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ReactTypicalProps extends StObject {
    
    var loop: js.UndefOr[Double] = js.undefined
    
    var steps: js.Array[String | Double]
    
    var wrapper: js.UndefOr[String] = js.undefined
  }
  object ReactTypicalProps {
    
    inline def apply(steps: js.Array[String | Double]): ReactTypicalProps = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTypicalProps]
    }
    
    extension [Self <: ReactTypicalProps](x: Self) {
      
      inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setSteps(value: js.Array[String | Double]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: (String | Double)*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
}
