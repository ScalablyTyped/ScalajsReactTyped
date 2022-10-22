package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormControlMod {
  
  @JSImport("react-bootstrap/lib/FormControl", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[FormControlProps, js.Object, Any]
  @JSImport("react-bootstrap/lib/FormControl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/FormControl", "Feedback")
  @js.native
  open class Feedback ()
    extends typingsJapgolly.reactBootstrap.libFormControlFeedbackMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/FormControl", "Feedback")
  @js.native
  def Feedback: Instantiable0[typingsJapgolly.reactBootstrap.libFormControlFeedbackMod.^] = js.native
  inline def Feedback_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libFormControlFeedbackMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Feedback")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/FormControl", "Static")
  @js.native
  open class Static ()
    extends typingsJapgolly.reactBootstrap.libFormControlStaticMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/FormControl", "Static")
  @js.native
  def Static: Instantiable0[typingsJapgolly.reactBootstrap.libFormControlStaticMod.^] = js.native
  inline def Static_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libFormControlStaticMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Static")(x.asInstanceOf[js.Any])
  
  type FormControl = japgolly.scalajs.react.facade.React.Component[FormControlProps & js.Object, js.Object]
  
  trait FormControlProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[FormControlProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
    
    var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement, Unit]] = js.undefined
  }
  object FormControlProps {
    
    inline def apply(): FormControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormControlProps]
    }
    
    extension [Self <: FormControlProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      inline def setInputRef(value: /* instance */ HTMLInputElement => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: /* instance */ HTMLInputElement) => value(t0).runNow()))
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    }
  }
}
