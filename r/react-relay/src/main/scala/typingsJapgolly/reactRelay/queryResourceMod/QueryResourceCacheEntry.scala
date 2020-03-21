package typingsJapgolly.reactRelay.queryResourceMod

import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResourceCacheEntry extends js.Object {
  val cacheKey: String = js.native
  def getRetainCount(): Double = js.native
  def getValue(): js.Error | js.Promise[Unit] | QueryResult = js.native
  def permanentRetain(environment: Environment): Disposable = js.native
  def setValue(value: js.Promise[Unit]): Unit = js.native
  def setValue(value: QueryResult): Unit = js.native
  def setValue(value: Error): Unit = js.native
  def temporaryRetain(environment: Environment): Unit = js.native
}

