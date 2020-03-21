package typingsJapgolly.pulumiKubernetes.appsMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apps", "v1beta1")
@js.native
object v1beta1 extends js.Object {
  @js.native
  class ControllerRevision protected ()
    extends typingsJapgolly.pulumiKubernetes.appsV1beta1Mod.ControllerRevision {
    /**
      * Create a apps.v1beta1.ControllerRevision resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta1.ControllerRevision) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta1.ControllerRevision,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class ControllerRevisionList protected ()
    extends typingsJapgolly.pulumiKubernetes.appsV1beta1Mod.ControllerRevisionList {
    /**
      * Create a apps.v1beta1.ControllerRevisionList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta1.ControllerRevisionList) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta1.ControllerRevisionList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class Deployment protected ()
    extends typingsJapgolly.pulumiKubernetes.appsV1beta1Mod.Deployment {
    /**
      * Create a apps.v1beta1.Deployment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta1.Deployment) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta1.Deployment,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class DeploymentList protected ()
    extends typingsJapgolly.pulumiKubernetes.appsV1beta1Mod.DeploymentList {
    /**
      * Create a apps.v1beta1.DeploymentList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta1.DeploymentList) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta1.DeploymentList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class StatefulSet protected ()
    extends typingsJapgolly.pulumiKubernetes.appsV1beta1Mod.StatefulSet {
    /**
      * Create a apps.v1beta1.StatefulSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta1.StatefulSet) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta1.StatefulSet,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class StatefulSetList protected ()
    extends typingsJapgolly.pulumiKubernetes.appsV1beta1Mod.StatefulSetList {
    /**
      * Create a apps.v1beta1.StatefulSetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta1.StatefulSetList) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta1.StatefulSetList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object ControllerRevision extends js.Object {
    /**
      * Get the state of an existing `ControllerRevision` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.controllerRevisionMod.ControllerRevision = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.controllerRevisionMod.ControllerRevision = js.native
    /**
      * Returns true if the given object is an instance of ControllerRevision.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/ControllerRevision.ControllerRevision */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ControllerRevisionList extends js.Object {
    /**
      * Get the state of an existing `ControllerRevisionList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.controllerRevisionListMod.ControllerRevisionList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.controllerRevisionListMod.ControllerRevisionList = js.native
    /**
      * Returns true if the given object is an instance of ControllerRevisionList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/ControllerRevisionList.ControllerRevisionList */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Deployment extends js.Object {
    /**
      * Get the state of an existing `Deployment` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.deploymentMod.Deployment = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.deploymentMod.Deployment = js.native
    /**
      * Returns true if the given object is an instance of Deployment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/Deployment.Deployment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DeploymentList extends js.Object {
    /**
      * Get the state of an existing `DeploymentList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.deploymentListMod.DeploymentList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.deploymentListMod.DeploymentList = js.native
    /**
      * Returns true if the given object is an instance of DeploymentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/DeploymentList.DeploymentList */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StatefulSet extends js.Object {
    /**
      * Get the state of an existing `StatefulSet` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.statefulSetMod.StatefulSet = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.statefulSetMod.StatefulSet = js.native
    /**
      * Returns true if the given object is an instance of StatefulSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/StatefulSet.StatefulSet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StatefulSetList extends js.Object {
    /**
      * Get the state of an existing `StatefulSetList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.statefulSetListMod.StatefulSetList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.statefulSetListMod.StatefulSetList = js.native
    /**
      * Returns true if the given object is an instance of StatefulSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/StatefulSetList.StatefulSetList */ Boolean = js.native
  }
  
}

