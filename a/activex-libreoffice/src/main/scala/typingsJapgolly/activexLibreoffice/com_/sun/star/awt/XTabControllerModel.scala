package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the basic operations for a tab controller model. */
trait XTabControllerModel
  extends StObject
     with XInterface {
  
  /** returns the control models. */
  var ControlModels: SafeArray[XControlModel]
  
  /** returns whether the control models are grouped together. */
  var GroupControl: Boolean
  
  /** returns the number of control model groups. */
  val GroupCount: Double
  
  /** returns the control models. */
  def getControlModels(): SafeArray[XControlModel]
  
  /** returns a control model group. */
  def getGroup(nGroup: Double, Group: js.Array[SeqEquiv[XControlModel]], Name: js.Array[String]): Unit
  
  /** returns a control model group by name. */
  def getGroupByName(Name: String, Group: js.Array[SeqEquiv[XControlModel]]): Unit
  
  /** returns whether the control models are grouped together. */
  def getGroupControl(): Boolean
  
  /** returns the number of control model groups. */
  def getGroupCount(): Double
  
  /** sets the control models. */
  def setControlModels(Controls: SeqEquiv[XControlModel]): Unit
  
  /** sets a control model group. */
  def setGroup(Group: SeqEquiv[XControlModel], GroupName: String): Unit
  
  /** determines if the control models are grouped together. */
  def setGroupControl(GroupControl: Boolean): Unit
}
object XTabControllerModel {
  
  inline def apply(
    ControlModels: SafeArray[XControlModel],
    GroupControl: Boolean,
    GroupCount: Double,
    acquire: Callback,
    getControlModels: CallbackTo[SafeArray[XControlModel]],
    getGroup: (Double, js.Array[SeqEquiv[XControlModel]], js.Array[String]) => Callback,
    getGroupByName: (String, js.Array[SeqEquiv[XControlModel]]) => Callback,
    getGroupControl: CallbackTo[Boolean],
    getGroupCount: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setControlModels: SeqEquiv[XControlModel] => Callback,
    setGroup: (SeqEquiv[XControlModel], String) => Callback,
    setGroupControl: Boolean => Callback
  ): XTabControllerModel = {
    val __obj = js.Dynamic.literal(ControlModels = ControlModels.asInstanceOf[js.Any], GroupControl = GroupControl.asInstanceOf[js.Any], GroupCount = GroupCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, getControlModels = getControlModels.toJsFn, getGroup = js.Any.fromFunction3((t0: Double, t1: js.Array[SeqEquiv[XControlModel]], t2: js.Array[String]) => (getGroup(t0, t1, t2)).runNow()), getGroupByName = js.Any.fromFunction2((t0: String, t1: js.Array[SeqEquiv[XControlModel]]) => (getGroupByName(t0, t1)).runNow()), getGroupControl = getGroupControl.toJsFn, getGroupCount = getGroupCount.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setControlModels = js.Any.fromFunction1((t0: SeqEquiv[XControlModel]) => setControlModels(t0).runNow()), setGroup = js.Any.fromFunction2((t0: SeqEquiv[XControlModel], t1: String) => (setGroup(t0, t1)).runNow()), setGroupControl = js.Any.fromFunction1((t0: Boolean) => setGroupControl(t0).runNow()))
    __obj.asInstanceOf[XTabControllerModel]
  }
  
  extension [Self <: XTabControllerModel](x: Self) {
    
    inline def setControlModels(value: SafeArray[XControlModel]): Self = StObject.set(x, "ControlModels", value.asInstanceOf[js.Any])
    
    inline def setGetControlModels(value: CallbackTo[SafeArray[XControlModel]]): Self = StObject.set(x, "getControlModels", value.toJsFn)
    
    inline def setGetGroup(value: (Double, js.Array[SeqEquiv[XControlModel]], js.Array[String]) => Callback): Self = StObject.set(x, "getGroup", js.Any.fromFunction3((t0: Double, t1: js.Array[SeqEquiv[XControlModel]], t2: js.Array[String]) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetGroupByName(value: (String, js.Array[SeqEquiv[XControlModel]]) => Callback): Self = StObject.set(x, "getGroupByName", js.Any.fromFunction2((t0: String, t1: js.Array[SeqEquiv[XControlModel]]) => (value(t0, t1)).runNow()))
    
    inline def setGetGroupControl(value: CallbackTo[Boolean]): Self = StObject.set(x, "getGroupControl", value.toJsFn)
    
    inline def setGetGroupCount(value: CallbackTo[Double]): Self = StObject.set(x, "getGroupCount", value.toJsFn)
    
    inline def setGroupControl(value: Boolean): Self = StObject.set(x, "GroupControl", value.asInstanceOf[js.Any])
    
    inline def setGroupCount(value: Double): Self = StObject.set(x, "GroupCount", value.asInstanceOf[js.Any])
    
    inline def setSetControlModels(value: SeqEquiv[XControlModel] => Callback): Self = StObject.set(x, "setControlModels", js.Any.fromFunction1((t0: SeqEquiv[XControlModel]) => value(t0).runNow()))
    
    inline def setSetGroup(value: (SeqEquiv[XControlModel], String) => Callback): Self = StObject.set(x, "setGroup", js.Any.fromFunction2((t0: SeqEquiv[XControlModel], t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetGroupControl(value: Boolean => Callback): Self = StObject.set(x, "setGroupControl", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
