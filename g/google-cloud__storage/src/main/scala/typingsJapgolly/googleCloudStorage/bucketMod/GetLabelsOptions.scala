package typingsJapgolly.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLabelsOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object GetLabelsOptions {
  @scala.inline
  def apply(userProject: String = null): GetLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLabelsOptions]
  }
}

