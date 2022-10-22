package typingsJapgolly.tsNode

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBinMod {
  
  @JSImport("ts-node/dist/bin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def main(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("main")().asInstanceOf[Unit]
  inline def main(argv: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("main")(argv.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def main(argv: js.Array[String], entrypointArgs: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(argv.asInstanceOf[js.Any], entrypointArgs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def main(argv: Unit, entrypointArgs: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(argv.asInstanceOf[js.Any], entrypointArgs.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
