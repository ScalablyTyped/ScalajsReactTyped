package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages

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

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.PageForSpecialization")
@js.native
open class PageForSpecialization protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageForSpecialization {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object PageForSpecialization {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.PageForSpecialization")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageForSpecialization instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageForSpecialization = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageForSpecialization]
  
  /**
    * Creates and returns a new PageForSpecialization instance in the SDK and on the server.
    * The new PageForSpecialization will be automatically stored in the 'pagesForSpecializations' property
    * of the parent GridEditButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  /* static member */
  inline def createInGridEditButtonUnderPagesForSpecializations(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridEditButton): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageForSpecialization = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridEditButtonUnderPagesForSpecializations")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageForSpecialization]
  
  /**
    * Creates and returns a new PageForSpecialization instance in the SDK and on the server.
    * The new PageForSpecialization will be automatically stored in the 'pagesForSpecializations' property
    * of the parent PageClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInPageClientActionUnderPagesForSpecializations(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageClientAction): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageForSpecialization = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageClientActionUnderPagesForSpecializations")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageForSpecialization]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.PageForSpecialization.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.PageForSpecialization.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
