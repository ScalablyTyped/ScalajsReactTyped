package typingsJapgolly.puppeteerCore

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.ExceptionDetails
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConsoleMessageMod.ConsoleMessageType
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonEventEmitterMod.EventEmitter
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonExecutionContextMod.ExecutionContext
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonJshandleMod.JSHandle
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTypesMod.EvaluateFunc
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTypesMod.HandleFor
import typingsJapgolly.std.Awaited
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonWebWorkerMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/WebWorker", "WebWorker")
  @js.native
  open class WebWorker protected () extends EventEmitter {
    /**
      * @internal
      */
    def this(
      client: CDPSession,
      url: String,
      consoleAPICalled: ConsoleAPICalledCallback,
      exceptionThrown: ExceptionThrownCallback
    ) = this()
    
    /**
      * If the function passed to the `worker.evaluate` returns a Promise, then
      * `worker.evaluate` would wait for the promise to resolve and return its
      * value. If the function passed to the `worker.evaluate` returns a
      * non-serializable value, then `worker.evaluate` resolves to `undefined`.
      * DevTools Protocol also supports transferring some additional values that
      * are not serializable by `JSON`: `-0`, `NaN`, `Infinity`, `-Infinity`, and
      * bigint literals.
      * Shortcut for `await worker.executionContext()).evaluate(pageFunction, ...args)`.
      *
      * @param pageFunction - Function to be evaluated in the worker context.
      * @param args - Arguments to pass to `pageFunction`.
      * @returns Promise which resolves to the return value of `pageFunction`.
      */
    def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    
    /**
      * The only difference between `worker.evaluate` and `worker.evaluateHandle`
      * is that `worker.evaluateHandle` returns in-page object (JSHandle). If the
      * function passed to the `worker.evaluateHandle` returns a `Promise`, then
      * `worker.evaluateHandle` would wait for the promise to resolve and return
      * its value. Shortcut for
      * `await worker.executionContext()).evaluateHandle(pageFunction, ...args)`
      *
      * @param pageFunction - Function to be evaluated in the page context.
      * @param args - Arguments to pass to `pageFunction`.
      * @returns Promise which resolves to the return value of `pageFunction`.
      */
    def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    
    /**
      * @internal
      */
    def executionContext(): js.Promise[ExecutionContext] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * @returns The URL of this web worker.
      */
    def url(): String = js.native
  }
  
  type ConsoleAPICalledCallback = js.Function3[
    /* eventType */ ConsoleMessageType, 
    /* handles */ js.Array[JSHandle[Any]], 
    /* trace */ StackTrace, 
    Unit
  ]
  
  type ExceptionThrownCallback = js.Function1[/* details */ ExceptionDetails, Unit]
}
