package typingsJapgolly.mendixmodelsdk.internalMod

import typingsJapgolly.mendixmodelsdk.AnonToRawChangeValue
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mobx.observablearrayMod.IArrayWillChange
import typingsJapgolly.mobx.observablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "sendListChangeDeltas")
@js.native
object sendListChangeDeltas extends js.Object {
  def apply[T, P](
    property: (typingsJapgolly.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with AnonToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def apply[T, P](
    property: (typingsJapgolly.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with AnonToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
}

