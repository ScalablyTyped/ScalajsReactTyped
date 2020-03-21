package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFNamedACLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamedACL extends js.Object {
  var AccessControlList: IAccessControlList
  val GUID: String
  var ID: Double
  var Name: String
  val NamedACLType: MFNamedACLType
  def Clone(): INamedACL
}

object INamedACL {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: CallbackTo[INamedACL],
    GUID: String,
    ID: Double,
    Name: String,
    NamedACLType: MFNamedACLType
  ): INamedACL = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamedACLType = NamedACLType.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[INamedACL]
  }
}

