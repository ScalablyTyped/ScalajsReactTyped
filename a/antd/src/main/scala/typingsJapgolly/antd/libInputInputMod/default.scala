package typingsJapgolly.antd.libInputInputMod

import typingsJapgolly.antd.Anon_AddonAfter
import typingsJapgolly.antd.Anon_Type
import typingsJapgolly.antd.Anon_ValueArray
import typingsJapgolly.antd.TypeofClassPassword
import typingsJapgolly.antd.TypeofClassSearch
import typingsJapgolly.antd.TypeofClassTextArea
import typingsJapgolly.antd.libInputGroupMod.GroupProps
import typingsJapgolly.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/input/Input", JSImport.Default)
@js.native
class default protected () extends Input {
  def this(props: InputProps) = this()
}

/* static members */
@JSImport("antd/lib/input/Input", JSImport.Default)
@js.native
object default extends js.Object {
  var Group: StatelessComponent[GroupProps] = js.native
  var Password: TypeofClassPassword = js.native
  var Search: TypeofClassSearch = js.native
  var TextArea: TypeofClassTextArea = js.native
  var defaultProps: Anon_Type = js.native
  var propTypes: Anon_AddonAfter = js.native
  def getDerivedStateFromProps(nextProps: InputProps): Anon_ValueArray | Null = js.native
}

