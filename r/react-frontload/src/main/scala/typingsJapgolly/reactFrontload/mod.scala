package typingsJapgolly.reactFrontload

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactFrontload.anon.AllFrontloads
import typingsJapgolly.reactFrontload.anon.Children
import typingsJapgolly.reactFrontload.anon.Context
import typingsJapgolly.reactFrontload.anon.Data
import typingsJapgolly.reactFrontload.anon.Frontloads
import typingsJapgolly.reactFrontload.anon.IsFinalRender
import typingsJapgolly.reactFrontload.anon.Logging
import typingsJapgolly.reactFrontload.anon.ServerRenderedData
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-frontload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FrontloadProvider(hasFrontloadStateChildren: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FrontloadProvider")(hasFrontloadStateChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object createFrontloadState {
    
    @JSImport("react-frontload", "createFrontloadState")
    @js.native
    val ^ : js.Any = js.native
    
    inline def client(args: ServerRenderedData): FrontloadState = ^.asInstanceOf[js.Dynamic].applyDynamic("client")(args.asInstanceOf[js.Any]).asInstanceOf[FrontloadState]
    
    inline def server(args: Logging): FrontloadState = ^.asInstanceOf[js.Dynamic].applyDynamic("server")(args.asInstanceOf[js.Any]).asInstanceOf[FrontloadState]
  }
  
  inline def frontloadServerRender[T](hasRenderFrontloadState: typingsJapgolly.reactFrontload.anon.FrontloadState[T]): js.Promise[Data[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("frontloadServerRender")(hasRenderFrontloadState.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data[T]]]
  
  inline def useFrontload[T](key: String, fn: js.Function1[/* context */ Any, js.Promise[T]]): FrontloadProps[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrontload")(key.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[FrontloadProps[T]]
  
  trait FrontloadData extends StObject {
    
    var fn: FrontloadFunction
    
    var key: String
  }
  object FrontloadData {
    
    inline def apply(fn: /* context */ Any => js.Promise[Any], key: String): FrontloadData = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrontloadData]
    }
    
    extension [Self <: FrontloadData](x: Self) {
      
      inline def setFn(value: /* context */ Any => js.Promise[Any]): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type FrontloadFunction = js.Function1[/* context */ Any, js.Promise[Any]]
  
  trait FrontloadMeta extends StObject {
    
    var done: Boolean
    
    var error: Any
    
    var pending: Boolean
    
    var serverRendered: Boolean
  }
  object FrontloadMeta {
    
    inline def apply(done: Boolean, error: Any, pending: Boolean, serverRendered: Boolean): FrontloadMeta = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], serverRendered = serverRendered.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrontloadMeta]
    }
    
    extension [Self <: FrontloadMeta](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setServerRendered(value: Boolean): Self = StObject.set(x, "serverRendered", value.asInstanceOf[js.Any])
    }
  }
  
  trait FrontloadProps[T] extends StObject {
    
    var data: T
    
    var frontloadMeta: FrontloadMeta
    
    def setData(fn: js.Function1[/* data */ T, T]): Unit
  }
  object FrontloadProps {
    
    inline def apply[T](data: T, frontloadMeta: FrontloadMeta, setData: js.Function1[/* data */ T, T] => Callback): FrontloadProps[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], frontloadMeta = frontloadMeta.asInstanceOf[js.Any], setData = js.Any.fromFunction1((t0: js.Function1[/* data */ T, T]) => setData(t0).runNow()))
      __obj.asInstanceOf[FrontloadProps[T]]
    }
    
    extension [Self <: FrontloadProps[?], T](x: Self & FrontloadProps[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFrontloadMeta(value: FrontloadMeta): Self = StObject.set(x, "frontloadMeta", value.asInstanceOf[js.Any])
      
      inline def setSetData(value: js.Function1[/* data */ T, T] => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: js.Function1[/* data */ T, T]) => value(t0).runNow()))
    }
  }
  
  type FrontloadServerRenderFunction[T] = js.Function1[/* args */ IsFinalRender, T]
  
  type FrontloadState = InstanceType[
    Instantiable1[/* hasServerRenderedDataContextLogging */ Context, FrontloadStatePrivate]
  ]
  
  trait FrontloadStatePrivate extends StObject {
    
    /* private */ var clientRender: Any
    
    def collectServerRenderFrontload(frontload: FrontloadData): Unit
    
    var context: Any
    
    def getFrontloadServerRenderedData(key: String): Any
    
    def getServerRenderCache(): StringDictionary[Any]
    
    def getServerRenderMeta(): Frontloads
    
    def hasFrontloadRunOnServer(key: String): Boolean
    
    def isClientLoggingEnabled(): Boolean
    
    def isFirstRender(): Boolean
    
    def prepareServerRenderPass(): Unit
    
    def runFrontloadsForThisServerRenderPass(): js.Promise[AllFrontloads]
    
    /* private */ var serverRender: Any
    
    def setFirstRenderDoneOnClient(): Unit
  }
  object FrontloadStatePrivate {
    
    inline def apply(
      clientRender: Any,
      collectServerRenderFrontload: FrontloadData => Callback,
      context: Any,
      getFrontloadServerRenderedData: String => Any,
      getServerRenderCache: CallbackTo[StringDictionary[Any]],
      getServerRenderMeta: CallbackTo[Frontloads],
      hasFrontloadRunOnServer: String => Boolean,
      isClientLoggingEnabled: CallbackTo[Boolean],
      isFirstRender: CallbackTo[Boolean],
      prepareServerRenderPass: Callback,
      runFrontloadsForThisServerRenderPass: CallbackTo[js.Promise[AllFrontloads]],
      serverRender: Any,
      setFirstRenderDoneOnClient: Callback
    ): FrontloadStatePrivate = {
      val __obj = js.Dynamic.literal(clientRender = clientRender.asInstanceOf[js.Any], collectServerRenderFrontload = js.Any.fromFunction1((t0: FrontloadData) => collectServerRenderFrontload(t0).runNow()), context = context.asInstanceOf[js.Any], getFrontloadServerRenderedData = js.Any.fromFunction1(getFrontloadServerRenderedData), getServerRenderCache = getServerRenderCache.toJsFn, getServerRenderMeta = getServerRenderMeta.toJsFn, hasFrontloadRunOnServer = js.Any.fromFunction1(hasFrontloadRunOnServer), isClientLoggingEnabled = isClientLoggingEnabled.toJsFn, isFirstRender = isFirstRender.toJsFn, prepareServerRenderPass = prepareServerRenderPass.toJsFn, runFrontloadsForThisServerRenderPass = runFrontloadsForThisServerRenderPass.toJsFn, serverRender = serverRender.asInstanceOf[js.Any], setFirstRenderDoneOnClient = setFirstRenderDoneOnClient.toJsFn)
      __obj.asInstanceOf[FrontloadStatePrivate]
    }
    
    extension [Self <: FrontloadStatePrivate](x: Self) {
      
      inline def setClientRender(value: Any): Self = StObject.set(x, "clientRender", value.asInstanceOf[js.Any])
      
      inline def setCollectServerRenderFrontload(value: FrontloadData => Callback): Self = StObject.set(x, "collectServerRenderFrontload", js.Any.fromFunction1((t0: FrontloadData) => value(t0).runNow()))
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setGetFrontloadServerRenderedData(value: String => Any): Self = StObject.set(x, "getFrontloadServerRenderedData", js.Any.fromFunction1(value))
      
      inline def setGetServerRenderCache(value: CallbackTo[StringDictionary[Any]]): Self = StObject.set(x, "getServerRenderCache", value.toJsFn)
      
      inline def setGetServerRenderMeta(value: CallbackTo[Frontloads]): Self = StObject.set(x, "getServerRenderMeta", value.toJsFn)
      
      inline def setHasFrontloadRunOnServer(value: String => Boolean): Self = StObject.set(x, "hasFrontloadRunOnServer", js.Any.fromFunction1(value))
      
      inline def setIsClientLoggingEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isClientLoggingEnabled", value.toJsFn)
      
      inline def setIsFirstRender(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFirstRender", value.toJsFn)
      
      inline def setPrepareServerRenderPass(value: Callback): Self = StObject.set(x, "prepareServerRenderPass", value.toJsFn)
      
      inline def setRunFrontloadsForThisServerRenderPass(value: CallbackTo[js.Promise[AllFrontloads]]): Self = StObject.set(x, "runFrontloadsForThisServerRenderPass", value.toJsFn)
      
      inline def setServerRender(value: Any): Self = StObject.set(x, "serverRender", value.asInstanceOf[js.Any])
      
      inline def setSetFirstRenderDoneOnClient(value: Callback): Self = StObject.set(x, "setFirstRenderDoneOnClient", value.toJsFn)
    }
  }
}
