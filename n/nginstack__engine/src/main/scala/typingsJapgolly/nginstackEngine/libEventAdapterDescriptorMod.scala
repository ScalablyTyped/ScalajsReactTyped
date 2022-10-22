package typingsJapgolly.nginstackEngine

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventAdapterDescriptorMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/event/AdapterDescriptor", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AdapterDescriptor
  @JSImport("@nginstack/engine/lib/event/AdapterDescriptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait AdapterDescriptor extends StObject {
    
    var acceptsUndefinedResult: Boolean = js.native
    
    def afterAdaptedListener(arg0: Event): Any = js.native
    
    def afterInherited(arg0: Event): Any = js.native
    
    def beforeAdaptedListener(arg0: Event): Any = js.native
    
    def beforeInherited(arg0: Event): Any = js.native
    
    var cancelable: Boolean = js.native
    
    var eventClass: Event = js.native
    
    def listenerFilter(arg0: Emitter, arg1: js.Function0[Any]): Boolean = js.native
    def listenerFilter(arg0: Emitter, arg1: Record[Any, Any]): Boolean = js.native
    
    /* private */ var nonDescribedParameters_ : Any = js.native
    
    var parameters: js.Array[Any] = js.native
    
    var resultProperty: String | Null = js.native
    
    var `type`: String = js.native
  }
  
  type Emitter = typingsJapgolly.nginstackEngine.libEventEmitterMod.^
  
  type Event = typingsJapgolly.nginstackEngine.libEventEventMod.^
}
