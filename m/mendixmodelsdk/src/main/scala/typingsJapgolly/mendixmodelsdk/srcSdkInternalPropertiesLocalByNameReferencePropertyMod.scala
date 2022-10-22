package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typingsJapgolly.mendixmodelsdk.srcSdkUtilsMod.utils.IMap
import typingsJapgolly.mobx.distTypesObservablevalueMod.IObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesLocalByNameReferencePropertyMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty", "LocalByNameReferenceProperty")
  @js.native
  open class LocalByNameReferenceProperty[T /* <: INamedElement */] protected () extends AbstractProperty[T | Null, IObservableValue[String | Null]] {
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
    
    def deepCopyInto(clone: Structure[IAbstractModel, IContainer | Null]): Unit = js.native
    def deepCopyInto(
      clone: Structure[IAbstractModel, IContainer | Null],
      idMap: Unit,
      unresolvedIdentifierFixers: js.Array[
          js.Function1[/* idMap */ IMap[Structure[IAbstractModel, IContainer | Null]], Unit]
        ]
    ): Unit = js.native
    def deepCopyInto(
      clone: Structure[IAbstractModel, IContainer | Null],
      idMap: IMap[Structure[IAbstractModel, IContainer | Null]]
    ): Unit = js.native
    
    def localName(): String | Null = js.native
    
    @JSName("parent")
    var parent_LocalByNameReferenceProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    
    def targetType: String = js.native
    
    def updateWithRawValue(value: String): Unit = js.native
  }
  
  inline def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean]
  
  @js.native
  trait INamedElement
    extends StObject
       with IElement {
    
    var name: String = js.native
  }
}
