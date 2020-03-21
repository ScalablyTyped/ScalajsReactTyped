package typingsJapgolly.storybookAddonKnobs

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsStrings.`object`
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsStrings.array
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsStrings.boolean
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsStrings.button
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsStrings.color
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsStrings.date
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsStrings.files
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsStrings.number
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsStrings.options
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsStrings.radios
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsStrings.select
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  def getKnobControl(
    `type`: number | boolean | `object` | color | button | select | text | date | options | radios | array | files
  ): KnobControlType = js.native
  @js.native
  object default extends js.Object {
    var array: TypeofArrayType = js.native
    var boolean: FunctionComponentBooleanT = js.native
    var button: FunctionComponentButtonTy = js.native
    var color: TypeofColorType = js.native
    var date: TypeofDateType = js.native
    var files: FunctionComponentFilesTyp = js.native
    var number: TypeofNumberType = js.native
    var `object`: TypeofObjectType = js.native
    var options: FunctionComponentOptionsT = js.native
    var radios: TypeofRadiosType = js.native
    var select: FunctionComponentSelectTy = js.native
    var text: TypeofTextType = js.native
  }
  
  type KnobControlType = ComponentType[_] with AnonDeserialize
  type KnobType = String
}

