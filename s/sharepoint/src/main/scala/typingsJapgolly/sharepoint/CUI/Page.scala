package typingsJapgolly.sharepoint.CUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  trait CommandDispatcher extends StObject {
    
    def executeCommand(commandId: String, properties: Any): Any
  }
  object CommandDispatcher {
    
    inline def apply(executeCommand: (String, Any) => Any): CommandDispatcher = {
      val __obj = js.Dynamic.literal(executeCommand = js.Any.fromFunction2(executeCommand))
      __obj.asInstanceOf[CommandDispatcher]
    }
    
    extension [Self <: CommandDispatcher](x: Self) {
      
      inline def setExecuteCommand(value: (String, Any) => Any): Self = StObject.set(x, "executeCommand", js.Any.fromFunction2(value))
    }
  }
  
  trait FocusManager
    extends StObject
       with CommandDispatcher
       with ICommandHandler {
    
    def getFocusedComponents(): js.Array[Component]
    
    def releaseAllFoci(): Boolean
    
    def releaseFocusFromComponent(component: Component): Any
    
    def requestFocusForComponent(component: Component): Any
  }
  object FocusManager {
    
    inline def apply(
      canHandleCommand: String => Boolean,
      executeCommand: (String, Any) => Any,
      getFocusedComponents: CallbackTo[js.Array[Component]],
      handleCommand: (String, Any, Double) => Boolean,
      releaseAllFoci: CallbackTo[Boolean],
      releaseFocusFromComponent: Component => Any,
      requestFocusForComponent: Component => Any
    ): FocusManager = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), executeCommand = js.Any.fromFunction2(executeCommand), getFocusedComponents = getFocusedComponents.toJsFn, handleCommand = js.Any.fromFunction3(handleCommand), releaseAllFoci = releaseAllFoci.toJsFn, releaseFocusFromComponent = js.Any.fromFunction1(releaseFocusFromComponent), requestFocusForComponent = js.Any.fromFunction1(requestFocusForComponent))
      __obj.asInstanceOf[FocusManager]
    }
    
    extension [Self <: FocusManager](x: Self) {
      
      inline def setGetFocusedComponents(value: CallbackTo[js.Array[Component]]): Self = StObject.set(x, "getFocusedComponents", value.toJsFn)
      
      inline def setReleaseAllFoci(value: CallbackTo[Boolean]): Self = StObject.set(x, "releaseAllFoci", value.toJsFn)
      
      inline def setReleaseFocusFromComponent(value: Component => Any): Self = StObject.set(x, "releaseFocusFromComponent", js.Any.fromFunction1(value))
      
      inline def setRequestFocusForComponent(value: Component => Any): Self = StObject.set(x, "requestFocusForComponent", js.Any.fromFunction1(value))
    }
  }
  
  trait ICommandHandler extends StObject {
    
    def canHandleCommand(commandId: String): Boolean
    
    def handleCommand(commandId: String, properties: Any, sequenceNumber: Double): Boolean
  }
  object ICommandHandler {
    
    inline def apply(canHandleCommand: String => Boolean, handleCommand: (String, Any, Double) => Boolean): ICommandHandler = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), handleCommand = js.Any.fromFunction3(handleCommand))
      __obj.asInstanceOf[ICommandHandler]
    }
    
    extension [Self <: ICommandHandler](x: Self) {
      
      inline def setCanHandleCommand(value: String => Boolean): Self = StObject.set(x, "canHandleCommand", js.Any.fromFunction1(value))
      
      inline def setHandleCommand(value: (String, Any, Double) => Boolean): Self = StObject.set(x, "handleCommand", js.Any.fromFunction3(value))
    }
  }
  
  trait PageComponent
    extends StObject
       with ICommandHandler {
    
    def getFocusedCommands(): js.Array[String]
    
    def getGlobalCommands(): js.Array[String]
    
    def getId(): String
    
    def init(): scala.Unit
    
    def isFocusable(): Boolean
    
    def receiveFocus(): Boolean
    
    def yieldFocus(): Boolean
  }
  object PageComponent {
    
    inline def apply(
      canHandleCommand: String => Boolean,
      getFocusedCommands: CallbackTo[js.Array[String]],
      getGlobalCommands: CallbackTo[js.Array[String]],
      getId: CallbackTo[String],
      handleCommand: (String, Any, Double) => Boolean,
      init: Callback,
      isFocusable: CallbackTo[Boolean],
      receiveFocus: CallbackTo[Boolean],
      yieldFocus: CallbackTo[Boolean]
    ): PageComponent = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = getFocusedCommands.toJsFn, getGlobalCommands = getGlobalCommands.toJsFn, getId = getId.toJsFn, handleCommand = js.Any.fromFunction3(handleCommand), init = init.toJsFn, isFocusable = isFocusable.toJsFn, receiveFocus = receiveFocus.toJsFn, yieldFocus = yieldFocus.toJsFn)
      __obj.asInstanceOf[PageComponent]
    }
    
    extension [Self <: PageComponent](x: Self) {
      
      inline def setGetFocusedCommands(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getFocusedCommands", value.toJsFn)
      
      inline def setGetGlobalCommands(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getGlobalCommands", value.toJsFn)
      
      inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
      
      inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setIsFocusable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocusable", value.toJsFn)
      
      inline def setReceiveFocus(value: CallbackTo[Boolean]): Self = StObject.set(x, "receiveFocus", value.toJsFn)
      
      inline def setYieldFocus(value: CallbackTo[Boolean]): Self = StObject.set(x, "yieldFocus", value.toJsFn)
    }
  }
  
  trait PageManager
    extends StObject
       with RootUser
       with ICommandHandler
       with IRootBuildClient {
    
    def add_ribbonInited(value: js.Function0[scala.Unit]): Any
    
    def get_commandDispatcher(): CommandDispatcher
    
    def get_focusManager(): FocusManager
    
    def get_undoManager(): UndoManager
  }
  object PageManager {
    
    inline def apply(
      add_ribbonInited: js.Function0[scala.Unit] => Any,
      canHandleCommand: String => Boolean,
      get_commandDispatcher: CallbackTo[CommandDispatcher],
      get_focusManager: CallbackTo[FocusManager],
      get_undoManager: CallbackTo[UndoManager],
      handleCommand: (String, Any, Double) => Boolean
    ): PageManager = {
      val __obj = js.Dynamic.literal(add_ribbonInited = js.Any.fromFunction1(add_ribbonInited), canHandleCommand = js.Any.fromFunction1(canHandleCommand), get_commandDispatcher = get_commandDispatcher.toJsFn, get_focusManager = get_focusManager.toJsFn, get_undoManager = get_undoManager.toJsFn, handleCommand = js.Any.fromFunction3(handleCommand))
      __obj.asInstanceOf[PageManager]
    }
    
    extension [Self <: PageManager](x: Self) {
      
      inline def setAdd_ribbonInited(value: js.Function0[scala.Unit] => Any): Self = StObject.set(x, "add_ribbonInited", js.Any.fromFunction1(value))
      
      inline def setGet_commandDispatcher(value: CallbackTo[CommandDispatcher]): Self = StObject.set(x, "get_commandDispatcher", value.toJsFn)
      
      inline def setGet_focusManager(value: CallbackTo[FocusManager]): Self = StObject.set(x, "get_focusManager", value.toJsFn)
      
      inline def setGet_undoManager(value: CallbackTo[UndoManager]): Self = StObject.set(x, "get_undoManager", value.toJsFn)
    }
  }
  
  trait UndoManager
    extends StObject
       with ICommandHandler
  object UndoManager {
    
    inline def apply(canHandleCommand: String => Boolean, handleCommand: (String, Any, Double) => Boolean): UndoManager = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), handleCommand = js.Any.fromFunction3(handleCommand))
      __obj.asInstanceOf[UndoManager]
    }
  }
}
