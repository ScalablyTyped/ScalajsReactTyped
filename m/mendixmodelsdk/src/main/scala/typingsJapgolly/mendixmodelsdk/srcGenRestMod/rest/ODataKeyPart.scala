package typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeType
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAttributeType
import typingsJapgolly.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.9.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.IODataKeyPart because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsODataKey, `type` */ @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataKeyPart")
@js.native
open class ODataKeyPart protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsODataKey: ODataKey = js.native
  @JSName("containerAsODataKey")
  val containerAsODataKey_FODataKeyPart: IODataKey = js.native
  
  def entityKeyPartName: String = js.native
  def entityKeyPartName_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.16.0: introduced
    */
  def filterable: Boolean = js.native
  def filterable_=(newValue: Boolean): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.9.0: introduced
    */
  def remoteType: String = js.native
  def remoteType_=(newValue: String): Unit = js.native
  
  def `type`: AttributeType = js.native
  def type_=(newValue: AttributeType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("type")
  val type_FODataKeyPart: IAttributeType = js.native
}
object ODataKeyPart {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataKeyPart")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ODataKeyPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ODataKeyPart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ODataKeyPart]
  
  /**
    * Creates and returns a new ODataKeyPart instance in the SDK and on the server.
    * The new ODataKeyPart will be automatically stored in the 'parts' property
    * of the parent ODataKey element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  inline def createIn(container: ODataKey): ODataKeyPart = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ODataKeyPart]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataKeyPart.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataKeyPart.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
