package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/page-templates relevant section in reference guide}
  *
  * In version 7.7.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.IFormBase because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ITemplateFormBase because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.IPageTemplate because var conflicts: containerAsFolderBase, displayName, documentationUrl, id, isLoaded, model, structureTypeName, templateCategory, templateCategoryWeight, unit. Inlined `type`, layoutCall, templateType */ @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageTemplate")
@js.native
open class PageTemplate protected () extends TemplateFormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  /**
    * In version 8.0.0: introduced
    */
  def appearance: Appearance = js.native
  def appearance_=(newValue: Appearance): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MPageTemplate: FolderBase = js.native
  
  /**
    * In version 7.17.0: added public
    */
  def layoutCall: LayoutCall = js.native
  def layoutCall_=(newValue: LayoutCall): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.17.0: added public
    */
  @JSName("layoutCall")
  val layoutCall_FPageTemplate: ILayoutCall = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.13.0: introduced
    */
  def templateType: TemplateType = js.native
  def templateType_=(newValue: TemplateType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.13.0: introduced
    */
  @JSName("templateType")
  val templateType_FPageTemplate: ITemplateType = js.native
  
  /**
    * In version 8.13.0: deleted
    * In version 7.17.0: added public
    */
  def `type`: PageTemplateType = js.native
  def type_=(newValue: PageTemplateType): Unit = js.native
  /**
    * In version 8.13.0: deleted
    * In version 7.17.0: added public
    */
  @JSName("type")
  val type_FPageTemplate: PageTemplateType = js.native
}
object PageTemplate {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PageTemplate unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): PageTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PageTemplate]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
