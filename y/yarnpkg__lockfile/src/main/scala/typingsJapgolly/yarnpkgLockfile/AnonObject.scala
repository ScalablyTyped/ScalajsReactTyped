package typingsJapgolly.yarnpkgLockfile

import typingsJapgolly.yarnpkgLockfile.yarnpkgLockfileStrings.conflict
import typingsJapgolly.yarnpkgLockfile.yarnpkgLockfileStrings.merge
import typingsJapgolly.yarnpkgLockfile.yarnpkgLockfileStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObject extends js.Object {
  var `object`: js.Any
  var `type`: success | merge | conflict
}

object AnonObject {
  @scala.inline
  def apply(`object`: js.Any, `type`: success | merge | conflict): AnonObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObject]
  }
}

