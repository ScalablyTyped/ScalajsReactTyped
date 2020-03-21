package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.describeMod.Desc
import typingsJapgolly.baconjs.observableMod.Property
import typingsJapgolly.baconjs.typesMod.EventStreamDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/transformpropertychanges", JSImport.Namespace)
@js.native
object transformpropertychangesMod extends js.Object {
  def default[V](property: Property[V], f: EventStreamDelay[V], desc: Desc): Property[V] = js.native
}

