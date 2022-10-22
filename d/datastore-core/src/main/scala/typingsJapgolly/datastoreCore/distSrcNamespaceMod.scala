package typingsJapgolly.datastoreCore

import typingsJapgolly.datastoreCore.distSrcKeytransformMod.KeyTransformDatastore
import typingsJapgolly.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNamespaceMod {
  
  @JSImport("datastore-core/dist/src/namespace", "NamespaceDatastore")
  @js.native
  open class NamespaceDatastore protected () extends KeyTransformDatastore {
    /**
      * @param {Datastore} child
      * @param {Key} prefix
      */
    def this(child: Datastore, prefix: Key) = this()
  }
  
  type Batch = typingsJapgolly.interfaceDatastore.mod.Batch
  
  type Datastore = typingsJapgolly.interfaceDatastore.mod.Datastore
  
  type KeyQuery = typingsJapgolly.interfaceDatastore.mod.KeyQuery
  
  type KeyTransform = typingsJapgolly.datastoreCore.distSrcTypesMod.KeyTransform
  
  type Options = typingsJapgolly.interfaceDatastore.mod.Options
  
  type Query = typingsJapgolly.interfaceDatastore.mod.Query
}
