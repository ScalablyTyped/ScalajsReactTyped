package typingsJapgolly.reactDndTouchBackend

import typingsJapgolly.dndCore.distInterfacesMod.BackendFactory
import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import typingsJapgolly.reactDndTouchBackend.anon.PartialTouchBackendOption
import typingsJapgolly.reactDndTouchBackend.distInterfacesMod.TouchBackendContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd-touch-backend", "ListenerType")
  @js.native
  object ListenerType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.reactDndTouchBackend.distInterfacesMod.ListenerType & String] = js.native
    
    /* "keyboard" */ val keyboard: typingsJapgolly.reactDndTouchBackend.distInterfacesMod.ListenerType.keyboard & String = js.native
    
    /* "mouse" */ val mouse: typingsJapgolly.reactDndTouchBackend.distInterfacesMod.ListenerType.mouse & String = js.native
    
    /* "touch" */ val touch: typingsJapgolly.reactDndTouchBackend.distInterfacesMod.ListenerType.touch & String = js.native
  }
  
  @JSImport("react-dnd-touch-backend", "TouchBackend")
  @js.native
  val TouchBackend: BackendFactory = js.native
  
  @JSImport("react-dnd-touch-backend", "TouchBackendImpl")
  @js.native
  open class TouchBackendImpl protected ()
    extends typingsJapgolly.reactDndTouchBackend.distTouchBackendImplMod.TouchBackendImpl {
    def this(manager: DragDropManager, context: TouchBackendContext, options: PartialTouchBackendOption) = this()
  }
  /* static members */
  object TouchBackendImpl {
    
    @JSImport("react-dnd-touch-backend", "TouchBackendImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dnd-touch-backend", "TouchBackendImpl.isSetUp")
    @js.native
    def isSetUp: Any = js.native
    inline def isSetUp_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSetUp")(x.asInstanceOf[js.Any])
  }
}
