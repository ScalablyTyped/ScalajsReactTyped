package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive status change events from an {@link XDataEditor} . */
trait XDataEditorListener
  extends StObject
     with XInterface {
  
  /** is called when the state of a connected {@link XDataEditor} changes. */
  def updateDataEditorState(event: DataEditorEvent): Unit
}
object XDataEditorListener {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    updateDataEditorState: DataEditorEvent => Callback
  ): XDataEditorListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, updateDataEditorState = js.Any.fromFunction1((t0: DataEditorEvent) => updateDataEditorState(t0).runNow()))
    __obj.asInstanceOf[XDataEditorListener]
  }
  
  extension [Self <: XDataEditorListener](x: Self) {
    
    inline def setUpdateDataEditorState(value: DataEditorEvent => Callback): Self = StObject.set(x, "updateDataEditorState", js.Any.fromFunction1((t0: DataEditorEvent) => value(t0).runNow()))
  }
}
