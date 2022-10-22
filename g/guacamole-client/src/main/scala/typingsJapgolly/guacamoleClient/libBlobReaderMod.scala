package typingsJapgolly.guacamoleClient

import org.scalajs.dom.Blob
import typingsJapgolly.guacamoleClient.libGuacCommonMod.Mimetype
import typingsJapgolly.guacamoleClient.libInputStreamMod.InputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBlobReaderMod {
  
  @JSImport("guacamole-client/lib/BlobReader", "BlobReader")
  @js.native
  open class BlobReader protected () extends StObject {
    /**
      * @param stream The stream that data will be read from.
      * @param mimetype The mimetype of the blob being built.
      */
    def this(stream: InputStream, mimetype: Mimetype) = this()
    
    /**
      * Returns the contents of this Guacamole.BlobReader as a Blob.
      * @return The contents of this Guacamole.BlobReader.
      */
    def getBlob(): Blob = js.native
    
    /**
      * Returns the current length of this Guacamole.InputStream, in bytes.
      * @return The current length of this Guacamole.InputStream.
      */
    def getLength(): Double = js.native
    
    /**
      * Fired once this stream is finished and no further data will be written.
      * @event
      */
    var onend: Null | js.Function0[Unit] = js.native
    
    /**
      * Fired once for every blob of data received.
      * @event
      * @param length The number of bytes received.
      */
    var onprogress: Null | (js.Function1[/* length */ Double, Unit]) = js.native
  }
}
