package typingsJapgolly.strongClusterControl

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter
import typingsJapgolly.strongClusterControl.mod.StrongClusterControl.Control
import typingsJapgolly.strongClusterControl.strongClusterControlStrings.CLUSTER_CONTROL_shutdown
import typingsJapgolly.strongClusterControl.strongClusterControlStrings.error
import typingsJapgolly.strongClusterControl.strongClusterControlStrings.resize
import typingsJapgolly.strongClusterControl.strongClusterControlStrings.restart
import typingsJapgolly.strongClusterControl.strongClusterControlStrings.setSize
import typingsJapgolly.strongClusterControl.strongClusterControlStrings.start
import typingsJapgolly.strongClusterControl.strongClusterControlStrings.startRestart
import typingsJapgolly.strongClusterControl.strongClusterControlStrings.startWorker
import typingsJapgolly.strongClusterControl.strongClusterControlStrings.stop
import typingsJapgolly.strongClusterControl.strongClusterControlStrings.stopWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("strong-cluster-control", JSImport.Namespace)
  @js.native
  val ^ : Control = js.native
  
  object StrongClusterControl {
    
    trait CMD extends StObject {
      
      var SHUTDOWN: CLUSTER_CONTROL_shutdown
    }
    object CMD {
      
      inline def apply(): CMD = {
        val __obj = js.Dynamic.literal(SHUTDOWN = "CLUSTER_CONTROL_shutdown")
        __obj.asInstanceOf[CMD]
      }
      
      extension [Self <: CMD](x: Self) {
        
        inline def setSHUTDOWN(value: CLUSTER_CONTROL_shutdown): Self = StObject.set(x, "SHUTDOWN", value.asInstanceOf[js.Any])
      }
    }
    
    trait ClusterMaster extends StObject {
      
      var pid: Double
      
      var setSize: js.UndefOr[Double] = js.undefined
      
      var startTime: Double
    }
    object ClusterMaster {
      
      inline def apply(pid: Double, startTime: Double): ClusterMaster = {
        val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClusterMaster]
      }
      
      extension [Self <: ClusterMaster](x: Self) {
        
        inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
        
        inline def setSetSize(value: Double): Self = StObject.set(x, "setSize", value.asInstanceOf[js.Any])
        
        inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
        
        inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      }
    }
    
    trait ClusterStatus extends StObject {
      
      var master: ClusterMaster
      
      var workers: js.Array[ClusterWorker]
    }
    object ClusterStatus {
      
      inline def apply(master: ClusterMaster, workers: js.Array[ClusterWorker]): ClusterStatus = {
        val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClusterStatus]
      }
      
      extension [Self <: ClusterStatus](x: Self) {
        
        inline def setMaster(value: ClusterMaster): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
        
        inline def setWorkers(value: js.Array[ClusterWorker]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
        
        inline def setWorkersVarargs(value: ClusterWorker*): Self = StObject.set(x, "workers", js.Array(value*))
      }
    }
    
    trait ClusterWorker
      extends StObject
         with ClusterMaster {
      
      var id: Double
    }
    object ClusterWorker {
      
      inline def apply(id: Double, pid: Double, startTime: Double): ClusterWorker = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClusterWorker]
      }
      
      extension [Self <: ClusterWorker](x: Self) {
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Control
      extends StObject
         with EventEmitter {
      
      val CPUS: Double = js.native
      
      val cmd: CMD = js.native
      
      def on(event: start | stop | restart, handler: js.Function0[Any]): this.type = js.native
      def on(event: setSize | resize, handler: js.Function1[/* size */ Double, Any]): this.type = js.native
      @JSName("on")
      def on_error(event: error, handler: js.Function1[/* error */ js.Error | js.Array[js.Error], Any]): this.type = js.native
      @JSName("on")
      def on_startRestart(event: startRestart, handler: js.Function1[/* workers */ js.Array[pid], Any]): this.type = js.native
      @JSName("on")
      def on_startWorker(event: startWorker, handler: js.Function1[/* worker */ ClusterWorker, Any]): this.type = js.native
      @JSName("on")
      def on_stopWorker(
        event: stopWorker,
        handler: js.Function3[/* worker */ ClusterWorker, /* code */ Double, /* signal */ String, Any]
      ): this.type = js.native
      
      val options: StartOptions = js.native
      
      /**
        * @description Restart workers one by one, until all current workers have been restarted.
        */
      def restart(): this.type = js.native
      
      /**
        * @description Set the size of the cluster.
        * @param N - The size of the cluster is the number of workers that should be maintained online.
        */
      def setSize(): this.type = js.native
      def setSize(N: Double): this.type = js.native
      
      /**
        * @description Disconnect worker id and take increasingly agressive action until it exits.
        * @param id - Cluster worker ID,
        */
      def shutdown(id: Double): this.type = js.native
      
      /**
        * @description Start the controller
        * @param [options] - An options object, no default, and options object is not required.
        * @param [options.size] - Number of workers that should be running, the default is to not control the number of workers
        * @param [options.env=null] - Environment properties object passed to cluster.fork() if the controller has to start a worker to resize the cluster, default is null.
        * @param [options.shutdownTimeout=5000] - Number of milliseconds to wait after shutdown before terminating a worker, the default is 5 seconds
        * @param [options.terminateTimeout=5000] - Number of milliseconds to wait after terminate before killing a worker, the default is 5 seconds
        * @param [options.throttoleDelay] - Number of milliseconds to delay restarting workers after they are exiting abnormally. Abnormal is defined as as not suicide.
        */
      def start(): this.type = js.native
      def start(callback: js.Function0[Any]): this.type = js.native
      def start(options: Unit, callback: js.Function0[Any]): this.type = js.native
      def start(options: StartOptions): this.type = js.native
      def start(options: StartOptions, callback: js.Function0[Any]): this.type = js.native
      
      /**
        * @description Returns the current cluster status
        */
      def status(): ClusterStatus = js.native
      
      /**
        * @description Stop the controller, after stopping workers (if the size is being controlled, see setSize()).
        */
      def stop(): this.type = js.native
      def stop(callback: js.Function0[Any]): this.type = js.native
      
      /**
        * @description Disconnect worker id and take increasingly agressive action until it exits.
        * @param id - Cluster worker ID,
        */
      def terminate(id: Double): this.type = js.native
    }
    
    trait StartOptions extends StObject {
      
      var env: js.UndefOr[js.Object] = js.undefined
      
      var shutdownTimeout: js.UndefOr[Double] = js.undefined
      
      var size: js.UndefOr[Double] = js.undefined
      
      var terminateTimeout: js.UndefOr[Double] = js.undefined
      
      var throttleDelay: js.UndefOr[Double] = js.undefined
    }
    object StartOptions {
      
      inline def apply(): StartOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StartOptions]
      }
      
      extension [Self <: StartOptions](x: Self) {
        
        inline def setEnv(value: js.Object): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
        
        inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
        
        inline def setShutdownTimeout(value: Double): Self = StObject.set(x, "shutdownTimeout", value.asInstanceOf[js.Any])
        
        inline def setShutdownTimeoutUndefined: Self = StObject.set(x, "shutdownTimeout", js.undefined)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setTerminateTimeout(value: Double): Self = StObject.set(x, "terminateTimeout", value.asInstanceOf[js.Any])
        
        inline def setTerminateTimeoutUndefined: Self = StObject.set(x, "terminateTimeout", js.undefined)
        
        inline def setThrottleDelay(value: Double): Self = StObject.set(x, "throttleDelay", value.asInstanceOf[js.Any])
        
        inline def setThrottleDelayUndefined: Self = StObject.set(x, "throttleDelay", js.undefined)
      }
    }
    
    type pid = Double
  }
  
  type _To = Control
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Control = ^
}
