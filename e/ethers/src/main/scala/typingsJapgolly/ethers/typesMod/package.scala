package typingsJapgolly.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Arrayish = java.lang.String | typingsJapgolly.std.ArrayLike[scala.Double]
  type BigNumberish = typingsJapgolly.ethers.typesMod.BigNumber | java.lang.String | scala.Double | typingsJapgolly.ethers.typesMod.Arrayish
  type BlockTag = java.lang.String | scala.Double
  type CoerceFunc = js.Function2[/* type */ java.lang.String, /* value */ js.Any, js.Any]
  type ContractFunction = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
  type EventType = java.lang.String | js.Array[java.lang.String] | typingsJapgolly.ethers.typesMod.Filter
  type Listener = js.Function1[/* repeated */ js.Any, scala.Unit]
  type Networkish = typingsJapgolly.ethers.typesMod.Network | java.lang.String | scala.Double
  type ProgressCallback = js.Function1[/* percent */ scala.Double, scala.Unit]
}
