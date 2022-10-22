package typingsJapgolly.dndMultiBackend

import org.scalajs.dom.Event
import typingsJapgolly.dndCore.distInterfacesMod.BackendFactory
import typingsJapgolly.dndMultiBackend.distEsmTypesMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmMod {
  
  @JSImport("dnd-multi-backend/dist/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dnd-multi-backend/dist/esm", "HTML5DragTransition")
  @js.native
  val HTML5DragTransition: Transition = js.native
  
  @JSImport("dnd-multi-backend/dist/esm", "MouseTransition")
  @js.native
  val MouseTransition: Transition = js.native
  
  @JSImport("dnd-multi-backend/dist/esm", "MultiBackend")
  @js.native
  val MultiBackend: BackendFactory = js.native
  
  @JSImport("dnd-multi-backend/dist/esm", "PointerTransition")
  @js.native
  val PointerTransition: Transition = js.native
  
  @JSImport("dnd-multi-backend/dist/esm", "TouchTransition")
  @js.native
  val TouchTransition: Transition = js.native
  
  inline def createTransition(event: String, check: js.Function1[/* e */ Event, Boolean]): Transition = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransition")(event.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[Transition]
}
