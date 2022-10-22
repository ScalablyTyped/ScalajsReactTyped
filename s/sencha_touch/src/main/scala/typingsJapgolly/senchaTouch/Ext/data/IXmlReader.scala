package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXmlReader
  extends StObject
     with typingsJapgolly.senchaTouch.Ext.data.reader.IReader {
  
  /** [Method] Normalizes the data object
    * @param data Object The raw data object.
    * @returns Object Returns the documentElement property of the data object if present, or the same object if not.
    */
  var getData: js.UndefOr[js.Function1[/* data */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Returns the value of record
    * @returns String
    */
  var getRecord: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of record
    * @param record String The new value.
    */
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.undefined
}
object IXmlReader {
  
  inline def apply(): IXmlReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlReader]
  }
  
  extension [Self <: IXmlReader](x: Self) {
    
    inline def setGetData(value: /* data */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    inline def setGetRecord(value: CallbackTo[String]): Self = StObject.set(x, "getRecord", value.toJsFn)
    
    inline def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
    
    inline def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setSetRecord(value: /* record */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setRecord", js.Any.fromFunction1((t0: /* record */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
  }
}
