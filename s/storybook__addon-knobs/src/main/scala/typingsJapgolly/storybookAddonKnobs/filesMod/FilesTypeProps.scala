package typingsJapgolly.storybookAddonKnobs.filesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesTypeProps extends KnobControlProps[DateTypeKnobValue] {
  @JSName("knob")
  var knob_FilesTypeProps: FileTypeKnob
}

object FilesTypeProps {
  @scala.inline
  def apply(knob: FileTypeKnob, onChange: DateTypeKnobValue => CallbackTo[DateTypeKnobValue]): FilesTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.filesMod.DateTypeKnobValue) => onChange(t0).runNow()))
    __obj.asInstanceOf[FilesTypeProps]
  }
}

