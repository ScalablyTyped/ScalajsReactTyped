package typingsJapgolly.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.arangodb.AnonThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArangoSearchViewPropertiesOptions extends js.Object {
  var cleanupIntervalStep: js.UndefOr[Double] = js.undefined
  var consolidationIntervalMsec: js.UndefOr[Double] = js.undefined
  var consolidationPolicy: js.UndefOr[AnonThreshold] = js.undefined
  var links: js.UndefOr[StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]] = js.undefined
}

object ArangoSearchViewPropertiesOptions {
  @scala.inline
  def apply(
    cleanupIntervalStep: Int | Double = null,
    consolidationIntervalMsec: Int | Double = null,
    consolidationPolicy: AnonThreshold = null,
    links: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]] = null
  ): ArangoSearchViewPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    if (cleanupIntervalStep != null) __obj.updateDynamic("cleanupIntervalStep")(cleanupIntervalStep.asInstanceOf[js.Any])
    if (consolidationIntervalMsec != null) __obj.updateDynamic("consolidationIntervalMsec")(consolidationIntervalMsec.asInstanceOf[js.Any])
    if (consolidationPolicy != null) __obj.updateDynamic("consolidationPolicy")(consolidationPolicy.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArangoSearchViewPropertiesOptions]
  }
}

