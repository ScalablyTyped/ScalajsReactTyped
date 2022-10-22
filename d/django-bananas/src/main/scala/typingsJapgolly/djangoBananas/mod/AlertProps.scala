package typingsJapgolly.djangoBananas.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertProps extends StObject {
  
  var agree: js.UndefOr[Boolean | String] = js.undefined
  
  var classes: Record[String, Any]
  
  var dismiss: js.UndefOr[Boolean | String] = js.undefined
  
  var keepMounted: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[Node | String] = js.undefined
  
  var onAgree: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onDismiss: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object AlertProps {
  
  inline def apply(classes: Record[String, Any]): AlertProps = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertProps]
  }
  
  extension [Self <: AlertProps](x: Self) {
    
    inline def setAgree(value: Boolean | String): Self = StObject.set(x, "agree", value.asInstanceOf[js.Any])
    
    inline def setAgreeUndefined: Self = StObject.set(x, "agree", js.undefined)
    
    inline def setClasses(value: Record[String, Any]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setDismiss(value: Boolean | String): Self = StObject.set(x, "dismiss", value.asInstanceOf[js.Any])
    
    inline def setDismissUndefined: Self = StObject.set(x, "dismiss", js.undefined)
    
    inline def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
    
    inline def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
    
    inline def setMessage(value: Node | String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "message", js.Array(value*))
    
    inline def setMessageVdomElement(value: VdomElement): Self = StObject.set(x, "message", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnAgree(value: CallbackTo[Any]): Self = StObject.set(x, "onAgree", value.toJsFn)
    
    inline def setOnAgreeUndefined: Self = StObject.set(x, "onAgree", js.undefined)
    
    inline def setOnClose(value: CallbackTo[Any]): Self = StObject.set(x, "onClose", value.toJsFn)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnDismiss(value: CallbackTo[Any]): Self = StObject.set(x, "onDismiss", value.toJsFn)
    
    inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
