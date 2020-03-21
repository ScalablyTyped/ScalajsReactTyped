package typingsJapgolly.keyvMongo.mod

import typingsJapgolly.keyv.mod.Store
import typingsJapgolly.keyvMongo.keyvMongoBooleans.`false`
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyvMongo[TValue]
  extends EventEmitter
     with Store[TValue] {
  var namespace: js.UndefOr[String] = js.native
  val ttlSupport: `false` = js.native
}

