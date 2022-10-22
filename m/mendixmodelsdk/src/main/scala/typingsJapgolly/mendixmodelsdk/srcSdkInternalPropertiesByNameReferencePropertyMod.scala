package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mobx.distTypesObservablevalueMod.IObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesByNameReferencePropertyMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/ByNameReferenceProperty", "ByNameReferenceListProperty")
  @js.native
  open class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends AbstractProperty[js.Array[T], IList[String]] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
    
    @JSName("parent")
    var parent_ByNameReferenceListProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def qualifiedNames(): js.Array[String] = js.native
    
    def targetType: String = js.native
    
    def updateWithRawValue(value: js.Array[String]): Unit = js.native
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/ByNameReferenceProperty", "ByNameReferenceProperty")
  @js.native
  open class ByNameReferenceProperty[T /* <: IAbstractElement */] protected () extends AbstractProperty[T | Null, IObservableValue[String | Null]] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
    
    @JSName("parent")
    var parent_ByNameReferenceProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def qualifiedName(): String | Null = js.native
    
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    
    def targetType: String = js.native
    
    def updateWithRawValue(value: String): Unit = js.native
  }
}
