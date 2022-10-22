package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetListMod.PodPresetList
import typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetListMod.PodPresetListArgs
import typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetMod.PodPreset
import typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetMod.PodPresetArgs
import typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetPatchMod.PodPresetPatch
import typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetPatchMod.PodPresetPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  object v1alpha1 {
    
    object PodPreset {
      
      @JSImport("@pulumi/kubernetes/settings", "v1alpha1.PodPreset")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PodPreset resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetMod.PodPreset = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetMod.PodPreset]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetMod.PodPreset = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetMod.PodPreset]
      
      /**
        * Returns true if the given object is an instance of PodPreset.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPreset.PodPreset */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPreset.PodPreset */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/settings", "v1alpha1.PodPreset")
    @js.native
    open class PodPresetCls protected () extends PodPreset {
      /**
        * Create a PodPreset resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodPresetArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PodPresetArgs, opts: CustomResourceOptions) = this()
    }
    
    object PodPresetList {
      
      @JSImport("@pulumi/kubernetes/settings", "v1alpha1.PodPresetList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PodPresetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetListMod.PodPresetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetListMod.PodPresetList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetListMod.PodPresetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetListMod.PodPresetList]
      
      /**
        * Returns true if the given object is an instance of PodPresetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPresetList.PodPresetList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPresetList.PodPresetList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/settings", "v1alpha1.PodPresetList")
    @js.native
    open class PodPresetListCls protected () extends PodPresetList {
      /**
        * Create a PodPresetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodPresetListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PodPresetListArgs, opts: CustomResourceOptions) = this()
    }
    
    object PodPresetPatch {
      
      @JSImport("@pulumi/kubernetes/settings", "v1alpha1.PodPresetPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PodPresetPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetPatchMod.PodPresetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetPatchMod.PodPresetPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetPatchMod.PodPresetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.settingsV1alpha1PodPresetPatchMod.PodPresetPatch]
      
      /**
        * Returns true if the given object is an instance of PodPresetPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPresetPatch.PodPresetPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPresetPatch.PodPresetPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/settings", "v1alpha1.PodPresetPatch")
    @js.native
    open class PodPresetPatchCls protected () extends PodPresetPatch {
      /**
        * Create a PodPresetPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodPresetPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PodPresetPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
