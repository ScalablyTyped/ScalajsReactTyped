package typingsJapgolly.angularDevkitCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.FileBufferLike
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.Stats
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsHostCreateMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSyncHost[StatsT /* <: js.Object */](handler: SyncHostHandler[StatsT]): Host[StatsT] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSyncHost")(handler.asInstanceOf[js.Any]).asInstanceOf[Host[StatsT]]
  
  trait SyncHostHandler[StatsT /* <: js.Object */] extends StObject {
    
    def delete(path: Path_): Unit
    
    def exists(path: Path_): Boolean
    
    def isDirectory(path: Path_): Boolean
    
    def isFile(path: Path_): Boolean
    
    def list(path: Path_): js.Array[PathFragment]
    
    def read(path: Path_): js.typedarray.ArrayBuffer
    
    def rename(from: Path_, to: Path_): Unit
    
    def stat(path: Path_): Stats[StatsT] | Null
    
    def write(path: Path_, content: FileBufferLike): Unit
  }
  object SyncHostHandler {
    
    inline def apply[StatsT /* <: js.Object */](
      delete: Path_ => Callback,
      exists: Path_ => Boolean,
      isDirectory: Path_ => Boolean,
      isFile: Path_ => Boolean,
      list: Path_ => js.Array[PathFragment],
      read: Path_ => js.typedarray.ArrayBuffer,
      rename: (Path_, Path_) => Callback,
      stat: Path_ => Stats[StatsT] | Null,
      write: (Path_, FileBufferLike) => Callback
    ): SyncHostHandler[StatsT] = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1((t0: Path_) => delete(t0).runNow()), exists = js.Any.fromFunction1(exists), isDirectory = js.Any.fromFunction1(isDirectory), isFile = js.Any.fromFunction1(isFile), list = js.Any.fromFunction1(list), read = js.Any.fromFunction1(read), rename = js.Any.fromFunction2((t0: Path_, t1: Path_) => (rename(t0, t1)).runNow()), stat = js.Any.fromFunction1(stat), write = js.Any.fromFunction2((t0: Path_, t1: FileBufferLike) => (write(t0, t1)).runNow()))
      __obj.asInstanceOf[SyncHostHandler[StatsT]]
    }
    
    extension [Self <: SyncHostHandler[?], StatsT /* <: js.Object */](x: Self & SyncHostHandler[StatsT]) {
      
      inline def setDelete(value: Path_ => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: Path_) => value(t0).runNow()))
      
      inline def setExists(value: Path_ => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      inline def setIsDirectory(value: Path_ => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction1(value))
      
      inline def setIsFile(value: Path_ => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction1(value))
      
      inline def setList(value: Path_ => js.Array[PathFragment]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
      
      inline def setRead(value: Path_ => js.typedarray.ArrayBuffer): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setRename(value: (Path_, Path_) => Callback): Self = StObject.set(x, "rename", js.Any.fromFunction2((t0: Path_, t1: Path_) => (value(t0, t1)).runNow()))
      
      inline def setStat(value: Path_ => Stats[StatsT] | Null): Self = StObject.set(x, "stat", js.Any.fromFunction1(value))
      
      inline def setWrite(value: (Path_, FileBufferLike) => Callback): Self = StObject.set(x, "write", js.Any.fromFunction2((t0: Path_, t1: FileBufferLike) => (value(t0, t1)).runNow()))
    }
  }
}
