package typingsJapgolly.activedirectory2

import typingsJapgolly.activedirectory2.activedirectory2Strings.cn
import typingsJapgolly.activedirectory2.activedirectory2Strings.comment
import typingsJapgolly.activedirectory2.activedirectory2Strings.description
import typingsJapgolly.activedirectory2.activedirectory2Strings.displayName
import typingsJapgolly.activedirectory2.activedirectory2Strings.distinguishedName
import typingsJapgolly.activedirectory2.activedirectory2Strings.dn
import typingsJapgolly.activedirectory2.activedirectory2Strings.employeeID
import typingsJapgolly.activedirectory2.activedirectory2Strings.givenName
import typingsJapgolly.activedirectory2.activedirectory2Strings.initials
import typingsJapgolly.activedirectory2.activedirectory2Strings.lockoutTime
import typingsJapgolly.activedirectory2.activedirectory2Strings.mail
import typingsJapgolly.activedirectory2.activedirectory2Strings.objectCategory
import typingsJapgolly.activedirectory2.activedirectory2Strings.pwdLastSet
import typingsJapgolly.activedirectory2.activedirectory2Strings.sAMAccountName
import typingsJapgolly.activedirectory2.activedirectory2Strings.sn
import typingsJapgolly.activedirectory2.activedirectory2Strings.userAccountControl
import typingsJapgolly.activedirectory2.activedirectory2Strings.userPrincipalName
import typingsJapgolly.activedirectory2.activedirectory2Strings.whenCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroup extends js.Object {
  var group: js.Tuple5[dn, cn, description, distinguishedName, objectCategory]
  var user: js.Tuple17[
    dn, 
    distinguishedName, 
    userPrincipalName, 
    sAMAccountName, 
    mail, 
    lockoutTime, 
    whenCreated, 
    pwdLastSet, 
    userAccountControl, 
    employeeID, 
    sn, 
    givenName, 
    initials, 
    cn, 
    displayName, 
    comment, 
    description
  ]
}

object AnonGroup {
  @scala.inline
  def apply(
    group: js.Tuple5[dn, cn, description, distinguishedName, objectCategory],
    user: js.Tuple17[
      dn, 
      distinguishedName, 
      userPrincipalName, 
      sAMAccountName, 
      mail, 
      lockoutTime, 
      whenCreated, 
      pwdLastSet, 
      userAccountControl, 
      employeeID, 
      sn, 
      givenName, 
      initials, 
      cn, 
      displayName, 
      comment, 
      description
    ]
  ): AnonGroup = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGroup]
  }
}

