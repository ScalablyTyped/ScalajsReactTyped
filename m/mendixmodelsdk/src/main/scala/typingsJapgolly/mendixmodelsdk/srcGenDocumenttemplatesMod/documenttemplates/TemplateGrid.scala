package typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/template-grid-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.TemplateGrid")
@js.native
open class TemplateGrid protected () extends Grid {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def evenRowsContents: TemplateGridContents | Null = js.native
  def evenRowsContents_=(newValue: TemplateGridContents | Null): Unit = js.native
  
  def numberOfColumns: Double = js.native
  def numberOfColumns_=(newValue: Double): Unit = js.native
  
  def oddRowsContents: TemplateGridContents = js.native
  def oddRowsContents_=(newValue: TemplateGridContents): Unit = js.native
}
object TemplateGrid {
  
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.TemplateGrid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): TemplateGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[TemplateGrid]
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  inline def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): TemplateGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateUnderToplevels")(container.asInstanceOf[js.Any]).asInstanceOf[TemplateGrid]
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  /* static member */
  inline def createInDropZoneUnderWidget(container: DropZone): TemplateGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropZoneUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[TemplateGrid]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.TemplateGrid.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.TemplateGrid.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
