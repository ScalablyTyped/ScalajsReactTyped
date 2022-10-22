package typingsJapgolly.tengitsui.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tengitsui.mod.BaseProps
  - typingsJapgolly.tengitsui.anon.Value
*/
trait RangePickerProps extends StObject
object RangePickerProps {
  
  inline def BaseProps(field: String, onChange: Callback, options: js.Array[Option_], opts: BaseOpts): typingsJapgolly.tengitsui.mod.BaseProps = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], onChange = onChange.toJsFn, options = options.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tengitsui.mod.BaseProps]
  }
  
  inline def Value(): typingsJapgolly.tengitsui.anon.Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.tengitsui.anon.Value]
  }
}
