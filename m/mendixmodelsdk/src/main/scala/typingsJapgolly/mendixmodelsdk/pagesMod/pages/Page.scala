package typingsJapgolly.mendixmodelsdk.pagesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.securityMod.security.IModuleRole
import typingsJapgolly.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/page relevant section in reference guide}
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
- typingsJapgolly.mendixmodelsdk.pagesMod.pages.IPage because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined layoutCall, allowedRoles, allowedRolesQualifiedNames */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Page")
@js.native
class Page protected () extends FormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("allowedRolesQualifiedNames")
  val allowedRolesQualifiedNames_FPage: js.Array[String] = js.native
  /**
    * In version 7.23.0: added public
    */
  @JSName("allowedRoles")
  val allowedRoles_FPage: IList[IModuleRole] = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.17.0: added public
    */
  @JSName("layoutCall")
  val layoutCall_FPage: ILayoutCall = js.native
  @JSName("model")
  var model_FPage: IModel = js.native
  /**
    * In version 7.23.0: added public
    */
  def allowedRoles(): IList[IModuleRole] = js.native
  def allowedRolesQualifiedNames(): js.Array[String] = js.native
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
  def containerAsFolderBase_MPage(): FolderBase = js.native
  /**
    * In version 7.17.0: added public
    */
  def layoutCall(): LayoutCall = js.native
  def layoutCall(newValue: LayoutCall): js.Any = js.native
  def markAsUsed(): Boolean = js.native
  def markAsUsed(newValue: Boolean): js.Any = js.native
  /**
    * In version 6.7.0: introduced
    */
  def popupCloseAction(): String = js.native
  def popupCloseAction(newValue: String): js.Any = js.native
  def popupHeight(): Double = js.native
  def popupHeight(newValue: Double): js.Any = js.native
  def popupResizable(): Boolean = js.native
  def popupResizable(newValue: Boolean): js.Any = js.native
  def popupWidth(): Double = js.native
  def popupWidth(newValue: Double): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def style(): String = js.native
  def style(newValue: String): js.Any = js.native
  def title(): Text = js.native
  def title(newValue: Text): js.Any = js.native
  /**
    * In version 6.7.0: introduced
    */
  def url(): String = js.native
  def url(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Page")
@js.native
object Page extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Page unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Page = js.native
}

