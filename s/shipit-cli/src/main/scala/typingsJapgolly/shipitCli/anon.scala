package typingsJapgolly.shipitCli

import typingsJapgolly.node.childProcessMod.ExecOptions
import typingsJapgolly.shipitCli.mod.EmptyCallback
import typingsJapgolly.shipitCli.mod.ShipitLocal
import typingsJapgolly.shipitCli.mod.Tasks_
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofshipit extends StObject {
    
    def blTask(name: String, depsOrFn: js.Array[String]): Any = js.native
    def blTask(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): Any = js.native
    def blTask(name: String, depsOrFn: EmptyCallback): Any = js.native
    def blTask(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): Any = js.native
    
    def copyFromRemote(src: String, dest: String): PromiseLike[ShipitLocal] = js.native
    def copyFromRemote(src: String, dest: String, options: ExecOptions): PromiseLike[ShipitLocal] = js.native
    
    def copyToRemote(src: String, dest: String): PromiseLike[ShipitLocal] = js.native
    def copyToRemote(src: String, dest: String, options: ExecOptions): PromiseLike[ShipitLocal] = js.native
    
    val domain: Any = js.native
    
    val doneCallback: Any = js.native
    
    def emit(name: String): Any = js.native
    
    val environment: String = js.native
    
    def initConfig(config: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: typeof shipit */ js.Any = js.native
    
    val isRunning: Boolean = js.native
    
    def local(command: String): PromiseLike[ShipitLocal] = js.native
    def local(
      command: String,
      options: Unit,
      callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
    ): PromiseLike[ShipitLocal] = js.native
    def local(command: String, options: ExecOptions): PromiseLike[ShipitLocal] = js.native
    def local(
      command: String,
      options: ExecOptions,
      callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
    ): PromiseLike[ShipitLocal] = js.native
    
    def log(log: Any*): Unit = js.native
    def log(log: Any): Unit = js.native
    
    def on(name: String, callback: js.Function1[/* e */ Any, Unit]): Any = js.native
    
    def remote(command: String): PromiseLike[ShipitLocal] = js.native
    def remote(
      command: String,
      options: Unit,
      callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
    ): PromiseLike[ShipitLocal] = js.native
    def remote(command: String, options: ExecOptions): PromiseLike[ShipitLocal] = js.native
    def remote(
      command: String,
      options: ExecOptions,
      callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
    ): PromiseLike[ShipitLocal] = js.native
    
    def remoteCopy(src: String, dest: String): PromiseLike[ShipitLocal] = js.native
    def remoteCopy(
      src: String,
      dest: String,
      options: Unit,
      callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
    ): PromiseLike[ShipitLocal] = js.native
    def remoteCopy(src: String, dest: String, options: ExecOptions): PromiseLike[ShipitLocal] = js.native
    def remoteCopy(
      src: String,
      dest: String,
      options: ExecOptions,
      callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
    ): PromiseLike[ShipitLocal] = js.native
    
    val seq: js.Array[Any] = js.native
    
    def start(tasks: String*): /* import warning: importer.ImportType#apply Failed type conversion: typeof shipit */ js.Any = js.native
    def start(tasks: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof shipit */ js.Any = js.native
    def start(tasks: js.Array[String]): /* import warning: importer.ImportType#apply Failed type conversion: typeof shipit */ js.Any = js.native
    
    def task(name: String, depsOrFn: js.Array[String]): /* import warning: importer.ImportType#apply Failed type conversion: typeof shipit */ js.Any = js.native
    def task(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): /* import warning: importer.ImportType#apply Failed type conversion: typeof shipit */ js.Any = js.native
    def task(name: String, depsOrFn: EmptyCallback): /* import warning: importer.ImportType#apply Failed type conversion: typeof shipit */ js.Any = js.native
    def task(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): /* import warning: importer.ImportType#apply Failed type conversion: typeof shipit */ js.Any = js.native
    
    val tasks: Tasks_ = js.native
  }
}
