package typingsJapgolly.pulumiKubernetes.mod.apps

import typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionListMod.ControllerRevisionList
import typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionListMod.ControllerRevisionListArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionMod.ControllerRevision
import typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionMod.ControllerRevisionArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionPatchMod.ControllerRevisionPatch
import typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionPatchMod.ControllerRevisionPatchArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentListMod.DeploymentList
import typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentListMod.DeploymentListArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentMod.Deployment
import typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentMod.DeploymentArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentPatchMod.DeploymentPatch
import typingsJapgolly.pulumiKubernetes.appsV1beta1DeploymentPatchMod.DeploymentPatchArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetListMod.StatefulSetList
import typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetListMod.StatefulSetListArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetMod.StatefulSet
import typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetMod.StatefulSetArgs
import typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetPatchMod.StatefulSetPatch
import typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetPatchMod.StatefulSetPatchArgs
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
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta2 {
  
  object ControllerRevision {
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.ControllerRevision")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ControllerRevision resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2ControllerRevisionMod.ControllerRevision = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2ControllerRevisionMod.ControllerRevision]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2ControllerRevisionMod.ControllerRevision = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2ControllerRevisionMod.ControllerRevision]
    
    /**
      * Get an existing ControllerRevision resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_ControllerRevision(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionMod.ControllerRevision = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionMod.ControllerRevision]
    inline def get_ControllerRevision(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionMod.ControllerRevision = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionMod.ControllerRevision]
    
    /**
      * Returns true if the given object is an instance of ControllerRevision.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/controllerRevision.ControllerRevision */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/controllerRevision.ControllerRevision */ Boolean]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.ControllerRevision")
  @js.native
  open class ControllerRevisionCls protected () extends ControllerRevision {
    /**
      * Create a ControllerRevision resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta1/ControllerRevision is deprecated by apps/v1/ControllerRevision and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: ControllerRevisionArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ControllerRevisionArgs, opts: CustomResourceOptions) = this()
  }
  
  object ControllerRevisionList {
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.ControllerRevisionList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ControllerRevisionList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2ControllerRevisionListMod.ControllerRevisionList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2ControllerRevisionListMod.ControllerRevisionList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2ControllerRevisionListMod.ControllerRevisionList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2ControllerRevisionListMod.ControllerRevisionList]
    
    /**
      * Get an existing ControllerRevisionList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_ControllerRevisionList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionListMod.ControllerRevisionList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionListMod.ControllerRevisionList]
    inline def get_ControllerRevisionList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionListMod.ControllerRevisionList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionListMod.ControllerRevisionList]
    
    /**
      * Returns true if the given object is an instance of ControllerRevisionList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/controllerRevisionList.ControllerRevisionList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/controllerRevisionList.ControllerRevisionList */ Boolean]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.ControllerRevisionList")
  @js.native
  open class ControllerRevisionListCls protected () extends ControllerRevisionList {
    /**
      * Create a ControllerRevisionList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ControllerRevisionListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ControllerRevisionListArgs, opts: CustomResourceOptions) = this()
  }
  
  object ControllerRevisionPatch {
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.ControllerRevisionPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ControllerRevisionPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionPatchMod.ControllerRevisionPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionPatchMod.ControllerRevisionPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionPatchMod.ControllerRevisionPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1ControllerRevisionPatchMod.ControllerRevisionPatch]
    
    /**
      * Get an existing ControllerRevisionPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_ControllerRevisionPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2ControllerRevisionPatchMod.ControllerRevisionPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2ControllerRevisionPatchMod.ControllerRevisionPatch]
    inline def get_ControllerRevisionPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2ControllerRevisionPatchMod.ControllerRevisionPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2ControllerRevisionPatchMod.ControllerRevisionPatch]
    
    /**
      * Returns true if the given object is an instance of ControllerRevisionPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/controllerRevisionPatch.ControllerRevisionPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/controllerRevisionPatch.ControllerRevisionPatch */ Boolean]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.ControllerRevisionPatch")
  @js.native
  open class ControllerRevisionPatchCls protected () extends ControllerRevisionPatch {
    /**
      * Create a ControllerRevisionPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta1/ControllerRevision is deprecated by apps/v1/ControllerRevision and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: ControllerRevisionPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ControllerRevisionPatchArgs, opts: CustomResourceOptions) = this()
  }
  
  object DaemonSet {
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.DaemonSet")
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
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.DaemonSet")
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
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.DaemonSetList")
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
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.DaemonSetList")
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
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.DaemonSetPatch")
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
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.DaemonSetPatch")
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
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.Deployment")
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
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.Deployment")
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
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.DeploymentList")
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
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.DeploymentList")
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
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.DeploymentPatch")
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
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.DeploymentPatch")
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
  
  object ReplicaSet {
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.ReplicaSet")
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
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.ReplicaSet")
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
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.ReplicaSetList")
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
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.ReplicaSetList")
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
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.ReplicaSetPatch")
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
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.ReplicaSetPatch")
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
  
  object StatefulSet {
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.StatefulSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StatefulSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetMod.StatefulSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetMod.StatefulSet]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetMod.StatefulSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetMod.StatefulSet]
    
    /**
      * Get an existing StatefulSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_StatefulSet(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2StatefulSetMod.StatefulSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2StatefulSetMod.StatefulSet]
    inline def get_StatefulSet(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2StatefulSetMod.StatefulSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2StatefulSetMod.StatefulSet]
    
    /**
      * Returns true if the given object is an instance of StatefulSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/statefulSet.StatefulSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/statefulSet.StatefulSet */ Boolean]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.StatefulSet")
  @js.native
  open class StatefulSetCls protected () extends StatefulSet {
    /**
      * Create a StatefulSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta1/StatefulSet is deprecated by apps/v1/StatefulSet and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: StatefulSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StatefulSetArgs, opts: CustomResourceOptions) = this()
  }
  
  object StatefulSetList {
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.StatefulSetList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StatefulSetList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2StatefulSetListMod.StatefulSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2StatefulSetListMod.StatefulSetList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2StatefulSetListMod.StatefulSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2StatefulSetListMod.StatefulSetList]
    
    /**
      * Get an existing StatefulSetList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_StatefulSetList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetListMod.StatefulSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetListMod.StatefulSetList]
    inline def get_StatefulSetList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetListMod.StatefulSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetListMod.StatefulSetList]
    
    /**
      * Returns true if the given object is an instance of StatefulSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/statefulSetList.StatefulSetList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/statefulSetList.StatefulSetList */ Boolean]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.StatefulSetList")
  @js.native
  open class StatefulSetListCls protected () extends StatefulSetList {
    /**
      * Create a StatefulSetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StatefulSetListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StatefulSetListArgs, opts: CustomResourceOptions) = this()
  }
  
  object StatefulSetPatch {
    
    @JSImport("@pulumi/kubernetes", "apps.v1beta2.StatefulSetPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StatefulSetPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta2StatefulSetPatchMod.StatefulSetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2StatefulSetPatchMod.StatefulSetPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta2StatefulSetPatchMod.StatefulSetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta2StatefulSetPatchMod.StatefulSetPatch]
    
    /**
      * Get an existing StatefulSetPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_StatefulSetPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetPatchMod.StatefulSetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetPatchMod.StatefulSetPatch]
    inline def get_StatefulSetPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetPatchMod.StatefulSetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.appsV1beta1StatefulSetPatchMod.StatefulSetPatch]
    
    /**
      * Returns true if the given object is an instance of StatefulSetPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/statefulSetPatch.StatefulSetPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/statefulSetPatch.StatefulSetPatch */ Boolean]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes", "apps.v1beta2.StatefulSetPatch")
  @js.native
  open class StatefulSetPatchCls protected () extends StatefulSetPatch {
    /**
      * Create a StatefulSetPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta1/StatefulSet is deprecated by apps/v1/StatefulSet and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: StatefulSetPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StatefulSetPatchArgs, opts: CustomResourceOptions) = this()
  }
}
