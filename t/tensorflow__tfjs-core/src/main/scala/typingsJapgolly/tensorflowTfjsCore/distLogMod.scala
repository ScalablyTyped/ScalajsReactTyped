package typingsJapgolly.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLogMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def log(msg: js.Object*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(msg.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def warn(msg: js.Object*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
}
