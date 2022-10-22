package typingsJapgolly.datastoreCore

import typingsJapgolly.datastoreCore.distSrcBaseMod.BaseDatastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMountMod {
  
  @JSImport("datastore-core/dist/src/mount", "MountDatastore")
  @js.native
  open class MountDatastore protected () extends BaseDatastore {
    /**
      * @param {Array<{prefix: Key, datastore: Datastore}>} mounts
      */
    def this(mounts: js.Array[typingsJapgolly.datastoreCore.anon.Datastore]) = this()
    
    /**
      * Lookup the matching datastore for the given key
      *
      * @private
      * @param {Key} key
      * @returns {{datastore: Datastore, mountpoint: Key} | undefined}
      */
    /* private */ var _lookup: Any = js.native
    
    var mounts: js.Array[typingsJapgolly.datastoreCore.anon.Datastore] = js.native
  }
  
  type Batch = typingsJapgolly.interfaceDatastore.mod.Batch
  
  type Datastore = typingsJapgolly.interfaceDatastore.mod.Datastore
  
  type Key = typingsJapgolly.interfaceDatastore.mod.Key
  
  type KeyQuery = typingsJapgolly.interfaceDatastore.mod.KeyQuery
  
  type KeyTransform = typingsJapgolly.datastoreCore.distSrcTypesMod.KeyTransform
  
  type Options = typingsJapgolly.interfaceDatastore.mod.Options
  
  type Query = typingsJapgolly.interfaceDatastore.mod.Query
}
