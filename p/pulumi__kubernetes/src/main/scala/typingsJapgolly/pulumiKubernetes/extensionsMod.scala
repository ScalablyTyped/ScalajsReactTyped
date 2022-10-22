package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentListMod.DeploymentList
import typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentListMod.DeploymentListArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentMod.Deployment
import typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentMod.DeploymentArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentPatchMod.DeploymentPatch
import typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentPatchMod.DeploymentPatchArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetListMod.DaemonSetList
import typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetListMod.DaemonSetListArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetMod.DaemonSet
import typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetMod.DaemonSetArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetPatchMod.DaemonSetPatch
import typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetPatchMod.DaemonSetPatchArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetListMod.ReplicaSetList
import typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetListMod.ReplicaSetListArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetMod.ReplicaSet
import typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetMod.ReplicaSetArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetPatchMod.ReplicaSetPatch
import typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetPatchMod.ReplicaSetPatchArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressListMod.IngressList
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressListMod.IngressListArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressMod.Ingress
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressMod.IngressArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressPatchMod.IngressPatch
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressPatchMod.IngressPatchArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyListMod.NetworkPolicyList
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyListMod.NetworkPolicyListArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyMod.NetworkPolicy
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyMod.NetworkPolicyArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyPatchMod.NetworkPolicyPatch
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyPatchMod.NetworkPolicyPatchArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyListArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicy
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicyArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensionsMod {
  
  object v1beta1 {
    
    object DaemonSet {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.DaemonSet")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing DaemonSet resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetMod.DaemonSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetMod.DaemonSet]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetMod.DaemonSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetMod.DaemonSet]
      
      /**
        * Get an existing DaemonSet resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_DaemonSet(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1DaemonSetMod.DaemonSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1DaemonSetMod.DaemonSet]
      inline def get_DaemonSet(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1DaemonSetMod.DaemonSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1DaemonSetMod.DaemonSet]
      
      /**
        * Returns true if the given object is an instance of DaemonSet.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/daemonSet.DaemonSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/daemonSet.DaemonSet */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.DaemonSet")
    @js.native
    open class DaemonSetCls protected () extends DaemonSet {
      /**
        * Create a DaemonSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated apps/v1beta2/DaemonSet is deprecated by apps/v1/DaemonSet and not supported by Kubernetes v1.16+ clusters. */
      def this(name: String) = this()
      def this(name: String, args: DaemonSetArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: DaemonSetArgs, opts: CustomResourceOptions) = this()
    }
    
    object DaemonSetList {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.DaemonSetList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing DaemonSetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1DaemonSetListMod.DaemonSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1DaemonSetListMod.DaemonSetList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1DaemonSetListMod.DaemonSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1DaemonSetListMod.DaemonSetList]
      
      /**
        * Get an existing DaemonSetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_DaemonSetList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetListMod.DaemonSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetListMod.DaemonSetList]
      inline def get_DaemonSetList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetListMod.DaemonSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetListMod.DaemonSetList]
      
      /**
        * Returns true if the given object is an instance of DaemonSetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/daemonSetList.DaemonSetList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/daemonSetList.DaemonSetList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.DaemonSetList")
    @js.native
    open class DaemonSetListCls protected () extends DaemonSetList {
      /**
        * Create a DaemonSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: DaemonSetListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: DaemonSetListArgs, opts: CustomResourceOptions) = this()
    }
    
    object DaemonSetPatch {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.DaemonSetPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing DaemonSetPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetPatchMod.DaemonSetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetPatchMod.DaemonSetPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetPatchMod.DaemonSetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2DaemonSetPatchMod.DaemonSetPatch]
      
      /**
        * Get an existing DaemonSetPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_DaemonSetPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1DaemonSetPatchMod.DaemonSetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1DaemonSetPatchMod.DaemonSetPatch]
      inline def get_DaemonSetPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1DaemonSetPatchMod.DaemonSetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1DaemonSetPatchMod.DaemonSetPatch]
      
      /**
        * Returns true if the given object is an instance of DaemonSetPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/daemonSetPatch.DaemonSetPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/daemonSetPatch.DaemonSetPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.DaemonSetPatch")
    @js.native
    open class DaemonSetPatchCls protected () extends DaemonSetPatch {
      /**
        * Create a DaemonSetPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated apps/v1beta2/DaemonSet is deprecated by apps/v1/DaemonSet and not supported by Kubernetes v1.16+ clusters. */
      def this(name: String) = this()
      def this(name: String, args: DaemonSetPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: DaemonSetPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object Deployment {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.Deployment")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing Deployment resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2DeploymentMod.Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2DeploymentMod.Deployment]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2DeploymentMod.Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2DeploymentMod.Deployment]
      
      /**
        * Get an existing Deployment resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_Deployment(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1DeploymentMod.Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1DeploymentMod.Deployment]
      inline def get_Deployment(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1DeploymentMod.Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1DeploymentMod.Deployment]
      
      /**
        * Get an existing Deployment resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_Deployment_Deployment(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentMod.Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentMod.Deployment]
      inline def get_Deployment_Deployment(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentMod.Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentMod.Deployment]
      
      /**
        * Returns true if the given object is an instance of Deployment.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/deployment.Deployment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/deployment.Deployment */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.Deployment")
    @js.native
    open class DeploymentCls protected () extends Deployment {
      /**
        * Create a Deployment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated apps/v1beta1/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters. */
      def this(name: String) = this()
      def this(name: String, args: DeploymentArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: DeploymentArgs, opts: CustomResourceOptions) = this()
    }
    
    object DeploymentList {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.DeploymentList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing DeploymentList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2DeploymentListMod.DeploymentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2DeploymentListMod.DeploymentList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2DeploymentListMod.DeploymentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2DeploymentListMod.DeploymentList]
      
      /**
        * Get an existing DeploymentList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_DeploymentList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentListMod.DeploymentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentListMod.DeploymentList]
      inline def get_DeploymentList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentListMod.DeploymentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentListMod.DeploymentList]
      
      /**
        * Get an existing DeploymentList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_DeploymentList_DeploymentList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1DeploymentListMod.DeploymentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1DeploymentListMod.DeploymentList]
      inline def get_DeploymentList_DeploymentList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1DeploymentListMod.DeploymentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1DeploymentListMod.DeploymentList]
      
      /**
        * Returns true if the given object is an instance of DeploymentList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/deploymentList.DeploymentList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/deploymentList.DeploymentList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.DeploymentList")
    @js.native
    open class DeploymentListCls protected () extends DeploymentList {
      /**
        * Create a DeploymentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: DeploymentListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: DeploymentListArgs, opts: CustomResourceOptions) = this()
    }
    
    object DeploymentPatch {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.DeploymentPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing DeploymentPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentPatchMod.DeploymentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentPatchMod.DeploymentPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentPatchMod.DeploymentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentPatchMod.DeploymentPatch]
      
      /**
        * Get an existing DeploymentPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_DeploymentPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2DeploymentPatchMod.DeploymentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2DeploymentPatchMod.DeploymentPatch]
      inline def get_DeploymentPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2DeploymentPatchMod.DeploymentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2DeploymentPatchMod.DeploymentPatch]
      
      /**
        * Get an existing DeploymentPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_DeploymentPatch_DeploymentPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1DeploymentPatchMod.DeploymentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1DeploymentPatchMod.DeploymentPatch]
      inline def get_DeploymentPatch_DeploymentPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1DeploymentPatchMod.DeploymentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1DeploymentPatchMod.DeploymentPatch]
      
      /**
        * Returns true if the given object is an instance of DeploymentPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/deploymentPatch.DeploymentPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/deploymentPatch.DeploymentPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.DeploymentPatch")
    @js.native
    open class DeploymentPatchCls protected () extends DeploymentPatch {
      /**
        * Create a DeploymentPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated apps/v1beta1/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters. */
      def this(name: String) = this()
      def this(name: String, args: DeploymentPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: DeploymentPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object Ingress {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.Ingress")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing Ingress resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressMod.Ingress = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressMod.Ingress]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressMod.Ingress = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressMod.Ingress]
      
      /**
        * Get an existing Ingress resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_Ingress(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressMod.Ingress = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressMod.Ingress]
      inline def get_Ingress(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressMod.Ingress = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressMod.Ingress]
      
      /**
        * Returns true if the given object is an instance of Ingress.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/ingress.Ingress */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/ingress.Ingress */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.Ingress")
    @js.native
    open class IngressCls protected () extends Ingress {
      /**
        * Create a Ingress resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated extensions/v1beta1/Ingress is deprecated by networking.k8s.io/v1beta1/Ingress and not supported by Kubernetes v1.20+ clusters. */
      def this(name: String) = this()
      def this(name: String, args: IngressArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: IngressArgs, opts: CustomResourceOptions) = this()
    }
    
    object IngressList {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.IngressList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing IngressList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressListMod.IngressList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressListMod.IngressList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressListMod.IngressList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressListMod.IngressList]
      
      /**
        * Get an existing IngressList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_IngressList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressListMod.IngressList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressListMod.IngressList]
      inline def get_IngressList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressListMod.IngressList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressListMod.IngressList]
      
      /**
        * Returns true if the given object is an instance of IngressList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/ingressList.IngressList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/ingressList.IngressList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.IngressList")
    @js.native
    open class IngressListCls protected () extends IngressList {
      /**
        * Create a IngressList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: IngressListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: IngressListArgs, opts: CustomResourceOptions) = this()
    }
    
    object IngressPatch {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.IngressPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing IngressPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressPatchMod.IngressPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressPatchMod.IngressPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressPatchMod.IngressPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressPatchMod.IngressPatch]
      
      /**
        * Get an existing IngressPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_IngressPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressPatchMod.IngressPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressPatchMod.IngressPatch]
      inline def get_IngressPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressPatchMod.IngressPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressPatchMod.IngressPatch]
      
      /**
        * Returns true if the given object is an instance of IngressPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/ingressPatch.IngressPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/ingressPatch.IngressPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.IngressPatch")
    @js.native
    open class IngressPatchCls protected () extends IngressPatch {
      /**
        * Create a IngressPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated extensions/v1beta1/Ingress is deprecated by networking.k8s.io/v1beta1/Ingress and not supported by Kubernetes v1.20+ clusters. */
      def this(name: String) = this()
      def this(name: String, args: IngressPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: IngressPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object NetworkPolicy {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.NetworkPolicy")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing NetworkPolicy resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyMod.NetworkPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyMod.NetworkPolicy]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyMod.NetworkPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyMod.NetworkPolicy]
      
      /**
        * Returns true if the given object is an instance of NetworkPolicy.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/networkPolicy.NetworkPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/networkPolicy.NetworkPolicy */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.NetworkPolicy")
    @js.native
    open class NetworkPolicyCls protected () extends NetworkPolicy {
      /**
        * Create a NetworkPolicy resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: NetworkPolicyArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: NetworkPolicyArgs, opts: CustomResourceOptions) = this()
    }
    
    object NetworkPolicyList {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.NetworkPolicyList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing NetworkPolicyList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyListMod.NetworkPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyListMod.NetworkPolicyList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyListMod.NetworkPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyListMod.NetworkPolicyList]
      
      /**
        * Returns true if the given object is an instance of NetworkPolicyList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/networkPolicyList.NetworkPolicyList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/networkPolicyList.NetworkPolicyList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.NetworkPolicyList")
    @js.native
    open class NetworkPolicyListCls protected () extends NetworkPolicyList {
      /**
        * Create a NetworkPolicyList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: NetworkPolicyListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: NetworkPolicyListArgs, opts: CustomResourceOptions) = this()
    }
    
    object NetworkPolicyPatch {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.NetworkPolicyPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing NetworkPolicyPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyPatchMod.NetworkPolicyPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyPatchMod.NetworkPolicyPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyPatchMod.NetworkPolicyPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1NetworkPolicyPatchMod.NetworkPolicyPatch]
      
      /**
        * Returns true if the given object is an instance of NetworkPolicyPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/networkPolicyPatch.NetworkPolicyPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/networkPolicyPatch.NetworkPolicyPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.NetworkPolicyPatch")
    @js.native
    open class NetworkPolicyPatchCls protected () extends NetworkPolicyPatch {
      /**
        * Create a NetworkPolicyPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: NetworkPolicyPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: NetworkPolicyPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object PodSecurityPolicy {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.PodSecurityPolicy")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PodSecurityPolicy resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyMod.PodSecurityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyMod.PodSecurityPolicy]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyMod.PodSecurityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyMod.PodSecurityPolicy]
      
      /**
        * Get an existing PodSecurityPolicy resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PodSecurityPolicy(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicy]
      inline def get_PodSecurityPolicy(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicy]
      
      /**
        * Returns true if the given object is an instance of PodSecurityPolicy.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicy.PodSecurityPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicy.PodSecurityPolicy */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.PodSecurityPolicy")
    @js.native
    open class PodSecurityPolicyCls protected () extends PodSecurityPolicy {
      /**
        * Create a PodSecurityPolicy resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodSecurityPolicyArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PodSecurityPolicyArgs, opts: CustomResourceOptions) = this()
    }
    
    object PodSecurityPolicyList {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.PodSecurityPolicyList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PodSecurityPolicyList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList]
      
      /**
        * Get an existing PodSecurityPolicyList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PodSecurityPolicyList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList]
      inline def get_PodSecurityPolicyList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList]
      
      /**
        * Returns true if the given object is an instance of PodSecurityPolicyList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicyList.PodSecurityPolicyList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicyList.PodSecurityPolicyList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.PodSecurityPolicyList")
    @js.native
    open class PodSecurityPolicyListCls protected () extends PodSecurityPolicyList {
      /**
        * Create a PodSecurityPolicyList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodSecurityPolicyListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PodSecurityPolicyListArgs, opts: CustomResourceOptions) = this()
    }
    
    object PodSecurityPolicyPatch {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.PodSecurityPolicyPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PodSecurityPolicyPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch]
      
      /**
        * Get an existing PodSecurityPolicyPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PodSecurityPolicyPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch]
      inline def get_PodSecurityPolicyPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch]
      
      /**
        * Returns true if the given object is an instance of PodSecurityPolicyPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicyPatch.PodSecurityPolicyPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicyPatch.PodSecurityPolicyPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.PodSecurityPolicyPatch")
    @js.native
    open class PodSecurityPolicyPatchCls protected () extends PodSecurityPolicyPatch {
      /**
        * Create a PodSecurityPolicyPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodSecurityPolicyPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PodSecurityPolicyPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object ReplicaSet {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.ReplicaSet")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing ReplicaSet resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1ReplicaSetMod.ReplicaSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1ReplicaSetMod.ReplicaSet]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1ReplicaSetMod.ReplicaSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1ReplicaSetMod.ReplicaSet]
      
      /**
        * Get an existing ReplicaSet resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_ReplicaSet(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetMod.ReplicaSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetMod.ReplicaSet]
      inline def get_ReplicaSet(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetMod.ReplicaSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetMod.ReplicaSet]
      
      /**
        * Returns true if the given object is an instance of ReplicaSet.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/replicaSet.ReplicaSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/replicaSet.ReplicaSet */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.ReplicaSet")
    @js.native
    open class ReplicaSetCls protected () extends ReplicaSet {
      /**
        * Create a ReplicaSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated apps/v1beta2/ReplicaSet is deprecated by apps/v1/ReplicaSet and not supported by Kubernetes v1.16+ clusters. */
      def this(name: String) = this()
      def this(name: String, args: ReplicaSetArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: ReplicaSetArgs, opts: CustomResourceOptions) = this()
    }
    
    object ReplicaSetList {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.ReplicaSetList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing ReplicaSetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1ReplicaSetListMod.ReplicaSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1ReplicaSetListMod.ReplicaSetList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1ReplicaSetListMod.ReplicaSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1ReplicaSetListMod.ReplicaSetList]
      
      /**
        * Get an existing ReplicaSetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_ReplicaSetList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetListMod.ReplicaSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetListMod.ReplicaSetList]
      inline def get_ReplicaSetList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetListMod.ReplicaSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetListMod.ReplicaSetList]
      
      /**
        * Returns true if the given object is an instance of ReplicaSetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/replicaSetList.ReplicaSetList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/replicaSetList.ReplicaSetList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.ReplicaSetList")
    @js.native
    open class ReplicaSetListCls protected () extends ReplicaSetList {
      /**
        * Create a ReplicaSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: ReplicaSetListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: ReplicaSetListArgs, opts: CustomResourceOptions) = this()
    }
    
    object ReplicaSetPatch {
      
      @JSImport("@pulumi/kubernetes/extensions", "v1beta1.ReplicaSetPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing ReplicaSetPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1ReplicaSetPatchMod.ReplicaSetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1ReplicaSetPatchMod.ReplicaSetPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1ReplicaSetPatchMod.ReplicaSetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1ReplicaSetPatchMod.ReplicaSetPatch]
      
      /**
        * Get an existing ReplicaSetPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_ReplicaSetPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetPatchMod.ReplicaSetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetPatchMod.ReplicaSetPatch]
      inline def get_ReplicaSetPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetPatchMod.ReplicaSetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2ReplicaSetPatchMod.ReplicaSetPatch]
      
      /**
        * Returns true if the given object is an instance of ReplicaSetPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/replicaSetPatch.ReplicaSetPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/replicaSetPatch.ReplicaSetPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/extensions", "v1beta1.ReplicaSetPatch")
    @js.native
    open class ReplicaSetPatchCls protected () extends ReplicaSetPatch {
      /**
        * Create a ReplicaSetPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated apps/v1beta2/ReplicaSet is deprecated by apps/v1/ReplicaSet and not supported by Kubernetes v1.16+ clusters. */
      def this(name: String) = this()
      def this(name: String, args: ReplicaSetPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: ReplicaSetPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
