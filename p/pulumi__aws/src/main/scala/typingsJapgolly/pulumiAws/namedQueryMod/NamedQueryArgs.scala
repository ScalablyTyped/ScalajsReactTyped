package typingsJapgolly.pulumiAws.namedQueryMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedQueryArgs extends js.Object {
  /**
    * The database to which the query belongs.
    */
  val database: Input[String] = js.native
  /**
    * A brief explanation of the query. Maximum length of 1024.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The plain language name for the query. Maximum length of 128.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The text of the query itself. In other words, all query statements. Maximum length of 262144.
    */
  val query: Input[String] = js.native
  /**
    * The workgroup to which the query belongs. Defaults to `primary`
    */
  val workgroup: js.UndefOr[Input[String]] = js.native
}

object NamedQueryArgs {
  @scala.inline
  def apply(
    database: Input[String],
    query: Input[String],
    description: Input[String] = null,
    name: Input[String] = null,
    workgroup: Input[String] = null
  ): NamedQueryArgs = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (workgroup != null) __obj.updateDynamic("workgroup")(workgroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedQueryArgs]
  }
}

