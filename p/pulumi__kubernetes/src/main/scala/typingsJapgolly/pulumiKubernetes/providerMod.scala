package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.typesInputMod.HelmReleaseSettings
import typingsJapgolly.pulumiKubernetes.typesInputMod.KubeClientSettings
import typingsJapgolly.pulumiPulumi.mod.ProviderResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("@pulumi/kubernetes/provider", "Provider")
  @js.native
  open class Provider protected () extends ProviderResource {
    /**
      * Create a Provider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ProviderArgs) = this()
    def this(name: String, args: Unit, opts: ResourceOptions) = this()
    def this(name: String, args: ProviderArgs, opts: ResourceOptions) = this()
  }
  /* static members */
  object Provider {
    
    @JSImport("@pulumi/kubernetes/provider", "Provider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of Provider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/provider.Provider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/provider.Provider */ Boolean]
  }
  
  trait ProviderArgs extends StObject {
    
    /**
      * If present, the name of the kubeconfig cluster to use.
      */
    var cluster: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If present, the name of the kubeconfig context to use.
      */
    var context: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If present and set to true, the provider will delete resources associated with an unreachable Kubernetes cluster from Pulumi state
      */
    var deleteUnreachable: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * BETA FEATURE - If present and set to true, allow ConfigMaps to be mutated.
      * This feature is in developer preview, and is disabled by default.
      *
      * This config can be specified in the following ways using this precedence:
      * 1. This `enableConfigMapMutable` parameter.
      * 2. The `PULUMI_K8S_ENABLE_CONFIGMAP_MUTABLE` environment variable.
      */
    var enableConfigMapMutable: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Deprecated. If present and set to true, enable server-side diff calculations.
      *
      * @deprecated This option has been replaced by `enableServerSideApply`.
      */
    var enableDryRun: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Obsolete. This option has no effect.
      *
      * @deprecated This option is deprecated, and will be removed in a future release.
      */
    var enableReplaceCRD: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * BETA FEATURE - If present and set to true, enable Server-Side Apply mode.
      * See https://github.com/pulumi/pulumi-kubernetes/issues/2011 for additional details.
      * This feature is in developer preview, and is disabled by default.
      */
    var enableServerSideApply: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Options to configure the Helm Release resource.
      */
    var helmReleaseSettings: js.UndefOr[Input[HelmReleaseSettings]] = js.undefined
    
    /**
      * Options for tuning the Kubernetes client used by a Provider.
      */
    var kubeClientSettings: js.UndefOr[Input[KubeClientSettings]] = js.undefined
    
    /**
      * The contents of a kubeconfig file or the path to a kubeconfig file.
      */
    var kubeconfig: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
      *
      * A namespace can be specified in multiple places, and the precedence is as follows:
      * 1. `.metadata.namespace` set on the resource.
      * 2. This `namespace` parameter.
      * 3. `namespace` set for the active context in the kubeconfig.
      */
    var namespace: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * BETA FEATURE - If present, render resource manifests to this directory. In this mode, resources will not
      * be created on a Kubernetes cluster, but the rendered manifests will be kept in sync with changes
      * to the Pulumi program. This feature is in developer preview, and is disabled by default.
      *
      * Note that some computed Outputs such as status fields will not be populated
      * since the resources are not created on a Kubernetes cluster. These Output values will remain undefined,
      * and may result in an error if they are referenced by other resources. Also note that any secret values
      * used in these resources will be rendered in plaintext to the resulting YAML.
      */
    var renderYamlToDirectory: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If present and set to true, suppress apiVersion deprecation warnings from the CLI.
      */
    var suppressDeprecationWarnings: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If present and set to true, suppress unsupported Helm hook warnings from the CLI.
      */
    var suppressHelmHookWarnings: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object ProviderArgs {
    
    inline def apply(): ProviderArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderArgs]
    }
    
    extension [Self <: ProviderArgs](x: Self) {
      
      inline def setCluster(value: Input[String]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
      
      inline def setContext(value: Input[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDeleteUnreachable(value: Input[Boolean]): Self = StObject.set(x, "deleteUnreachable", value.asInstanceOf[js.Any])
      
      inline def setDeleteUnreachableUndefined: Self = StObject.set(x, "deleteUnreachable", js.undefined)
      
      inline def setEnableConfigMapMutable(value: Input[Boolean]): Self = StObject.set(x, "enableConfigMapMutable", value.asInstanceOf[js.Any])
      
      inline def setEnableConfigMapMutableUndefined: Self = StObject.set(x, "enableConfigMapMutable", js.undefined)
      
      inline def setEnableDryRun(value: Input[Boolean]): Self = StObject.set(x, "enableDryRun", value.asInstanceOf[js.Any])
      
      inline def setEnableDryRunUndefined: Self = StObject.set(x, "enableDryRun", js.undefined)
      
      inline def setEnableReplaceCRD(value: Input[Boolean]): Self = StObject.set(x, "enableReplaceCRD", value.asInstanceOf[js.Any])
      
      inline def setEnableReplaceCRDUndefined: Self = StObject.set(x, "enableReplaceCRD", js.undefined)
      
      inline def setEnableServerSideApply(value: Input[Boolean]): Self = StObject.set(x, "enableServerSideApply", value.asInstanceOf[js.Any])
      
      inline def setEnableServerSideApplyUndefined: Self = StObject.set(x, "enableServerSideApply", js.undefined)
      
      inline def setHelmReleaseSettings(value: Input[HelmReleaseSettings]): Self = StObject.set(x, "helmReleaseSettings", value.asInstanceOf[js.Any])
      
      inline def setHelmReleaseSettingsUndefined: Self = StObject.set(x, "helmReleaseSettings", js.undefined)
      
      inline def setKubeClientSettings(value: Input[KubeClientSettings]): Self = StObject.set(x, "kubeClientSettings", value.asInstanceOf[js.Any])
      
      inline def setKubeClientSettingsUndefined: Self = StObject.set(x, "kubeClientSettings", js.undefined)
      
      inline def setKubeconfig(value: Input[String]): Self = StObject.set(x, "kubeconfig", value.asInstanceOf[js.Any])
      
      inline def setKubeconfigUndefined: Self = StObject.set(x, "kubeconfig", js.undefined)
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setRenderYamlToDirectory(value: Input[String]): Self = StObject.set(x, "renderYamlToDirectory", value.asInstanceOf[js.Any])
      
      inline def setRenderYamlToDirectoryUndefined: Self = StObject.set(x, "renderYamlToDirectory", js.undefined)
      
      inline def setSuppressDeprecationWarnings(value: Input[Boolean]): Self = StObject.set(x, "suppressDeprecationWarnings", value.asInstanceOf[js.Any])
      
      inline def setSuppressDeprecationWarningsUndefined: Self = StObject.set(x, "suppressDeprecationWarnings", js.undefined)
      
      inline def setSuppressHelmHookWarnings(value: Input[Boolean]): Self = StObject.set(x, "suppressHelmHookWarnings", value.asInstanceOf[js.Any])
      
      inline def setSuppressHelmHookWarningsUndefined: Self = StObject.set(x, "suppressHelmHookWarnings", js.undefined)
    }
  }
}
