package typingsJapgolly.angularDevkitCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.delete
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.exists
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.isDirectory
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.isFile
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.list
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.read
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.stat
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.watch
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.write
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostMemoryMod.SimpleMemoryHost
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostSyncMod.SyncDelegateHost
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsHostTestMod {
  
  object test {
    
    @JSImport("@angular-devkit/core/src/virtual-fs/host/test", "test.TestHost")
    @js.native
    open class TestHost () extends SimpleMemoryHost {
      def this(map: StringDictionary[String]) = this()
      
      @JSName("$exists")
      def $exists(path: String): Boolean = js.native
      
      @JSName("$isDirectory")
      def $isDirectory(path: String): Boolean = js.native
      
      @JSName("$isFile")
      def $isFile(path: String): Boolean = js.native
      
      @JSName("$list")
      def $list(path: String): js.Array[PathFragment] = js.native
      
      @JSName("$read")
      def $read(path: String): String = js.native
      
      @JSName("$write")
      def $write(path: String, content: String): Unit = js.native
      
      /* protected */ var _records: js.Array[TestLogRecord] = js.native
      
      /* protected */ var _sync: SyncDelegateHost[js.Object] | Null = js.native
      
      def clearRecords(): Unit = js.native
      
      def files: js.Array[Path_] = js.native
      
      def records: js.Array[TestLogRecord] = js.native
      
      def sync: SyncDelegateHost[js.Object] = js.native
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.angularDevkitCore.anon.Kind
      - typingsJapgolly.angularDevkitCore.anon.From
    */
    trait TestLogRecord extends StObject
    object TestLogRecord {
      
      inline def From(from: Path_, to: Path_): typingsJapgolly.angularDevkitCore.anon.From = {
        val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], kind = "rename", to = to.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.anon.From]
      }
      
      inline def Kind(kind: write | read | delete | list | exists | isDirectory | isFile | stat | watch, path: Path_): typingsJapgolly.angularDevkitCore.anon.Kind = {
        val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.anon.Kind]
      }
    }
  }
}
