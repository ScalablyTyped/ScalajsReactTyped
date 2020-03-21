package typingsJapgolly.pulumiAws.rdsMod

import typingsJapgolly.pulumiAws.getEventCategoriesMod.GetEventCategoriesArgs
import typingsJapgolly.pulumiAws.getEventCategoriesMod.GetEventCategoriesResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds", "getEventCategories")
@js.native
object getEventCategories extends js.Object {
  def apply(): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
  def apply(args: GetEventCategoriesArgs): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
  def apply(args: GetEventCategoriesArgs, opts: InvokeOptions): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
}

