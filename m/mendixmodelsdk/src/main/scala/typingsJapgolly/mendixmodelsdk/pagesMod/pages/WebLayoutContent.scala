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
- typingsJapgolly.mendixmodelsdk.pagesMod.pages.IWebLayoutContent because var conflicts: containerAsLayout, id, isLoaded, model, structureTypeName, unit. Inlined layoutType, layoutCall */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.WebLayoutContent")
@js.native
class WebLayoutContent protected () extends LayoutContent {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("layoutCall")
  val layoutCall_FWebLayoutContent: ILayoutCall | Null = js.native
  @JSName("layoutType")
  val layoutType_FWebLayoutContent: LayoutType = js.native
  @JSName("model")
  var model_FWebLayoutContent: IModel = js.native
  @JSName("containerAsLayout")
  def containerAsLayout_MWebLayoutContent(): Layout = js.native
  def layoutCall(): js.Any = js.native
  def layoutCall(newValue: LayoutCall): js.Any = js.native
  @JSName("layoutCall")
  def layoutCall_Union(): LayoutCall | Null = js.native
  def layoutType(): LayoutType = js.native
  def layoutType(newValue: LayoutType): js.Any = js.native
  def widgets(): IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.WebLayoutContent")
@js.native
object WebLayoutContent extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WebLayoutContent instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WebLayoutContent = js.native
  /**
    * Creates and returns a new WebLayoutContent instance in the SDK and on the server.
    * The new WebLayoutContent will be automatically stored in the 'content' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: Layout): WebLayoutContent = js.native
}

