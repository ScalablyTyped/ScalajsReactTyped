package typingsJapgolly.rmcTabs.modelsMod.Models

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabData
  extends /** for user's custom extends */
/* key */ StringDictionary[js.Any] {
  var key: js.UndefOr[String] = js.undefined
  var title: Node
}

object TabData {
  @scala.inline
  def apply(
    StringDictionary: /** for user's custom extends */
  /* key */ StringDictionary[js.Any] = null,
    key: String = null,
    title: VdomNode = null
  ): TabData = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabData]
  }
}

