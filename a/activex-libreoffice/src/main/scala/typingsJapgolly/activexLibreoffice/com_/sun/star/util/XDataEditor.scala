package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** connects to a model and broadcasts status change events. */
trait XDataEditor
  extends StObject
     with XInterface {
  
  /** @returns the data model which was set by {@link XDataEditor.setModel()} . */
  var Model: XInterface
  
  /** registers a listener to receive `DataEditorEvent` s. */
  def addDataEditorListener(listener: XDataEditorListener): Unit
  
  /** @returns the data model which was set by {@link XDataEditor.setModel()} . */
  def getModel(): XInterface
  
  /** unregisters a listener. */
  def removeDataEditorListener(listener: XDataEditorListener): Unit
  
  /** connects the data editor to a data model. */
  def setModel(model: XInterface): Unit
  
  /** makes the data editor visible to the user. */
  def show(): Unit
}
object XDataEditor {
  
  inline def apply(
    Model: XInterface,
    acquire: Callback,
    addDataEditorListener: XDataEditorListener => Callback,
    getModel: CallbackTo[XInterface],
    queryInterface: `type` => Any,
    release: Callback,
    removeDataEditorListener: XDataEditorListener => Callback,
    setModel: XInterface => Callback,
    show: Callback
  ): XDataEditor = {
    val __obj = js.Dynamic.literal(Model = Model.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDataEditorListener = js.Any.fromFunction1((t0: XDataEditorListener) => addDataEditorListener(t0).runNow()), getModel = getModel.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDataEditorListener = js.Any.fromFunction1((t0: XDataEditorListener) => removeDataEditorListener(t0).runNow()), setModel = js.Any.fromFunction1((t0: XInterface) => setModel(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[XDataEditor]
  }
  
  extension [Self <: XDataEditor](x: Self) {
    
    inline def setAddDataEditorListener(value: XDataEditorListener => Callback): Self = StObject.set(x, "addDataEditorListener", js.Any.fromFunction1((t0: XDataEditorListener) => value(t0).runNow()))
    
    inline def setGetModel(value: CallbackTo[XInterface]): Self = StObject.set(x, "getModel", value.toJsFn)
    
    inline def setModel(value: XInterface): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setRemoveDataEditorListener(value: XDataEditorListener => Callback): Self = StObject.set(x, "removeDataEditorListener", js.Any.fromFunction1((t0: XDataEditorListener) => value(t0).runNow()))
    
    inline def setSetModel(value: XInterface => Callback): Self = StObject.set(x, "setModel", js.Any.fromFunction1((t0: XInterface) => value(t0).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
