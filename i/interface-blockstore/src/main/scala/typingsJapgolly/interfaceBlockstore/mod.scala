package typingsJapgolly.interfaceBlockstore

import typingsJapgolly.interfaceStore.mod.Store
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Batch = typingsJapgolly.interfaceStore.mod.Batch[CID[Any, Double, Double, Version], js.typedarray.Uint8Array]
  
  type Blockstore = Store[CID[Any, Double, Double, Version], js.typedarray.Uint8Array]
  
  type KeyQuery = typingsJapgolly.interfaceStore.mod.KeyQuery[CID[Any, Double, Double, Version]]
  
  type KeyQueryFilter = typingsJapgolly.interfaceStore.mod.KeyQueryFilter[CID[Any, Double, Double, Version]]
  
  type KeyQueryOrder = typingsJapgolly.interfaceStore.mod.KeyQueryOrder[CID[Any, Double, Double, Version]]
  
  type Options = typingsJapgolly.interfaceStore.mod.Options
  
  type Pair = typingsJapgolly.interfaceStore.mod.Pair[CID[Any, Double, Double, Version], js.typedarray.Uint8Array]
  
  type Query = typingsJapgolly.interfaceStore.mod.Query[CID[Any, Double, Double, Version], js.typedarray.Uint8Array]
  
  type QueryFilter = typingsJapgolly.interfaceStore.mod.QueryFilter[CID[Any, Double, Double, Version], js.typedarray.Uint8Array]
  
  type QueryOrder = typingsJapgolly.interfaceStore.mod.QueryOrder[CID[Any, Double, Double, Version], js.typedarray.Uint8Array]
}
