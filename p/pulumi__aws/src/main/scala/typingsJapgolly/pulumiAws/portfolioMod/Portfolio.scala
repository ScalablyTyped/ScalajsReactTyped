package typingsJapgolly.pulumiAws.portfolioMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicecatalog/portfolio", "Portfolio")
@js.native
class Portfolio protected () extends CustomResource {
  /**
    * Create a Portfolio resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: PortfolioArgs) = this()
  def this(name: String, args: PortfolioArgs, opts: CustomResourceOptions) = this()
  val arn: Output_[String] = js.native
  val createdTime: Output_[String] = js.native
  /**
    * Description of the portfolio
    */
  val description: Output_[String] = js.native
  /**
    * The name of the portfolio.
    */
  val name: Output_[String] = js.native
  /**
    * Name of the person or organization who owns the portfolio.
    */
  val providerName: Output_[js.UndefOr[String]] = js.native
  /**
    * Tags to apply to the connection.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/servicecatalog/portfolio", "Portfolio")
@js.native
object Portfolio extends js.Object {
  /**
    * Get an existing Portfolio resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Portfolio = js.native
  def get(name: String, id: Input[ID], state: PortfolioState): Portfolio = js.native
  def get(name: String, id: Input[ID], state: PortfolioState, opts: CustomResourceOptions): Portfolio = js.native
  /**
    * Returns true if the given object is an instance of Portfolio.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicecatalog/portfolio.Portfolio */ Boolean = js.native
}

