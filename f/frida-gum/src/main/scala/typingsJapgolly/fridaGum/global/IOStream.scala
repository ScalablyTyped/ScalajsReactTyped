package typingsJapgolly.fridaGum.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("IOStream")
@js.native
open class IOStream ()
  extends StObject
     with typingsJapgolly.fridaGum.IOStream {
  
  /**
    * Closes the stream, releasing resources related to it. This will also close the individual input and output
    * streams. Once the stream is closed, all other operations will fail. Closing a stream multiple times is allowed
    * and will not result in an error.
    */
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  
  /**
    * The `InputStream` to read from.
    */
  /* CompleteClass */
  var input: typingsJapgolly.fridaGum.InputStream = js.native
  
  /**
    * The `OutputStream` to write to.
    */
  /* CompleteClass */
  var output: typingsJapgolly.fridaGum.OutputStream = js.native
}
