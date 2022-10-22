package typingsJapgolly.fastGlob

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.nodelibFsScandir.anon.WithFileTypes
import typingsJapgolly.nodelibFsScandir.outTypesMod.Dirent
import typingsJapgolly.nodelibFsScandir.outTypesMod.ErrnoException
import typingsJapgolly.nodelibFsStat.outAdaptersFsMod.StatAsynchronousMethod
import typingsJapgolly.nodelibFsStat.outAdaptersFsMod.StatSynchronousMethod
import typingsJapgolly.nodelibFsStat.outTypesMod.Stats
import typingsJapgolly.nodelibFsWalk.outSettingsMod.Options
import typingsJapgolly.nodelibFsWalk.outSettingsMod.default
import typingsJapgolly.nodelibFsWalk.outTypesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(directory: String): Readable = js.native
    def apply(directory: String, optionsOrSettings: Options): Readable = js.native
    def apply(directory: String, optionsOrSettings: default): Readable = js.native
  }
  
  @js.native
  trait FnCallDirectoryOptionsOrSettings extends StObject {
    
    def apply(directory: String): js.Array[Entry] = js.native
    def apply(directory: String, optionsOrSettings: Options): js.Array[Entry] = js.native
    def apply(directory: String, optionsOrSettings: default): js.Array[Entry] = js.native
  }
  
  @js.native
  trait FnCallPathOptionsOrSettings extends StObject {
    
    def apply(path: String): Stats = js.native
    def apply(path: String, optionsOrSettings: typingsJapgolly.nodelibFsStat.outSettingsMod.Options): Stats = js.native
    def apply(path: String, optionsOrSettings: typingsJapgolly.nodelibFsStat.outSettingsMod.default): Stats = js.native
  }
  
  /* Inlined std.Partial<fast-glob.fast-glob/out/types.FileSystemAdapter> */
  trait PartialFileSystemAdapter extends StObject {
    
    var lstat: js.UndefOr[StatAsynchronousMethod] = js.undefined
    
    var lstatSync: js.UndefOr[StatSynchronousMethod] = js.undefined
    
    var readdir: js.UndefOr[
        js.Function3[
          /* filepath */ String, 
          /* options */ WithFileTypes, 
          /* callback */ js.Function2[/* error */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var readdirSync: js.UndefOr[
        js.Function2[/* filepath */ String, /* options */ WithFileTypes, js.Array[Dirent]]
      ] = js.undefined
    
    var stat: js.UndefOr[StatAsynchronousMethod] = js.undefined
    
    var statSync: js.UndefOr[StatSynchronousMethod] = js.undefined
  }
  object PartialFileSystemAdapter {
    
    inline def apply(): PartialFileSystemAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFileSystemAdapter]
    }
    
    extension [Self <: PartialFileSystemAdapter](x: Self) {
      
      inline def setLstat(
        value: (/* path */ String, /* callback */ js.Function2[
              /* error */ typingsJapgolly.nodelibFsStat.outTypesMod.ErrnoException | Null, 
              /* stats */ typingsJapgolly.node.fsMod.Stats, 
              Unit
            ]) => Callback
      ): Self = StObject.set(x, "lstat", js.Any.fromFunction2((t0: /* path */ String, t1: /* callback */ js.Function2[
              /* error */ typingsJapgolly.nodelibFsStat.outTypesMod.ErrnoException | Null, 
              /* stats */ typingsJapgolly.node.fsMod.Stats, 
              Unit
            ]) => (value(t0, t1)).runNow()))
      
      inline def setLstatSync(value: /* path */ String => typingsJapgolly.node.fsMod.Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      inline def setLstatSyncUndefined: Self = StObject.set(x, "lstatSync", js.undefined)
      
      inline def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      inline def setReaddir(
        value: (/* filepath */ String, /* options */ WithFileTypes, /* callback */ js.Function2[/* error */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]) => Callback
      ): Self = StObject.set(x, "readdir", js.Any.fromFunction3((t0: /* filepath */ String, t1: /* options */ WithFileTypes, t2: /* callback */ js.Function2[/* error */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setReaddirSync(value: (/* filepath */ String, /* options */ WithFileTypes) => js.Array[Dirent]): Self = StObject.set(x, "readdirSync", js.Any.fromFunction2(value))
      
      inline def setReaddirSyncUndefined: Self = StObject.set(x, "readdirSync", js.undefined)
      
      inline def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      inline def setStat(
        value: (/* path */ String, /* callback */ js.Function2[
              /* error */ typingsJapgolly.nodelibFsStat.outTypesMod.ErrnoException | Null, 
              /* stats */ typingsJapgolly.node.fsMod.Stats, 
              Unit
            ]) => Callback
      ): Self = StObject.set(x, "stat", js.Any.fromFunction2((t0: /* path */ String, t1: /* callback */ js.Function2[
              /* error */ typingsJapgolly.nodelibFsStat.outTypesMod.ErrnoException | Null, 
              /* stats */ typingsJapgolly.node.fsMod.Stats, 
              Unit
            ]) => (value(t0, t1)).runNow()))
      
      inline def setStatSync(value: /* path */ String => typingsJapgolly.node.fsMod.Stats): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
      
      inline def setStatSyncUndefined: Self = StObject.set(x, "statSync", js.undefined)
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
}
