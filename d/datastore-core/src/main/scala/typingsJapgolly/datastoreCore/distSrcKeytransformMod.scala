package typingsJapgolly.datastoreCore

import typingsJapgolly.datastoreCore.distSrcBaseMod.BaseDatastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeytransformMod {
  
  @JSImport("datastore-core/dist/src/keytransform", "KeyTransformDatastore")
  @js.native
  open class KeyTransformDatastore protected () extends BaseDatastore {
    /**
      * @param {Datastore} child
      * @param {KeyTransform} transform
      */
    def this(child: Datastore, transform: KeyTransform) = this()
    
    var child: typingsJapgolly.interfaceDatastore.mod.Datastore = js.native
    
    var transform: typingsJapgolly.datastoreCore.distSrcTypesMod.KeyTransform = js.native
  }
  
  type AwaitIterable[TEntry] = typingsJapgolly.interfaceStore.mod.AwaitIterable[TEntry]
  
  type Batch = typingsJapgolly.interfaceDatastore.mod.Batch
  
  type Datastore = typingsJapgolly.interfaceDatastore.mod.Datastore
  
  type Key = typingsJapgolly.interfaceDatastore.mod.Key
  
  type KeyQuery = typingsJapgolly.interfaceDatastore.mod.KeyQuery
  
  type KeyTransform = typingsJapgolly.datastoreCore.distSrcTypesMod.KeyTransform
  
  type Options = typingsJapgolly.interfaceDatastore.mod.Options
  
  type Pair = typingsJapgolly.interfaceDatastore.mod.Pair
  
  type Query = typingsJapgolly.interfaceDatastore.mod.Query
}
