package typingsJapgolly.playable

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.eventemitter3.mod.ListenerFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsKeyboardInterceptorMod {
  
  @JSImport("playable/dist/src/utils/keyboard-interceptor", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with KeyboardInterceptorCore {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, callbacks: ICallbacks) = this()
  }
  
  object KEYCODES {
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.DEBUG_KEY")
    @js.native
    def DEBUG_KEY: Double = js.native
    inline def DEBUG_KEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.DOWN_ARROW")
    @js.native
    def DOWN_ARROW: Double = js.native
    inline def DOWN_ARROW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWN_ARROW")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.ENTER")
    @js.native
    def ENTER: Double = js.native
    inline def ENTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.LEFT_ARROW")
    @js.native
    def LEFT_ARROW: Double = js.native
    inline def LEFT_ARROW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT_ARROW")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.RIGHT_ARROW")
    @js.native
    def RIGHT_ARROW: Double = js.native
    inline def RIGHT_ARROW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT_ARROW")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.SPACE_BAR")
    @js.native
    def SPACE_BAR: Double = js.native
    inline def SPACE_BAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_BAR")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.TAB")
    @js.native
    def TAB: Double = js.native
    inline def TAB_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.UP_ARROW")
    @js.native
    def UP_ARROW: Double = js.native
    inline def UP_ARROW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UP_ARROW")(x.asInstanceOf[js.Any])
  }
  
  type ICallbacks = StringDictionary[ListenerFn[js.Array[Any]]]
  
  @js.native
  trait KeyboardInterceptorCore extends StObject {
    
    /* private */ var _attachCallbacks: Any = js.native
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _element: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ def _isDestroyed: Any = js.native
    
    /* private */ var _processKeyboardInput: Any = js.native
    
    /* private */ var _unattachCallbacks: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def addCallbacks(callbacks: ICallbacks): Unit = js.native
    
    def destroy(): Unit = js.native
  }
}
