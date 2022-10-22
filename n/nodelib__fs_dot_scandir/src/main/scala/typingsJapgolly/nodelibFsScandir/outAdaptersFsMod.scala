package typingsJapgolly.nodelibFsScandir

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.nodelibFsScandir.anon.PartialFileSystemAdapter
import typingsJapgolly.nodelibFsScandir.anon.WithFileTypes
import typingsJapgolly.nodelibFsScandir.outTypesMod.Dirent
import typingsJapgolly.nodelibFsScandir.outTypesMod.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outAdaptersFsMod {
  
  @JSImport("@nodelib/fs.scandir/out/adapters/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nodelib/fs.scandir/out/adapters/fs", "FILE_SYSTEM_ADAPTER")
  @js.native
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  
  inline def createFileSystemAdapter(): FileSystemAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemAdapter")().asInstanceOf[FileSystemAdapter]
  inline def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemAdapter")(fsMethods.asInstanceOf[js.Any]).asInstanceOf[FileSystemAdapter]
  
  trait FileSystemAdapter
    extends StObject
       with typingsJapgolly.nodelibFsStat.outAdaptersFsMod.FileSystemAdapter {
    
    def readdir(
      filepath: String,
      callback: js.Function2[/* error */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit
    def readdir(
      filepath: String,
      options: WithFileTypes,
      callback: js.Function2[/* error */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]
    ): Unit
    
    def readdirSync(filepath: String): js.Array[String]
    def readdirSync(filepath: String, options: WithFileTypes): js.Array[Dirent]
    @JSName("readdirSync")
    var readdirSync_Original: ReaddirSynchronousMethod
    
    @JSName("readdir")
    var readdir_Original: ReaddirAsynchronousMethod
  }
  object FileSystemAdapter {
    
    inline def apply(
      lstat: (/* path */ String, /* callback */ js.Function2[
          /* error */ typingsJapgolly.nodelibFsStat.outTypesMod.ErrnoException | Null, 
          /* stats */ Stats, 
          Unit
        ]) => Callback,
      lstatSync: /* path */ String => Stats,
      readdir: ReaddirAsynchronousMethod,
      readdirSync: ReaddirSynchronousMethod,
      stat: (/* path */ String, /* callback */ js.Function2[
          /* error */ typingsJapgolly.nodelibFsStat.outTypesMod.ErrnoException | Null, 
          /* stats */ Stats, 
          Unit
        ]) => Callback,
      statSync: /* path */ String => Stats
    ): FileSystemAdapter = {
      val __obj = js.Dynamic.literal(lstat = js.Any.fromFunction2((t0: /* path */ String, t1: /* callback */ js.Function2[
          /* error */ typingsJapgolly.nodelibFsStat.outTypesMod.ErrnoException | Null, 
          /* stats */ Stats, 
          Unit
        ]) => (lstat(t0, t1)).runNow()), lstatSync = js.Any.fromFunction1(lstatSync), readdir = readdir.asInstanceOf[js.Any], readdirSync = readdirSync.asInstanceOf[js.Any], stat = js.Any.fromFunction2((t0: /* path */ String, t1: /* callback */ js.Function2[
          /* error */ typingsJapgolly.nodelibFsStat.outTypesMod.ErrnoException | Null, 
          /* stats */ Stats, 
          Unit
        ]) => (stat(t0, t1)).runNow()), statSync = js.Any.fromFunction1(statSync))
      __obj.asInstanceOf[FileSystemAdapter]
    }
    
    extension [Self <: FileSystemAdapter](x: Self) {
      
      inline def setReaddir(value: ReaddirAsynchronousMethod): Self = StObject.set(x, "readdir", value.asInstanceOf[js.Any])
      
      inline def setReaddirSync(value: ReaddirSynchronousMethod): Self = StObject.set(x, "readdirSync", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReaddirAsynchronousMethod extends StObject {
    
    def apply(
      filepath: String,
      callback: js.Function2[/* error */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      filepath: String,
      options: WithFileTypes,
      callback: js.Function2[/* error */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait ReaddirSynchronousMethod extends StObject {
    
    def apply(filepath: String): js.Array[String] = js.native
    def apply(filepath: String, options: WithFileTypes): js.Array[Dirent] = js.native
  }
}
