package typingsJapgolly.protobufjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/cli/pbjs", JSImport.Namespace)
@js.native
object pbjsMod extends js.Object {
  def main(args: js.Array[String]): js.UndefOr[Double] = js.native
  def main(args: js.Array[String], callback: pbjsCallback): js.UndefOr[Double] = js.native
  type pbjsCallback = js.Function2[/* err */ js.Error | Null, /* output */ js.UndefOr[String], Unit]
}

