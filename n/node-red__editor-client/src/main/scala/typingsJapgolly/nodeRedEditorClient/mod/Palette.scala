package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeRedEditorClient.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Palette extends StObject {
  
  def add(nt: String, `def`: js.Object): Unit
  
  var editor: PaletteEditor
  
  def getCategories(): js.Array[Label]
  
  def hide(nt: String): Unit
  
  def init(): Unit
  
  def refresh(): Unit
  
  def remove(nt: String): Unit
  
  def show(nt: String): Unit
}
object Palette {
  
  inline def apply(
    add: (String, js.Object) => Callback,
    editor: PaletteEditor,
    getCategories: CallbackTo[js.Array[Label]],
    hide: String => Callback,
    init: Callback,
    refresh: Callback,
    remove: String => Callback,
    show: String => Callback
  ): Palette = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: String, t1: js.Object) => (add(t0, t1)).runNow()), editor = editor.asInstanceOf[js.Any], getCategories = getCategories.toJsFn, hide = js.Any.fromFunction1((t0: String) => hide(t0).runNow()), init = init.toJsFn, refresh = refresh.toJsFn, remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), show = js.Any.fromFunction1((t0: String) => show(t0).runNow()))
    __obj.asInstanceOf[Palette]
  }
  
  extension [Self <: Palette](x: Self) {
    
    inline def setAdd(value: (String, js.Object) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: String, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setEditor(value: PaletteEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setGetCategories(value: CallbackTo[js.Array[Label]]): Self = StObject.set(x, "getCategories", value.toJsFn)
    
    inline def setHide(value: String => Callback): Self = StObject.set(x, "hide", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setShow(value: String => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
