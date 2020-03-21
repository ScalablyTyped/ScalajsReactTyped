package typingsJapgolly.reactJss

import typingsJapgolly.jss.mod.Jss
import typingsJapgolly.jss.mod.SheetsRegistry
import typingsJapgolly.jss.mod.StyleSheetFactoryOptions
import typingsJapgolly.reactJss.mod.Managers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisableStylesGeneration extends js.Object {
  var disableStylesGeneration: Boolean
  var jss: js.UndefOr[Jss] = js.undefined
  var managers: js.UndefOr[Managers] = js.undefined
  var registry: js.UndefOr[SheetsRegistry] = js.undefined
  var sheetOptions: StyleSheetFactoryOptions
}

object AnonDisableStylesGeneration {
  @scala.inline
  def apply(
    disableStylesGeneration: Boolean,
    sheetOptions: StyleSheetFactoryOptions,
    jss: Jss = null,
    managers: Managers = null,
    registry: SheetsRegistry = null
  ): AnonDisableStylesGeneration = {
    val __obj = js.Dynamic.literal(disableStylesGeneration = disableStylesGeneration.asInstanceOf[js.Any], sheetOptions = sheetOptions.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (managers != null) __obj.updateDynamic("managers")(managers.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisableStylesGeneration]
  }
}

