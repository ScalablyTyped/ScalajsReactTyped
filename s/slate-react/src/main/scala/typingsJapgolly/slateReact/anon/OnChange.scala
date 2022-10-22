package typingsJapgolly.slateReact.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  def onChange(editor: typingsJapgolly.slate.distInterfacesEditorMod.Editor): Unit
  
  var selectorContext: GetSlate
}
object OnChange {
  
  inline def apply(
    onChange: typingsJapgolly.slate.distInterfacesEditorMod.Editor => Callback,
    selectorContext: GetSlate
  ): OnChange = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: typingsJapgolly.slate.distInterfacesEditorMod.Editor) => onChange(t0).runNow()), selectorContext = selectorContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange]
  }
  
  extension [Self <: OnChange](x: Self) {
    
    inline def setOnChange(value: typingsJapgolly.slate.distInterfacesEditorMod.Editor => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: typingsJapgolly.slate.distInterfacesEditorMod.Editor) => value(t0).runNow()))
    
    inline def setSelectorContext(value: GetSlate): Self = StObject.set(x, "selectorContext", value.asInstanceOf[js.Any])
  }
}
