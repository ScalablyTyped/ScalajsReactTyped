package typingsJapgolly.storybookAddonKnobs.optionsMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.storybookAddonKnobs.FnCall
import typingsJapgolly.storybookAddonKnobs.PartialOptionsTypePropsan
import typingsJapgolly.storybookAddonKnobs.WeakValidationMapOptionsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Options", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialOptionsTypePropsan] = js.native
  var deserialize: FnCall = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapOptionsT] = js.native
  var serialize: FnCall = js.native
  def apply(props: PropsWithChildren[OptionsTypeProps[_]]): Element | Null = js.native
  def apply(props: PropsWithChildren[OptionsTypeProps[_]], context: js.Any): Element | Null = js.native
}

