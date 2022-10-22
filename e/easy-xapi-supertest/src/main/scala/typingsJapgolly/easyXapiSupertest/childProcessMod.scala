package typingsJapgolly.easyXapiSupertest

import typingsJapgolly.easyXapiSupertest.anon.Custom
import typingsJapgolly.easyXapiSupertest.anon.CustomFds
import typingsJapgolly.easyXapiSupertest.anon.Cwd
import typingsJapgolly.easyXapiSupertest.anon.Encoding
import typingsJapgolly.easyXapiSupertest.anon.Env
import typingsJapgolly.easyXapiSupertest.eventsMod.EventEmitter
import typingsJapgolly.easyXapiSupertest.streamMod.Readable
import typingsJapgolly.easyXapiSupertest.streamMod.Writable
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childProcessMod {
  
  @JSImport("child_process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exec(command: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def exec(
    command: String,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def exec(command: String, options: CustomFds): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def exec(
    command: String,
    options: CustomFds,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def execFile(file: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def execFile(file: String, args: js.Array[String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: js.Array[String],
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: js.Array[String],
    options: Unit,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, args: js.Array[String], options: Cwd): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: js.Array[String],
    options: Cwd,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: Unit,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: Unit,
    options: Unit,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, args: Unit, options: Cwd): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: Unit,
    options: Cwd,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def execFileSync(command: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def execFileSync(command: String, args: js.Array[String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFileSync(command: String, args: js.Array[String], options: Encoding): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFileSync(command: String, args: Unit, options: Encoding): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def execSync(command: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def execSync(command: String, options: Encoding): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def fork(modulePath: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def fork(modulePath: String, args: js.Array[String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def fork(modulePath: String, args: js.Array[String], options: Env): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def fork(modulePath: String, args: Unit, options: Env): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def spawn(command: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def spawn(command: String, args: js.Array[String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def spawn(command: String, args: js.Array[String], options: Custom): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def spawn(command: String, args: Unit, options: Custom): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  @js.native
  trait ChildProcess extends EventEmitter {
    
    def disconnect(): Unit = js.native
    
    def kill(): Unit = js.native
    def kill(signal: String): Unit = js.native
    
    var pid: Double = js.native
    
    def send(message: Any): Unit = js.native
    def send(message: Any, sendHandle: Any): Unit = js.native
    
    var stderr: Readable = js.native
    
    var stdin: Writable = js.native
    
    var stdout: Readable = js.native
  }
}
