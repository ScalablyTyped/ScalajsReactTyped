package typingsJapgolly.graphqlBinding

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLField
import typingsJapgolly.graphql.definitionMod.GraphQLFieldMap
import typingsJapgolly.graphql.definitionMod.GraphQLInputField
import typingsJapgolly.graphql.definitionMod.GraphQLInputType
import typingsJapgolly.graphql.definitionMod.GraphQLOutputType
import typingsJapgolly.graphql.mod.GraphQLInputObjectType
import typingsJapgolly.graphql.mod.GraphQLInterfaceType
import typingsJapgolly.graphql.mod.GraphQLObjectType
import typingsJapgolly.graphqlBinding.generatorMod.Generator
import typingsJapgolly.graphqlBinding.typesMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/codegen/FlowGenerator", JSImport.Namespace)
@js.native
object flowGeneratorMod extends js.Object {
  @js.native
  class FlowGenerator protected () extends Generator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: AnonInputSchemaPath) = this()
    var graphqlRenderers: AnonGraphQLEnumType = js.native
    var scalarMapping: AnonBoolean = js.native
    def getPayloadType(operation: String, `type`: String): String = js.native
    def getTypeNames(): js.Array[String] = js.native
    def renderDescription(description: Maybe[String]): String = js.native
    def renderFieldName(field: GraphQLField[_, _, StringDictionary[_]]): String = js.native
    def renderFieldName(field: GraphQLInputField): String = js.native
    def renderFieldType(`type`: GraphQLInputType | GraphQLOutputType): String = js.native
    def renderInputFieldType(`type`: GraphQLInputType | GraphQLOutputType): js.Any = js.native
    def renderInterfaceOrObject(`type`: GraphQLInputObjectType): String = js.native
    def renderInterfaceOrObject(`type`: GraphQLInterfaceType): String = js.native
    def renderInterfaceOrObject(`type`: GraphQLObjectType[_, _, StringDictionary[_]]): String = js.native
    def renderInterfaceWrapper(
      typeName: String,
      typeDescription: Maybe[String],
      interfaces: js.Array[GraphQLInterfaceType],
      fieldDefinition: String
    ): String = js.native
    def renderMainMethodFields(operation: String, fields: GraphQLFieldMap[_, _, StringDictionary[_]]): String = js.native
    def renderMutations(): String = js.native
    def renderObjectWrapper(
      typeName: String,
      typeDescription: Maybe[String],
      objects: js.Array[GraphQLObjectType[_, _, StringDictionary[_]]],
      fieldDefinition: String
    ): String = js.native
    def renderQueries(): String = js.native
    def renderSubscriptions(): String = js.native
    def renderTypeWrapper(typeName: String, typeDescription: Maybe[String], fieldDefinition: String): String = js.native
    def renderTypes(): String = js.native
  }
  
}

