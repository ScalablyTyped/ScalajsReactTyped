package typingsJapgolly.slateReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.MutationRecord
import typingsJapgolly.lodash.mod.DebouncedFunc
import typingsJapgolly.slate.distInterfacesPointMod.Point
import typingsJapgolly.slate.distInterfacesRangeMod.Range
import typingsJapgolly.slateReact.distPluginReactEditorMod.ReactEditor
import typingsJapgolly.slateReact.slateReactStrings.action
import typingsJapgolly.std.InputEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksAndroidInputManagerAndroidInputManagerMod {
  
  @JSImport("slate-react/dist/hooks/android-input-manager/android-input-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAndroidInputManager(hasEditorScheduleOnDOMSelectionChangeOnDOMSelectionChange: CreateAndroidInputManagerOptions): AndroidInputManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createAndroidInputManager")(hasEditorScheduleOnDOMSelectionChangeOnDOMSelectionChange.asInstanceOf[js.Any]).asInstanceOf[AndroidInputManager]
  
  trait Action extends StObject {
    
    var at: js.UndefOr[Point | Range] = js.undefined
    
    def run(): Unit
  }
  object Action {
    
    inline def apply(run: Callback): Action = {
      val __obj = js.Dynamic.literal(run = run.toJsFn)
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAt(value: Point | Range): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setRun(value: Callback): Self = StObject.set(x, "run", value.toJsFn)
    }
  }
  
  @js.native
  trait AndroidInputManager extends StObject {
    
    def flush(): Unit = js.native
    
    def handleCompositionEnd(event: ReactCompositionEventFrom[HTMLDivElement]): Unit = js.native
    
    def handleCompositionStart(event: ReactCompositionEventFrom[HTMLDivElement]): Unit = js.native
    
    def handleDOMBeforeInput(event: InputEvent): Unit = js.native
    
    def handleDomMutations(mutations: js.Array[MutationRecord]): Unit = js.native
    
    def handleInput(): Unit = js.native
    
    def handleKeyDown(event: ReactKeyboardEventFrom[HTMLDivElement]): Unit = js.native
    
    def handleUserSelect(): Unit = js.native
    def handleUserSelect(range: Range): Unit = js.native
    
    def hasPendingAction(): Boolean = js.native
    
    def hasPendingChanges(): Boolean = js.native
    
    def hasPendingDiffs(): Boolean = js.native
    
    def isFlushing(): Boolean | action = js.native
    
    def scheduleFlush(): Unit = js.native
  }
  
  trait CreateAndroidInputManagerOptions extends StObject {
    
    var editor: ReactEditor
    
    var onDOMSelectionChange: DebouncedFunc[js.Function0[Unit]]
    
    var scheduleOnDOMSelectionChange: DebouncedFunc[js.Function0[Unit]]
  }
  object CreateAndroidInputManagerOptions {
    
    inline def apply(
      editor: ReactEditor,
      onDOMSelectionChange: DebouncedFunc[js.Function0[Unit]],
      scheduleOnDOMSelectionChange: DebouncedFunc[js.Function0[Unit]]
    ): CreateAndroidInputManagerOptions = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], onDOMSelectionChange = onDOMSelectionChange.asInstanceOf[js.Any], scheduleOnDOMSelectionChange = scheduleOnDOMSelectionChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAndroidInputManagerOptions]
    }
    
    extension [Self <: CreateAndroidInputManagerOptions](x: Self) {
      
      inline def setEditor(value: ReactEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setOnDOMSelectionChange(value: DebouncedFunc[js.Function0[Unit]]): Self = StObject.set(x, "onDOMSelectionChange", value.asInstanceOf[js.Any])
      
      inline def setScheduleOnDOMSelectionChange(value: DebouncedFunc[js.Function0[Unit]]): Self = StObject.set(x, "scheduleOnDOMSelectionChange", value.asInstanceOf[js.Any])
    }
  }
}
