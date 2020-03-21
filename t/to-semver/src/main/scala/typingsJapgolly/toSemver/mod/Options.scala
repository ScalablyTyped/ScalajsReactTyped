package typingsJapgolly.toSemver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Clean versions. For example `v1.3.0` → `1.3.0`.
  		@default true
  		*/
  val clean: js.UndefOr[Boolean] = js.undefined
  /**
  		Include prereleases, like `1.2.3-alpha.3`.
  		@default true
  		*/
  val includePrereleases: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(clean: js.UndefOr[Boolean] = js.undefined, includePrereleases: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (!js.isUndefined(includePrereleases)) __obj.updateDynamic("includePrereleases")(includePrereleases.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

