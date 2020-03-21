package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.getProductMod.GetProductArgs
import typingsJapgolly.pulumiAws.getProductMod.GetProductResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pricing", JSImport.Namespace)
@js.native
object pricingMod extends js.Object {
  def getProduct(args: GetProductArgs): js.Promise[GetProductResult] with GetProductResult = js.native
  def getProduct(args: GetProductArgs, opts: InvokeOptions): js.Promise[GetProductResult] with GetProductResult = js.native
}

