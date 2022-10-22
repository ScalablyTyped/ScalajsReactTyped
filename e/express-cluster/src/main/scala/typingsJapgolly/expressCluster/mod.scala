package typingsJapgolly.expressCluster

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.clusterMod.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("express-cluster", JSImport.Namespace)
  @js.native
  val ^ : Cluster = js.native
  
  @js.native
  trait Cluster extends StObject {
    
    def apply(config: Config, fn: WorkerFunction): Unit = js.native
    def apply(fn: WorkerFunction, config: Config): Unit = js.native
  }
  
  trait Config extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var outputStream: js.UndefOr[WritableStream] = js.undefined
    
    var respawn: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var workerListener: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setOutputStream(value: WritableStream): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
      
      inline def setOutputStreamUndefined: Self = StObject.set(x, "outputStream", js.undefined)
      
      inline def setRespawn(value: Boolean): Self = StObject.set(x, "respawn", value.asInstanceOf[js.Any])
      
      inline def setRespawnUndefined: Self = StObject.set(x, "respawn", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWorkerListener(value: Callback): Self = StObject.set(x, "workerListener", value.toJsFn)
      
      inline def setWorkerListenerUndefined: Self = StObject.set(x, "workerListener", js.undefined)
    }
  }
  
  type WorkerFunction = js.Function1[/* worker */ Worker, Unit]
  
  type _To = Cluster
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Cluster = ^
}
