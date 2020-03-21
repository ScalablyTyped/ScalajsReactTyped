package typingsJapgolly.apolloUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storeUtilsMod {
  type Directives = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]]
  type ListValue = js.Array[scala.Null | typingsJapgolly.apolloUtilities.storeUtilsMod.IdValue]
  type NumberValue = typingsJapgolly.graphql.astMod.IntValueNode | typingsJapgolly.graphql.astMod.FloatValueNode
  type ScalarValue = typingsJapgolly.graphql.astMod.StringValueNode | typingsJapgolly.graphql.astMod.BooleanValueNode | typingsJapgolly.graphql.astMod.EnumValueNode
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - js.Array[java.lang.String]
    - typingsJapgolly.apolloUtilities.storeUtilsMod.IdValue
    - typingsJapgolly.apolloUtilities.storeUtilsMod.ListValue
    - typingsJapgolly.apolloUtilities.storeUtilsMod.JsonValue
    - scala.Null
    - `js.undefined`
    - scala.Unit
    - js.Object
  */
  type StoreValue = js.UndefOr[
    typingsJapgolly.apolloUtilities.storeUtilsMod._StoreValue | js.Array[java.lang.String] | scala.Double | java.lang.String | typingsJapgolly.apolloUtilities.storeUtilsMod.ListValue | scala.Null | scala.Unit | js.Object
  ]
  type VariableValue = js.Function1[/* node */ typingsJapgolly.graphql.astMod.VariableNode, js.Any]
}
