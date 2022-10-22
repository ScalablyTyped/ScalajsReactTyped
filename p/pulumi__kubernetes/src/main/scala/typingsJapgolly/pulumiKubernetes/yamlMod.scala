package typingsJapgolly.pulumiKubernetes

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.yamlYamlMod.ConfigFileOpts
import typingsJapgolly.pulumiKubernetes.yamlYamlMod.ConfigGroupOpts
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yamlMod {
  
  @JSImport("@pulumi/kubernetes/yaml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@pulumi/kubernetes/yaml", "CollectionComponentResource")
  @js.native
  open class CollectionComponentResource protected ()
    extends typingsJapgolly.pulumiKubernetes.yamlYamlMod.CollectionComponentResource {
    /* protected */ def this(resourceType: String, name: String, config: Any) = this()
    /* protected */ def this(resourceType: String, name: String, config: Any, opts: ComponentResourceOptions) = this()
  }
  
  @JSImport("@pulumi/kubernetes/yaml", "ConfigFile")
  @js.native
  open class ConfigFile protected ()
    extends typingsJapgolly.pulumiKubernetes.yamlYamlMod.ConfigFile {
    /**
      * Create a ConfigFile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param config The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, config: ConfigFileOpts) = this()
    def this(name: String, config: Unit, opts: ComponentResourceOptions) = this()
    def this(name: String, config: ConfigFileOpts, opts: ComponentResourceOptions) = this()
  }
  
  @JSImport("@pulumi/kubernetes/yaml", "ConfigGroup")
  @js.native
  open class ConfigGroup protected ()
    extends typingsJapgolly.pulumiKubernetes.yamlYamlMod.ConfigGroup {
    /**
      * Create a ConfigGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param config The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, config: ConfigGroupOpts) = this()
    def this(name: String, config: ConfigGroupOpts, opts: ComponentResourceOptions) = this()
  }
  
  inline def parse(config: ConfigGroupOpts): Output_[StringDictionary[CustomResource]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(config.asInstanceOf[js.Any]).asInstanceOf[Output_[StringDictionary[CustomResource]]]
  inline def parse(config: ConfigGroupOpts, opts: CustomResourceOptions): Output_[StringDictionary[CustomResource]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Output_[StringDictionary[CustomResource]]]
  
  inline def skipAwait(o: Any, opts: ComponentResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skipAwait")(o.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
