package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.storybookAddonKnobs.filesMod.FilesTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> & {serialize (): undefined, deserialize (): undefined} */
@js.native
trait FunctionComponentFilesTyp extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialFilesTypeProps] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapFilesTyp] = js.native
  def apply(props: PropsWithChildren[FilesTypeProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[FilesTypeProps], context: js.Any): Element | Null = js.native
  def deserialize(): js.UndefOr[scala.Nothing] = js.native
  def serialize(): js.UndefOr[scala.Nothing] = js.native
}

