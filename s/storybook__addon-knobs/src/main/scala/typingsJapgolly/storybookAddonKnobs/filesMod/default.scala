package typingsJapgolly.storybookAddonKnobs.filesMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.storybookAddonKnobs.PartialFilesTypeProps
import typingsJapgolly.storybookAddonKnobs.WeakValidationMapFilesTyp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Files", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialFilesTypeProps] = js.native
  var deserialize: js.Function0[js.UndefOr[scala.Nothing]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapFilesTyp] = js.native
  var serialize: js.Function0[js.UndefOr[scala.Nothing]] = js.native
  def apply(props: PropsWithChildren[FilesTypeProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[FilesTypeProps], context: js.Any): Element | Null = js.native
}

