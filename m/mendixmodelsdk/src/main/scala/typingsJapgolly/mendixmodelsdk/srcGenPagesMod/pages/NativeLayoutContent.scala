package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ILayoutContent because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.INativeLayoutContent because var conflicts: containerAsLayout, id, isLoaded, model, structureTypeName, unit. Inlined layoutType */ @JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeLayoutContent")
@js.native
open class NativeLayoutContent protected () extends LayoutContent {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsLayout")
  def containerAsLayout_MNativeLayoutContent: Layout = js.native
  
  /**
    * In version 8.5.0: introduced
    */
  def layoutType: NativeLayoutType = js.native
  def layoutType_=(newValue: NativeLayoutType): Unit = js.native
  /**
    * In version 8.5.0: introduced
    */
  @JSName("layoutType")
  val layoutType_FNativeLayoutContent: NativeLayoutType = js.native
  
  def rightHeaderPlaceholder: Placeholder | Null = js.native
  def rightHeaderPlaceholder_=(newValue: Placeholder | Null): Unit = js.native
  
  /**
    * In version 8.2.0: introduced
    */
  def showBottomBar: Boolean = js.native
  def showBottomBar_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.5.0: introduced
    */
  def sidebar: Boolean = js.native
  
  /**
    * In version 8.5.0: introduced
    */
  def sidebarWidgets: IList[Widget] = js.native
  
  def sidebar_=(newValue: Boolean): Unit = js.native
  
  def widgets: IList[Widget] = js.native
}
object NativeLayoutContent {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeLayoutContent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new NativeLayoutContent instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): NativeLayoutContent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[NativeLayoutContent]
  
  /**
    * Creates and returns a new NativeLayoutContent instance in the SDK and on the server.
    * The new NativeLayoutContent will be automatically stored in the 'content' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createIn(container: Layout): NativeLayoutContent = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[NativeLayoutContent]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeLayoutContent.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeLayoutContent.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
