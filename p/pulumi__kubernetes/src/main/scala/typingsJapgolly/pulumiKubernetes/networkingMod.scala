package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressListMod.IngressList
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressListMod.IngressListArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressMod.Ingress
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressMod.IngressArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressPatchMod.IngressPatch
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1IngressPatchMod.IngressPatchArgs
import typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRList
import typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRListArgs
import typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDR
import typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDRArgs
import typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatch
import typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatchArgs
import typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassListMod.IngressClassList
import typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassListMod.IngressClassListArgs
import typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassMod.IngressClass
import typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassMod.IngressClassArgs
import typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassPatchMod.IngressClassPatch
import typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassPatchMod.IngressClassPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkingMod {
  
  object v1alpha1 {
    
    object ClusterCIDR {
      
      @JSImport("@pulumi/kubernetes/networking", "v1alpha1.ClusterCIDR")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing ClusterCIDR resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDR = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDR]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDR = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDR]
      
      /**
        * Returns true if the given object is an instance of ClusterCIDR.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1alpha1/clusterCIDR.ClusterCIDR */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1alpha1/clusterCIDR.ClusterCIDR */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/networking", "v1alpha1.ClusterCIDR")
    @js.native
    open class ClusterCIDRCls protected () extends ClusterCIDR {
      /**
        * Create a ClusterCIDR resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: ClusterCIDRArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: ClusterCIDRArgs, opts: CustomResourceOptions) = this()
    }
    
    object ClusterCIDRList {
      
      @JSImport("@pulumi/kubernetes/networking", "v1alpha1.ClusterCIDRList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing ClusterCIDRList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRList]
      
      /**
        * Returns true if the given object is an instance of ClusterCIDRList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1alpha1/clusterCIDRList.ClusterCIDRList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1alpha1/clusterCIDRList.ClusterCIDRList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/networking", "v1alpha1.ClusterCIDRList")
    @js.native
    open class ClusterCIDRListCls protected () extends ClusterCIDRList {
      /**
        * Create a ClusterCIDRList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: ClusterCIDRListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: ClusterCIDRListArgs, opts: CustomResourceOptions) = this()
    }
    
    object ClusterCIDRPatch {
      
      @JSImport("@pulumi/kubernetes/networking", "v1alpha1.ClusterCIDRPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing ClusterCIDRPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatch]
      
      /**
        * Returns true if the given object is an instance of ClusterCIDRPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1alpha1/clusterCIDRPatch.ClusterCIDRPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1alpha1/clusterCIDRPatch.ClusterCIDRPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/networking", "v1alpha1.ClusterCIDRPatch")
    @js.native
    open class ClusterCIDRPatchCls protected () extends ClusterCIDRPatch {
      /**
        * Create a ClusterCIDRPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: ClusterCIDRPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: ClusterCIDRPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
  
  object v1beta1 {
    
    object Ingress {
      
      @JSImport("@pulumi/kubernetes/networking", "v1beta1.Ingress")
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
    
    object IngressClass {
      
      @JSImport("@pulumi/kubernetes/networking", "v1beta1.IngressClass")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing IngressClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassMod.IngressClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassMod.IngressClass]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassMod.IngressClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassMod.IngressClass]
      
      /**
        * Returns true if the given object is an instance of IngressClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/ingressClass.IngressClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/ingressClass.IngressClass */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/networking", "v1beta1.IngressClass")
    @js.native
    open class IngressClassCls protected () extends IngressClass {
      /**
        * Create a IngressClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: IngressClassArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: IngressClassArgs, opts: CustomResourceOptions) = this()
    }
    
    object IngressClassList {
      
      @JSImport("@pulumi/kubernetes/networking", "v1beta1.IngressClassList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing IngressClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassListMod.IngressClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassListMod.IngressClassList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassListMod.IngressClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassListMod.IngressClassList]
      
      /**
        * Returns true if the given object is an instance of IngressClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/ingressClassList.IngressClassList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/ingressClassList.IngressClassList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/networking", "v1beta1.IngressClassList")
    @js.native
    open class IngressClassListCls protected () extends IngressClassList {
      /**
        * Create a IngressClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: IngressClassListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: IngressClassListArgs, opts: CustomResourceOptions) = this()
    }
    
    object IngressClassPatch {
      
      @JSImport("@pulumi/kubernetes/networking", "v1beta1.IngressClassPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing IngressClassPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassPatchMod.IngressClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassPatchMod.IngressClassPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassPatchMod.IngressClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1beta1IngressClassPatchMod.IngressClassPatch]
      
      /**
        * Returns true if the given object is an instance of IngressClassPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/ingressClassPatch.IngressClassPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/ingressClassPatch.IngressClassPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/networking", "v1beta1.IngressClassPatch")
    @js.native
    open class IngressClassPatchCls protected () extends IngressClassPatch {
      /**
        * Create a IngressClassPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: IngressClassPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: IngressClassPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/networking", "v1beta1.Ingress")
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
      
      @JSImport("@pulumi/kubernetes/networking", "v1beta1.IngressList")
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
    @JSImport("@pulumi/kubernetes/networking", "v1beta1.IngressList")
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
      
      @JSImport("@pulumi/kubernetes/networking", "v1beta1.IngressPatch")
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
    @JSImport("@pulumi/kubernetes/networking", "v1beta1.IngressPatch")
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
  }
}
