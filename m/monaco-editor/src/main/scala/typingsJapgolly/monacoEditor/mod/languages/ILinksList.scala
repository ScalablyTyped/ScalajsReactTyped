package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinksList extends js.Object {
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var links: js.Array[ILink]
}

object ILinksList {
  @scala.inline
  def apply(links: js.Array[ILink], dispose: js.UndefOr[Callback] = js.undefined): ILinksList = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    dispose.foreach(p => __obj.updateDynamic("dispose")(p.toJsFn))
    __obj.asInstanceOf[ILinksList]
  }
}

