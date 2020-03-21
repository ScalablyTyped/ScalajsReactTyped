package typingsJapgolly.monacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileMatch extends js.Object {
  /**
    * A list of file names that are associated to the schema. The '*' wildcard can be used. For example '*.schema.json', 'package.json'
    */
  val fileMatch: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The schema for the given URI.
    */
  val schema: js.UndefOr[js.Any] = js.undefined
  /**
    * The URI of the schema, which is also the identifier of the schema.
    */
  val uri: String
}

object AnonFileMatch {
  @scala.inline
  def apply(uri: String, fileMatch: js.Array[String] = null, schema: js.Any = null): AnonFileMatch = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    if (fileMatch != null) __obj.updateDynamic("fileMatch")(fileMatch.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileMatch]
  }
}

