package typingsJapgolly.mendixmodelsdk.pagesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.pagesMod.pages.ILayoutContent because Already inherited
- typingsJapgolly.mendixmodelsdk.pagesMod.pages.INativeLayoutContent because var conflicts: containerAsLayout, id, isLoaded, model, structureTypeName, unit. Inlined layoutType */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NativeLayoutContent")
@js.native
class NativeLayoutContent protected () extends LayoutContent {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 8.5.0: introduced
    */
  @JSName("layoutType")
  val layoutType_FNativeLayoutContent: NativeLayoutType = js.native
  @JSName("model")
  var model_FNativeLayoutContent: IModel = js.native
  @JSName("containerAsLayout")
  def containerAsLayout_MNativeLayoutContent(): Layout = js.native
  /**
    * In version 8.5.0: introduced
    */
  def layoutType(): NativeLayoutType = js.native
  def layoutType(newValue: NativeLayoutType): js.Any = js.native
  def rightHeaderPlaceholder(): js.Any = js.native
  def rightHeaderPlaceholder(newValue: Placeholder): js.Any = js.native
  @JSName("rightHeaderPlaceholder")
  def rightHeaderPlaceholder_Union(): Placeholder | Null = js.native
  /**
    * In version 8.2.0: introduced
    */
  def showBottomBar(): Boolean = js.native
  def showBottomBar(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.5.0: introduced
    */
  def sidebar(): Boolean = js.native
  def sidebar(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.5.0: introduced
    */
  def sidebarWidgets(): IList[Widget] = js.native
  def widgets(): IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NativeLayoutContent")
@js.native
object NativeLayoutContent extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NativeLayoutContent instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NativeLayoutContent = js.native
  /**
    * Creates and returns a new NativeLayoutContent instance in the SDK and on the server.
    * The new NativeLayoutContent will be automatically stored in the 'content' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: Layout): NativeLayoutContent = js.native
}

