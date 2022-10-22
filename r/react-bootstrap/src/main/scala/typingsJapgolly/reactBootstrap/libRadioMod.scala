package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.error
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.success
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioMod {
  
  @JSImport("react-bootstrap/lib/Radio", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[RadioProps, js.Object, Any]
  
  type Radio = japgolly.scalajs.react.facade.React.Component[RadioProps & js.Object, js.Object]
  
  trait RadioProps
    extends StObject
       with HTMLProps[japgolly.scalajs.react.facade.React.Component[RadioProps & js.Object, js.Object]] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement, Unit]] = js.undefined
    
    var validationState: js.UndefOr[success | warning | error] = js.undefined
  }
  object RadioProps {
    
    inline def apply(): RadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioProps]
    }
    
    extension [Self <: RadioProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInputRef(value: /* instance */ HTMLInputElement => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: /* instance */ HTMLInputElement) => value(t0).runNow()))
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setValidationState(value: success | warning | error): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
}
