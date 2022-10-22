package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to access and change the selection in a view.
  * @see OfficeDocumentView
  */
trait XSelectionSupplier
  extends StObject
     with XInterface {
  
  /** @returns the current selection.  The selection is either specified by an object which is contained in the component to which the view belongs, or it is an */
  val Selection: Any
  
  /** registers an event listener, which is called when the selection changes. */
  def addSelectionChangeListener(xListener: XSelectionChangeListener): Unit
  
  /** @returns the current selection.  The selection is either specified by an object which is contained in the component to which the view belongs, or it is an */
  def getSelection(): Any
  
  /** unregisters an event listener which was registered with {@link XSelectionSupplier.addSelectionChangeListener()} . */
  def removeSelectionChangeListener(xListener: XSelectionChangeListener): Unit
  
  /** selects the object represented by **xSelection** if it is known and selectable in this object. */
  def select(xSelection: Any): Boolean
}
object XSelectionSupplier {
  
  inline def apply(
    Selection: Any,
    acquire: Callback,
    addSelectionChangeListener: XSelectionChangeListener => Callback,
    getSelection: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback,
    removeSelectionChangeListener: XSelectionChangeListener => Callback,
    select: Any => Boolean
  ): XSelectionSupplier = {
    val __obj = js.Dynamic.literal(Selection = Selection.asInstanceOf[js.Any], acquire = acquire.toJsFn, addSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => addSelectionChangeListener(t0).runNow()), getSelection = getSelection.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => removeSelectionChangeListener(t0).runNow()), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[XSelectionSupplier]
  }
  
  extension [Self <: XSelectionSupplier](x: Self) {
    
    inline def setAddSelectionChangeListener(value: XSelectionChangeListener => Callback): Self = StObject.set(x, "addSelectionChangeListener", js.Any.fromFunction1((t0: XSelectionChangeListener) => value(t0).runNow()))
    
    inline def setGetSelection(value: CallbackTo[Any]): Self = StObject.set(x, "getSelection", value.toJsFn)
    
    inline def setRemoveSelectionChangeListener(value: XSelectionChangeListener => Callback): Self = StObject.set(x, "removeSelectionChangeListener", js.Any.fromFunction1((t0: XSelectionChangeListener) => value(t0).runNow()))
    
    inline def setSelect(value: Any => Boolean): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelection(value: Any): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
  }
}
