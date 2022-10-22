package typingsJapgolly.dicer

import typingsJapgolly.dicer.dicerStrings.close
import typingsJapgolly.dicer.dicerStrings.data
import typingsJapgolly.dicer.dicerStrings.drain
import typingsJapgolly.dicer.dicerStrings.end
import typingsJapgolly.dicer.dicerStrings.error
import typingsJapgolly.dicer.dicerStrings.finish
import typingsJapgolly.dicer.dicerStrings.header
import typingsJapgolly.dicer.dicerStrings.part
import typingsJapgolly.dicer.dicerStrings.pipe
import typingsJapgolly.dicer.dicerStrings.preamble
import typingsJapgolly.dicer.dicerStrings.readable
import typingsJapgolly.dicer.dicerStrings.trailer
import typingsJapgolly.dicer.dicerStrings.unpipe
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable:unified-signatures
  /**
    * A very fast streaming multipart parser for node.js.
    * Dicer is a WritableStream
    *
    * Dicer (special) events:
    * - on('finish', ()) - Emitted when all parts have been parsed and the Dicer instance has been ended.
    * - on('part', (stream: PartStream)) - Emitted when a new part has been found.
    * - on('preamble', (stream: PartStream)) - Emitted for preamble if you should happen to need it (can usually be ignored).
    * - on('trailer', (data: Buffer)) - Emitted when trailing data was found after the terminating boundary (as with the preamble, this can usually be ignored too).
    */
  @JSImport("dicer", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Dicer {
    /**
      * Creates and returns a new Dicer instance with the following valid config settings:
      *
      * @param config The configuration to use
      */
    def this(config: Config) = this()
  }
  
  trait Config extends StObject {
    
    /**
      * This is the boundary used to detect the beginning of a new part.
      */
    var boundary: js.UndefOr[String] = js.undefined
    
    /**
      * If true, preamble header parsing will be performed first.
      */
    var headerFirst: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum number of header key=>value pairs to parse Default: 2000 (same as node's http).
      */
    var maxHeaderPairs: js.UndefOr[Double] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setBoundary(value: String): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setHeaderFirst(value: Boolean): Self = StObject.set(x, "headerFirst", value.asInstanceOf[js.Any])
      
      inline def setHeaderFirstUndefined: Self = StObject.set(x, "headerFirst", js.undefined)
      
      inline def setMaxHeaderPairs(value: Double): Self = StObject.set(x, "maxHeaderPairs", value.asInstanceOf[js.Any])
      
      inline def setMaxHeaderPairsUndefined: Self = StObject.set(x, "maxHeaderPairs", js.undefined)
    }
  }
  
  // tslint:disable:unified-signatures
  /**
    * A very fast streaming multipart parser for node.js.
    * Dicer is a WritableStream
    *
    * Dicer (special) events:
    * - on('finish', ()) - Emitted when all parts have been parsed and the Dicer instance has been ended.
    * - on('part', (stream: PartStream)) - Emitted when a new part has been found.
    * - on('preamble', (stream: PartStream)) - Emitted for preamble if you should happen to need it (can usually be ignored).
    * - on('trailer', (data: Buffer)) - Emitted when trailing data was found after the terminating boundary (as with the preamble, this can usually be ignored too).
    */
  @js.native
  trait Dicer extends Writable {
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_part(event: part, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_preamble(event: preamble, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_trailer(event: trailer, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_part(event: part, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_preamble(event: preamble, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
    @JSName("on")
    def on_trailer(event: trailer, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_part(event: part, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_preamble(event: preamble, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
    @JSName("once")
    def once_trailer(event: trailer, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_part(event: part, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_preamble(event: preamble, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_trailer(event: trailer, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_part(event: part, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_preamble(event: preamble, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_trailer(event: trailer, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_part(event: part, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_preamble(event: preamble, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_trailer(event: trailer, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /**
      * Sets the boundary to use for parsing and performs some initialization needed for parsing.
      * You should only need to use this if you set headerFirst to true in the constructor and are parsing the boundary from the preamble header.
      *
      * @param boundary The boundary to use
      */
    def setBoundary(boundary: String): Unit = js.native
  }
  
  /**
    * PartStream is a _ReadableStream_
    *
    * PartStream (special) events:
    * - on('header', (header: object)) - An object containing the header for this particular part. Each property value is an array of one or more string values.
    */
  @js.native
  trait PartStream extends Readable {
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_header(event: header, listener: js.Function1[/* header */ js.Object, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_header(event: header, listener: js.Function1[/* header */ js.Object, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_header(event: header, listener: js.Function1[/* header */ js.Object, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_header(event: header, listener: js.Function1[/* header */ js.Object, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_header(event: header, listener: js.Function1[/* header */ js.Object, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_header(event: header, listener: js.Function1[/* header */ js.Object, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  }
}
