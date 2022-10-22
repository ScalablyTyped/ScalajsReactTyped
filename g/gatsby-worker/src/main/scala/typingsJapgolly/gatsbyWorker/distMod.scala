package typingsJapgolly.gatsbyWorker

import typingsJapgolly.gatsbyWorker.anon.All
import typingsJapgolly.gatsbyWorker.distChildMod.IGatsbyWorkerMessenger
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.Record
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("gatsby-worker/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gatsby-worker/dist", "WorkerPool")
  @js.native
  open class WorkerPool[WorkerModuleExports, MessagesFromParent, MessagesFromChild] protected () extends StObject {
    def this(workerPath: String) = this()
    def this(workerPath: String, options: IWorkerOptions) = this()
    
    /**
      * Schedule task execution on all workers. Useful for setting up workers
      */
    var all: /* import warning: importer.ImportType#apply Failed type conversion: {[ FunctionName in keyof WorkerModuleExports ]: gatsby-worker.gatsby-worker/dist.WrapReturnInArray<gatsby-worker.gatsby-worker/dist.EnsureFunctionReturnsAPromise<WorkerModuleExports[FunctionName]>>} */ js.Any = js.native
    
    /* private */ var checkForWork: Any = js.native
    
    /* private */ var doWork: Any = js.native
    
    /**
      * Kills worker processes and rejects and ongoing or pending tasks.
      * @returns Array of promises for each worker that will resolve once worker did exit.
      */
    def end(): js.Array[js.Promise[Double | Null]] = js.native
    
    def getWorkerInfo(): js.Array[IPublicWorkerInfo] = js.native
    
    /* private */ var idleWorkers: Any = js.native
    
    /* private */ var listeners: Any = js.native
    
    def onMessage(listener: js.Function2[/* msg */ MessagesFromChild, /* workerId */ Double, Unit]): Unit = js.native
    
    /* private */ var options: Any = js.native
    
    /**
      * Kills all running worker processes and spawns a new pool of processes
      */
    def restart(): js.Promise[Unit] = js.native
    
    /* private */ var scheduleWork: Any = js.native
    
    /* private */ var scheduleWorkAll: Any = js.native
    
    /* private */ var scheduleWorkSingle: Any = js.native
    
    def sendMessage(msg: MessagesFromParent, workerId: Double): Unit = js.native
    
    /**
      * Schedule task execution on single worker. Useful to distribute tasks between multiple workers.
      */
    var single: /* import warning: importer.ImportType#apply Failed type conversion: {[ FunctionName in keyof WorkerModuleExports ]: gatsby-worker.gatsby-worker/dist.EnsureFunctionReturnsAPromise<WorkerModuleExports[FunctionName]>} */ js.Any = js.native
    
    /* private */ var startAll: Any = js.native
    
    /* private */ var taskQueue: Any = js.native
    
    /* private */ var workerPath: Any = js.native
    
    /* private */ var workers: Any = js.native
  }
  
  @JSImport("gatsby-worker/dist", "getMessenger")
  @js.native
  def getMessenger: js.Function0[js.UndefOr[IGatsbyWorkerMessenger[Any, Any]]] = js.native
  inline def getMessenger_=(x: js.Function0[js.UndefOr[IGatsbyWorkerMessenger[Any, Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMessenger")(x.asInstanceOf[js.Any])
  
  /**
    * Used to check wether current context is executed in worker process
    */
  @JSImport("gatsby-worker/dist", "isWorker")
  @js.native
  def isWorker: Boolean = js.native
  inline def isWorker_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWorker")(x.asInstanceOf[js.Any])
  
  type CreateWorkerPoolType[ExposedFunctions] = (WorkerPool[Record[String, Any], Any, Any]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ FunctionName in keyof ExposedFunctions ]: gatsby-worker.gatsby-worker/dist.EnsureFunctionReturnsAPromise<ExposedFunctions[FunctionName]>} */ js.Any) & All[ExposedFunctions]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    MaybeFunction extends (args : ...any): std.Promise<any> ? MaybeFunction : MaybeFunction extends (args : ...any): any ? gatsby-worker.gatsby-worker/dist.WrapReturnOfAFunctionInAPromise<MaybeFunction> : never
    }}}
    */
  @js.native
  trait EnsureFunctionReturnsAPromise[MaybeFunction] extends StObject
  
  trait IPublicWorkerInfo extends StObject {
    
    var workerId: Double
  }
  object IPublicWorkerInfo {
    
    inline def apply(workerId: Double): IPublicWorkerInfo = {
      val __obj = js.Dynamic.literal(workerId = workerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPublicWorkerInfo]
    }
    
    extension [Self <: IPublicWorkerInfo](x: Self) {
      
      inline def setWorkerId(value: Double): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWorkerOptions extends StObject {
    
    var env: js.UndefOr[Record[String, String]] = js.undefined
    
    var numWorkers: js.UndefOr[Double] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object IWorkerOptions {
    
    inline def apply(): IWorkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWorkerOptions]
    }
    
    extension [Self <: IWorkerOptions](x: Self) {
      
      inline def setEnv(value: Record[String, String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
      
      inline def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    MaybeFunction extends (args : ...any): any ? (a : std.Parameters<MaybeFunction>): std.Array<std.ReturnType<MaybeFunction>> : never
    }}}
    */
  @js.native
  trait WrapReturnInArray[MaybeFunction] extends StObject
  
  type WrapReturnOfAFunctionInAPromise[FunctionThatDoesNotReturnAPromise /* <: js.Function1[/* repeated */ Any, Any] */] = js.Function1[
    /* a */ Parameters[FunctionThatDoesNotReturnAPromise], 
    js.Promise[ReturnType[FunctionThatDoesNotReturnAPromise]]
  ]
}
