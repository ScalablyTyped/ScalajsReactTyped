package typingsJapgolly.tinymce.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Node
import typingsJapgolly.tinymce.tinymceBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Events {
  
  trait ChangeEvent
    extends StObject
       with Event
  object ChangeEvent {
    
    inline def apply(
      isDefaultPrevented: CallbackTo[Boolean],
      isImmediatePropagationStopped: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      preventDefault: Callback,
      stopImmediatePropagation: Callback,
      stopPropagation: Callback,
      target: String,
      `type`: String
    ): ChangeEvent = {
      val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, isImmediatePropagationStopped = isImmediatePropagationStopped.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, preventDefault = preventDefault.toJsFn, stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEvent]
    }
  }
  
  trait CommandEvent
    extends StObject
       with Event {
    
    var command: String
    
    var ui: Boolean
    
    var value: String
  }
  object CommandEvent {
    
    inline def apply(
      command: String,
      isDefaultPrevented: CallbackTo[Boolean],
      isImmediatePropagationStopped: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      preventDefault: Callback,
      stopImmediatePropagation: Callback,
      stopPropagation: Callback,
      target: String,
      `type`: String,
      ui: Boolean,
      value: String
    ): CommandEvent = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isImmediatePropagationStopped = isImmediatePropagationStopped.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, preventDefault = preventDefault.toJsFn, stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandEvent]
    }
    
    extension [Self <: CommandEvent](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setUi(value: Boolean): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentEvent
    extends StObject
       with Event {
    
    var content: String
    
    var format: String
    
    var set: Boolean
  }
  object ContentEvent {
    
    inline def apply(
      content: String,
      format: String,
      isDefaultPrevented: CallbackTo[Boolean],
      isImmediatePropagationStopped: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      preventDefault: Callback,
      set: Boolean,
      stopImmediatePropagation: Callback,
      stopPropagation: Callback,
      target: String,
      `type`: String
    ): ContentEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isImmediatePropagationStopped = isImmediatePropagationStopped.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, preventDefault = preventDefault.toJsFn, set = set.asInstanceOf[js.Any], stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentEvent]
    }
    
    extension [Self <: ContentEvent](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setSet(value: Boolean): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
  
  trait Event extends StObject {
    
    def isDefaultPrevented(): Boolean
    
    def isImmediatePropagationStopped(): Boolean
    
    def isPropagationStopped(): Boolean
    
    def preventDefault(): Unit
    
    def stopImmediatePropagation(): Unit
    
    def stopPropagation(): Unit
    
    var target: String
    
    var `type`: String
  }
  object Event {
    
    inline def apply(
      isDefaultPrevented: CallbackTo[Boolean],
      isImmediatePropagationStopped: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      preventDefault: Callback,
      stopImmediatePropagation: Callback,
      stopPropagation: Callback,
      target: String,
      `type`: String
    ): Event = {
      val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, isImmediatePropagationStopped = isImmediatePropagationStopped.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, preventDefault = preventDefault.toJsFn, stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setIsDefaultPrevented(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefaultPrevented", value.toJsFn)
      
      inline def setIsImmediatePropagationStopped(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImmediatePropagationStopped", value.toJsFn)
      
      inline def setIsPropagationStopped(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPropagationStopped", value.toJsFn)
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setStopImmediatePropagation(value: Callback): Self = StObject.set(x, "stopImmediatePropagation", value.toJsFn)
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusBlurEvent
    extends StObject
       with Event {
    
    var blurredEditor: Editor
  }
  object FocusBlurEvent {
    
    inline def apply(
      blurredEditor: Editor,
      isDefaultPrevented: CallbackTo[Boolean],
      isImmediatePropagationStopped: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      preventDefault: Callback,
      stopImmediatePropagation: Callback,
      stopPropagation: Callback,
      target: String,
      `type`: String
    ): FocusBlurEvent = {
      val __obj = js.Dynamic.literal(blurredEditor = blurredEditor.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isImmediatePropagationStopped = isImmediatePropagationStopped.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, preventDefault = preventDefault.toJsFn, stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusBlurEvent]
    }
    
    extension [Self <: FocusBlurEvent](x: Self) {
      
      inline def setBlurredEditor(value: Editor): Self = StObject.set(x, "blurredEditor", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeChangeEvent
    extends StObject
       with Event {
    
    var element: Node
    
    var parents: js.Array[Node]
    
    var selectionChange: Boolean
  }
  object NodeChangeEvent {
    
    inline def apply(
      element: Node,
      isDefaultPrevented: CallbackTo[Boolean],
      isImmediatePropagationStopped: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      parents: js.Array[Node],
      preventDefault: Callback,
      selectionChange: Boolean,
      stopImmediatePropagation: Callback,
      stopPropagation: Callback,
      target: String,
      `type`: String
    ): NodeChangeEvent = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isImmediatePropagationStopped = isImmediatePropagationStopped.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, parents = parents.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, selectionChange = selectionChange.asInstanceOf[js.Any], stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeChangeEvent]
    }
    
    extension [Self <: NodeChangeEvent](x: Self) {
      
      inline def setElement(value: Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setParents(value: js.Array[Node]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsVarargs(value: Node*): Self = StObject.set(x, "parents", js.Array(value*))
      
      inline def setSelectionChange(value: Boolean): Self = StObject.set(x, "selectionChange", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessEvent
    extends StObject
       with Event {
    
    var content: String
    
    var forced_root_block: String
    
    var format: String
    
    var get: Boolean
    
    var get_inner: Boolean
    
    var node: Node
    
    var selection: `true`
  }
  object ProcessEvent {
    
    inline def apply(
      content: String,
      forced_root_block: String,
      format: String,
      get: Boolean,
      get_inner: Boolean,
      isDefaultPrevented: CallbackTo[Boolean],
      isImmediatePropagationStopped: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      node: Node,
      preventDefault: Callback,
      stopImmediatePropagation: Callback,
      stopPropagation: Callback,
      target: String,
      `type`: String
    ): ProcessEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], forced_root_block = forced_root_block.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], get_inner = get_inner.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isImmediatePropagationStopped = isImmediatePropagationStopped.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, node = node.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, selection = true, stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessEvent]
    }
    
    extension [Self <: ProcessEvent](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setForced_root_block(value: String): Self = StObject.set(x, "forced_root_block", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setGet(value: Boolean): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGet_inner(value: Boolean): Self = StObject.set(x, "get_inner", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: `true`): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
  
  trait UndoRedoEvent
    extends StObject
       with Event
  object UndoRedoEvent {
    
    inline def apply(
      isDefaultPrevented: CallbackTo[Boolean],
      isImmediatePropagationStopped: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      preventDefault: Callback,
      stopImmediatePropagation: Callback,
      stopPropagation: Callback,
      target: String,
      `type`: String
    ): UndoRedoEvent = {
      val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, isImmediatePropagationStopped = isImmediatePropagationStopped.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, preventDefault = preventDefault.toJsFn, stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UndoRedoEvent]
    }
  }
}
