package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
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
  * See: {@link https://docs.mendix.com/refguide/sort-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.GridSortBar")
@js.native
open class GridSortBar protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages.GridSortBar {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object GridSortBar {
  
  @JSImport("mendixmodelsdk", "pages.GridSortBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar]
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent DropDownSearchField element passed as argument.
    */
  /* static member */
  inline def createInDropDownSearchFieldUnderSortBar(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DropDownSearchField): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropDownSearchFieldUnderSortBar")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar]
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorDatabaseSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.2.0 and higher
    */
  /* static member */
  inline def createInSelectorDatabaseSourceUnderSortBar(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SelectorDatabaseSource): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorDatabaseSourceUnderSortBar")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar]
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorXPathSource element passed as argument.
    */
  /* static member */
  inline def createInSelectorXPathSourceUnderSortBar(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SelectorXPathSource): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorXPathSourceUnderSortBar")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar]
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SortableEntityPathSource element passed as argument.
    */
  /* static member */
  inline def createInSortableEntityPathSourceUnderSortBar(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SortableEntityPathSource): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSortableEntityPathSourceUnderSortBar")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSortBar]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSortBar.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSortBar.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
