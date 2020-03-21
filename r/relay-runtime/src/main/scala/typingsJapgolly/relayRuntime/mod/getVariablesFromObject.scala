package typingsJapgolly.relayRuntime.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.readerNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getVariablesFromObject")
@js.native
object getVariablesFromObject extends js.Object {
  def apply(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): Variables = js.native
}

