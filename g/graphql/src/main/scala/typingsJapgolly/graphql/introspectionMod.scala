package typingsJapgolly.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLEnumType
import typingsJapgolly.graphql.definitionMod.GraphQLField
import typingsJapgolly.graphql.definitionMod.GraphQLObjectType
import typingsJapgolly.graphql.definitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/introspection", JSImport.Namespace)
@js.native
object introspectionMod extends js.Object {
  @JSName("__Directive")
  val Directive: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__DirectiveLocation")
  val DirectiveLocation: GraphQLEnumType = js.native
  @JSName("__EnumValue")
  val EnumValue: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__Field")
  val Field: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__InputValue")
  val InputValue: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__Schema")
  val Schema: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val SchemaMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__Type")
  val Type: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__TypeKind")
  val _TypeKind: GraphQLEnumType = js.native
  val introspectionTypes: js.Array[GraphQLType] = js.native
  def isIntrospectionType(`type`: js.Any): Boolean = js.native
  @js.native
  object TypeKind extends js.Object {
    var ENUM: typingsJapgolly.graphql.graphqlStrings.ENUM = js.native
    var INPUT_OBJECT: typingsJapgolly.graphql.graphqlStrings.INPUT_OBJECT = js.native
    var INTERFACE: typingsJapgolly.graphql.graphqlStrings.INTERFACE = js.native
    var LIST: typingsJapgolly.graphql.graphqlStrings.LIST = js.native
    var NON_NULL: typingsJapgolly.graphql.graphqlStrings.NON_NULL = js.native
    var OBJECT: typingsJapgolly.graphql.graphqlStrings.OBJECT = js.native
    var SCALAR: typingsJapgolly.graphql.graphqlStrings.SCALAR = js.native
    var UNION: typingsJapgolly.graphql.graphqlStrings.UNION = js.native
  }
  
}

