package typingsJapgolly.mendixmodelsdk.pagesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/page-template relevant section in reference guide}
  *
  * In version 7.7.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.pagesMod.pages.IFormBase because Already inherited
- typingsJapgolly.mendixmodelsdk.pagesMod.pages.ITemplateFormBase because Already inherited
- typingsJapgolly.mendixmodelsdk.pagesMod.pages.IPageTemplate because var conflicts: containerAsFolderBase, displayName, documentationUrl, id, isLoaded, model, structureTypeName, unit. Inlined `type`, layoutCall */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageTemplate")
@js.native
class PageTemplate protected () extends TemplateFormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.17.0: added public
    */
  @JSName("layoutCall")
  val layoutCall_FPageTemplate: ILayoutCall = js.native
  @JSName("model")
  var model_FPageTemplate: IModel = js.native
  /**
    * In version 7.17.0: added public
    */
  @JSName("type")
  val type_FPageTemplate: PageTemplateType = js.native
  /**
    * In version 8.0.0: introduced
    */
  def appearance(): Appearance = js.native
  def appearance(newValue: Appearance): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def `class`(): String = js.native
  def `class`(newValue: String): js.Any = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MPageTemplate(): FolderBase = js.native
  /**
    * In version 7.17.0: added public
    */
  def layoutCall(): LayoutCall = js.native
  def layoutCall(newValue: LayoutCall): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def style(): String = js.native
  def style(newValue: String): js.Any = js.native
  /**
    * In version 7.17.0: added public
    */
  def `type`(): PageTemplateType = js.native
  def `type`(newValue: PageTemplateType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageTemplate")
@js.native
object PageTemplate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new PageTemplate unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): PageTemplate = js.native
}

