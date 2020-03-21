package typingsJapgolly.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.arangodb.AnonSegmentThreshold
import typingsJapgolly.arangodb.arangodbStrings.arangosearch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArangoSearchViewProperties extends js.Object {
  var cleanupIntervalStep: Double
  var consolidationIntervalMsec: Double
  var consolidationPolicy: AnonSegmentThreshold
  var id: String
  var links: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]
  var name: String
  var `type`: arangosearch
}

object ArangoSearchViewProperties {
  @scala.inline
  def apply(
    cleanupIntervalStep: Double,
    consolidationIntervalMsec: Double,
    consolidationPolicy: AnonSegmentThreshold,
    id: String,
    links: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]],
    name: String,
    `type`: arangosearch
  ): ArangoSearchViewProperties = {
    val __obj = js.Dynamic.literal(cleanupIntervalStep = cleanupIntervalStep.asInstanceOf[js.Any], consolidationIntervalMsec = consolidationIntervalMsec.asInstanceOf[js.Any], consolidationPolicy = consolidationPolicy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArangoSearchViewProperties]
  }
}

