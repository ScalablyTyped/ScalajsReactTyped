package typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenKafkaMod.kafka.ConsumedKafkaService
import typingsJapgolly.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/rest", "rest.MetadataReference")
@js.native
open class MetadataReference protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsConsumedKafkaService: ConsumedKafkaService = js.native
  
  def containerAsConsumedODataService: ConsumedODataService = js.native
  
  def containerAsMetadataReference: MetadataReference = js.native
  
  def metadata: String = js.native
  
  /**
    * In version 8.8.0: introduced
    */
  def metadataReferences: IList[MetadataReference] = js.native
  
  def metadata_=(newValue: String): Unit = js.native
  
  def uri: String = js.native
  def uri_=(newValue: String): Unit = js.native
}
object MetadataReference {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.MetadataReference")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): MetadataReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MetadataReference]
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * The new MetadataReference will be automatically stored in the 'metadataReferences' property
    * of the parent ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 to 8.7.0
    */
  /* static member */
  inline def createIn(container: ConsumedODataService): MetadataReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MetadataReference]
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * The new MetadataReference will be automatically stored in the 'metadataReferences' property
    * of the parent kafka.ConsumedKafkaService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.11.0 and higher
    */
  /* static member */
  inline def createInConsumedKafkaServiceUnderMetadataReferences(container: ConsumedKafkaService): MetadataReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConsumedKafkaServiceUnderMetadataReferences")(container.asInstanceOf[js.Any]).asInstanceOf[MetadataReference]
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * The new MetadataReference will be automatically stored in the 'metadataReferences' property
    * of the parent ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  inline def createInConsumedODataServiceUnderMetadataReferences(container: ConsumedODataService): MetadataReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConsumedODataServiceUnderMetadataReferences")(container.asInstanceOf[js.Any]).asInstanceOf[MetadataReference]
  
  /**
    * Creates and returns a new MetadataReference instance in the SDK and on the server.
    * The new MetadataReference will be automatically stored in the 'metadataReferences' property
    * of the parent MetadataReference element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  inline def createInMetadataReferenceUnderMetadataReferences(container: MetadataReference): MetadataReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMetadataReferenceUnderMetadataReferences")(container.asInstanceOf[js.Any]).asInstanceOf[MetadataReference]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.MetadataReference.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.MetadataReference.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
