package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormControlFeedbackMod {
  
  @JSImport("react-bootstrap/lib/FormControlFeedback", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[FormControlFeedbackProps, js.Object, Any]
  
  type FormControlFeedback = japgolly.scalajs.react.facade.React.Component[FormControlFeedbackProps & js.Object, js.Object]
  
  trait FormControlFeedbackProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[FormControlFeedbackProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object FormControlFeedbackProps {
    
    inline def apply(): FormControlFeedbackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormControlFeedbackProps]
    }
    
    extension [Self <: FormControlFeedbackProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
