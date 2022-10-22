package typingsJapgolly.nodeRedEditorClient.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.nodeRedEditorClient.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: JQuery[HTMLElement]
  
  var folderTools: js.UndefOr[Boolean] = js.undefined
  
  var onconfirm: js.UndefOr[js.Function1[/* item */ js.Object, Unit]] = js.undefined
  
  var onselect: js.UndefOr[js.Function1[/* item */ js.Object, Unit]] = js.undefined
}
object Container {
  
  inline def apply(container: JQuery[HTMLElement]): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setFolderTools(value: Boolean): Self = StObject.set(x, "folderTools", value.asInstanceOf[js.Any])
    
    inline def setFolderToolsUndefined: Self = StObject.set(x, "folderTools", js.undefined)
    
    inline def setOnconfirm(value: /* item */ js.Object => Callback): Self = StObject.set(x, "onconfirm", js.Any.fromFunction1((t0: /* item */ js.Object) => value(t0).runNow()))
    
    inline def setOnconfirmUndefined: Self = StObject.set(x, "onconfirm", js.undefined)
    
    inline def setOnselect(value: /* item */ js.Object => Callback): Self = StObject.set(x, "onselect", js.Any.fromFunction1((t0: /* item */ js.Object) => value(t0).runNow()))
    
    inline def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
  }
}
