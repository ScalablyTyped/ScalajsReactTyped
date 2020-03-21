package typingsJapgolly.bip174

import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/shared/checkPubkey", JSImport.Namespace)
@js.native
object checkPubkeyMod extends js.Object {
  def makeChecker(pubkeyTypes: js.Array[Double]): js.Function1[/* keyVal */ KeyValue, js.UndefOr[Buffer]] = js.native
}

