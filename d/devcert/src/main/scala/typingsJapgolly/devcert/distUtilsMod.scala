package typingsJapgolly.devcert

import typingsJapgolly.node.NodeJS.ArrayBufferView
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.childProcessMod.ExecFileSyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("devcert/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mktmp(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mktmp")().asInstanceOf[String]
  
  inline def numericHash(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("numericHash")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def openssl(args: js.Array[String]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("openssl")(args.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def reportableError(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("reportableError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def run(cmd: String, args: js.Array[String]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def run(cmd: String, args: js.Array[String], options: ExecFileSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def sudo(cmd: String): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("sudo")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  inline def sudoAppend(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sudoAppend")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def sudoAppend(file: String, input: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sudoAppend")(file.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sudoAppend(file: String, input: ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sudoAppend")(file.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def waitForUser(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForUser")().asInstanceOf[js.Promise[Any]]
}
