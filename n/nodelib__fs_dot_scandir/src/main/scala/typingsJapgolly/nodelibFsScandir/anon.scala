package typingsJapgolly.nodelibFsScandir

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.nodelibFsScandir.nodelibFsScandirBooleans.`true`
import typingsJapgolly.nodelibFsScandir.outAdaptersFsMod.ReaddirAsynchronousMethod
import typingsJapgolly.nodelibFsScandir.outAdaptersFsMod.ReaddirSynchronousMethod
import typingsJapgolly.nodelibFsStat.outAdaptersFsMod.StatAsynchronousMethod
import typingsJapgolly.nodelibFsStat.outAdaptersFsMod.StatSynchronousMethod
import typingsJapgolly.nodelibFsStat.outTypesMod.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@nodelib/fs.scandir.@nodelib/fs.scandir/out/adapters/fs.FileSystemAdapter> */
  trait PartialFileSystemAdapter extends StObject {
    
    var lstat: js.UndefOr[StatAsynchronousMethod] = js.undefined
    
    var lstatSync: js.UndefOr[StatSynchronousMethod] = js.undefined
    
    var readdir: js.UndefOr[ReaddirAsynchronousMethod] = js.undefined
    
    var readdirSync: js.UndefOr[ReaddirSynchronousMethod] = js.undefined
    
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
        value: (/* path */ String, /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => Callback
      ): Self = StObject.set(x, "lstat", js.Any.fromFunction2((t0: /* path */ String, t1: /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setLstatSync(value: /* path */ String => Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      inline def setLstatSyncUndefined: Self = StObject.set(x, "lstatSync", js.undefined)
      
      inline def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      inline def setReaddir(value: ReaddirAsynchronousMethod): Self = StObject.set(x, "readdir", value.asInstanceOf[js.Any])
      
      inline def setReaddirSync(value: ReaddirSynchronousMethod): Self = StObject.set(x, "readdirSync", value.asInstanceOf[js.Any])
      
      inline def setReaddirSyncUndefined: Self = StObject.set(x, "readdirSync", js.undefined)
      
      inline def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      inline def setStat(
        value: (/* path */ String, /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => Callback
      ): Self = StObject.set(x, "stat", js.Any.fromFunction2((t0: /* path */ String, t1: /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setStatSync(value: /* path */ String => Stats): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
      
      inline def setStatSyncUndefined: Self = StObject.set(x, "statSync", js.undefined)
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  trait WithFileTypes extends StObject {
    
    var withFileTypes: `true`
  }
  object WithFileTypes {
    
    inline def apply(): WithFileTypes = {
      val __obj = js.Dynamic.literal(withFileTypes = true)
      __obj.asInstanceOf[WithFileTypes]
    }
    
    extension [Self <: WithFileTypes](x: Self) {
      
      inline def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
}
