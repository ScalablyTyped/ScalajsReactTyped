package typingsJapgolly.jqueryAjaxfile.AjaxFileJQuery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jqueryAjaxfile.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAjaxFileJQueryExtension extends js.Object {
  def ajaxWithFile(jqueryOption: IJQueryOption): JQueryDeferred[_]
}

object IAjaxFileJQueryExtension {
  @scala.inline
  def apply(ajaxWithFile: IJQueryOption => CallbackTo[JQueryDeferred[js.Any]]): IAjaxFileJQueryExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ajaxWithFile")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryAjaxfile.AjaxFileJQuery.IJQueryOption) => ajaxWithFile(t0).runNow()))
    __obj.asInstanceOf[IAjaxFileJQueryExtension]
  }
}

