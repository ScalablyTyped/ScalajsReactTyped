package typingsJapgolly.pulumiAws.namedQueryMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedQueryState extends js.Object {
  /**
    * The database to which the query belongs.
    */
  val database: js.UndefOr[Input[String]] = js.native
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
  val query: js.UndefOr[Input[String]] = js.native
  /**
    * The workgroup to which the query belongs. Defaults to `primary`
    */
  val workgroup: js.UndefOr[Input[String]] = js.native
}

object NamedQueryState {
  @scala.inline
  def apply(
    database: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    query: Input[String] = null,
    workgroup: Input[String] = null
  ): NamedQueryState = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (workgroup != null) __obj.updateDynamic("workgroup")(workgroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedQueryState]
  }
}

