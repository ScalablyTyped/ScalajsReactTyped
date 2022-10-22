package typingsJapgolly.grommet.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  var checked: js.UndefOr[
    Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
  ] = js.undefined
  
  var indeterminate: js.UndefOr[Any] = js.undefined
}
object Checked {
  
  inline def apply(): Checked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checked]
  }
  
  extension [Self <: Checked](x: Self) {
    
    inline def setChecked(
      value: Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
    ): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedNull: Self = StObject.set(x, "checked", null)
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setCheckedVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "checked", js.Array(value*))
    
    inline def setCheckedVdomElement(value: VdomElement): Self = StObject.set(x, "checked", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIndeterminate(value: Any): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
  }
}
