package typingsJapgolly.node

import typingsJapgolly.node.dnsMod.RecordWithTtl
import typingsJapgolly.node.dnsMod.ResolveOptions
import typingsJapgolly.node.dnsMod.ResolveWithTtlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Hostname extends js.Object {
  def apply(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | java.lang.String]] = js.native
  def apply(hostname: java.lang.String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
}

