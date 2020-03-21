package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.observableMod.EventStream
import typingsJapgolly.baconjs.observableMod.Property
import typingsJapgolly.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/holdwhen", JSImport.Namespace)
@js.native
object holdwhenMod extends js.Object {
  def holdWhen[V](src: default[V], valve: Property[Boolean]): EventStream[V] = js.native
}

