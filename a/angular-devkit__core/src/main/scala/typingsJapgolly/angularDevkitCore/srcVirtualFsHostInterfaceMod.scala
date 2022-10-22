package typingsJapgolly.angularDevkitCore

import typingsJapgolly.angularDevkitCore.angularDevkitCoreInts.`0`
import typingsJapgolly.angularDevkitCore.angularDevkitCoreInts.`1`
import typingsJapgolly.angularDevkitCore.angularDevkitCoreInts.`2`
import typingsJapgolly.angularDevkitCore.angularDevkitCoreInts.`3`
import typingsJapgolly.angularDevkitCore.anon.Atime
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.Path_
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsHostInterfaceMod {
  
  type FileBuffer = js.typedarray.ArrayBuffer
  
  type FileBufferLike = ArrayBufferLike
  
  @js.native
  trait Host[StatsT /* <: js.Object */]
    extends StObject
       with ReadonlyHost[StatsT] {
    
    def delete(path: Path_): Observable_[Unit] = js.native
    
    def rename(from: Path_, to: Path_): Observable_[Unit] = js.native
    
    def watch(path: Path_): Observable_[HostWatchEvent] | Null = js.native
    def watch(path: Path_, options: HostWatchOptions): Observable_[HostWatchEvent] | Null = js.native
    
    def write(path: Path_, content: FileBufferLike): Observable_[Unit] = js.native
  }
  
  trait HostCapabilities extends StObject {
    
    var synchronous: Boolean
  }
  object HostCapabilities {
    
    inline def apply(synchronous: Boolean): HostCapabilities = {
      val __obj = js.Dynamic.literal(synchronous = synchronous.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostCapabilities]
    }
    
    extension [Self <: HostCapabilities](x: Self) {
      
      inline def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostWatchEvent extends StObject {
    
    val path: Path_
    
    val time: js.Date
    
    val `type`: HostWatchEventType
  }
  object HostWatchEvent {
    
    inline def apply(path: Path_, time: js.Date, `type`: HostWatchEventType): HostWatchEvent = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostWatchEvent]
    }
    
    extension [Self <: HostWatchEvent](x: Self) {
      
      inline def setPath(value: Path_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setType(value: HostWatchEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularDevkitCore.angularDevkitCoreInts.`0`
    - typingsJapgolly.angularDevkitCore.angularDevkitCoreInts.`1`
    - typingsJapgolly.angularDevkitCore.angularDevkitCoreInts.`2`
    - typingsJapgolly.angularDevkitCore.angularDevkitCoreInts.`3`
  */
  trait HostWatchEventType extends StObject
  object HostWatchEventType {
    
    inline def Changed: `0` = 0.asInstanceOf[`0`]
    
    inline def Created: `1` = 1.asInstanceOf[`1`]
    
    inline def Deleted: `2` = 2.asInstanceOf[`2`]
    
    inline def Renamed: `3` = 3.asInstanceOf[`3`]
  }
  
  trait HostWatchOptions extends StObject {
    
    val persistent: js.UndefOr[Boolean] = js.undefined
    
    val recursive: js.UndefOr[Boolean] = js.undefined
  }
  object HostWatchOptions {
    
    inline def apply(): HostWatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostWatchOptions]
    }
    
    extension [Self <: HostWatchOptions](x: Self) {
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait ReadonlyHost[StatsT /* <: js.Object */] extends StObject {
    
    val capabilities: HostCapabilities
    
    def exists(path: Path_): Observable_[Boolean]
    
    def isDirectory(path: Path_): Observable_[Boolean]
    
    def isFile(path: Path_): Observable_[Boolean]
    
    def list(path: Path_): Observable_[js.Array[PathFragment]]
    
    def read(path: Path_): Observable_[js.typedarray.ArrayBuffer]
    
    def stat(path: Path_): (Observable_[Stats[StatsT] | Null]) | Null
  }
  object ReadonlyHost {
    
    inline def apply[StatsT /* <: js.Object */](
      capabilities: HostCapabilities,
      exists: Path_ => Observable_[Boolean],
      isDirectory: Path_ => Observable_[Boolean],
      isFile: Path_ => Observable_[Boolean],
      list: Path_ => Observable_[js.Array[PathFragment]],
      read: Path_ => Observable_[js.typedarray.ArrayBuffer],
      stat: Path_ => (Observable_[Stats[StatsT] | Null]) | Null
    ): ReadonlyHost[StatsT] = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], exists = js.Any.fromFunction1(exists), isDirectory = js.Any.fromFunction1(isDirectory), isFile = js.Any.fromFunction1(isFile), list = js.Any.fromFunction1(list), read = js.Any.fromFunction1(read), stat = js.Any.fromFunction1(stat))
      __obj.asInstanceOf[ReadonlyHost[StatsT]]
    }
    
    extension [Self <: ReadonlyHost[?], StatsT /* <: js.Object */](x: Self & ReadonlyHost[StatsT]) {
      
      inline def setCapabilities(value: HostCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setExists(value: Path_ => Observable_[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      inline def setIsDirectory(value: Path_ => Observable_[Boolean]): Self = StObject.set(x, "isDirectory", js.Any.fromFunction1(value))
      
      inline def setIsFile(value: Path_ => Observable_[Boolean]): Self = StObject.set(x, "isFile", js.Any.fromFunction1(value))
      
      inline def setList(value: Path_ => Observable_[js.Array[PathFragment]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
      
      inline def setRead(value: Path_ => Observable_[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setStat(value: Path_ => (Observable_[Stats[StatsT] | Null]) | Null): Self = StObject.set(x, "stat", js.Any.fromFunction1(value))
    }
  }
  
  type Stats[T /* <: js.Object */] = T & Atime
}
