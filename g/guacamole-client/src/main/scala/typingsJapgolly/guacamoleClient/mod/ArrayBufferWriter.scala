package typingsJapgolly.guacamoleClient.mod

import typingsJapgolly.guacamoleClient.guacamoleClientInts.`6048`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "ArrayBufferWriter")
@js.native
open class ArrayBufferWriter protected ()
  extends typingsJapgolly.guacamoleClient.libArrayBufferWriterMod.ArrayBufferWriter {
  /**
    * @param stream The stream that data will be written
    */
  def this(stream: typingsJapgolly.guacamoleClient.libOutputStreamMod.OutputStream) = this()
}
/* static members */
object ArrayBufferWriter {
  
  /**
    * The default maximum blob length for new Guacamole.ArrayBufferWriter
    * instances.
    */
  @JSImport("guacamole-client", "ArrayBufferWriter.DEFAULT_BLOB_LENGTH")
  @js.native
  val DEFAULT_BLOB_LENGTH: `6048` = js.native
}
