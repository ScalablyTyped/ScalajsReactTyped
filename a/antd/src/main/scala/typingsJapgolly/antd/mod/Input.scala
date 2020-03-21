package typingsJapgolly.antd.mod

import typingsJapgolly.antd.AnonType
import typingsJapgolly.antd.PartialInputState
import typingsJapgolly.antd.TypeofPassword
import typingsJapgolly.antd.TypeofSearch
import typingsJapgolly.antd.TypeofTextArea
import typingsJapgolly.antd.inputGroupMod.GroupProps
import typingsJapgolly.antd.inputInputMod.InputProps
import typingsJapgolly.antd.inputInputMod.InputState
import typingsJapgolly.antd.inputMod.default
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Input")
@js.native
class Input protected () extends default {
  def this(props: InputProps) = this()
}

/* static members */
@JSImport("antd", "Input")
@js.native
object Input extends js.Object {
  var Group: StatelessComponent[GroupProps] = js.native
  var Password: TypeofPassword = js.native
  var Search: TypeofSearch = js.native
  var TextArea: TypeofTextArea = js.native
  var defaultProps: AnonType = js.native
  def getDerivedStateFromProps(nextProps: InputProps, hasPrevValue: InputState): PartialInputState = js.native
}

