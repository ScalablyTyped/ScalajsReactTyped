package typingsJapgolly.dropboxChooser.Dropbox

import japgolly.scalajs.react.Callback
import typingsJapgolly.dropboxChooser.dropboxChooserStrings.direct
import typingsJapgolly.dropboxChooser.dropboxChooserStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooserOptions extends js.Object {
  // called when the user closes the dialog without selecting a file
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  // eg. '.png'
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  // default: false
  var folderselect: js.UndefOr[Boolean] = js.undefined
  // default: 'preview'
  var linkType: js.UndefOr[preview | direct] = js.undefined
  // default: false
  var multiselect: js.UndefOr[Boolean] = js.undefined
  // any positive number
  var sizeLimit: js.UndefOr[Double] = js.undefined
  // called when a user selects an item in the Chooser
  def success(files: js.Array[ChooserFile]): Unit
}

object ChooserOptions {
  @scala.inline
  def apply(
    success: js.Array[ChooserFile] => Callback,
    cancel: js.UndefOr[Callback] = js.undefined,
    extensions: js.Array[String] = null,
    folderselect: js.UndefOr[Boolean] = js.undefined,
    linkType: preview | direct = null,
    multiselect: js.UndefOr[Boolean] = js.undefined,
    sizeLimit: Int | Double = null
  ): ChooserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.dropboxChooser.Dropbox.ChooserFile]) => success(t0).runNow()))
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(folderselect)) __obj.updateDynamic("folderselect")(folderselect.asInstanceOf[js.Any])
    if (linkType != null) __obj.updateDynamic("linkType")(linkType.asInstanceOf[js.Any])
    if (!js.isUndefined(multiselect)) __obj.updateDynamic("multiselect")(multiselect.asInstanceOf[js.Any])
    if (sizeLimit != null) __obj.updateDynamic("sizeLimit")(sizeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooserOptions]
  }
}

