package typingsJapgolly.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamOptions extends js.Object {
  var `match`: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ _
    ])
  ] = js.undefined
  var once: js.UndefOr[Boolean] = js.undefined
}

object StreamOptions {
  @scala.inline
  def apply(
    `match`: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ _
    ]) = null,
    once: js.UndefOr[Boolean] = js.undefined
  ): StreamOptions = {
    val __obj = js.Dynamic.literal()
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamOptions]
  }
}

