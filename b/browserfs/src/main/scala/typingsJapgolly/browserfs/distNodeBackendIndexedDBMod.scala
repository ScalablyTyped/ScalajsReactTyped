package typingsJapgolly.browserfs

import org.scalajs.dom.IDBObjectStore
import org.scalajs.dom.IDBTransaction
import typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.BFSOneArgCallback
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
import typingsJapgolly.browserfs.distNodeGenericKeyValueFilesystemMod.AsyncKeyValueFileSystem
import typingsJapgolly.browserfs.distNodeGenericKeyValueFilesystemMod.AsyncKeyValueROTransaction
import typingsJapgolly.browserfs.distNodeGenericKeyValueFilesystemMod.AsyncKeyValueRWTransaction
import typingsJapgolly.browserfs.distNodeGenericKeyValueFilesystemMod.AsyncKeyValueStore
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeBackendIndexedDBMod {
  
  @JSImport("browserfs/dist/node/backend/IndexedDB", JSImport.Default)
  @js.native
  open class default protected () extends AsyncKeyValueFileSystem {
    /**
      * **Deprecated. Use IndexedDB.Create() method instead.**
      *
      * Constructs an IndexedDB file system.
      * @param cb Called once the database is instantiated and ready for use.
      *   Passes an error if there was an issue instantiating the database.
      * @param storeName The name of this file system. You can have
      *   multiple IndexedDB file systems operating at once, but each must have
      *   a different name.
      */
    def this(cb: BFSCallback[IndexedDBFileSystem]) = this()
    def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String) = this()
    def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String, deprecateMsg: Boolean) = this()
    def this(cb: BFSCallback[IndexedDBFileSystem], storeName: Unit, deprecateMsg: Boolean) = this()
  }
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/backend/IndexedDB", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs an IndexedDB file system with the given options.
      */
    inline def Create(opts: IndexedDBFileSystemOptions, cb: BFSCallback[IndexedDBFileSystem]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("browserfs/dist/node/backend/IndexedDB", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/IndexedDB", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBROTransaction")
  @js.native
  open class IndexedDBROTransaction protected ()
    extends StObject
       with AsyncKeyValueROTransaction {
    def this(tx: IDBTransaction, store: IDBObjectStore) = this()
    
    /**
      * Retrieves the data at the given key.
      * @param key The key to look under for data.
      */
    /* CompleteClass */
    override def get(key: String, cb: BFSCallback[Buffer]): Unit = js.native
    
    var store: IDBObjectStore = js.native
    
    var tx: IDBTransaction = js.native
  }
  
  @JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBRWTransaction")
  @js.native
  open class IndexedDBRWTransaction protected ()
    extends IndexedDBROTransaction
       with AsyncKeyValueRWTransaction {
    def this(tx: IDBTransaction, store: IDBObjectStore) = this()
    
    /**
      * Aborts and rolls back the transaction.
      */
    /* CompleteClass */
    override def abort(cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Commits the transaction.
      */
    /* CompleteClass */
    override def commit(cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Deletes the data at the given key.
      * @param key The key to delete from the store.
      */
    /* CompleteClass */
    override def del(key: String, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Retrieves the data at the given key.
      * @param key The key to look under for data.
      */
    /* CompleteClass */
    override def get(key: String, cb: BFSCallback[Buffer]): Unit = js.native
    
    /**
      * Adds the data to the store under the given key. Overwrites any existing
      * data.
      * @param key The key to add the data under.
      * @param data The data to add to the store.
      * @param overwrite If 'true', overwrite any existing data. If 'false',
      *   avoids writing the data if the key exists.
      * @param cb Triggered with an error and whether or not the value was
      *   committed.
      */
    /* CompleteClass */
    override def put(
      key: String,
      data: Buffer,
      overwrite: Boolean,
      cb: js.Function2[/* e */ ApiError, /* committed */ js.UndefOr[Boolean], Unit]
    ): Unit = js.native
  }
  
  @JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBStore")
  @js.native
  open class IndexedDBStore protected ()
    extends StObject
       with AsyncKeyValueStore {
    def this(cb: BFSCallback[IndexedDBStore]) = this()
    def this(cb: BFSCallback[IndexedDBStore], storeName: String) = this()
    
    /* private */ var db: Any = js.native
    
    /* private */ var storeName: Any = js.native
  }
  
  type IndexedDBFileSystem = AsyncKeyValueFileSystem
  
  trait IndexedDBFileSystemOptions extends StObject {
    
    var storeName: js.UndefOr[String] = js.undefined
  }
  object IndexedDBFileSystemOptions {
    
    inline def apply(): IndexedDBFileSystemOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndexedDBFileSystemOptions]
    }
    
    extension [Self <: IndexedDBFileSystemOptions](x: Self) {
      
      inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
      
      inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    }
  }
}
