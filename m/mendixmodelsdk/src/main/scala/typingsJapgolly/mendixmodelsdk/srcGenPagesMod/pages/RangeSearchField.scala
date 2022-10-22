package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/search-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.RangeSearchField")
@js.native
open class RangeSearchField protected () extends SearchField {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def includeLower: Boolean = js.native
  def includeLower_=(newValue: Boolean): Unit = js.native
  
  def includeUpper: Boolean = js.native
  def includeUpper_=(newValue: Boolean): Unit = js.native
  
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def lowerBound: String = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def lowerBoundRef: AttributeRef | Null = js.native
  def lowerBoundRef_=(newValue: AttributeRef | Null): Unit = js.native
  
  def lowerBound_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def upperBound: String = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def upperBoundRef: AttributeRef | Null = js.native
  def upperBoundRef_=(newValue: AttributeRef | Null): Unit = js.native
  
  def upperBound_=(newValue: String): Unit = js.native
}
object RangeSearchField {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.RangeSearchField")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RangeSearchField instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): RangeSearchField = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[RangeSearchField]
  
  /**
    * Creates and returns a new RangeSearchField instance in the SDK and on the server.
    * The new RangeSearchField will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  /* static member */
  inline def createIn(container: ControlBar): RangeSearchField = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[RangeSearchField]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.RangeSearchField.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.RangeSearchField.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
