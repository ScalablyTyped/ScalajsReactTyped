package typingsJapgolly.bip174.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtGlobalUpdate extends js.Object {
  var globalXpub: js.UndefOr[js.Array[GlobalXpub]] = js.undefined
}

object PsbtGlobalUpdate {
  @scala.inline
  def apply(globalXpub: js.Array[GlobalXpub] = null): PsbtGlobalUpdate = {
    val __obj = js.Dynamic.literal()
    if (globalXpub != null) __obj.updateDynamic("globalXpub")(globalXpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtGlobalUpdate]
  }
}

