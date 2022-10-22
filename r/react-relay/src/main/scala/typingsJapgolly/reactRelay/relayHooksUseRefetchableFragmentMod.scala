package typingsJapgolly.reactRelay

import typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyType
import typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyTypeData
import typingsJapgolly.reactRelay.relayHooksUseRefetchableFragmentNodeMod.Options
import typingsJapgolly.reactRelay.relayHooksUseRefetchableFragmentNodeMod.RefetchFnDynamic
import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksUseRefetchableFragmentMod {
  
  @JSImport("react-relay/relay-hooks/useRefetchableFragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[TQuery, TKey, (KeyTypeData[TKey, Any]) | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[TQuery, TKey, (KeyTypeData[TKey, Any]) | Null]]
  inline def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[TQuery, TKey, KeyTypeData[TKey, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[TQuery, TKey, KeyTypeData[TKey, Any]]]
  
  type useRefetchableFragmentHookType[TQuery /* <: OperationType */, TKey /* <: KeyType[Any] | Null */, TFragmentData] = js.Tuple2[TFragmentData, RefetchFnDynamic[TQuery, TKey, Options]]
}
