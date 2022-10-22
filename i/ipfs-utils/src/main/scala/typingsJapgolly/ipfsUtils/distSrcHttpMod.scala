package typingsJapgolly.ipfsUtils

import org.scalajs.dom.ReadableStream
import org.scalajs.dom.Request
import org.scalajs.dom.Response
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHttpMod {
  
  @JSImport("ipfs-utils/dist/src/http", JSImport.Namespace)
  @js.native
  /**
    *
    * @param {HTTPOptions} options
    */
  open class ^ ()
    extends StObject
       with HTTP {
    def this(options: HTTPOptions) = this()
  }
  @JSImport("ipfs-utils/dist/src/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipfs-utils/dist/src/http", "HTTPError")
  @js.native
  open class HTTPError protected ()
    extends typingsJapgolly.ipfsUtils.distSrcHttpErrorMod.HTTPError {
    /**
      * @param {Response} response
      */
    def this(response: Response) = this()
  }
  
  @JSImport("ipfs-utils/dist/src/http", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends typingsJapgolly.ipfsUtils.distSrcHttpErrorMod.TimeoutError
  
  /**
    * @param {string | Request} resource
    * @param {HTTPOptions} [options]
    */
  inline def get(resource: String): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  inline def get(resource: String, options: typingsJapgolly.ipfsUtils.distSrcTypesMod.HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(resource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  inline def get(resource: Request): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  inline def get(resource: Request, options: typingsJapgolly.ipfsUtils.distSrcTypesMod.HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(resource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  
  /**
    * @param {string | Request} resource
    * @param {HTTPOptions} [options]
    */
  inline def options(resource: String): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  inline def options(resource: String, options: typingsJapgolly.ipfsUtils.distSrcTypesMod.HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(resource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  inline def options(resource: Request): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  inline def options(resource: Request, options: typingsJapgolly.ipfsUtils.distSrcTypesMod.HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(resource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  
  /**
    * @param {string | Request} resource
    * @param {HTTPOptions} [options]
    */
  inline def post(resource: String): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  inline def post(resource: String, options: typingsJapgolly.ipfsUtils.distSrcTypesMod.HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(resource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  inline def post(resource: Request): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  inline def post(resource: Request, options: typingsJapgolly.ipfsUtils.distSrcTypesMod.HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(resource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  
  /**
    * @param {string | Request} resource
    * @param {HTTPOptions} [options]
    */
  inline def put(resource: String): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  inline def put(resource: String, options: typingsJapgolly.ipfsUtils.distSrcTypesMod.HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(resource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  inline def put(resource: Request): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  inline def put(resource: Request, options: typingsJapgolly.ipfsUtils.distSrcTypesMod.HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(resource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse]]
  
  /**
    * Stream to AsyncIterable
    *
    * @template TChunk
    * @param {ReadableStream<TChunk> | NodeReadableStream | null} source
    * @returns {AsyncIterable<TChunk>}
    */
  inline def streamToAsyncIterator[TChunk](): AsyncIterable[TChunk] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamToAsyncIterator")().asInstanceOf[AsyncIterable[TChunk]]
  inline def streamToAsyncIterator[TChunk](source: ReadableStream[TChunk]): AsyncIterable[TChunk] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamToAsyncIterator")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[TChunk]]
  inline def streamToAsyncIterator[TChunk](source: Readable): AsyncIterable[TChunk] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamToAsyncIterator")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[TChunk]]
  
  type ExtendedResponse = typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse
  
  @js.native
  trait HTTP extends StObject {
    
    /**
      * @param {string | Request} resource
      * @param {HTTPOptions} options
      */
    def delete(resource: String): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def delete(resource: String, options: HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def delete(resource: Request): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def delete(resource: Request, options: HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    
    /**
      * Fetch
      *
      * @param {string | Request} resource
      * @param {HTTPOptions} options
      * @returns {Promise<ExtendedResponse>}
      */
    def fetch(resource: String): js.Promise[ExtendedResponse] = js.native
    def fetch(resource: String, options: HTTPOptions): js.Promise[ExtendedResponse] = js.native
    def fetch(resource: Request): js.Promise[ExtendedResponse] = js.native
    def fetch(resource: Request, options: HTTPOptions): js.Promise[ExtendedResponse] = js.native
    
    /**
      * @param {string | Request} resource
      * @param {HTTPOptions} options
      */
    def get(resource: String): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def get(resource: String, options: HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def get(resource: Request): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def get(resource: Request, options: HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    
    /**
      * @param {string | Request} resource
      * @param {HTTPOptions} options
      */
    def options(resource: String): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def options(resource: String, options: HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def options(resource: Request): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def options(resource: Request, options: HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    
    /** @type {HTTPOptions} */
    var opts: HTTPOptions = js.native
    
    /**
      * @param {string | Request} resource
      * @param {HTTPOptions} options
      */
    def post(resource: String): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def post(resource: String, options: HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def post(resource: Request): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def post(resource: Request, options: HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    
    /**
      * @param {string | Request} resource
      * @param {HTTPOptions} options
      */
    def put(resource: String): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def put(resource: String, options: HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def put(resource: Request): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
    def put(resource: Request, options: HTTPOptions): js.Promise[typingsJapgolly.ipfsUtils.distSrcTypesMod.ExtendedResponse] = js.native
  }
  
  type HTTPOptions = typingsJapgolly.ipfsUtils.distSrcTypesMod.HTTPOptions
  
  type NodeReadableStream = Readable
}
