package typingsJapgolly.pulumiKubernetes

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.yamlYamlMod.ConfigFileOpts
import typingsJapgolly.pulumiKubernetes.yamlYamlMod.ConfigGroupOpts
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/yaml", JSImport.Namespace)
@js.native
object yamlMod extends js.Object {
  @js.native
  abstract class CollectionComponentResource protected ()
    extends typingsJapgolly.pulumiKubernetes.yamlYamlMod.CollectionComponentResource {
    def this(resourceType: String, name: String, config: js.Any) = this()
    def this(resourceType: String, name: String, config: js.Any, opts: ComponentResourceOptions) = this()
  }
  
  @js.native
  class ConfigFile protected ()
    extends typingsJapgolly.pulumiKubernetes.yamlYamlMod.ConfigFile {
    def this(name: String) = this()
    def this(name: String, config: ConfigFileOpts) = this()
    def this(name: String, config: ConfigFileOpts, opts: ComponentResourceOptions) = this()
  }
  
  @js.native
  class ConfigGroup protected ()
    extends typingsJapgolly.pulumiKubernetes.yamlYamlMod.ConfigGroup {
    def this(name: String, config: ConfigGroupOpts) = this()
    def this(name: String, config: ConfigGroupOpts, opts: ComponentResourceOptions) = this()
  }
  
  def parse(config: ConfigGroupOpts): Output_[StringDictionary[CustomResource]] = js.native
  def parse(config: ConfigGroupOpts, opts: CustomResourceOptions): Output_[StringDictionary[CustomResource]] = js.native
}

