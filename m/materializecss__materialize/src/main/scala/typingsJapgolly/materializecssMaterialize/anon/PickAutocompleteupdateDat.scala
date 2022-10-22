package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.materializecssMaterialize.M.AutocompleteData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Autocomplete, 'updateData'> */
trait PickAutocompleteupdateDat extends StObject {
  
  def updateData(data: AutocompleteData): Unit
  @JSName("updateData")
  var updateData_Original: js.Function1[/* data */ AutocompleteData, Unit]
}
object PickAutocompleteupdateDat {
  
  inline def apply(updateData: /* data */ AutocompleteData => Callback): PickAutocompleteupdateDat = {
    val __obj = js.Dynamic.literal(updateData = js.Any.fromFunction1((t0: /* data */ AutocompleteData) => updateData(t0).runNow()))
    __obj.asInstanceOf[PickAutocompleteupdateDat]
  }
  
  extension [Self <: PickAutocompleteupdateDat](x: Self) {
    
    inline def setUpdateData(value: /* data */ AutocompleteData => Callback): Self = StObject.set(x, "updateData", js.Any.fromFunction1((t0: /* data */ AutocompleteData) => value(t0).runNow()))
  }
}
