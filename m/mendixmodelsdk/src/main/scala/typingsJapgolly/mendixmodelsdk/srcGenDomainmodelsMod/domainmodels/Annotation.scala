package typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IPoint
import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ExportLevel
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
  * See: {@link https://docs.mendix.com/refguide/annotations relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Annotation")
@js.native
open class Annotation protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  
  def containerAsDomainModel: DomainModel = js.native
  
  /**
    * In version 9.15.0: introduced
    */
  def exportLevel: ExportLevel = js.native
  def exportLevel_=(newValue: ExportLevel): Unit = js.native
  
  def location: IPoint = js.native
  def location_=(newValue: IPoint): Unit = js.native
  
  def width: Double = js.native
  def width_=(newValue: Double): Unit = js.native
}
object Annotation {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Annotation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Annotation]
  
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * The new Annotation will be automatically stored in the 'annotations' property
    * of the parent DomainModel element passed as argument.
    */
  /* static member */
  inline def createIn(container: DomainModel): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Annotation]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Annotation.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Annotation.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
