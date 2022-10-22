package typingsJapgolly.datastoreCore

import typingsJapgolly.datastoreCore.datastoreCoreStrings.SHARDING
import typingsJapgolly.datastoreCore.datastoreCoreStrings.SlashrepoSlashflatfsSlashshardSlash
import typingsJapgolly.datastoreCore.datastoreCoreStrings._README
import typingsJapgolly.datastoreCore.distSrcKeytransformMod.Datastore
import typingsJapgolly.datastoreCore.distSrcShardingMod.Shard
import typingsJapgolly.errCode.mod.Extensions
import typingsJapgolly.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datastore-core", "BaseDatastore")
  @js.native
  open class BaseDatastore ()
    extends typingsJapgolly.datastoreCore.distSrcBaseMod.BaseDatastore
  
  object Errors {
    
    @JSImport("datastore-core", "Errors")
    @js.native
    val ^ : js.Any = js.native
    
    inline def abortedError(): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")().asInstanceOf[js.Error & Extensions]
    inline def abortedError(err: js.Error): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error & Extensions]
    
    inline def dbDeleteFailedError(): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDeleteFailedError")().asInstanceOf[js.Error & Extensions]
    inline def dbDeleteFailedError(err: js.Error): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDeleteFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error & Extensions]
    
    inline def dbOpenFailedError(): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("dbOpenFailedError")().asInstanceOf[js.Error & Extensions]
    inline def dbOpenFailedError(err: js.Error): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("dbOpenFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error & Extensions]
    
    inline def dbWriteFailedError(): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("dbWriteFailedError")().asInstanceOf[js.Error & Extensions]
    inline def dbWriteFailedError(err: js.Error): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("dbWriteFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error & Extensions]
    
    inline def notFoundError(): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")().asInstanceOf[js.Error & Extensions]
    inline def notFoundError(err: js.Error): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error & Extensions]
  }
  
  @JSImport("datastore-core", "KeyTransformDatastore")
  @js.native
  open class KeyTransformDatastore protected ()
    extends typingsJapgolly.datastoreCore.distSrcKeytransformMod.KeyTransformDatastore {
    /**
      * @param {Datastore} child
      * @param {KeyTransform} transform
      */
    def this(child: Datastore, transform: typingsJapgolly.datastoreCore.distSrcKeytransformMod.KeyTransform) = this()
  }
  
  @JSImport("datastore-core", "MemoryDatastore")
  @js.native
  open class MemoryDatastore ()
    extends typingsJapgolly.datastoreCore.distSrcMemoryMod.MemoryDatastore
  
  @JSImport("datastore-core", "MountDatastore")
  @js.native
  open class MountDatastore protected ()
    extends typingsJapgolly.datastoreCore.distSrcMountMod.MountDatastore {
    /**
      * @param {Array<{prefix: Key, datastore: Datastore}>} mounts
      */
    def this(mounts: js.Array[typingsJapgolly.datastoreCore.anon.Datastore]) = this()
  }
  
  @JSImport("datastore-core", "NamespaceDatastore")
  @js.native
  open class NamespaceDatastore protected ()
    extends typingsJapgolly.datastoreCore.distSrcNamespaceMod.NamespaceDatastore {
    /**
      * @param {Datastore} child
      * @param {Key} prefix
      */
    def this(child: typingsJapgolly.datastoreCore.distSrcNamespaceMod.Datastore, prefix: Key) = this()
  }
  
  @JSImport("datastore-core", "ShardingDatastore")
  @js.native
  open class ShardingDatastore protected ()
    extends typingsJapgolly.datastoreCore.distSrcShardingMod.ShardingDatastore {
    /**
      * @param {Datastore} store
      * @param {Shard} shard
      */
    def this(store: typingsJapgolly.datastoreCore.distSrcShardingMod.Datastore, shard: Shard) = this()
  }
  /* static members */
  object ShardingDatastore {
    
    @JSImport("datastore-core", "ShardingDatastore")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {Datastore} store
      * @param {Shard} shard
      */
    inline def create(store: typingsJapgolly.datastoreCore.distSrcShardingMod.Datastore, shard: Shard): js.Promise[typingsJapgolly.datastoreCore.distSrcTypesMod.Shard] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(store.asInstanceOf[js.Any], shard.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.datastoreCore.distSrcTypesMod.Shard]]
    
    /**
      * @deprecated
      * @param {Datastore} store
      * @param {Shard} shard
      */
    inline def createOrOpen(store: typingsJapgolly.datastoreCore.distSrcShardingMod.Datastore, shard: Shard): js.Promise[typingsJapgolly.datastoreCore.distSrcShardingMod.ShardingDatastore] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrOpen")(store.asInstanceOf[js.Any], shard.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.datastoreCore.distSrcShardingMod.ShardingDatastore]]
    
    /**
      * @deprecated
      * @param {Datastore} store
      */
    inline def open(store: typingsJapgolly.datastoreCore.distSrcShardingMod.Datastore): js.Promise[typingsJapgolly.datastoreCore.distSrcShardingMod.ShardingDatastore] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.datastoreCore.distSrcShardingMod.ShardingDatastore]]
  }
  
  @JSImport("datastore-core", "TieredDatastore")
  @js.native
  open class TieredDatastore protected ()
    extends typingsJapgolly.datastoreCore.distSrcTieredMod.TieredDatastore {
    /**
      * @param {Datastore[]} stores
      */
    def this(stores: js.Array[typingsJapgolly.datastoreCore.distSrcTieredMod.Datastore]) = this()
  }
  
  object shard {
    
    @JSImport("datastore-core", "shard")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("datastore-core", "shard.NextToLast")
    @js.native
    open class NextToLast protected ()
      extends typingsJapgolly.datastoreCore.distSrcShardMod.NextToLast {
      /**
        * @param {number} suffixLen
        */
      def this(suffixLen: Double) = this()
    }
    
    @JSImport("datastore-core", "shard.PREFIX")
    @js.native
    val PREFIX_ : SlashrepoSlashflatfsSlashshardSlash = js.native
    
    @JSImport("datastore-core", "shard.Prefix")
    @js.native
    open class Prefix protected ()
      extends typingsJapgolly.datastoreCore.distSrcShardMod.Prefix {
      /**
        * @param {number} prefixLen
        */
      def this(prefixLen: Double) = this()
    }
    
    @JSImport("datastore-core", "shard.README_FN")
    @js.native
    val README_FN: _README = js.native
    
    @JSImport("datastore-core", "shard.SHARDING_FN")
    @js.native
    val SHARDING_FN: SHARDING = js.native
    
    @JSImport("datastore-core", "shard.ShardBase")
    @js.native
    open class ShardBase protected ()
      extends typingsJapgolly.datastoreCore.distSrcShardMod.ShardBase {
      /**
        * @param {any} param
        */
      def this(param: Any) = this()
    }
    
    @JSImport("datastore-core", "shard.Suffix")
    @js.native
    open class Suffix protected ()
      extends typingsJapgolly.datastoreCore.distSrcShardMod.Suffix {
      /**
        * @param {number} suffixLen
        */
      def this(suffixLen: Double) = this()
    }
    
    inline def parseShardFun(str: String): typingsJapgolly.datastoreCore.distSrcShardMod.Shard = ^.asInstanceOf[js.Dynamic].applyDynamic("parseShardFun")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.datastoreCore.distSrcShardMod.Shard]
    
    inline def readShardFun(path: String, store: typingsJapgolly.datastoreCore.distSrcShardMod.Datastore): js.Promise[typingsJapgolly.datastoreCore.distSrcTypesMod.Shard] = (^.asInstanceOf[js.Dynamic].applyDynamic("readShardFun")(path.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.datastoreCore.distSrcTypesMod.Shard]]
    inline def readShardFun(path: js.typedarray.Uint8Array, store: typingsJapgolly.datastoreCore.distSrcShardMod.Datastore): js.Promise[typingsJapgolly.datastoreCore.distSrcTypesMod.Shard] = (^.asInstanceOf[js.Dynamic].applyDynamic("readShardFun")(path.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.datastoreCore.distSrcTypesMod.Shard]]
    
    @JSImport("datastore-core", "shard.readme")
    @js.native
    val readme: /* This is a repository of IPLD objects. Each IPLD object is in a single file,
    named <base32 encoding of cid>.data. Where <base32 encoding of cid> is the
    "base32" encoding of the CID (as specified in
    https://github.com/multiformats/multibase) without the 'B' prefix.
    All the object files are placed in a tree of directories, based on a
    function of the CID. This is a form of sharding similar to
    the objects directory in git repositories. Previously, we used
    prefixes, we now use the next-to-last two charters.
      func NextToLast(base32cid string) {
      nextToLastLen := 2
      offset := len(base32cid) - nextToLastLen - 1
      return str[offset : offset+nextToLastLen]
      }
    For example, an object with a base58 CIDv1 of
      zb2rhYSxw4ZjuzgCnWSt19Q94ERaeFhu9uSqRgjSdx9bsgM6f
    has a base32 CIDv1 of
      BAFKREIA22FLID5AJ2KU7URG47MDLROZIH6YF2KALU2PWEFPVI37YLKRSCA
    and will be placed at
      SC/AFKREIA22FLID5AJ2KU7URG47MDLROZIH6YF2KALU2PWEFPVI37YLKRSCA.data
    with 'SC' being the last-to-next two characters and the 'B' at the
    beginning of the CIDv1 string is the multibase prefix that is not
    stored in the filename.
      */ String = js.native
  }
  
  type KeyTransform = typingsJapgolly.datastoreCore.distSrcTypesMod.KeyTransform
  
  type Shard_ = typingsJapgolly.datastoreCore.distSrcTypesMod.Shard
}
