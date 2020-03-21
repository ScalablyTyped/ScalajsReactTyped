package typingsJapgolly.algoliasearch.mod

import typingsJapgolly.algoliasearch.algoliasearchStrings.addObject
import typingsJapgolly.algoliasearch.algoliasearchStrings.analytics
import typingsJapgolly.algoliasearch.algoliasearchStrings.browse
import typingsJapgolly.algoliasearch.algoliasearchStrings.deleteIndex
import typingsJapgolly.algoliasearch.algoliasearchStrings.deleteObject
import typingsJapgolly.algoliasearch.algoliasearchStrings.editSettings
import typingsJapgolly.algoliasearch.algoliasearchStrings.listIndexes
import typingsJapgolly.algoliasearch.algoliasearchStrings.logs
import typingsJapgolly.algoliasearch.algoliasearchStrings.search
import typingsJapgolly.algoliasearch.algoliasearchStrings.seeUnretrievableAttributes
import typingsJapgolly.algoliasearch.algoliasearchStrings.settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKey extends js.Object {
  var acl: js.Array[
    search | browse | addObject | deleteObject | deleteIndex | settings | editSettings | analytics | listIndexes | logs | seeUnretrievableAttributes
  ]
  var createdAt: Double
  var description: js.UndefOr[String] = js.undefined
  var indexes: js.UndefOr[js.Array[String]] = js.undefined
  var validity: Double
  var value: String
}

object ApiKey {
  @scala.inline
  def apply(
    acl: js.Array[
      search | browse | addObject | deleteObject | deleteIndex | settings | editSettings | analytics | listIndexes | logs | seeUnretrievableAttributes
    ],
    createdAt: Double,
    validity: Double,
    value: String,
    description: String = null,
    indexes: js.Array[String] = null
  ): ApiKey = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKey]
  }
}

