package typingsJapgolly.bootstrap

import japgolly.scalajs.react.Callback
import typingsJapgolly.bootstrap.mod.global.Element
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsDistBaseComponentMod {
  
  @JSImport("bootstrap/js/dist/base-component", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BaseComponent {
    def this(element: String) = this()
    def this(element: Element) = this()
    
    /**
      * Destroys an element's.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("bootstrap/js/dist/base-component", "default.DATA_KEY")
    @js.native
    val DATA_KEY: String = js.native
    
    @JSImport("bootstrap/js/dist/base-component", "default.EVENT_KEY")
    @js.native
    val EVENT_KEY: String = js.native
    
    /**
      * Version of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#version-numbers
      */
    @JSImport("bootstrap/js/dist/base-component", "default.VERSION")
    @js.native
    val VERSION: String = js.native
  }
  
  trait BaseComponent extends StObject {
    
    /**
      * Destroys an element's.
      */
    def dispose(): Unit
  }
  object BaseComponent {
    
    inline def apply(dispose: Callback): BaseComponent = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
      __obj.asInstanceOf[BaseComponent]
    }
    
    extension [Self <: BaseComponent](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    }
  }
  
  type ComponentOptions = Record[String, Any]
  
  type GetInstanceFactory[T] = js.Function1[/* element */ String | Element, T | Null]
  
  type GetOrCreateInstanceFactory[T, C /* <: ComponentOptions */] = js.Function2[/* element */ String | Element, /* config */ js.UndefOr[C], T]
}
