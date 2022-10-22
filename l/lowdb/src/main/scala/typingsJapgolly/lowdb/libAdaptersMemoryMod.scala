package typingsJapgolly.lowdb

import typingsJapgolly.lowdb.libLowMod.Adapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersMemoryMod {
  
  @JSImport("lowdb/lib/adapters/Memory", "Memory")
  @js.native
  open class Memory[T] ()
    extends StObject
       with Adapter[T] {
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def read(): js.Promise[T | Null] = js.native
    
    /* CompleteClass */
    override def write(data: T): js.Promise[Unit] = js.native
  }
}
