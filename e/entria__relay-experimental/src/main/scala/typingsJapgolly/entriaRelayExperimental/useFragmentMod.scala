package typingsJapgolly.entriaRelayExperimental

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental/lib/useFragment", JSImport.Namespace)
@js.native
object useFragmentMod extends js.Object {
  def useFragment[TKey /* <: js.Array[StringDictionary[_]] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableArrayFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_StringDictionaryAny_NonNullableFragmentReturn[TKey /* <: StringDictionary[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_UnionArrayStringDictionaryWildcardNull_NullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[_]] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableArrayFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_UnionStringDictionaryAnyNull_NullableFragmentReturn[TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableFragmentReturn[TKey] = js.native
  type NonNullableArrayFragmentReturn[T] = ReturnType[NonNullableArrayReturn[T]]
  type NonNullableArrayReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[js.Array[TFragmentData]], TFragmentData]
  type NonNullableFragmentReturn[T] = ReturnType[NonNullableReturn[T]]
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  type NullableArrayFragmentReturn[T] = ReturnType[NullableArrayReturn[T]]
  type NullableArrayReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[js.Array[TFragmentData]], TFragmentData | Null]
  type NullableFragmentReturn[T] = ReturnType[NullableReturn[T]]
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData | Null]
}

