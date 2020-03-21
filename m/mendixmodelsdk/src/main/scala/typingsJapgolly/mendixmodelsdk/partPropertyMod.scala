package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.elementsMod.Element
import typingsJapgolly.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsJapgolly.mendixmodelsdk.unitsMod.ModelUnit
import typingsJapgolly.mobx.observablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/PartProperty", JSImport.Namespace)
@js.native
object partPropertyMod extends js.Object {
  @js.native
  class PartProperty[T /* <: Element */] () extends AbstractProperty[T | Null, IObservableValue[T | Null]] {
    var hasDefaultValue: Boolean = js.native
    @JSName("parent")
    var parent_PartProperty: AbstractElement = js.native
    def detachValue(): Unit = js.native
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    def updateElementContainer(unit: ModelUnit): Unit = js.native
    def updateWithRawValue(): Unit = js.native
    def updateWithRawValue(value: IAbstractElementJson): Unit = js.native
  }
  
}

