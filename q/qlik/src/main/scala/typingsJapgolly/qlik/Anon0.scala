package typingsJapgolly.qlik

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.qlik.mod.CustomProperty
import typingsJapgolly.qlik.qlikStrings.settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var items: js.UndefOr[StringDictionary[CustomProperty]] = js.undefined
  var uses: settings
}

object Anon0 {
  @scala.inline
  def apply(uses: settings, items: StringDictionary[CustomProperty] = null): Anon0 = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

