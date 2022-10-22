package typingsJapgolly.rimraf

import japgolly.scalajs.react.Callback
import typingsJapgolly.glob.mod.IOptions
import typingsJapgolly.node.fsMod.Mode
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.StatSyncFn
import typingsJapgolly.rimraf.anon.FnCall
import typingsJapgolly.rimraf.anon.FnCallPathOptions
import typingsJapgolly.rimraf.anon.Typeofchmod
import typingsJapgolly.rimraf.anon.Typeoflstat
import typingsJapgolly.rimraf.anon.Typeofreaddir
import typingsJapgolly.rimraf.anon.Typeofrmdir
import typingsJapgolly.rimraf.anon.Typeofstat
import typingsJapgolly.rimraf.anon.Typeofunlink
import typingsJapgolly.rimraf.rimrafBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    path: String,
    options: Options,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("rimraf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * It can remove stuff synchronously, too.
    * But that's not so good. Use the async API.
    * It's better.
    */
  inline def sync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def sync(path: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * see {@link https://github.com/isaacs/rimraf/blob/79b933fb362b2c51bedfa448be848e1d7ed32d7e/README.md#options}
    */
  trait Options extends StObject {
    
    var chmod: js.UndefOr[Typeofchmod] = js.undefined
    
    var chmodSync: js.UndefOr[js.Function2[/* path */ PathLike, /* mode */ Mode, Unit]] = js.undefined
    
    /** @default false */
    var disableGlob: js.UndefOr[Boolean] = js.undefined
    
    var emfileWait: js.UndefOr[Double] = js.undefined
    
    var glob: js.UndefOr[IOptions | `false`] = js.undefined
    
    var lstat: js.UndefOr[Typeoflstat] = js.undefined
    
    var lstatSync: js.UndefOr[StatSyncFn] = js.undefined
    
    var maxBusyTries: js.UndefOr[Double] = js.undefined
    
    var readdir: js.UndefOr[Typeofreaddir] = js.undefined
    
    var readdirSync: js.UndefOr[FnCallPathOptions] = js.undefined
    
    var rmdir: js.UndefOr[Typeofrmdir] = js.undefined
    
    var rmdirSync: js.UndefOr[FnCall] = js.undefined
    
    var stat: js.UndefOr[Typeofstat] = js.undefined
    
    var statSync: js.UndefOr[StatSyncFn] = js.undefined
    
    var unlink: js.UndefOr[Typeofunlink] = js.undefined
    
    var unlinkSync: js.UndefOr[js.Function1[/* path */ PathLike, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChmod(value: Typeofchmod): Self = StObject.set(x, "chmod", value.asInstanceOf[js.Any])
      
      inline def setChmodSync(value: (/* path */ PathLike, /* mode */ Mode) => Callback): Self = StObject.set(x, "chmodSync", js.Any.fromFunction2((t0: /* path */ PathLike, t1: /* mode */ Mode) => (value(t0, t1)).runNow()))
      
      inline def setChmodSyncUndefined: Self = StObject.set(x, "chmodSync", js.undefined)
      
      inline def setChmodUndefined: Self = StObject.set(x, "chmod", js.undefined)
      
      inline def setDisableGlob(value: Boolean): Self = StObject.set(x, "disableGlob", value.asInstanceOf[js.Any])
      
      inline def setDisableGlobUndefined: Self = StObject.set(x, "disableGlob", js.undefined)
      
      inline def setEmfileWait(value: Double): Self = StObject.set(x, "emfileWait", value.asInstanceOf[js.Any])
      
      inline def setEmfileWaitUndefined: Self = StObject.set(x, "emfileWait", js.undefined)
      
      inline def setGlob(value: IOptions | `false`): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      inline def setLstat(value: Typeoflstat): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      inline def setLstatSync(value: StatSyncFn): Self = StObject.set(x, "lstatSync", value.asInstanceOf[js.Any])
      
      inline def setLstatSyncUndefined: Self = StObject.set(x, "lstatSync", js.undefined)
      
      inline def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      inline def setMaxBusyTries(value: Double): Self = StObject.set(x, "maxBusyTries", value.asInstanceOf[js.Any])
      
      inline def setMaxBusyTriesUndefined: Self = StObject.set(x, "maxBusyTries", js.undefined)
      
      inline def setReaddir(value: Typeofreaddir): Self = StObject.set(x, "readdir", value.asInstanceOf[js.Any])
      
      inline def setReaddirSync(value: FnCallPathOptions): Self = StObject.set(x, "readdirSync", value.asInstanceOf[js.Any])
      
      inline def setReaddirSyncUndefined: Self = StObject.set(x, "readdirSync", js.undefined)
      
      inline def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      inline def setRmdir(value: Typeofrmdir): Self = StObject.set(x, "rmdir", value.asInstanceOf[js.Any])
      
      inline def setRmdirSync(value: FnCall): Self = StObject.set(x, "rmdirSync", value.asInstanceOf[js.Any])
      
      inline def setRmdirSyncUndefined: Self = StObject.set(x, "rmdirSync", js.undefined)
      
      inline def setRmdirUndefined: Self = StObject.set(x, "rmdir", js.undefined)
      
      inline def setStat(value: Typeofstat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatSync(value: StatSyncFn): Self = StObject.set(x, "statSync", value.asInstanceOf[js.Any])
      
      inline def setStatSyncUndefined: Self = StObject.set(x, "statSync", js.undefined)
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
      
      inline def setUnlink(value: Typeofunlink): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
      
      inline def setUnlinkSync(value: /* path */ PathLike => Callback): Self = StObject.set(x, "unlinkSync", js.Any.fromFunction1((t0: /* path */ PathLike) => value(t0).runNow()))
      
      inline def setUnlinkSyncUndefined: Self = StObject.set(x, "unlinkSync", js.undefined)
      
      inline def setUnlinkUndefined: Self = StObject.set(x, "unlink", js.undefined)
    }
  }
}
