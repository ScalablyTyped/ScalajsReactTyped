package typingsJapgolly.relayRuntime.anon

import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libStoreResolverFragmentsMod.ArrayKeyType
import typingsJapgolly.relayRuntime.libStoreResolverFragmentsMod.ArrayKeyTypeData
import typingsJapgolly.relayRuntime.libStoreResolverFragmentsMod.KeyType
import typingsJapgolly.relayRuntime.libStoreResolverFragmentsMod.KeyTypeData
import typingsJapgolly.relayRuntime.libStoreResolverFragmentsMod.ResolverContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRelayResolverFragme extends StObject {
  
  val RESOLVER_FRAGMENT_MISSING_DATA_SENTINEL: Any = js.native
  
  def readFragment[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, Any]) | Null = js.native
  def readFragment[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, Any] = js.native
  @JSName("readFragment")
  def readFragment_TKey_ArrayKeyTypeData[TKey /* <: ArrayKeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ArrayKeyTypeData[TKey, Any] = js.native
  @JSName("readFragment")
  def readFragment_TKey_Union[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, Any]) | Null = js.native
  
  def withResolverContext[T](context: ResolverContext, cb: js.Function0[T]): T = js.native
}
