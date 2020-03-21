package typingsJapgolly.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tree args
  */
trait ITreeArgs extends js.Object {
  var cacheKey: js.UndefOr[String] = js.undefined
  var section: String
}

object ITreeArgs {
  @scala.inline
  def apply(section: String, cacheKey: String = null): ITreeArgs = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeArgs]
  }
}

