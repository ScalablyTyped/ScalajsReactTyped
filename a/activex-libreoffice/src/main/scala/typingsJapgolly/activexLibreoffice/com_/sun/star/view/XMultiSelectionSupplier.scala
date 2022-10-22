package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to append and remove objects from a selection.
  *
  * The method XSelectionSupplier::setSelection() for an instance that also supports {@link XMultiSelectionSupplier} should be implemented that it also
  * takes either a selectable object or a sequence of selectable objects.
  *
  * Adding an object more than once to a selection should not toggle the selection for that object but only select it once
  */
trait XMultiSelectionSupplier
  extends StObject
     with XSelectionSupplier {
  
  /** returns the number of selected objects of this {@link XMultiSelectionSupplier} . */
  val SelectionCount: Double
  
  /**
    * adds the object or the objects represented by **Selection** to the selection of this {@link XMultiSelectionSupplier} .
    * @param Selection either an Object that is selectable or a sequence of objects that are selectable.
    * @returns `TRUE` /, if **Selection** was added to the current selection. `FALSE` , if **Selection** or parts of **Selection** could not be added to the cur
    * @throws com::sun::star::lang::IllegalArgumentException If **Selection** is not a selectable object for this {@link XMultiSelectionSupplier} . Adding an o
    */
  def addSelection(Selection: Any): Boolean
  
  /** clears the selection of this {@link XMultiSelectionSupplier} . */
  def clearSelection(): Unit
  
  /** @returns a new object to enumerate the selection of this {@link XMultiSelectionSupplier} in reverse order. If the order of the selected objects It returns */
  def createReverseSelectionEnumeration(): XEnumeration
  
  /** @returns a new object to enumerate the selection of this {@link XMultiSelectionSupplier} . It returns NULL if there are no objects in the selection. */
  def createSelectionEnumeration(): XEnumeration
  
  /** returns the number of selected objects of this {@link XMultiSelectionSupplier} . */
  def getSelectionCount(): Double
  
  /**
    * remove the object or objects represented by **Selection** from the selection of this {@link XMultiSelectionSupplier} .
    * @param Selection either an Object that is selectable or a sequence of objects that are selectable.
    * @returns `TRUE` /, if **Selection** was added to the current selection. `FALSE` , if **Selection** or parts of **Selection** could not be added to the cur
    * @throws com::sun::star::lang::IllegalArgumentException If **Selection** is not a selectable object for this {@link XMultiSelectionSupplier} . Removing an
    */
  def removeSelection(Selection: Any): Unit
}
object XMultiSelectionSupplier {
  
  inline def apply(
    Selection: Any,
    SelectionCount: Double,
    acquire: Callback,
    addSelection: Any => Boolean,
    addSelectionChangeListener: XSelectionChangeListener => Callback,
    clearSelection: Callback,
    createReverseSelectionEnumeration: CallbackTo[XEnumeration],
    createSelectionEnumeration: CallbackTo[XEnumeration],
    getSelection: CallbackTo[Any],
    getSelectionCount: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    removeSelection: Any => Callback,
    removeSelectionChangeListener: XSelectionChangeListener => Callback,
    select: Any => Boolean
  ): XMultiSelectionSupplier = {
    val __obj = js.Dynamic.literal(Selection = Selection.asInstanceOf[js.Any], SelectionCount = SelectionCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, addSelection = js.Any.fromFunction1(addSelection), addSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => addSelectionChangeListener(t0).runNow()), clearSelection = clearSelection.toJsFn, createReverseSelectionEnumeration = createReverseSelectionEnumeration.toJsFn, createSelectionEnumeration = createSelectionEnumeration.toJsFn, getSelection = getSelection.toJsFn, getSelectionCount = getSelectionCount.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSelection = js.Any.fromFunction1((t0: Any) => removeSelection(t0).runNow()), removeSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => removeSelectionChangeListener(t0).runNow()), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[XMultiSelectionSupplier]
  }
  
  extension [Self <: XMultiSelectionSupplier](x: Self) {
    
    inline def setAddSelection(value: Any => Boolean): Self = StObject.set(x, "addSelection", js.Any.fromFunction1(value))
    
    inline def setClearSelection(value: Callback): Self = StObject.set(x, "clearSelection", value.toJsFn)
    
    inline def setCreateReverseSelectionEnumeration(value: CallbackTo[XEnumeration]): Self = StObject.set(x, "createReverseSelectionEnumeration", value.toJsFn)
    
    inline def setCreateSelectionEnumeration(value: CallbackTo[XEnumeration]): Self = StObject.set(x, "createSelectionEnumeration", value.toJsFn)
    
    inline def setGetSelectionCount(value: CallbackTo[Double]): Self = StObject.set(x, "getSelectionCount", value.toJsFn)
    
    inline def setRemoveSelection(value: Any => Callback): Self = StObject.set(x, "removeSelection", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSelectionCount(value: Double): Self = StObject.set(x, "SelectionCount", value.asInstanceOf[js.Any])
  }
}
