package typingsJapgolly.mendixmodelsdk.srcGenCodeactionsMod.codeactions

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCodeactionsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.IImage
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.Microflow
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
  * In version 7.21.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenCodeactionsMod.codeactions.IMicroflowActionInfo because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeAction, containerAsMicroflow, caption, category, icon, iconQualifiedName, imageData */ @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.MicroflowActionInfo")
@js.native
open class MicroflowActionInfo protected () extends Element[IModel] {
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
  @JSName("caption")
  val caption_FMicroflowActionInfo: String = js.native
  
  def category: String = js.native
  def category_=(newValue: String): Unit = js.native
  @JSName("category")
  val category_FMicroflowActionInfo: String = js.native
  
  def containerAsCodeAction: CodeAction = js.native
  @JSName("containerAsCodeAction")
  val containerAsCodeAction_FMicroflowActionInfo: ICodeAction = js.native
  
  def containerAsMicroflow: Microflow = js.native
  @JSName("containerAsMicroflow")
  val containerAsMicroflow_FMicroflowActionInfo: IMicroflow = js.native
  
  /**
    * In version 9.10.0: deleted
    */
  def icon: IImage | Null = js.native
  
  /**
    * In version 9.10.0: introduced
    */
  def iconData: String | Null = js.native
  
  /**
    * In version 9.10.0: introduced
    */
  def iconDataDark: String | Null = js.native
  def iconDataDark_=(newValue: String | Null): Unit = js.native
  
  def iconData_=(newValue: String | Null): Unit = js.native
  
  def iconQualifiedName: String | Null = js.native
  @JSName("iconQualifiedName")
  val iconQualifiedName_FMicroflowActionInfo: String | Null = js.native
  
  def icon_=(newValue: IImage | Null): Unit = js.native
  /**
    * In version 9.10.0: deleted
    */
  @JSName("icon")
  val icon_FMicroflowActionInfo: IImage | Null = js.native
  
  /**
    * In version 9.6.0: introduced
    */
  def imageData: String | Null = js.native
  
  /**
    * In version 9.10.0: introduced
    */
  def imageDataDark: String | Null = js.native
  def imageDataDark_=(newValue: String | Null): Unit = js.native
  
  def imageData_=(newValue: String | Null): Unit = js.native
  /**
    * In version 9.6.0: introduced
    */
  @JSName("imageData")
  val imageData_FMicroflowActionInfo: String | Null = js.native
}
object MicroflowActionInfo {
  
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.MicroflowActionInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): MicroflowActionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MicroflowActionInfo]
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'modelerActionInfo' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  inline def createIn(container: CodeAction): MicroflowActionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowActionInfo]
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'modelerActionInfo' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInCodeActionUnderModelerActionInfo(container: CodeAction): MicroflowActionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCodeActionUnderModelerActionInfo")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowActionInfo]
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'microflowActionInfo' property
    * of the parent microflows.Microflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInMicroflowUnderMicroflowActionInfo(container: Microflow): MicroflowActionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowUnderMicroflowActionInfo")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowActionInfo]
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'workflowActionInfo' property
    * of the parent microflows.Microflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInMicroflowUnderWorkflowActionInfo(container: Microflow): MicroflowActionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowUnderWorkflowActionInfo")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowActionInfo]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.MicroflowActionInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.MicroflowActionInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
