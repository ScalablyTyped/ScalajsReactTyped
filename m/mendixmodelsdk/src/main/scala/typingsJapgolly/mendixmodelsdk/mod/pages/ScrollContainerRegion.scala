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

@JSImport("mendixmodelsdk", "pages.ScrollContainerRegion")
@js.native
open class ScrollContainerRegion protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages.ScrollContainerRegion {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ScrollContainerRegion {
  
  @JSImport("mendixmodelsdk", "pages.ScrollContainerRegion")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'bottom' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  inline def createInScrollContainerUnderBottom(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainer): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderBottom")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'center' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  inline def createInScrollContainerUnderCenter(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainer): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderCenter")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'left' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  inline def createInScrollContainerUnderLeft(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainer): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderLeft")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'right' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  inline def createInScrollContainerUnderRight(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainer): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderRight")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'top' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  inline def createInScrollContainerUnderTop(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainer): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderTop")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ScrollContainerRegion.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ScrollContainerRegion.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
