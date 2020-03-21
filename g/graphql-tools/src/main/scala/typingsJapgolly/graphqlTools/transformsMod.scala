package typingsJapgolly.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLField
import typingsJapgolly.graphql.definitionMod.GraphQLNamedType
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.addArgumentsAsVariablesMod.default
import typingsJapgolly.graphqlTools.filterRootFieldsMod.RootFilter
import typingsJapgolly.graphqlTools.graphqlToolsStrings.Mutation
import typingsJapgolly.graphqlTools.graphqlToolsStrings.Query
import typingsJapgolly.graphqlTools.graphqlToolsStrings.Subscription
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import typingsJapgolly.graphqlTools.renameTypesMod.RenameOptions
import typingsJapgolly.graphqlTools.transformRootFieldsMod.RootTransformer
import typingsJapgolly.graphqlTools.wrapQueryMod.QueryWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms", JSImport.Namespace)
@js.native
object transformsMod extends js.Object {
  @js.native
  class AddArgumentsAsVariables protected () extends default {
    def this(schema: GraphQLSchema, args: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class AddTypenameToAbstract protected ()
    extends typingsJapgolly.graphqlTools.addTypenameToAbstractMod.default {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class CheckResultAndHandleErrors protected ()
    extends typingsJapgolly.graphqlTools.checkResultAndHandleErrorsMod.default {
    def this(info: GraphQLResolveInfo) = this()
    def this(info: GraphQLResolveInfo, fieldName: String) = this()
  }
  
  @js.native
  class ExpandAbstractTypes protected ()
    extends typingsJapgolly.graphqlTools.expandAbstractTypesMod.default {
    def this(transformedSchema: GraphQLSchema, targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class ExtractField protected ()
    extends typingsJapgolly.graphqlTools.extractFieldMod.default {
    def this(hasFromTo: AnonFrom) = this()
  }
  
  @js.native
  class FilterRootFields protected ()
    extends typingsJapgolly.graphqlTools.filterRootFieldsMod.default {
    def this(filter: RootFilter) = this()
  }
  
  @js.native
  class FilterToSchema protected ()
    extends typingsJapgolly.graphqlTools.filterToSchemaMod.default {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class FilterTypes protected ()
    extends typingsJapgolly.graphqlTools.filterTypesMod.default {
    def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
  }
  
  @js.native
  class RenameRootFields protected ()
    extends typingsJapgolly.graphqlTools.renameRootFieldsMod.default {
    def this(renamer: js.Function3[
            /* operation */ Query | Mutation | Subscription, 
            /* name */ String, 
            /* field */ GraphQLField[_, _, StringDictionary[_]], 
            String
          ]) = this()
  }
  
  @js.native
  class RenameTypes protected ()
    extends typingsJapgolly.graphqlTools.renameTypesMod.default {
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
  }
  
  @js.native
  class ReplaceFieldWithFragment protected ()
    extends typingsJapgolly.graphqlTools.replaceFieldWithFragmentMod.default {
    def this(targetSchema: GraphQLSchema, fragments: js.Array[AnonField]) = this()
  }
  
  @js.native
  class TransformRootFields protected ()
    extends typingsJapgolly.graphqlTools.transformRootFieldsMod.default {
    def this(transform: RootTransformer) = this()
  }
  
  @js.native
  class WrapQuery protected ()
    extends typingsJapgolly.graphqlTools.wrapQueryMod.default {
    def this(path: js.Array[String], wrapper: QueryWrapper, extractor: js.Function1[/* result */ js.Any, _]) = this()
  }
  
  def transformSchema(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchematransformsAr = js.native
}

