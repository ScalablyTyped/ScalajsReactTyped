package typingsJapgolly.atStorybookApi.distStoreMod

import typingsJapgolly.atStorybookApi.atStorybookApiStrings.none
import typingsJapgolly.atStorybookApi.atStorybookApiStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var persistence: none | session | String
}

object Options {
  @scala.inline
  def apply(persistence: none | session | String): Options = {
    val __obj = js.Dynamic.literal(persistence = persistence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

