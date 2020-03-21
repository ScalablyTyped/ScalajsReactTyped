package typingsJapgolly.lusca.mod

import typingsJapgolly.lusca.AnonName
import typingsJapgolly.lusca.AnonOptions
import typingsJapgolly.lusca.luscaBooleans.`false`
import typingsJapgolly.lusca.luscaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.lusca.mod.csrfOptionsAngular
  - typingsJapgolly.lusca.mod.csrfOptionsNonAngular
*/
trait csrfOptionsAngularOrNonAngular extends js.Object

object csrfOptionsAngularOrNonAngular {
  @scala.inline
  def csrfOptionsAngular(angular: `true`, cookie: String | AnonOptions = null): csrfOptionsAngularOrNonAngular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngularOrNonAngular]
  }
  @scala.inline
  def csrfOptionsNonAngular(angular: `false` = null, cookie: String | AnonName = null): csrfOptionsAngularOrNonAngular = {
    val __obj = js.Dynamic.literal()
    if (angular != null) __obj.updateDynamic("angular")(angular.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsAngularOrNonAngular]
  }
}

