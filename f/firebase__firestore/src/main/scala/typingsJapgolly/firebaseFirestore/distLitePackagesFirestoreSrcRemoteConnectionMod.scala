package typingsJapgolly.firebaseFirestore

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcApiCredentialsMod.Token
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcRemoteConnectionMod {
  
  @js.native
  trait Connection extends StObject {
    
    /**
      * Invokes an RPC by name, given a request message as a JavaScript object
      * representing the JSON to send.
      *
      * @param rpcName - the name of the RPC to invoke
      * @param path - the path to invoke this RPC on
      * @param request - the Raw JSON object encoding of the request message
      * @param token - the Token to use for the RPC.
      * @returns a Promise containing the JSON object encoding of the response
      */
    def invokeRPC[Req, Resp](rpcName: String, path: String, request: Req): js.Promise[Resp] = js.native
    def invokeRPC[Req, Resp](rpcName: String, path: String, request: Req, authToken: Null, appCheckToken: Token): js.Promise[Resp] = js.native
    def invokeRPC[Req, Resp](rpcName: String, path: String, request: Req, authToken: Token): js.Promise[Resp] = js.native
    def invokeRPC[Req, Resp](rpcName: String, path: String, request: Req, authToken: Token, appCheckToken: Token): js.Promise[Resp] = js.native
    
    /**
      * Invokes a streaming RPC by name, given a request message as a JavaScript
      * object representing the JSON to send. The responses will be consumed to
      * completion and then returned as an array.
      *
      * @param rpcName - the name of the RPC to invoke
      * @param path - the path to invoke this RPC on
      * @param request - the Raw JSON object encoding of the request message
      * @param token - the Token to use for the RPC.
      * @returns a Promise containing an array with the JSON object encodings of the
      * responses
      */
    def invokeStreamingRPC[Req, Resp](rpcName: String, path: String, request: Req): js.Promise[js.Array[Resp]] = js.native
    def invokeStreamingRPC[Req, Resp](
      rpcName: String,
      path: String,
      request: Req,
      authToken: Null,
      appCheckToken: Null,
      expectedResponseCount: Double
    ): js.Promise[js.Array[Resp]] = js.native
    def invokeStreamingRPC[Req, Resp](rpcName: String, path: String, request: Req, authToken: Null, appCheckToken: Token): js.Promise[js.Array[Resp]] = js.native
    def invokeStreamingRPC[Req, Resp](
      rpcName: String,
      path: String,
      request: Req,
      authToken: Null,
      appCheckToken: Token,
      expectedResponseCount: Double
    ): js.Promise[js.Array[Resp]] = js.native
    def invokeStreamingRPC[Req, Resp](rpcName: String, path: String, request: Req, authToken: Token): js.Promise[js.Array[Resp]] = js.native
    def invokeStreamingRPC[Req, Resp](
      rpcName: String,
      path: String,
      request: Req,
      authToken: Token,
      appCheckToken: Null,
      expectedResponseCount: Double
    ): js.Promise[js.Array[Resp]] = js.native
    def invokeStreamingRPC[Req, Resp](rpcName: String, path: String, request: Req, authToken: Token, appCheckToken: Token): js.Promise[js.Array[Resp]] = js.native
    def invokeStreamingRPC[Req, Resp](
      rpcName: String,
      path: String,
      request: Req,
      authToken: Token,
      appCheckToken: Token,
      expectedResponseCount: Double
    ): js.Promise[js.Array[Resp]] = js.native
    
    /**
      * Opens a stream to the given stream RPC endpoint. Returns a stream which
      * will try to open itself.
      * @param rpcName - the name of the RPC to open the stream on
      * @param token - the Token to use for the RPC.
      */
    def openStream[Req, Resp](rpcName: String): Stream[Req, Resp] = js.native
    def openStream[Req, Resp](rpcName: String, authToken: Null, appCheckToken: Token): Stream[Req, Resp] = js.native
    def openStream[Req, Resp](rpcName: String, authToken: Token): Stream[Req, Resp] = js.native
    def openStream[Req, Resp](rpcName: String, authToken: Token, appCheckToken: Token): Stream[Req, Resp] = js.native
    
    /**
      * Returns whether or not the implementation requires that the "path" of the resource
      * (a document or a collection) be present in the request message. If true, then the
      * request message must include the path. If false, then the request message must NOT
      * include the path.
      */
    val shouldResourcePathBeIncludedInRequest: Boolean = js.native
  }
  
  trait Stream[I, O] extends StObject {
    
    def close(): Unit
    
    def onClose(callback: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit]): Unit
    
    def onMessage(callback: js.Function1[/* msg */ O, Unit]): Unit
    
    def onOpen(callback: js.Function0[Unit]): Unit
    
    def send(msg: I): Unit
  }
  object Stream {
    
    inline def apply[I, O](
      close: Callback,
      onClose: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit] => Callback,
      onMessage: js.Function1[/* msg */ O, Unit] => Callback,
      onOpen: js.Function0[Unit] => Callback,
      send: I => Callback
    ): Stream[I, O] = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, onClose = js.Any.fromFunction1((t0: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit]) => onClose(t0).runNow()), onMessage = js.Any.fromFunction1((t0: js.Function1[/* msg */ O, Unit]) => onMessage(t0).runNow()), onOpen = js.Any.fromFunction1((t0: js.Function0[Unit]) => onOpen(t0).runNow()), send = js.Any.fromFunction1((t0: I) => send(t0).runNow()))
      __obj.asInstanceOf[Stream[I, O]]
    }
    
    extension [Self <: Stream[?, ?], I, O](x: Self & (Stream[I, O])) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setOnClose(value: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit]) => value(t0).runNow()))
      
      inline def setOnMessage(value: js.Function1[/* msg */ O, Unit] => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction1((t0: js.Function1[/* msg */ O, Unit]) => value(t0).runNow()))
      
      inline def setOnOpen(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setSend(value: I => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: I) => value(t0).runNow()))
    }
  }
}
