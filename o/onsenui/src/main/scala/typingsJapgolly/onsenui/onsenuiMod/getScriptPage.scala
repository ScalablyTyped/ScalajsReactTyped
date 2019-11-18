package typingsJapgolly.onsenui.onsenuiMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("onsenui", "getScriptPage")
@js.native
object getScriptPage extends js.Object {
  /**
    * @description Access the last created page from the current `script` scope. Only works inside `<script></script>` tags that are direct children of `ons-page` element. Use this to add lifecycle hooks to a page.
    * @return Returns the corresponding page element.
    */
  def apply(): HTMLElement | Null = js.native
}

