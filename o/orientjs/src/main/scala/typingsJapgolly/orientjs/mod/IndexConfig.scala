package typingsJapgolly.orientjs.mod

import typingsJapgolly.orientjs.orientjsStrings.COLA
import typingsJapgolly.orientjs.orientjsStrings.DICTIONARY
import typingsJapgolly.orientjs.orientjsStrings.DICTIONARY_HASH_INDEX
import typingsJapgolly.orientjs.orientjsStrings.FULLTEXT
import typingsJapgolly.orientjs.orientjsStrings.FULLTEXT_HASH_INDEX
import typingsJapgolly.orientjs.orientjsStrings.LUCENE
import typingsJapgolly.orientjs.orientjsStrings.NOTUNIQUE
import typingsJapgolly.orientjs.orientjsStrings.NOTUNIQUE_HASH_INDEX
import typingsJapgolly.orientjs.orientjsStrings.SPATIAL
import typingsJapgolly.orientjs.orientjsStrings.UNIQUE
import typingsJapgolly.orientjs.orientjsStrings.UNIQUE_HASH_INDEX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexConfig extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var engine: js.UndefOr[LUCENE | COLA | String] = js.undefined
  var ifnotexist: js.UndefOr[Boolean] = js.undefined
  var keyType: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var name: String
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  var `type`: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL
}

object IndexConfig {
  @scala.inline
  def apply(
    name: String,
    `type`: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL,
    `class`: String = null,
    engine: LUCENE | COLA | String = null,
    ifnotexist: js.UndefOr[Boolean] = js.undefined,
    keyType: String = null,
    metadata: js.Any = null,
    properties: js.Array[String] = null
  ): IndexConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (!js.isUndefined(ifnotexist)) __obj.updateDynamic("ifnotexist")(ifnotexist.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexConfig]
  }
}

