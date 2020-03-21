package typingsJapgolly.relayRuntime.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.readerNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getDataIDsFromObject")
@js.native
object getDataIDsFromObject extends js.Object {
  def apply(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[DataID | js.Array[DataID]] = js.native
}

