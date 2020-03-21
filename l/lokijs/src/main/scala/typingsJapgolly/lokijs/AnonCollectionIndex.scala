package typingsJapgolly.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollectionIndex extends js.Object {
  var collectionIndex: js.UndefOr[Double] = js.undefined
  var delimited: js.UndefOr[Boolean] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
}

object AnonCollectionIndex {
  @scala.inline
  def apply(
    collectionIndex: Int | Double = null,
    delimited: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null
  ): AnonCollectionIndex = {
    val __obj = js.Dynamic.literal()
    if (collectionIndex != null) __obj.updateDynamic("collectionIndex")(collectionIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollectionIndex]
  }
}

