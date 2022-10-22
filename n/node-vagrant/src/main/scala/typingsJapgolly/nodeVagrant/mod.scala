package typingsJapgolly.nodeVagrant

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.nodeVagrant.anon.Cb
import typingsJapgolly.nodeVagrant.anon.CurrentVersion
import typingsJapgolly.nodeVagrant.anon.Cwd
import typingsJapgolly.nodeVagrant.anon.Env
import typingsJapgolly.nodeVagrant.anon.Host
import typingsJapgolly.nodeVagrant.anon.Id
import typingsJapgolly.nodeVagrant.anon.Major
import typingsJapgolly.nodeVagrant.anon.Name
import typingsJapgolly.nodeVagrant.anon.Provider
import typingsJapgolly.nodeVagrant.nodeVagrantStrings.`up-progress`
import typingsJapgolly.nodeVagrant.nodeVagrantStrings.progress
import typingsJapgolly.nodeVagrant.nodeVagrantStrings.stderr
import typingsJapgolly.nodeVagrant.nodeVagrantStrings.stdout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-vagrant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def boxAdd(box: String): ProgressEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("boxAdd")(box.asInstanceOf[js.Any]).asInstanceOf[ProgressEmitter]
  inline def boxAdd(box: String, args: String): ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("boxAdd")(box.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ProgressEmitter]
  inline def boxAdd(box: String, args: String, cb: Callback): ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("boxAdd")(box.asInstanceOf[js.Any], args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ProgressEmitter]
  inline def boxAdd(box: String, args: js.Array[String]): ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("boxAdd")(box.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ProgressEmitter]
  inline def boxAdd(box: String, args: js.Array[String], cb: Callback): ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("boxAdd")(box.asInstanceOf[js.Any], args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ProgressEmitter]
  inline def boxAdd(box: String, args: Unit, cb: Callback): ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("boxAdd")(box.asInstanceOf[js.Any], args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ProgressEmitter]
  inline def boxAdd(box: String, cb: Callback): ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("boxAdd")(box.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ProgressEmitter]
  
  inline def boxList(args: String, cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Name]], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxList")(args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxList(
    args: js.Array[String],
    cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Name]], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxList")(args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxList(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Name]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("boxList")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def boxOutdated(
    args: String,
    cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[CurrentVersion]], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxOutdated")(args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxOutdated(
    args: js.Array[String],
    cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[CurrentVersion]], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxOutdated")(args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxOutdated(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[CurrentVersion]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("boxOutdated")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def boxPrune(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("boxPrune")().asInstanceOf[Unit]
  inline def boxPrune(args: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("boxPrune")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def boxPrune(args: String, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxPrune")(args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxPrune(args: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("boxPrune")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def boxPrune(args: js.Array[String], cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxPrune")(args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxPrune(cb: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("boxPrune")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def boxRemove(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("boxRemove")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def boxRemove(name: String, args: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxRemove")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxRemove(name: String, args: String, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxRemove")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxRemove(name: String, args: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxRemove")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxRemove(name: String, args: js.Array[String], cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxRemove")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def boxRemove(name: String, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boxRemove")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def boxUpdate(box: String): ProgressEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("boxUpdate")(box.asInstanceOf[js.Any]).asInstanceOf[ProgressEmitter]
  inline def boxUpdate(box: String, provider: String): ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("boxUpdate")(box.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[ProgressEmitter]
  inline def boxUpdate(box: String, provider: String, cb: Callback): ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("boxUpdate")(box.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ProgressEmitter]
  inline def boxUpdate(box: String, provider: Null, cb: Callback): ProgressEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("boxUpdate")(box.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ProgressEmitter]
  
  inline def create(): Machine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Machine]
  inline def create(opts: Env): Machine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[Machine]
  
  inline def globalStatus(args: String, cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Id]], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("globalStatus")(args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def globalStatus(
    args: js.Array[String],
    cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Id]], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("globalStatus")(args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def globalStatus(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Id]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("globalStatus")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def promisify(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("promisify")().asInstanceOf[Unit]
  
  inline def version(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("version")().asInstanceOf[Unit]
  inline def version(cb: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("version")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def versionStatus(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[Major], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("versionStatus")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Callback = js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[String], Unit]
  
  type ErrorArg = js.Error | String | Null
  
  @js.native
  trait Machine extends MachineEmitter {
    
    var batch: js.Array[Cb] = js.native
    
    def boxRepackage(name: String, provider: String, version: String): Unit = js.native
    def boxRepackage(name: String, provider: String, version: String, cb: Callback): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(args: String): Unit = js.native
    def destroy(args: String, cb: Callback): Unit = js.native
    def destroy(args: js.Array[String]): Unit = js.native
    def destroy(args: js.Array[String], cb: Callback): Unit = js.native
    def destroy(args: Unit, cb: Callback): Unit = js.native
    def destroy(cb: Callback): Unit = js.native
    
    def halt(): Unit = js.native
    def halt(args: String): Unit = js.native
    def halt(args: String, cb: Callback): Unit = js.native
    def halt(args: js.Array[String]): Unit = js.native
    def halt(args: js.Array[String], cb: Callback): Unit = js.native
    def halt(args: Unit, cb: Callback): Unit = js.native
    def halt(cb: Callback): Unit = js.native
    
    def init(args: String, cb: Callback): Unit = js.native
    def init(args: String, config: Any, cb: Callback): Unit = js.native
    def init(args: js.Array[String], cb: Callback): Unit = js.native
    def init(args: js.Array[String], config: Any, cb: Callback): Unit = js.native
    
    var opts: Cwd = js.native
    
    def plugin(): Plugin = js.native
    
    def pluginRepair(): Unit = js.native
    def pluginRepair(cb: Callback): Unit = js.native
    
    def pluginUpdate(): Unit = js.native
    def pluginUpdate(cb: Callback): Unit = js.native
    
    def provision(): Unit = js.native
    def provision(cb: Callback): Unit = js.native
    
    def reload(): Unit = js.native
    def reload(args: String): Unit = js.native
    def reload(args: String, cb: Callback): Unit = js.native
    def reload(args: js.Array[String]): Unit = js.native
    def reload(args: js.Array[String], cb: Callback): Unit = js.native
    def reload(args: Unit, cb: Callback): Unit = js.native
    def reload(cb: Callback): Unit = js.native
    
    def resume(): Unit = js.native
    def resume(cb: Callback): Unit = js.native
    
    def snapshots(): Snapshots = js.native
    
    def sshConfig(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[Host], Unit]): Unit = js.native
    
    def status(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Provider]], Unit]): Unit = js.native
    
    def suspend(): Unit = js.native
    def suspend(cb: Callback): Unit = js.native
    
    def up(): Unit = js.native
    def up(args: String): Unit = js.native
    def up(args: String, cb: Callback): Unit = js.native
    def up(args: js.Array[String]): Unit = js.native
    def up(args: js.Array[String], cb: Callback): Unit = js.native
    def up(args: Unit, cb: Callback): Unit = js.native
    def up(cb: Callback): Unit = js.native
  }
  
  @js.native
  trait MachineEmitter extends EventEmitter {
    
    def on(event: stdout | stderr | `up-progress`, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_progress(
      event: progress,
      listener: js.Function4[
          /* machine */ String, 
          /* progress */ String, 
          /* rate */ String, 
          /* remaining */ String, 
          Unit
        ]
    ): this.type = js.native
  }
  
  @js.native
  trait Plugin extends StObject {
    
    def expunge(): Unit = js.native
    def expunge(args: String): Unit = js.native
    def expunge(args: String, cb: Callback): Unit = js.native
    def expunge(args: js.Array[String]): Unit = js.native
    def expunge(args: js.Array[String], cb: Callback): Unit = js.native
    def expunge(args: Unit, cb: Callback): Unit = js.native
    
    def install(): Unit = js.native
    def install(args: String): Unit = js.native
    def install(args: String, cb: Callback): Unit = js.native
    def install(args: js.Array[String]): Unit = js.native
    def install(args: js.Array[String], cb: Callback): Unit = js.native
    def install(args: Unit, cb: Callback): Unit = js.native
    
    def list(): Unit = js.native
    def list(args: String): Unit = js.native
    def list(args: String, cb: Callback): Unit = js.native
    def list(args: js.Array[String]): Unit = js.native
    def list(args: js.Array[String], cb: Callback): Unit = js.native
    def list(args: Unit, cb: Callback): Unit = js.native
    
    def repair(): Unit = js.native
    def repair(args: String): Unit = js.native
    def repair(args: String, cb: Callback): Unit = js.native
    def repair(args: js.Array[String]): Unit = js.native
    def repair(args: js.Array[String], cb: Callback): Unit = js.native
    def repair(args: Unit, cb: Callback): Unit = js.native
    
    def uninstall(): Unit = js.native
    def uninstall(args: String): Unit = js.native
    def uninstall(args: String, cb: Callback): Unit = js.native
    def uninstall(args: js.Array[String]): Unit = js.native
    def uninstall(args: js.Array[String], cb: Callback): Unit = js.native
    def uninstall(args: Unit, cb: Callback): Unit = js.native
    
    def update(): Unit = js.native
    def update(args: String): Unit = js.native
    def update(args: String, cb: Callback): Unit = js.native
    def update(args: js.Array[String]): Unit = js.native
    def update(args: js.Array[String], cb: Callback): Unit = js.native
    def update(args: Unit, cb: Callback): Unit = js.native
  }
  
  @js.native
  trait ProgressEmitter extends EventEmitter {
    
    @JSName("on")
    def on_progress(
      event: progress,
      listener: js.Function4[
          /* machine */ String, 
          /* progress */ String, 
          /* rate */ String, 
          /* remaining */ String, 
          Unit
        ]
    ): this.type = js.native
  }
  
  @js.native
  trait Snapshots extends StObject {
    
    def delete(args: String): Unit = js.native
    def delete(args: String, cb: Callback): Unit = js.native
    def delete(args: js.Array[String]): Unit = js.native
    def delete(args: js.Array[String], cb: Callback): Unit = js.native
    
    def list(): Unit = js.native
    def list(cb: Callback): Unit = js.native
    
    def pop(): Unit = js.native
    def pop(cb: Callback): Unit = js.native
    
    def push(): Unit = js.native
    def push(cb: Callback): Unit = js.native
    
    def restore(): Unit = js.native
    def restore(args: String): Unit = js.native
    def restore(args: String, cb: Callback): Unit = js.native
    def restore(args: js.Array[String]): Unit = js.native
    def restore(args: js.Array[String], cb: Callback): Unit = js.native
    def restore(args: Unit, cb: Callback): Unit = js.native
    
    def save(): Unit = js.native
    def save(args: String): Unit = js.native
    def save(args: String, cb: Callback): Unit = js.native
    def save(args: js.Array[String]): Unit = js.native
    def save(args: js.Array[String], cb: Callback): Unit = js.native
    def save(args: Unit, cb: Callback): Unit = js.native
  }
}
