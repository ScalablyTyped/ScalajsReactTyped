package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldUserValue
  extends StObject
     with FieldLookupValue
object FieldUserValue {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_lookupId: CallbackTo[Double],
    get_lookupValue: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_lookupId: Double => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): FieldUserValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_lookupId = get_lookupId.toJsFn, get_lookupValue = get_lookupValue.toJsFn, get_typeId = get_typeId.toJsFn, set_lookupId = js.Any.fromFunction1((t0: Double) => set_lookupId(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[FieldUserValue]
  }
}
