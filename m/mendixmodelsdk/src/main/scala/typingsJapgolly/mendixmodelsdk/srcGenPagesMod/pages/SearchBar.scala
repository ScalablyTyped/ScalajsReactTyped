package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

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
  * See: {@link https://docs.mendix.com/refguide/search-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchBar")
@js.native
open class SearchBar protected () extends ControlBar {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def `type`: SearchBarTypeEnum = js.native
  def type_=(newValue: SearchBarTypeEnum): Unit = js.native
  
  def waitForSearch: Boolean = js.native
  def waitForSearch_=(newValue: Boolean): Unit = js.native
}
object SearchBar {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SearchBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): SearchBar = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[SearchBar]
  
  /**
    * Creates and returns a new SearchBar instance in the SDK and on the server.
    * The new SearchBar will be automatically stored in the 'searchBar' property
    * of the parent GridBaseSource element passed as argument.
    */
  /* static member */
  inline def createInGridBaseSourceUnderSearchBar(container: GridBaseSource): SearchBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridBaseSourceUnderSearchBar")(container.asInstanceOf[js.Any]).asInstanceOf[SearchBar]
  
  /**
    * Creates and returns a new SearchBar instance in the SDK and on the server.
    * The new SearchBar will be automatically stored in the 'searchBar' property
    * of the parent GridDatabaseSource element passed as argument.
    */
  /* static member */
  inline def createInGridDatabaseSourceUnderSearchBar(container: GridDatabaseSource): SearchBar = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridDatabaseSourceUnderSearchBar")(container.asInstanceOf[js.Any]).asInstanceOf[SearchBar]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchBar.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchBar.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
