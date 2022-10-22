package typingsJapgolly.barnard59Core

import typingsJapgolly.readableStream.mod.Readable
import typingsJapgolly.readableStream.mod.Writable
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepMod {
  
  @JSImport("barnard59-core/lib/Step", JSImport.Default)
  @js.native
  open class default () extends Step
  
  @js.native
  trait Step
    extends typingsJapgolly.barnard59Core.libStreamObjectMod.default {
    
    var args: js.Array[Any] | (Record[String, Any]) = js.native
    
    var operation: Any = js.native
    
    @JSName("stream")
    var stream_Step: Readable | Writable = js.native
  }
}
