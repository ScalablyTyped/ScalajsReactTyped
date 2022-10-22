package typingsJapgolly.nodeRedEditorClient.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.nodeRedEditorClient.mod.global.JQuery
import typingsJapgolly.nodeRedEditorClient.nodeRedEditorClientStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dir extends StObject {
  
  var container: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  
  var dir: js.UndefOr[vertical] = js.undefined
  
  var id: String
  
  var resize: js.UndefOr[js.Function2[/* size1 */ Double, /* size2 */ Double, Unit]] = js.undefined
}
object Dir {
  
  inline def apply(id: String): Dir = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dir]
  }
  
  extension [Self <: Dir](x: Self) {
    
    inline def setContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDir(value: vertical): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResize(value: (/* size1 */ Double, /* size2 */ Double) => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction2((t0: /* size1 */ Double, t1: /* size2 */ Double) => (value(t0, t1)).runNow()))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
