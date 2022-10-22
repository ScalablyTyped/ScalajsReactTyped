package typingsJapgolly.tarn

import typingsJapgolly.tarn.distUtilsMod.Deferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResourceMod {
  
  @JSImport("tarn/dist/Resource", "Resource")
  @js.native
  open class Resource[T] protected () extends StObject {
    def this(resource: T) = this()
    
    /* protected */ var deferred: Deferred[Unit] = js.native
    
    def promise: js.Promise[Unit] = js.native
    
    def resolve(): Resource[T] = js.native
    
    var resource: T = js.native
    
    val timestamp: Double = js.native
  }
}
