package typingsJapgolly.reduxPersist.persistReducerMod

import typingsJapgolly.reduxPersist.typesMod.PersistState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistPartial extends js.Object {
  var _persist: PersistState
}

object PersistPartial {
  @scala.inline
  def apply(_persist: PersistState): PersistPartial = {
    val __obj = js.Dynamic.literal(_persist = _persist.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PersistPartial]
  }
}

