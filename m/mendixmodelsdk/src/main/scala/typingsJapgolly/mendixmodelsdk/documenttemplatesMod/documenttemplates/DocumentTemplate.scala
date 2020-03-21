package typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.Document
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/document-templates relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.IDocumentTemplate because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DocumentTemplate")
@js.native
class DocumentTemplate protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FDocumentTemplate: IModel = js.native
  def canvasWidth(): Double = js.native
  def canvasWidth(newValue: Double): js.Any = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MDocumentTemplate(): FolderBase = js.native
  def footer(): js.Any = js.native
  def footer(newValue: Footer): js.Any = js.native
  @JSName("footer")
  def footer_Union(): Footer | Null = js.native
  def header(): js.Any = js.native
  def header(newValue: Header): js.Any = js.native
  @JSName("header")
  def header_Union(): Header | Null = js.native
  def marginBottomInInch(): Double = js.native
  def marginBottomInInch(newValue: Double): js.Any = js.native
  def marginLeftInInch(): Double = js.native
  def marginLeftInInch(newValue: Double): js.Any = js.native
  def marginRightInInch(): Double = js.native
  def marginRightInInch(newValue: Double): js.Any = js.native
  def marginTopInInch(): Double = js.native
  def marginTopInInch(newValue: Double): js.Any = js.native
  def pageHeight(): String = js.native
  def pageHeight(newValue: String): js.Any = js.native
  def pageWidth(): String = js.native
  def pageWidth(newValue: String): js.Any = js.native
  def ppi(): Double = js.native
  def ppi(newValue: Double): js.Any = js.native
  def showHeaderAndFooterOnFirstPage(): Boolean = js.native
  def showHeaderAndFooterOnFirstPage(newValue: Boolean): js.Any = js.native
  def style(): Style = js.native
  def style(newValue: Style): js.Any = js.native
  def toplevels(): IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DocumentTemplate")
@js.native
object DocumentTemplate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new DocumentTemplate unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): DocumentTemplate = js.native
}

