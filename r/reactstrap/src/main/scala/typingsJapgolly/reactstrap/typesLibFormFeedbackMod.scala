package typingsJapgolly.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibFormFeedbackMod {
  
  @JSImport("reactstrap/types/lib/FormFeedback", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FormFeedbackProps, js.Object, Any]
  
  type FormFeedback = japgolly.scalajs.react.facade.React.Component[FormFeedbackProps & js.Object, js.Object]
  
  trait FormFeedbackProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[Boolean] = js.undefined
    
    var valid: js.UndefOr[Boolean] = js.undefined
  }
  object FormFeedbackProps {
    
    inline def apply(): FormFeedbackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFeedbackProps]
    }
    
    extension [Self <: FormFeedbackProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
}
