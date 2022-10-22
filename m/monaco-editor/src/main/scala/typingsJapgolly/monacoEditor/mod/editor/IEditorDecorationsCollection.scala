package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.IDisposable
import typingsJapgolly.monacoEditor.mod.IEvent
import typingsJapgolly.monacoEditor.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorDecorationsCollection extends StObject {
  
  /**
    * Remove all previous decorations.
    */
  def clear(): Unit
  
  /**
    * Get the range for a decoration.
    */
  def getRange(index: Double): Range | Null
  
  /**
    * Get all ranges for decorations.
    */
  def getRanges(): js.Array[Range]
  
  /**
    * Determine if a decoration is in this collection.
    */
  def has(decoration: IModelDecoration): Boolean
  
  /**
    * Get the decorations count.
    */
  var length: Double
  
  /**
    * An event emitted when decorations change in the editor,
    * but the change is not caused by us setting or clearing the collection.
    */
  def onDidChange(listener: js.Function1[/* e */ IModelDecorationsChangedEvent, Any]): IDisposable
  def onDidChange(listener: js.Function1[/* e */ IModelDecorationsChangedEvent, Any], thisArg: Any): IDisposable
  /**
    * An event emitted when decorations change in the editor,
    * but the change is not caused by us setting or clearing the collection.
    */
  @JSName("onDidChange")
  var onDidChange_Original: IEvent[IModelDecorationsChangedEvent]
  
  /**
    * Replace all previous decorations with `newDecorations`.
    */
  def set(newDecorations: js.Array[IModelDeltaDecoration]): Unit
}
object IEditorDecorationsCollection {
  
  inline def apply(
    clear: Callback,
    getRange: Double => Range | Null,
    getRanges: CallbackTo[js.Array[Range]],
    has: IModelDecoration => Boolean,
    length: Double,
    onDidChange: (/* listener */ js.Function1[IModelDecorationsChangedEvent, Any], /* thisArg */ js.UndefOr[Any]) => IDisposable,
    set: js.Array[IModelDeltaDecoration] => Callback
  ): IEditorDecorationsCollection = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, getRange = js.Any.fromFunction1(getRange), getRanges = getRanges.toJsFn, has = js.Any.fromFunction1(has), length = length.asInstanceOf[js.Any], onDidChange = js.Any.fromFunction2(onDidChange), set = js.Any.fromFunction1((t0: js.Array[IModelDeltaDecoration]) => set(t0).runNow()))
    __obj.asInstanceOf[IEditorDecorationsCollection]
  }
  
  extension [Self <: IEditorDecorationsCollection](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setGetRange(value: Double => Range | Null): Self = StObject.set(x, "getRange", js.Any.fromFunction1(value))
    
    inline def setGetRanges(value: CallbackTo[js.Array[Range]]): Self = StObject.set(x, "getRanges", value.toJsFn)
    
    inline def setHas(value: IModelDecoration => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOnDidChange(
      value: (/* listener */ js.Function1[IModelDecorationsChangedEvent, Any], /* thisArg */ js.UndefOr[Any]) => IDisposable
    ): Self = StObject.set(x, "onDidChange", js.Any.fromFunction2(value))
    
    inline def setSet(value: js.Array[IModelDeltaDecoration] => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: js.Array[IModelDeltaDecoration]) => value(t0).runNow()))
  }
}
