package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.ImageEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofImageEditor extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ImageEditor
  
  /* static member */
  var fn: ImageEditor
}
object TypeofImageEditor {
  
  inline def apply(extend: js.Object => ImageEditor, fn: ImageEditor): TypeofImageEditor = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofImageEditor]
  }
  
  extension [Self <: TypeofImageEditor](x: Self) {
    
    inline def setExtend(value: js.Object => ImageEditor): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ImageEditor): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
