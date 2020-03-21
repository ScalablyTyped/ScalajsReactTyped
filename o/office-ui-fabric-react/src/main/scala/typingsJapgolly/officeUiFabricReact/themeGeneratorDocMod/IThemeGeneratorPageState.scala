package typingsJapgolly.officeUiFabricReact.themeGeneratorDocMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.ithemerulesMod.IThemeRules
import typingsJapgolly.officeUiFabricReact.ithemeslotruleMod.IThemeSlotRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeGeneratorPageState extends js.Object {
  var colorPickerElement: HTMLElement | Null
  var colorPickerSlotRule: IThemeSlotRule | Null
  var colorPickerVisible: Boolean
  var themeRules: IThemeRules
}

object IThemeGeneratorPageState {
  @scala.inline
  def apply(
    colorPickerVisible: Boolean,
    themeRules: IThemeRules,
    colorPickerElement: HTMLElement = null,
    colorPickerSlotRule: IThemeSlotRule = null
  ): IThemeGeneratorPageState = {
    val __obj = js.Dynamic.literal(colorPickerVisible = colorPickerVisible.asInstanceOf[js.Any], themeRules = themeRules.asInstanceOf[js.Any])
    if (colorPickerElement != null) __obj.updateDynamic("colorPickerElement")(colorPickerElement.asInstanceOf[js.Any])
    if (colorPickerSlotRule != null) __obj.updateDynamic("colorPickerSlotRule")(colorPickerSlotRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeGeneratorPageState]
  }
}

