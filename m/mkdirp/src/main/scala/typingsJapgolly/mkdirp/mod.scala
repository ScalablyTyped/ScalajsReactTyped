package typingsJapgolly.mkdirp

import typingsJapgolly.mkdirp.anon.FnCall
import typingsJapgolly.mkdirp.anon.Typeofmkdir
import typingsJapgolly.mkdirp.anon.Typeofstat
import typingsJapgolly.node.anon.MakeDirectoryOptionsrecur
import typingsJapgolly.node.anon.MakeDirectoryOptionsrecurMode
import typingsJapgolly.node.anon.StatSyncOptionsbigintbool
import typingsJapgolly.node.anon.StatSyncOptionsbigintfals
import typingsJapgolly.node.anon.StatSyncOptionsbigintfalsBigint
import typingsJapgolly.node.anon.StatSyncOptionsbiginttrue
import typingsJapgolly.node.anon.StatSyncOptionsbiginttrueBigint
import typingsJapgolly.node.fsMod.BigIntStats
import typingsJapgolly.node.fsMod.MakeDirectoryOptions
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.StatSyncFn
import typingsJapgolly.node.fsMod.StatSyncOptions
import typingsJapgolly.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new directory and any necessary subdirectories at dir with octal
    * permission string `opts.mode`. If opts is a string or number, it will be
    * treated as the `opts.mode`. If opts.mode isn't specified, it defaults to
    * 0o777 & (~`process.umask()`).
    *
    * Promise resolves to first directory made that had to be created, or
    * undefined if everything already exists. Promise rejects if any errors are
    * encountered. Note that, in the case of promise rejection, some directories
    * may have been created, as recursive directory creation is not an atomic operation.
    * You can optionally pass in an alternate fs implementation by passing in
    * opts.fs.
    *
    * Your implementation should have `opts.fs.mkdir(path, opts, cb)` and
    * `opts.fs.stat(path, cb)`.
    *
    * You can also override just one or the other of mkdir and stat by passing in
    * `opts.stat` or `opts.mkdir`, or providing an fs option that only overrides one
    * of these.
    */
  inline def apply(dir: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def apply(dir: String, opts: Mode): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def apply(dir: String, opts: Options): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  @JSImport("mkdirp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Use the manual implementation (not the native one). This is the default
    * when the native implementation is not available or the stat/mkdir
    * implementation is overridden.
    */
  inline def manual(dir: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("manual")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def manual(dir: String, opts: Mode): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("manual")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def manual(dir: String, opts: Options): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("manual")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  /**
    * Use the manual implementation (not the native one). This is the default
    * when the native implementation is not available or the stat/mkdir
    * implementation is overridden.
    */
  inline def manualSync(dir: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def manualSync(dir: String, opts: Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def manualSync(dir: String, opts: OptionsSync): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Use the native implementation (not the manual one). This is the default
    * when the native implementation is available and stat/mkdir are not
    * overridden.
    */
  inline def native(dir: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def native(dir: String, opts: Mode): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def native(dir: String, opts: Options): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  /**
    * Use the native implementation (not the manual one). This is the default
    * when the native implementation is available and stat/mkdir are not
    * overridden.
    */
  inline def nativeSync(dir: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeSync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def nativeSync(dir: String, opts: Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("nativeSync")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def nativeSync(dir: String, opts: OptionsSync): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("nativeSync")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Synchronously create a new directory and any necessary subdirectories at
    * dir with octal permission string `opts.mode`. If opts is a string or number,
    * it will be treated as the `opts.mode`. If `opts.mode` isn't specified, it
    * defaults to 0o777 & (~`process.umask()`).
    * You can optionally pass in an alternate fs implementation by passing in
    * `opts.fs`. Your implementation should have `opts.fs.mkdirSync(path, mode)`
    * and `opts.fs.statSync(path)`. You can also override just one or the other
    * of `mkdirSync` and `statSync` by passing in `opts.statSync` or `opts.mkdirSync`,
    * or providing an fs option that only overrides one of these.
    * @returns Returns the first directory that had to be created, or undefined if everything already exists.
    */
  inline def sync(dir: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def sync(dir: String, opts: Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def sync(dir: String, opts: OptionsSync): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  trait FsImplementation extends StObject {
    
    var mkdir: Typeofmkdir
    
    var stat: Typeofstat
  }
  object FsImplementation {
    
    inline def apply(mkdir: Typeofmkdir, stat: Typeofstat): FsImplementation = {
      val __obj = js.Dynamic.literal(mkdir = mkdir.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsImplementation]
    }
    
    extension [Self <: FsImplementation](x: Self) {
      
      inline def setMkdir(value: Typeofmkdir): Self = StObject.set(x, "mkdir", value.asInstanceOf[js.Any])
      
      inline def setStat(value: Typeofstat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    }
  }
  
  trait FsImplementationSync extends StObject {
    
    def mkdirSync(path: PathLike): js.UndefOr[String]
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String]
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit
    def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String]
    def mkdirSync(path: PathLike, options: typingsJapgolly.node.fsMod.Mode): js.UndefOr[String]
    @JSName("mkdirSync")
    var mkdirSync_Original: FnCall
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike): Unit
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike, options: typingsJapgolly.node.fsMod.Mode): Unit
    
    def statSync(path: PathLike): Stats
    def statSync(path: PathLike, options: Unit): Stats
    def statSync(path: PathLike, options: StatSyncOptionsbigintbool): Stats | BigIntStats
    def statSync(path: PathLike, options: StatSyncOptionsbigintfals): js.UndefOr[Stats]
    def statSync(path: PathLike, options: StatSyncOptionsbigintfalsBigint): Stats
    def statSync(path: PathLike, options: StatSyncOptionsbiginttrue): js.UndefOr[BigIntStats]
    def statSync(path: PathLike, options: StatSyncOptionsbiginttrueBigint): BigIntStats
    def statSync(path: PathLike, options: StatSyncOptions): js.UndefOr[Stats | BigIntStats]
    @JSName("statSync")
    var statSync_Original: StatSyncFn
    @JSName("statSync")
    def statSync_Union(path: PathLike): js.UndefOr[Stats]
  }
  object FsImplementationSync {
    
    inline def apply(mkdirSync: FnCall, statSync: StatSyncFn): FsImplementationSync = {
      val __obj = js.Dynamic.literal(mkdirSync = mkdirSync.asInstanceOf[js.Any], statSync = statSync.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsImplementationSync]
    }
    
    extension [Self <: FsImplementationSync](x: Self) {
      
      inline def setMkdirSync(value: FnCall): Self = StObject.set(x, "mkdirSync", value.asInstanceOf[js.Any])
      
      inline def setStatSync(value: StatSyncFn): Self = StObject.set(x, "statSync", value.asInstanceOf[js.Any])
    }
  }
  
  type Mode = js.UndefOr[Double | String]
  
  trait Options extends StObject {
    
    var fs: js.UndefOr[FsImplementation] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFs(value: FsImplementation): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait OptionsSync extends StObject {
    
    var fs: js.UndefOr[FsImplementationSync] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
  }
  object OptionsSync {
    
    inline def apply(): OptionsSync = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsSync]
    }
    
    extension [Self <: OptionsSync](x: Self) {
      
      inline def setFs(value: FsImplementationSync): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
