package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.appsyncApiKeyMod.ApiKeyArgs
import typingsJapgolly.pulumiAws.appsyncApiKeyMod.ApiKeyState
import typingsJapgolly.pulumiAws.dataSourceMod.DataSourceArgs
import typingsJapgolly.pulumiAws.dataSourceMod.DataSourceState
import typingsJapgolly.pulumiAws.functionMod.FunctionArgs
import typingsJapgolly.pulumiAws.functionMod.FunctionState
import typingsJapgolly.pulumiAws.graphQLApiMod.GraphQLApiArgs
import typingsJapgolly.pulumiAws.graphQLApiMod.GraphQLApiState
import typingsJapgolly.pulumiAws.resolverMod.ResolverArgs
import typingsJapgolly.pulumiAws.resolverMod.ResolverState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "appsync")
@js.native
object appsync extends js.Object {
  @js.native
  class ApiKey protected ()
    extends typingsJapgolly.pulumiAws.appsyncMod.ApiKey {
    /**
      * Create a ApiKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApiKeyArgs) = this()
    def this(name: String, args: ApiKeyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DataSource protected ()
    extends typingsJapgolly.pulumiAws.appsyncMod.DataSource {
    /**
      * Create a DataSource resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DataSourceArgs) = this()
    def this(name: String, args: DataSourceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Function protected ()
    extends typingsJapgolly.pulumiAws.appsyncMod.Function {
    /**
      * Create a Function resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FunctionArgs) = this()
    def this(name: String, args: FunctionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class GraphQLApi protected ()
    extends typingsJapgolly.pulumiAws.appsyncMod.GraphQLApi {
    /**
      * Create a GraphQLApi resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GraphQLApiArgs) = this()
    def this(name: String, args: GraphQLApiArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Resolver protected ()
    extends typingsJapgolly.pulumiAws.appsyncMod.Resolver {
    /**
      * Create a Resolver resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverArgs) = this()
    def this(name: String, args: ResolverArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object ApiKey extends js.Object {
    /**
      * Get an existing ApiKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.appsyncApiKeyMod.ApiKey = js.native
    def get(name: String, id: Input[ID], state: ApiKeyState): typingsJapgolly.pulumiAws.appsyncApiKeyMod.ApiKey = js.native
    def get(name: String, id: Input[ID], state: ApiKeyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.appsyncApiKeyMod.ApiKey = js.native
    /**
      * Returns true if the given object is an instance of ApiKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/apiKey.ApiKey */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DataSource extends js.Object {
    /**
      * Get an existing DataSource resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.dataSourceMod.DataSource = js.native
    def get(name: String, id: Input[ID], state: DataSourceState): typingsJapgolly.pulumiAws.dataSourceMod.DataSource = js.native
    def get(name: String, id: Input[ID], state: DataSourceState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.dataSourceMod.DataSource = js.native
    /**
      * Returns true if the given object is an instance of DataSource.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/dataSource.DataSource */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Function extends js.Object {
    /**
      * Get an existing Function resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.functionMod.Function = js.native
    def get(name: String, id: Input[ID], state: FunctionState): typingsJapgolly.pulumiAws.functionMod.Function = js.native
    def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.functionMod.Function = js.native
    /**
      * Returns true if the given object is an instance of Function.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/function.Function */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GraphQLApi extends js.Object {
    /**
      * Get an existing GraphQLApi resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.graphQLApiMod.GraphQLApi = js.native
    def get(name: String, id: Input[ID], state: GraphQLApiState): typingsJapgolly.pulumiAws.graphQLApiMod.GraphQLApi = js.native
    def get(name: String, id: Input[ID], state: GraphQLApiState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.graphQLApiMod.GraphQLApi = js.native
    /**
      * Returns true if the given object is an instance of GraphQLApi.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/graphQLApi.GraphQLApi */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Resolver extends js.Object {
    /**
      * Get an existing Resolver resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.resolverMod.Resolver = js.native
    def get(name: String, id: Input[ID], state: ResolverState): typingsJapgolly.pulumiAws.resolverMod.Resolver = js.native
    def get(name: String, id: Input[ID], state: ResolverState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.resolverMod.Resolver = js.native
    /**
      * Returns true if the given object is an instance of Resolver.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ Boolean = js.native
  }
  
}

