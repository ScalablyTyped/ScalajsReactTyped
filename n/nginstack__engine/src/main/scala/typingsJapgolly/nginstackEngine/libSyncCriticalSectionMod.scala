package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyncCriticalSectionMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/sync/CriticalSection", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CriticalSection {
    
    /* CompleteClass */
    override def enter(criticalSectionName: String): Unit = js.native
    
    /* CompleteClass */
    override def leave(criticalSectionName: String): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/sync/CriticalSection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): CriticalSection = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[CriticalSection]
  
  trait CriticalSection extends StObject {
    
    def enter(criticalSectionName: String): Unit
    
    def leave(criticalSectionName: String): Unit
  }
  object CriticalSection {
    
    inline def apply(enter: String => Callback, leave: String => Callback): CriticalSection = {
      val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1((t0: String) => enter(t0).runNow()), leave = js.Any.fromFunction1((t0: String) => leave(t0).runNow()))
      __obj.asInstanceOf[CriticalSection]
    }
    
    extension [Self <: CriticalSection](x: Self) {
      
      inline def setEnter(value: String => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setLeave(value: String => Callback): Self = StObject.set(x, "leave", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
