package typingsJapgolly.fundamentalReact.localizationEditorMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.PartialLocalizationEditor
import typingsJapgolly.fundamentalReact.WeakValidationMapLocaliza
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.LocalizationEditor
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialLocalizationEditor] = js.native
  var displayName: js.UndefOr[LocalizationEditor | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapLocaliza] = js.native
  def apply(props: PropsWithChildren[LocalizationEditorProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[LocalizationEditorProps], context: js.Any): Element | Null = js.native
}

