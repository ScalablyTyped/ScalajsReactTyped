package typingsJapgolly.componentEmitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Emitter[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Emitter[String]]
  inline def apply(obj: js.Object): Emitter[String] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Emitter[String]]
  
  @JSImport("component-emitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("component-emitter", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with Emitter[String] {
    def this(obj: js.Object) = this()
  }
  
  @js.native
  trait Emitter[Event] extends StObject {
    
    def emit(event: Event, args: Any*): Emitter[String] = js.native
    
    def hasListeners(event: Event): Boolean = js.native
    
    def listeners(event: Event): js.Array[js.Function] = js.native
    
    def off(): Emitter[String] = js.native
    def off(event: Event): Emitter[String] = js.native
    def off(event: Event, listener: js.Function): Emitter[String] = js.native
    def off(event: Unit, listener: js.Function): Emitter[String] = js.native
    
    def on(event: Event, listener: js.Function): Emitter[String] = js.native
    
    def once(event: Event, listener: js.Function): Emitter[String] = js.native
    
    def removeAllListeners(): Emitter[String] = js.native
    def removeAllListeners(event: Event): Emitter[String] = js.native
    
    def removeEventListener(): Emitter[String] = js.native
    def removeEventListener(event: Event): Emitter[String] = js.native
    def removeEventListener(event: Event, listener: js.Function): Emitter[String] = js.native
    def removeEventListener(event: Unit, listener: js.Function): Emitter[String] = js.native
    
    def removeListener(): Emitter[String] = js.native
    def removeListener(event: Event): Emitter[String] = js.native
    def removeListener(event: Event, listener: js.Function): Emitter[String] = js.native
    def removeListener(event: Unit, listener: js.Function): Emitter[String] = js.native
  }
}
