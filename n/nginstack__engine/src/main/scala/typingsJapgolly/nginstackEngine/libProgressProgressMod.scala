package typingsJapgolly.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressProgressMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opt_logger: Logger): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/progress/Progress", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Progress {
    def this(opt_logger: Logger) = this()
  }
  @JSImport("@nginstack/engine/lib/progress/Progress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Logger = typingsJapgolly.nginstackEngine.libLogLoggerMod.^
  
  @js.native
  trait Progress extends StObject {
    
    def beginTask(name: String): Unit = js.native
    def beginTask(name: String, opt_totalWork: Double): Unit = js.native
    
    def done(): Unit = js.native
    
    def forkSubTask(workQty: Double): Unit = js.native
    
    def worked(): Unit = js.native
    def worked(opt_qty: Double): Unit = js.native
  }
}
