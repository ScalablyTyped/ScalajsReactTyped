package typingsJapgolly.nodelibFsStat

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.nodelibFsStat.anon.PartialFileSystemAdapter
import typingsJapgolly.nodelibFsStat.outTypesMod.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outAdaptersFsMod {
  
  @JSImport("@nodelib/fs.stat/out/adapters/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nodelib/fs.stat/out/adapters/fs", "FILE_SYSTEM_ADAPTER")
  @js.native
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  
  inline def createFileSystemAdapter(): FileSystemAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemAdapter")().asInstanceOf[FileSystemAdapter]
  inline def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemAdapter")(fsMethods.asInstanceOf[js.Any]).asInstanceOf[FileSystemAdapter]
  
  trait FileSystemAdapter extends StObject {
    
    def lstat(path: String, callback: js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit
    
    def lstatSync(path: String): Stats
    @JSName("lstatSync")
    var lstatSync_Original: StatSynchronousMethod
    
    @JSName("lstat")
    var lstat_Original: StatAsynchronousMethod
    
    def stat(path: String, callback: js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit
    
    def statSync(path: String): Stats
    @JSName("statSync")
    var statSync_Original: StatSynchronousMethod
    
    @JSName("stat")
    var stat_Original: StatAsynchronousMethod
  }
  object FileSystemAdapter {
    
    inline def apply(
      lstat: (/* path */ String, /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => Callback,
      lstatSync: /* path */ String => Stats,
      stat: (/* path */ String, /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => Callback,
      statSync: /* path */ String => Stats
    ): FileSystemAdapter = {
      val __obj = js.Dynamic.literal(lstat = js.Any.fromFunction2((t0: /* path */ String, t1: /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => (lstat(t0, t1)).runNow()), lstatSync = js.Any.fromFunction1(lstatSync), stat = js.Any.fromFunction2((t0: /* path */ String, t1: /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => (stat(t0, t1)).runNow()), statSync = js.Any.fromFunction1(statSync))
      __obj.asInstanceOf[FileSystemAdapter]
    }
    
    extension [Self <: FileSystemAdapter](x: Self) {
      
      inline def setLstat(
        value: (/* path */ String, /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => Callback
      ): Self = StObject.set(x, "lstat", js.Any.fromFunction2((t0: /* path */ String, t1: /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setLstatSync(value: /* path */ String => Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      inline def setStat(
        value: (/* path */ String, /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => Callback
      ): Self = StObject.set(x, "stat", js.Any.fromFunction2((t0: /* path */ String, t1: /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setStatSync(value: /* path */ String => Stats): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
    }
  }
  
  type StatAsynchronousMethod = js.Function2[
    /* path */ String, 
    /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit], 
    Unit
  ]
  
  type StatSynchronousMethod = js.Function1[/* path */ String, Stats]
}
