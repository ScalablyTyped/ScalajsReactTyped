package typingsJapgolly.jpm.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jpm.sdkUiSidebarMod.SidebarWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var onAttach: js.UndefOr[js.Function1[/* worker */ SidebarWorker, Any]] = js.undefined
  
  var onDetach: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onReady: js.UndefOr[js.Function1[/* worker */ SidebarWorker, Any]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var title: String
  
  var url: String
}
object Id {
  
  inline def apply(title: String, url: String): Id = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOnAttach(value: /* worker */ SidebarWorker => Any): Self = StObject.set(x, "onAttach", js.Any.fromFunction1(value))
    
    inline def setOnAttachUndefined: Self = StObject.set(x, "onAttach", js.undefined)
    
    inline def setOnDetach(value: CallbackTo[Any]): Self = StObject.set(x, "onDetach", value.toJsFn)
    
    inline def setOnDetachUndefined: Self = StObject.set(x, "onDetach", js.undefined)
    
    inline def setOnHide(value: CallbackTo[Any]): Self = StObject.set(x, "onHide", value.toJsFn)
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnReady(value: /* worker */ SidebarWorker => Any): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setOnShow(value: CallbackTo[Any]): Self = StObject.set(x, "onShow", value.toJsFn)
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
