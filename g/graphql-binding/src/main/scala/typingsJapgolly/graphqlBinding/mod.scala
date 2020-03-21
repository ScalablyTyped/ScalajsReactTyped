package typingsJapgolly.graphqlBinding

import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlBinding.distTypesMod.BindingOptions
import typingsJapgolly.graphqlBinding.distTypesMod.FragmentReplacement
import typingsJapgolly.graphqlBinding.distTypesMod.Operation
import typingsJapgolly.graphqlTools.interfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Binding protected ()
    extends typingsJapgolly.graphqlBinding.bindingMod.Binding {
    def this(hasSchemaFragmentReplacementsBeforeDisableCache: BindingOptions) = this()
  }
  
  @js.native
  class Delegate protected ()
    extends typingsJapgolly.graphqlBinding.delegateMod.Delegate {
    def this(hasSchemaFragmentReplacementsBeforeDisableCache: BindingOptions) = this()
  }
  
  @js.native
  class FlowGenerator protected ()
    extends typingsJapgolly.graphqlBinding.flowGeneratorMod.FlowGenerator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: AnonInputSchemaPath) = this()
  }
  
  @js.native
  class Generator protected ()
    extends typingsJapgolly.graphqlBinding.generatorMod.Generator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: AnonInputSchemaPath) = this()
  }
  
  @js.native
  class TypescriptGenerator protected ()
    extends typingsJapgolly.graphqlBinding.typescriptGeneratorMod.TypescriptGenerator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: AnonInputSchemaPath) = this()
  }
  
  def addFragmentToInfo(info: GraphQLResolveInfo, fragment: String): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: String): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: DocumentNode): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: GraphQLResolveInfo): GraphQLResolveInfo = js.native
  def extractFragmentReplacements(resolvers: IResolvers[_, _]): js.Array[FragmentReplacement] = js.native
  def forwardTo(bindingName: String): js.Function4[
    /* parent */ js.Any, 
    /* args */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    _
  ] = js.native
  def makeBindingClass[T](hasSchema: AnonSchema): T = js.native
}

