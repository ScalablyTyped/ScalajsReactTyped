package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.catalogDatabaseMod.CatalogDatabaseArgs
import typingsJapgolly.pulumiAws.catalogDatabaseMod.CatalogDatabaseState
import typingsJapgolly.pulumiAws.catalogTableMod.CatalogTableArgs
import typingsJapgolly.pulumiAws.catalogTableMod.CatalogTableState
import typingsJapgolly.pulumiAws.classifierMod.ClassifierArgs
import typingsJapgolly.pulumiAws.classifierMod.ClassifierState
import typingsJapgolly.pulumiAws.crawlerMod.CrawlerArgs
import typingsJapgolly.pulumiAws.crawlerMod.CrawlerState
import typingsJapgolly.pulumiAws.getScriptMod.GetScriptArgs
import typingsJapgolly.pulumiAws.getScriptMod.GetScriptResult
import typingsJapgolly.pulumiAws.glueConnectionMod.ConnectionArgs
import typingsJapgolly.pulumiAws.glueConnectionMod.ConnectionState
import typingsJapgolly.pulumiAws.glueSecurityConfigurationMod.SecurityConfigurationArgs
import typingsJapgolly.pulumiAws.glueSecurityConfigurationMod.SecurityConfigurationState
import typingsJapgolly.pulumiAws.glueTriggerMod.TriggerArgs
import typingsJapgolly.pulumiAws.glueTriggerMod.TriggerState
import typingsJapgolly.pulumiAws.jobMod.JobArgs
import typingsJapgolly.pulumiAws.jobMod.JobState
import typingsJapgolly.pulumiAws.workflowMod.WorkflowArgs
import typingsJapgolly.pulumiAws.workflowMod.WorkflowState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "glue")
@js.native
object glue extends js.Object {
  @js.native
  class CatalogDatabase protected ()
    extends typingsJapgolly.pulumiAws.glueMod.CatalogDatabase {
    /**
      * Create a CatalogDatabase resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CatalogDatabaseArgs) = this()
    def this(name: String, args: CatalogDatabaseArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class CatalogTable protected ()
    extends typingsJapgolly.pulumiAws.glueMod.CatalogTable {
    /**
      * Create a CatalogTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CatalogTableArgs) = this()
    def this(name: String, args: CatalogTableArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Classifier protected ()
    extends typingsJapgolly.pulumiAws.glueMod.Classifier {
    /**
      * Create a Classifier resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClassifierArgs) = this()
    def this(name: String, args: ClassifierArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Connection protected ()
    extends typingsJapgolly.pulumiAws.glueMod.Connection {
    /**
      * Create a Connection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConnectionArgs) = this()
    def this(name: String, args: ConnectionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Crawler protected ()
    extends typingsJapgolly.pulumiAws.glueMod.Crawler {
    /**
      * Create a Crawler resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CrawlerArgs) = this()
    def this(name: String, args: CrawlerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Job protected ()
    extends typingsJapgolly.pulumiAws.glueMod.Job {
    /**
      * Create a Job resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobArgs) = this()
    def this(name: String, args: JobArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SecurityConfiguration protected ()
    extends typingsJapgolly.pulumiAws.glueMod.SecurityConfiguration {
    /**
      * Create a SecurityConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityConfigurationArgs) = this()
    def this(name: String, args: SecurityConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Trigger protected ()
    extends typingsJapgolly.pulumiAws.glueMod.Trigger {
    /**
      * Create a Trigger resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TriggerArgs) = this()
    def this(name: String, args: TriggerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Workflow protected ()
    extends typingsJapgolly.pulumiAws.glueMod.Workflow {
    /**
      * Create a Workflow resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: WorkflowArgs) = this()
    def this(name: String, args: WorkflowArgs, opts: CustomResourceOptions) = this()
  }
  
  def getScript(args: GetScriptArgs): js.Promise[GetScriptResult] with GetScriptResult = js.native
  def getScript(args: GetScriptArgs, opts: InvokeOptions): js.Promise[GetScriptResult] with GetScriptResult = js.native
  /* static members */
  @js.native
  object CatalogDatabase extends js.Object {
    /**
      * Get an existing CatalogDatabase resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.catalogDatabaseMod.CatalogDatabase = js.native
    def get(name: String, id: Input[ID], state: CatalogDatabaseState): typingsJapgolly.pulumiAws.catalogDatabaseMod.CatalogDatabase = js.native
    def get(name: String, id: Input[ID], state: CatalogDatabaseState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.catalogDatabaseMod.CatalogDatabase = js.native
    /**
      * Returns true if the given object is an instance of CatalogDatabase.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogDatabase.CatalogDatabase */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CatalogTable extends js.Object {
    /**
      * Get an existing CatalogTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.catalogTableMod.CatalogTable = js.native
    def get(name: String, id: Input[ID], state: CatalogTableState): typingsJapgolly.pulumiAws.catalogTableMod.CatalogTable = js.native
    def get(name: String, id: Input[ID], state: CatalogTableState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.catalogTableMod.CatalogTable = js.native
    /**
      * Returns true if the given object is an instance of CatalogTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogTable.CatalogTable */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Classifier extends js.Object {
    /**
      * Get an existing Classifier resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.classifierMod.Classifier = js.native
    def get(name: String, id: Input[ID], state: ClassifierState): typingsJapgolly.pulumiAws.classifierMod.Classifier = js.native
    def get(name: String, id: Input[ID], state: ClassifierState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.classifierMod.Classifier = js.native
    /**
      * Returns true if the given object is an instance of Classifier.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Connection extends js.Object {
    /**
      * Get an existing Connection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.glueConnectionMod.Connection = js.native
    def get(name: String, id: Input[ID], state: ConnectionState): typingsJapgolly.pulumiAws.glueConnectionMod.Connection = js.native
    def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.glueConnectionMod.Connection = js.native
    /**
      * Returns true if the given object is an instance of Connection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/connection.Connection */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Crawler extends js.Object {
    /**
      * Get an existing Crawler resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.crawlerMod.Crawler = js.native
    def get(name: String, id: Input[ID], state: CrawlerState): typingsJapgolly.pulumiAws.crawlerMod.Crawler = js.native
    def get(name: String, id: Input[ID], state: CrawlerState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.crawlerMod.Crawler = js.native
    /**
      * Returns true if the given object is an instance of Crawler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/crawler.Crawler */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Job extends js.Object {
    /**
      * Get an existing Job resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.jobMod.Job = js.native
    def get(name: String, id: Input[ID], state: JobState): typingsJapgolly.pulumiAws.jobMod.Job = js.native
    def get(name: String, id: Input[ID], state: JobState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.jobMod.Job = js.native
    /**
      * Returns true if the given object is an instance of Job.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/job.Job */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SecurityConfiguration extends js.Object {
    /**
      * Get an existing SecurityConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState): typingsJapgolly.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    /**
      * Returns true if the given object is an instance of SecurityConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/securityConfiguration.SecurityConfiguration */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Trigger extends js.Object {
    /**
      * Get an existing Trigger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.glueTriggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: TriggerState): typingsJapgolly.pulumiAws.glueTriggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.glueTriggerMod.Trigger = js.native
    /**
      * Returns true if the given object is an instance of Trigger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/trigger.Trigger */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Workflow extends js.Object {
    /**
      * Get an existing Workflow resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.workflowMod.Workflow = js.native
    def get(name: String, id: Input[ID], state: WorkflowState): typingsJapgolly.pulumiAws.workflowMod.Workflow = js.native
    def get(name: String, id: Input[ID], state: WorkflowState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.workflowMod.Workflow = js.native
    /**
      * Returns true if the given object is an instance of Workflow.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/workflow.Workflow */ Boolean = js.native
  }
  
}

