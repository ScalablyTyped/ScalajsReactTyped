package typingsJapgolly.inquirer

import typingsJapgolly.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inquirer/lib/utils/readline", JSImport.Namespace)
@js.native
object readlineMod extends js.Object {
  def clearLine(readLine: Interface, count: Double): Unit = js.native
  def down(readLine: Interface, count: Double): Unit = js.native
  def left(readLine: Interface, count: Double): Unit = js.native
  def right(readLine: Interface, count: Double): Unit = js.native
  def up(readLine: Interface, count: Double): Unit = js.native
}

