package typingsJapgolly.mongodbMemoryServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull
  - typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest
  - typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1
  - typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger
*/
trait StorageEngineT extends js.Object

object StorageEngineT {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def devnull: typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull = this.cast("devnull")
  @scala.inline
  def ephemeralForTest: typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest = this.cast("ephemeralForTest")
  @scala.inline
  def mmapv1: typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1 = this.cast("mmapv1")
  @scala.inline
  def wiredTiger: typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger = this.cast("wiredTiger")
}

