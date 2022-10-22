package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IAbstractElementJson
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit
import typingsJapgolly.mobx.distTypesObservablevalueMod.IObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesPartPropertyMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/PartProperty", "PartProperty")
  @js.native
  open class PartProperty[T /* <: Element[IAbstractModel] */] protected () extends AbstractProperty[T | Null, IObservableValue[T | Null]] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: Any*
    ) = this()
    
    def detachValue(): Unit = js.native
    
    var hasDefaultValue: Boolean = js.native
    
    @JSName("parent")
    var parent_PartProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    
    def updateElementContainer(unit: ModelUnit[IAbstractModel]): Unit = js.native
    
    def updateWithRawValue(): Unit = js.native
    def updateWithRawValue(value: IAbstractElementJson): Unit = js.native
  }
}
