package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentListMod.VolumeAttachmentList
import typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentListMod.VolumeAttachmentListArgs
import typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentMod.VolumeAttachment
import typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentMod.VolumeAttachmentArgs
import typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentPatchMod.VolumeAttachmentPatch
import typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentPatchMod.VolumeAttachmentPatchArgs
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverListMod.CSIDriverList
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverListMod.CSIDriverListArgs
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverMod.CSIDriver
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverMod.CSIDriverArgs
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverPatchMod.CSIDriverPatch
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverPatchMod.CSIDriverPatchArgs
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodeListMod.CSINodeList
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodeListMod.CSINodeListArgs
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodeMod.CSINode
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodeMod.CSINodeArgs
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodePatchMod.CSINodePatch
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodePatchMod.CSINodePatchArgs
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityListMod.CSIStorageCapacityList
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityListMod.CSIStorageCapacityListArgs
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityMod.CSIStorageCapacity
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityMod.CSIStorageCapacityArgs
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityPatchMod.CSIStorageCapacityPatch
import typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityPatchMod.CSIStorageCapacityPatchArgs
import typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassListMod.StorageClassList
import typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassListMod.StorageClassListArgs
import typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassMod.StorageClass
import typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassMod.StorageClassArgs
import typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassPatchMod.StorageClassPatch
import typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassPatchMod.StorageClassPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod {
  
  object v1alpha1 {
    
    object VolumeAttachment {
      
      @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachment")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentMod.VolumeAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentMod.VolumeAttachment]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentMod.VolumeAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentMod.VolumeAttachment]
      
      /**
        * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_VolumeAttachment(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentMod.VolumeAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentMod.VolumeAttachment]
      inline def get_VolumeAttachment(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentMod.VolumeAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentMod.VolumeAttachment]
      
      /**
        * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachment.VolumeAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachment.VolumeAttachment */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachment")
    @js.native
    open class VolumeAttachmentCls protected () extends VolumeAttachment {
      /**
        * Create a VolumeAttachment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: VolumeAttachmentArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: VolumeAttachmentArgs, opts: CustomResourceOptions) = this()
    }
    
    object VolumeAttachmentList {
      
      @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachmentList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing VolumeAttachmentList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentListMod.VolumeAttachmentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentListMod.VolumeAttachmentList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentListMod.VolumeAttachmentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentListMod.VolumeAttachmentList]
      
      /**
        * Get an existing VolumeAttachmentList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_VolumeAttachmentList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentListMod.VolumeAttachmentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentListMod.VolumeAttachmentList]
      inline def get_VolumeAttachmentList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentListMod.VolumeAttachmentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentListMod.VolumeAttachmentList]
      
      /**
        * Returns true if the given object is an instance of VolumeAttachmentList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachmentList.VolumeAttachmentList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachmentList.VolumeAttachmentList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachmentList")
    @js.native
    open class VolumeAttachmentListCls protected () extends VolumeAttachmentList {
      /**
        * Create a VolumeAttachmentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: VolumeAttachmentListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: VolumeAttachmentListArgs, opts: CustomResourceOptions) = this()
    }
    
    object VolumeAttachmentPatch {
      
      @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachmentPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing VolumeAttachmentPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentPatchMod.VolumeAttachmentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentPatchMod.VolumeAttachmentPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentPatchMod.VolumeAttachmentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentPatchMod.VolumeAttachmentPatch]
      
      /**
        * Get an existing VolumeAttachmentPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_VolumeAttachmentPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentPatchMod.VolumeAttachmentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentPatchMod.VolumeAttachmentPatch]
      inline def get_VolumeAttachmentPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentPatchMod.VolumeAttachmentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentPatchMod.VolumeAttachmentPatch]
      
      /**
        * Returns true if the given object is an instance of VolumeAttachmentPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachmentPatch.VolumeAttachmentPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachmentPatch.VolumeAttachmentPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1alpha1.VolumeAttachmentPatch")
    @js.native
    open class VolumeAttachmentPatchCls protected () extends VolumeAttachmentPatch {
      /**
        * Create a VolumeAttachmentPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: VolumeAttachmentPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: VolumeAttachmentPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
  
  object v1beta1 {
    
    object CSIDriver {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriver")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CSIDriver resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverMod.CSIDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverMod.CSIDriver]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverMod.CSIDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverMod.CSIDriver]
      
      /**
        * Returns true if the given object is an instance of CSIDriver.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csidriver.CSIDriver */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csidriver.CSIDriver */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriver")
    @js.native
    open class CSIDriverCls protected () extends CSIDriver {
      /**
        * Create a CSIDriver resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CSIDriverArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CSIDriverArgs, opts: CustomResourceOptions) = this()
    }
    
    object CSIDriverList {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriverList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CSIDriverList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverListMod.CSIDriverList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverListMod.CSIDriverList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverListMod.CSIDriverList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverListMod.CSIDriverList]
      
      /**
        * Returns true if the given object is an instance of CSIDriverList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csidriverList.CSIDriverList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csidriverList.CSIDriverList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriverList")
    @js.native
    open class CSIDriverListCls protected () extends CSIDriverList {
      /**
        * Create a CSIDriverList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CSIDriverListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CSIDriverListArgs, opts: CustomResourceOptions) = this()
    }
    
    object CSIDriverPatch {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriverPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CSIDriverPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverPatchMod.CSIDriverPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverPatchMod.CSIDriverPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverPatchMod.CSIDriverPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsidriverPatchMod.CSIDriverPatch]
      
      /**
        * Returns true if the given object is an instance of CSIDriverPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csidriverPatch.CSIDriverPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csidriverPatch.CSIDriverPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIDriverPatch")
    @js.native
    open class CSIDriverPatchCls protected () extends CSIDriverPatch {
      /**
        * Create a CSIDriverPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CSIDriverPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CSIDriverPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object CSINode {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINode")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CSINode resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodeMod.CSINode = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodeMod.CSINode]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodeMod.CSINode = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodeMod.CSINode]
      
      /**
        * Returns true if the given object is an instance of CSINode.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csinode.CSINode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csinode.CSINode */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINode")
    @js.native
    open class CSINodeCls protected () extends CSINode {
      /**
        * Create a CSINode resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated storage/v1beta1/CSINode is deprecated by storage.k8s.io/v1/CSINode. */
      def this(name: String) = this()
      def this(name: String, args: CSINodeArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CSINodeArgs, opts: CustomResourceOptions) = this()
    }
    
    object CSINodeList {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINodeList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CSINodeList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodeListMod.CSINodeList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodeListMod.CSINodeList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodeListMod.CSINodeList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodeListMod.CSINodeList]
      
      /**
        * Returns true if the given object is an instance of CSINodeList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csinodeList.CSINodeList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csinodeList.CSINodeList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINodeList")
    @js.native
    open class CSINodeListCls protected () extends CSINodeList {
      /**
        * Create a CSINodeList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CSINodeListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CSINodeListArgs, opts: CustomResourceOptions) = this()
    }
    
    object CSINodePatch {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINodePatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CSINodePatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodePatchMod.CSINodePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodePatchMod.CSINodePatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodePatchMod.CSINodePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsinodePatchMod.CSINodePatch]
      
      /**
        * Returns true if the given object is an instance of CSINodePatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csinodePatch.CSINodePatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csinodePatch.CSINodePatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSINodePatch")
    @js.native
    open class CSINodePatchCls protected () extends CSINodePatch {
      /**
        * Create a CSINodePatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated storage/v1beta1/CSINode is deprecated by storage.k8s.io/v1/CSINode. */
      def this(name: String) = this()
      def this(name: String, args: CSINodePatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CSINodePatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object CSIStorageCapacity {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIStorageCapacity")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CSIStorageCapacity resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityMod.CSIStorageCapacity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityMod.CSIStorageCapacity]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityMod.CSIStorageCapacity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityMod.CSIStorageCapacity]
      
      /**
        * Returns true if the given object is an instance of CSIStorageCapacity.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csistorageCapacity.CSIStorageCapacity */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csistorageCapacity.CSIStorageCapacity */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIStorageCapacity")
    @js.native
    open class CSIStorageCapacityCls protected () extends CSIStorageCapacity {
      /**
        * Create a CSIStorageCapacity resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CSIStorageCapacityArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CSIStorageCapacityArgs, opts: CustomResourceOptions) = this()
    }
    
    object CSIStorageCapacityList {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIStorageCapacityList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CSIStorageCapacityList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityListMod.CSIStorageCapacityList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityListMod.CSIStorageCapacityList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityListMod.CSIStorageCapacityList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityListMod.CSIStorageCapacityList]
      
      /**
        * Returns true if the given object is an instance of CSIStorageCapacityList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csistorageCapacityList.CSIStorageCapacityList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csistorageCapacityList.CSIStorageCapacityList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIStorageCapacityList")
    @js.native
    open class CSIStorageCapacityListCls protected () extends CSIStorageCapacityList {
      /**
        * Create a CSIStorageCapacityList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CSIStorageCapacityListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CSIStorageCapacityListArgs, opts: CustomResourceOptions) = this()
    }
    
    object CSIStorageCapacityPatch {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIStorageCapacityPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CSIStorageCapacityPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityPatchMod.CSIStorageCapacityPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityPatchMod.CSIStorageCapacityPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityPatchMod.CSIStorageCapacityPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1CsistorageCapacityPatchMod.CSIStorageCapacityPatch]
      
      /**
        * Returns true if the given object is an instance of CSIStorageCapacityPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csistorageCapacityPatch.CSIStorageCapacityPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/csistorageCapacityPatch.CSIStorageCapacityPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.CSIStorageCapacityPatch")
    @js.native
    open class CSIStorageCapacityPatchCls protected () extends CSIStorageCapacityPatch {
      /**
        * Create a CSIStorageCapacityPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CSIStorageCapacityPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CSIStorageCapacityPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object StorageClass {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClass")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing StorageClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassMod.StorageClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassMod.StorageClass]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassMod.StorageClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassMod.StorageClass]
      
      /**
        * Returns true if the given object is an instance of StorageClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClass.StorageClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClass.StorageClass */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClass")
    @js.native
    open class StorageClassCls protected () extends StorageClass {
      /**
        * Create a StorageClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: StorageClassArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: StorageClassArgs, opts: CustomResourceOptions) = this()
    }
    
    object StorageClassList {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClassList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing StorageClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassListMod.StorageClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassListMod.StorageClassList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassListMod.StorageClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassListMod.StorageClassList]
      
      /**
        * Returns true if the given object is an instance of StorageClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClassList.StorageClassList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClassList.StorageClassList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClassList")
    @js.native
    open class StorageClassListCls protected () extends StorageClassList {
      /**
        * Create a StorageClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: StorageClassListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: StorageClassListArgs, opts: CustomResourceOptions) = this()
    }
    
    object StorageClassPatch {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClassPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing StorageClassPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassPatchMod.StorageClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassPatchMod.StorageClassPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassPatchMod.StorageClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1StorageClassPatchMod.StorageClassPatch]
      
      /**
        * Returns true if the given object is an instance of StorageClassPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClassPatch.StorageClassPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClassPatch.StorageClassPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.StorageClassPatch")
    @js.native
    open class StorageClassPatchCls protected () extends StorageClassPatch {
      /**
        * Create a StorageClassPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: StorageClassPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: StorageClassPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object VolumeAttachment {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachment")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentMod.VolumeAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentMod.VolumeAttachment]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentMod.VolumeAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentMod.VolumeAttachment]
      
      /**
        * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_VolumeAttachment(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentMod.VolumeAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentMod.VolumeAttachment]
      inline def get_VolumeAttachment(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentMod.VolumeAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentMod.VolumeAttachment]
      
      /**
        * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachment.VolumeAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachment.VolumeAttachment */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachment")
    @js.native
    open class VolumeAttachmentCls protected () extends VolumeAttachment {
      /**
        * Create a VolumeAttachment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: VolumeAttachmentArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: VolumeAttachmentArgs, opts: CustomResourceOptions) = this()
    }
    
    object VolumeAttachmentList {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachmentList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing VolumeAttachmentList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentListMod.VolumeAttachmentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentListMod.VolumeAttachmentList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentListMod.VolumeAttachmentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentListMod.VolumeAttachmentList]
      
      /**
        * Get an existing VolumeAttachmentList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_VolumeAttachmentList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentListMod.VolumeAttachmentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentListMod.VolumeAttachmentList]
      inline def get_VolumeAttachmentList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentListMod.VolumeAttachmentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentListMod.VolumeAttachmentList]
      
      /**
        * Returns true if the given object is an instance of VolumeAttachmentList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachmentList.VolumeAttachmentList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachmentList.VolumeAttachmentList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachmentList")
    @js.native
    open class VolumeAttachmentListCls protected () extends VolumeAttachmentList {
      /**
        * Create a VolumeAttachmentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: VolumeAttachmentListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: VolumeAttachmentListArgs, opts: CustomResourceOptions) = this()
    }
    
    object VolumeAttachmentPatch {
      
      @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachmentPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing VolumeAttachmentPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentPatchMod.VolumeAttachmentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentPatchMod.VolumeAttachmentPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentPatchMod.VolumeAttachmentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1beta1VolumeAttachmentPatchMod.VolumeAttachmentPatch]
      
      /**
        * Get an existing VolumeAttachmentPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_VolumeAttachmentPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentPatchMod.VolumeAttachmentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentPatchMod.VolumeAttachmentPatch]
      inline def get_VolumeAttachmentPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentPatchMod.VolumeAttachmentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.storageV1alpha1VolumeAttachmentPatchMod.VolumeAttachmentPatch]
      
      /**
        * Returns true if the given object is an instance of VolumeAttachmentPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachmentPatch.VolumeAttachmentPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachmentPatch.VolumeAttachmentPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/storage", "v1beta1.VolumeAttachmentPatch")
    @js.native
    open class VolumeAttachmentPatchCls protected () extends VolumeAttachmentPatch {
      /**
        * Create a VolumeAttachmentPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: VolumeAttachmentPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: VolumeAttachmentPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
