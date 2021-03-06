package typingsJapgolly.rocksdb.mod.RocksDB

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.abstractLeveldown.mod.AbstractOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutOptions extends AbstractOptions {
  var sync: js.UndefOr[Boolean] = js.undefined
}

object PutOptions {
  @scala.inline
  def apply(StringDictionary: StringDictionary[js.Any] = null, sync: js.UndefOr[Boolean] = js.undefined): PutOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOptions]
  }
}

