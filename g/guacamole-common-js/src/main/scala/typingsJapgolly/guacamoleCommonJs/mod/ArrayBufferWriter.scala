package typingsJapgolly.guacamoleCommonJs.mod

import typingsJapgolly.guacamoleCommonJs.guacamoleCommonJsInts.`6048`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-common-js", "ArrayBufferWriter")
@js.native
open class ArrayBufferWriter protected ()
  extends typingsJapgolly.guacamoleCommonJs.libArrayBufferWriterMod.ArrayBufferWriter {
  /**
    * @param stream The stream that data will be written
    */
  def this(stream: typingsJapgolly.guacamoleCommonJs.libOutputStreamMod.OutputStream) = this()
}
/* static members */
object ArrayBufferWriter {
  
  /**
    * The default maximum blob length for new Guacamole.ArrayBufferWriter
    * instances.
    */
  @JSImport("guacamole-common-js", "ArrayBufferWriter.DEFAULT_BLOB_LENGTH")
  @js.native
  val DEFAULT_BLOB_LENGTH: `6048` = js.native
}
