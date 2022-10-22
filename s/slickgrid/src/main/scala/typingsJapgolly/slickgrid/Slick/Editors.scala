package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Editors {
  
  trait Checkbox[T /* <: SlickData */]
    extends StObject
       with Editor[T]
  object Checkbox {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Callback,
      destroy: Callback,
      focus: Callback,
      init: Callback,
      isValueChanged: CallbackTo[Boolean],
      loadValue: T => Callback,
      serializeValue: CallbackTo[Any],
      validate: CallbackTo[ValidateResults]
    ): Checkbox[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2((t0: T, t1: String) => (applyValue(t0, t1)).runNow()), destroy = destroy.toJsFn, focus = focus.toJsFn, init = init.toJsFn, isValueChanged = isValueChanged.toJsFn, loadValue = js.Any.fromFunction1((t0: T) => loadValue(t0).runNow()), serializeValue = serializeValue.toJsFn, validate = validate.toJsFn)
      __obj.asInstanceOf[Checkbox[T]]
    }
  }
  
  trait Date[T /* <: SlickData */]
    extends StObject
       with Editor[T] {
    
    def hide(): Unit
    
    def position(position: Position): Unit
    
    def show(): Unit
  }
  object Date {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Callback,
      destroy: Callback,
      focus: Callback,
      hide: Callback,
      init: Callback,
      isValueChanged: CallbackTo[Boolean],
      loadValue: T => Callback,
      position: Position => Callback,
      serializeValue: CallbackTo[Any],
      show: Callback,
      validate: CallbackTo[ValidateResults]
    ): Date[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2((t0: T, t1: String) => (applyValue(t0, t1)).runNow()), destroy = destroy.toJsFn, focus = focus.toJsFn, hide = hide.toJsFn, init = init.toJsFn, isValueChanged = isValueChanged.toJsFn, loadValue = js.Any.fromFunction1((t0: T) => loadValue(t0).runNow()), position = js.Any.fromFunction1((t0: Position) => position(t0).runNow()), serializeValue = serializeValue.toJsFn, show = show.toJsFn, validate = validate.toJsFn)
      __obj.asInstanceOf[Date[T]]
    }
    
    extension [Self <: Date[?], T /* <: SlickData */](x: Self & Date[T]) {
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setPosition(value: Position => Callback): Self = StObject.set(x, "position", js.Any.fromFunction1((t0: Position) => value(t0).runNow()))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait Editor[T /* <: SlickData */] extends StObject {
    
    def applyValue(item: T, state: String): Unit
    
    def destroy(): Unit
    
    def focus(): Unit
    
    def init(): Unit
    
    def isValueChanged(): Boolean
    
    def loadValue(item: T): Unit
    
    def serializeValue(): Any
    
    def validate(): ValidateResults
  }
  object Editor {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Callback,
      destroy: Callback,
      focus: Callback,
      init: Callback,
      isValueChanged: CallbackTo[Boolean],
      loadValue: T => Callback,
      serializeValue: CallbackTo[Any],
      validate: CallbackTo[ValidateResults]
    ): Editor[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2((t0: T, t1: String) => (applyValue(t0, t1)).runNow()), destroy = destroy.toJsFn, focus = focus.toJsFn, init = init.toJsFn, isValueChanged = isValueChanged.toJsFn, loadValue = js.Any.fromFunction1((t0: T) => loadValue(t0).runNow()), serializeValue = serializeValue.toJsFn, validate = validate.toJsFn)
      __obj.asInstanceOf[Editor[T]]
    }
    
    extension [Self <: Editor[?], T /* <: SlickData */](x: Self & Editor[T]) {
      
      inline def setApplyValue(value: (T, String) => Callback): Self = StObject.set(x, "applyValue", js.Any.fromFunction2((t0: T, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setIsValueChanged(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValueChanged", value.toJsFn)
      
      inline def setLoadValue(value: T => Callback): Self = StObject.set(x, "loadValue", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setSerializeValue(value: CallbackTo[Any]): Self = StObject.set(x, "serializeValue", value.toJsFn)
      
      inline def setValidate(value: CallbackTo[ValidateResults]): Self = StObject.set(x, "validate", value.toJsFn)
    }
  }
  
  trait EditorOptions[T /* <: SlickData */] extends StObject {
    
    var cancelChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var column: Column[T]
    
    var commitChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var container: HTMLElement
    
    var grid: Grid[T]
    
    var gridPosition: js.UndefOr[CellPosition] = js.undefined
    
    var item: js.UndefOr[T] = js.undefined
    
    var position: js.UndefOr[CellPosition] = js.undefined
  }
  object EditorOptions {
    
    inline def apply[T /* <: SlickData */](column: Column[T], container: HTMLElement, grid: Grid[T]): EditorOptions[T] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorOptions[T]]
    }
    
    extension [Self <: EditorOptions[?], T /* <: SlickData */](x: Self & EditorOptions[T]) {
      
      inline def setCancelChanges(value: Callback): Self = StObject.set(x, "cancelChanges", value.toJsFn)
      
      inline def setCancelChangesUndefined: Self = StObject.set(x, "cancelChanges", js.undefined)
      
      inline def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setCommitChanges(value: Callback): Self = StObject.set(x, "commitChanges", value.toJsFn)
      
      inline def setCommitChangesUndefined: Self = StObject.set(x, "commitChanges", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: Grid[T]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridPosition(value: CellPosition): Self = StObject.set(x, "gridPosition", value.asInstanceOf[js.Any])
      
      inline def setGridPositionUndefined: Self = StObject.set(x, "gridPosition", js.undefined)
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setPosition(value: CellPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait Integer[T /* <: SlickData */]
    extends StObject
       with Editor[T]
  object Integer {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Callback,
      destroy: Callback,
      focus: Callback,
      init: Callback,
      isValueChanged: CallbackTo[Boolean],
      loadValue: T => Callback,
      serializeValue: CallbackTo[Any],
      validate: CallbackTo[ValidateResults]
    ): Integer[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2((t0: T, t1: String) => (applyValue(t0, t1)).runNow()), destroy = destroy.toJsFn, focus = focus.toJsFn, init = init.toJsFn, isValueChanged = isValueChanged.toJsFn, loadValue = js.Any.fromFunction1((t0: T) => loadValue(t0).runNow()), serializeValue = serializeValue.toJsFn, validate = validate.toJsFn)
      __obj.asInstanceOf[Integer[T]]
    }
  }
  
  trait LongText[T /* <: SlickData */]
    extends StObject
       with Editor[T] {
    
    def cancel(): Unit
    
    def handleKeyDown(e: org.scalajs.dom.Event): Unit
    
    def hide(): Unit
    
    def position(position: Position): Unit
    
    def save(): Unit
    
    def show(): Unit
  }
  object LongText {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Callback,
      cancel: Callback,
      destroy: Callback,
      focus: Callback,
      handleKeyDown: org.scalajs.dom.Event => Callback,
      hide: Callback,
      init: Callback,
      isValueChanged: CallbackTo[Boolean],
      loadValue: T => Callback,
      position: Position => Callback,
      save: Callback,
      serializeValue: CallbackTo[Any],
      show: Callback,
      validate: CallbackTo[ValidateResults]
    ): LongText[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2((t0: T, t1: String) => (applyValue(t0, t1)).runNow()), cancel = cancel.toJsFn, destroy = destroy.toJsFn, focus = focus.toJsFn, handleKeyDown = js.Any.fromFunction1((t0: org.scalajs.dom.Event) => handleKeyDown(t0).runNow()), hide = hide.toJsFn, init = init.toJsFn, isValueChanged = isValueChanged.toJsFn, loadValue = js.Any.fromFunction1((t0: T) => loadValue(t0).runNow()), position = js.Any.fromFunction1((t0: Position) => position(t0).runNow()), save = save.toJsFn, serializeValue = serializeValue.toJsFn, show = show.toJsFn, validate = validate.toJsFn)
      __obj.asInstanceOf[LongText[T]]
    }
    
    extension [Self <: LongText[?], T /* <: SlickData */](x: Self & LongText[T]) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setHandleKeyDown(value: org.scalajs.dom.Event => Callback): Self = StObject.set(x, "handleKeyDown", js.Any.fromFunction1((t0: org.scalajs.dom.Event) => value(t0).runNow()))
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setPosition(value: Position => Callback): Self = StObject.set(x, "position", js.Any.fromFunction1((t0: Position) => value(t0).runNow()))
      
      inline def setSave(value: Callback): Self = StObject.set(x, "save", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait PercentComplete[T /* <: SlickData */]
    extends StObject
       with Editor[T]
  object PercentComplete {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Callback,
      destroy: Callback,
      focus: Callback,
      init: Callback,
      isValueChanged: CallbackTo[Boolean],
      loadValue: T => Callback,
      serializeValue: CallbackTo[Any],
      validate: CallbackTo[ValidateResults]
    ): PercentComplete[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2((t0: T, t1: String) => (applyValue(t0, t1)).runNow()), destroy = destroy.toJsFn, focus = focus.toJsFn, init = init.toJsFn, isValueChanged = isValueChanged.toJsFn, loadValue = js.Any.fromFunction1((t0: T) => loadValue(t0).runNow()), serializeValue = serializeValue.toJsFn, validate = validate.toJsFn)
      __obj.asInstanceOf[PercentComplete[T]]
    }
  }
  
  trait Text[T /* <: SlickData */]
    extends StObject
       with Editor[T] {
    
    def getValue(): String
    
    def setValue(`val`: String): Unit
  }
  object Text {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Callback,
      destroy: Callback,
      focus: Callback,
      getValue: CallbackTo[String],
      init: Callback,
      isValueChanged: CallbackTo[Boolean],
      loadValue: T => Callback,
      serializeValue: CallbackTo[Any],
      setValue: String => Callback,
      validate: CallbackTo[ValidateResults]
    ): Text[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2((t0: T, t1: String) => (applyValue(t0, t1)).runNow()), destroy = destroy.toJsFn, focus = focus.toJsFn, getValue = getValue.toJsFn, init = init.toJsFn, isValueChanged = isValueChanged.toJsFn, loadValue = js.Any.fromFunction1((t0: T) => loadValue(t0).runNow()), serializeValue = serializeValue.toJsFn, setValue = js.Any.fromFunction1((t0: String) => setValue(t0).runNow()), validate = validate.toJsFn)
      __obj.asInstanceOf[Text[T]]
    }
    
    extension [Self <: Text[?], T /* <: SlickData */](x: Self & Text[T]) {
      
      inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setSetValue(value: String => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait YesNoSelect[T /* <: SlickData */]
    extends StObject
       with Editor[T]
  object YesNoSelect {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Callback,
      destroy: Callback,
      focus: Callback,
      init: Callback,
      isValueChanged: CallbackTo[Boolean],
      loadValue: T => Callback,
      serializeValue: CallbackTo[Any],
      validate: CallbackTo[ValidateResults]
    ): YesNoSelect[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2((t0: T, t1: String) => (applyValue(t0, t1)).runNow()), destroy = destroy.toJsFn, focus = focus.toJsFn, init = init.toJsFn, isValueChanged = isValueChanged.toJsFn, loadValue = js.Any.fromFunction1((t0: T) => loadValue(t0).runNow()), serializeValue = serializeValue.toJsFn, validate = validate.toJsFn)
      __obj.asInstanceOf[YesNoSelect[T]]
    }
  }
}
