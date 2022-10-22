package typingsJapgolly.useGestureCore

import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import typingsJapgolly.useGestureCore.distDeclarationsSrcControllerMod.Controller
import typingsJapgolly.useGestureCore.distDeclarationsSrcEnginesCoordinatesEngineMod.CoordinatesEngine
import typingsJapgolly.useGestureCore.useGestureCoreStrings.drag
import typingsJapgolly.useGestureCore.useGestureCoreStrings.dragging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcEnginesDragEngineMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/engines/DragEngine", "DragEngine")
  @js.native
  open class DragEngine protected () extends CoordinatesEngine[drag] {
    def this(ctrl: Controller, args: js.Array[Any], key: drag) = this()
    
    def bind(bindFunction: Any): Unit = js.native
    
    def cancel(): Unit = js.native
    
    @JSName("ingKey")
    var ingKey_DragEngine: dragging = js.native
    
    def keyDown(event: KeyboardEvent): Unit = js.native
    
    def keyUp(event: KeyboardEvent): Unit = js.native
    
    def pointerClean(): Unit = js.native
    
    def pointerClick(event: MouseEvent): Unit = js.native
    
    def pointerDown(event: PointerEvent): Unit = js.native
    
    def pointerMove(event: PointerEvent): Unit = js.native
    
    def pointerUp(event: PointerEvent): Unit = js.native
    
    def preventScroll(event: PointerEvent): Unit = js.native
    
    def setActive(): Unit = js.native
    
    def setupDelayTrigger(event: PointerEvent): Unit = js.native
    
    def setupPointer(event: PointerEvent): Unit = js.native
    
    def setupScrollPrevention(event: PointerEvent): Unit = js.native
    
    @JSName("setup")
    def setup_MDragEngine(): Unit = js.native
    
    def startPointerDrag(event: PointerEvent): Unit = js.native
  }
}
