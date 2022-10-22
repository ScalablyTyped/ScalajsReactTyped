package typingsJapgolly.reactMdAlert

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdPortal.typesConditionalPortalMod.RenderConditionalPortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSnackbarMod {
  
  @JSImport("@react-md/alert/types/Snackbar", "Snackbar")
  @js.native
  val Snackbar: ForwardRefExoticComponent[SnackbarProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdAlert.reactMdAlertStrings.bottom
    - typingsJapgolly.reactMdAlert.reactMdAlertStrings.top
  */
  trait SnackbarPosition extends StObject
  object SnackbarPosition {
    
    inline def bottom: typingsJapgolly.reactMdAlert.reactMdAlertStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.reactMdAlert.reactMdAlertStrings.bottom]
    
    inline def top: typingsJapgolly.reactMdAlert.reactMdAlertStrings.top = "top".asInstanceOf[typingsJapgolly.reactMdAlert.reactMdAlertStrings.top]
  }
  
  trait SnackbarProps
    extends StObject
       with HTMLAttributes[HTMLDivElement]
       with RenderConditionalPortalProps {
    
    /**
      * The id for the snackbar element. This is required for a11y.
      */
    @JSName("id")
    var id_SnackbarProps: String
    
    /**
      * The position for the snackbar to be fixed within the viewport or a
      * container element.
      */
    var position: js.UndefOr[SnackbarPosition] = js.undefined
  }
  object SnackbarProps {
    
    inline def apply(id: String): SnackbarProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnackbarProps]
    }
    
    extension [Self <: SnackbarProps](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: SnackbarPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
