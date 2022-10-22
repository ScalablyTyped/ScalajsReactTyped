package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XPersistObject
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a standard tab controller model. */
trait TabControllerModel
  extends StObject
     with XTabControllerModel
     with XPersistObject
object TabControllerModel {
  
  inline def apply(
    ControlModels: SafeArray[XControlModel],
    GroupControl: Boolean,
    GroupCount: Double,
    ServiceName: String,
    acquire: Callback,
    getControlModels: CallbackTo[SafeArray[XControlModel]],
    getGroup: (Double, js.Array[SeqEquiv[XControlModel]], js.Array[String]) => Callback,
    getGroupByName: (String, js.Array[SeqEquiv[XControlModel]]) => Callback,
    getGroupControl: CallbackTo[Boolean],
    getGroupCount: CallbackTo[Double],
    getServiceName: CallbackTo[String],
    queryInterface: `type` => Any,
    read: XObjectInputStream => Callback,
    release: Callback,
    setControlModels: SeqEquiv[XControlModel] => Callback,
    setGroup: (SeqEquiv[XControlModel], String) => Callback,
    setGroupControl: Boolean => Callback,
    write: XObjectOutputStream => Callback
  ): TabControllerModel = {
    val __obj = js.Dynamic.literal(ControlModels = ControlModels.asInstanceOf[js.Any], GroupControl = GroupControl.asInstanceOf[js.Any], GroupCount = GroupCount.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getControlModels = getControlModels.toJsFn, getGroup = js.Any.fromFunction3((t0: Double, t1: js.Array[SeqEquiv[XControlModel]], t2: js.Array[String]) => (getGroup(t0, t1, t2)).runNow()), getGroupByName = js.Any.fromFunction2((t0: String, t1: js.Array[SeqEquiv[XControlModel]]) => (getGroupByName(t0, t1)).runNow()), getGroupControl = getGroupControl.toJsFn, getGroupCount = getGroupCount.toJsFn, getServiceName = getServiceName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1((t0: XObjectInputStream) => read(t0).runNow()), release = release.toJsFn, setControlModels = js.Any.fromFunction1((t0: SeqEquiv[XControlModel]) => setControlModels(t0).runNow()), setGroup = js.Any.fromFunction2((t0: SeqEquiv[XControlModel], t1: String) => (setGroup(t0, t1)).runNow()), setGroupControl = js.Any.fromFunction1((t0: Boolean) => setGroupControl(t0).runNow()), write = js.Any.fromFunction1((t0: XObjectOutputStream) => write(t0).runNow()))
    __obj.asInstanceOf[TabControllerModel]
  }
}
