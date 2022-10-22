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
  * See: {@link https://docs.mendix.com/refguide/control-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.GridSearchButton")
@js.native
open class GridSearchButton protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages.GridSearchButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object GridSearchButton {
  
  @JSImport("mendixmodelsdk", "pages.GridSearchButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSearchButton = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSearchButton]
  
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * The new GridSearchButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ControlBar): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSearchButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSearchButton]
  
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * The new GridSearchButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  /* static member */
  inline def createInControlBarUnderItems(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ControlBar): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSearchButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarUnderItems")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSearchButton]
  
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * The new GridSearchButton will be automatically stored in the 'searchButton' property
    * of the parent GridControlBar element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInGridControlBarUnderSearchButton(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridControlBar): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSearchButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridControlBarUnderSearchButton")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSearchButton]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSearchButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSearchButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
