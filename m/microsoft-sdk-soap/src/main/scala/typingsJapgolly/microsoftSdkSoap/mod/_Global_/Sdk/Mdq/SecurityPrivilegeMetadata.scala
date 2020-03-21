package typingsJapgolly.microsoftSdkSoap.mod._Global_.Sdk.Mdq

import typingsJapgolly.microsoftSdkSoap.microsoftSdkSoapStrings.Append
import typingsJapgolly.microsoftSdkSoap.microsoftSdkSoapStrings.AppendTo
import typingsJapgolly.microsoftSdkSoap.microsoftSdkSoapStrings.Assign
import typingsJapgolly.microsoftSdkSoap.microsoftSdkSoapStrings.Create
import typingsJapgolly.microsoftSdkSoap.microsoftSdkSoapStrings.Delete
import typingsJapgolly.microsoftSdkSoap.microsoftSdkSoapStrings.None
import typingsJapgolly.microsoftSdkSoap.microsoftSdkSoapStrings.Read
import typingsJapgolly.microsoftSdkSoap.microsoftSdkSoapStrings.Share
import typingsJapgolly.microsoftSdkSoap.microsoftSdkSoapStrings.Write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityPrivilegeMetadata extends js.Object {
  var CanBeBasic: Boolean
  var CanBeDeep: Boolean
  var CanBeEntityReference: Boolean
  var CanBeGlobal: Boolean
  var CanBeLocal: Boolean
  var CanBeParentEntityReference: Boolean
  var ExtensionData: Boolean
  var Name: String
  var PrivilegeId: String
  var PrivilegeType: Append | AppendTo | Assign | Create | Delete | None | Read | Share | Write
}

object SecurityPrivilegeMetadata {
  @scala.inline
  def apply(
    CanBeBasic: Boolean,
    CanBeDeep: Boolean,
    CanBeEntityReference: Boolean,
    CanBeGlobal: Boolean,
    CanBeLocal: Boolean,
    CanBeParentEntityReference: Boolean,
    ExtensionData: Boolean,
    Name: String,
    PrivilegeId: String,
    PrivilegeType: Append | AppendTo | Assign | Create | Delete | None | Read | Share | Write
  ): SecurityPrivilegeMetadata = {
    val __obj = js.Dynamic.literal(CanBeBasic = CanBeBasic.asInstanceOf[js.Any], CanBeDeep = CanBeDeep.asInstanceOf[js.Any], CanBeEntityReference = CanBeEntityReference.asInstanceOf[js.Any], CanBeGlobal = CanBeGlobal.asInstanceOf[js.Any], CanBeLocal = CanBeLocal.asInstanceOf[js.Any], CanBeParentEntityReference = CanBeParentEntityReference.asInstanceOf[js.Any], ExtensionData = ExtensionData.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PrivilegeId = PrivilegeId.asInstanceOf[js.Any], PrivilegeType = PrivilegeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecurityPrivilegeMetadata]
  }
}

