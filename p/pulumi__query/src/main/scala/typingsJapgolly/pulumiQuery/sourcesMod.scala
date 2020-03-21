package typingsJapgolly.pulumiQuery

import typingsJapgolly.pulumiQuery.interfacesMod.AsyncIterableIterator
import typingsJapgolly.pulumiQuery.interfacesMod.AsyncQuerySource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/query/sources", JSImport.Namespace)
@js.native
object sourcesMod extends js.Object {
  def from[TSource](source: AsyncQuerySource[TSource]): AsyncIterableIterator[TSource] = js.native
  def range(start: Double): AsyncIterableIterator[Double] = js.native
  def range(start: Double, end: Double): AsyncIterableIterator[Double] = js.native
}

