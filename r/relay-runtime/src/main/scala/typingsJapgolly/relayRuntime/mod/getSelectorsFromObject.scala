package typingsJapgolly.relayRuntime.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.readerNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.relayStoreTypesMod.ReaderSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getSelectorsFromObject")
@js.native
object getSelectorsFromObject extends js.Object {
  def apply(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[ReaderSelector] = js.native
}

