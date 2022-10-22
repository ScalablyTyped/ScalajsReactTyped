package typingsJapgolly.babylonjs.indexMod

import org.scalajs.dom.Worker
import typingsJapgolly.babylonjs.miscWorkerPoolMod.AutoReleaseWorkerPoolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "AutoReleaseWorkerPool")
@js.native
open class AutoReleaseWorkerPool protected ()
  extends typingsJapgolly.babylonjs.miscIndexMod.AutoReleaseWorkerPool {
  def this(maxWorkers: Double, createWorkerAsync: js.Function0[js.Promise[Worker]]) = this()
  def this(
    maxWorkers: Double,
    createWorkerAsync: js.Function0[js.Promise[Worker]],
    options: AutoReleaseWorkerPoolOptions
  ) = this()
}
/* static members */
object AutoReleaseWorkerPool {
  
  @JSImport("babylonjs/index", "AutoReleaseWorkerPool")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default options for the constructor.
    * Override to change the defaults.
    */
  @JSImport("babylonjs/index", "AutoReleaseWorkerPool.DefaultOptions")
  @js.native
  def DefaultOptions: AutoReleaseWorkerPoolOptions = js.native
  inline def DefaultOptions_=(x: AutoReleaseWorkerPoolOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultOptions")(x.asInstanceOf[js.Any])
}
