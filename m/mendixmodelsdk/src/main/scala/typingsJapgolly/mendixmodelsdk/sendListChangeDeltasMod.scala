package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mobx.observablearrayMod.IArrayWillChange
import typingsJapgolly.mobx.observablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/sendListChangeDeltas", JSImport.Namespace)
@js.native
object sendListChangeDeltasMod extends js.Object {
  def sendListChangeDeltas[T, P](
    property: (AbstractProperty[js.Array[T], IList[P]]) with AnonToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (AbstractProperty[js.Array[T], IList[P]]) with AnonToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
}

