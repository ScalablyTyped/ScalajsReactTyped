package typingsJapgolly.antd.antdMod

import typingsJapgolly.antd.Anon_AddonAfter
import typingsJapgolly.antd.Anon_Type
import typingsJapgolly.antd.Anon_ValueArray
import typingsJapgolly.antd.TypeofClassPassword
import typingsJapgolly.antd.TypeofClassSearch
import typingsJapgolly.antd.TypeofClassTextArea
import typingsJapgolly.antd.libInputGroupMod.GroupProps
import typingsJapgolly.antd.libInputInputMod.InputProps
import typingsJapgolly.antd.libInputMod.default
import typingsJapgolly.react.reactMod.StatelessComponent
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
  var Password: TypeofClassPassword = js.native
  var Search: TypeofClassSearch = js.native
  var TextArea: TypeofClassTextArea = js.native
  var defaultProps: Anon_Type = js.native
  var propTypes: Anon_AddonAfter = js.native
  def getDerivedStateFromProps(nextProps: InputProps): Anon_ValueArray | Null = js.native
}

