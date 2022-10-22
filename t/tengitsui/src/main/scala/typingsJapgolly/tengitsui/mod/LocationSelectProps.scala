package typingsJapgolly.tengitsui.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationSelectProps extends StObject {
  
  var fields: Location
  
  var onChange: typingsJapgolly.tengitsui.mod.onChange
  
  var opts: LocationSelectOpts
}
object LocationSelectProps {
  
  inline def apply(fields: Location, onChange: /* value */ Any => Callback, opts: LocationSelectOpts): LocationSelectProps = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: /* value */ Any) => onChange(t0).runNow()), opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationSelectProps]
  }
  
  extension [Self <: LocationSelectProps](x: Self) {
    
    inline def setFields(value: Location): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: /* value */ Any => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def setOpts(value: LocationSelectOpts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
  }
}
