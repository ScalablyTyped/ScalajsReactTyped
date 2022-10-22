package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
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
  * In version 8.4.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.PageVariable")
@js.native
open class PageVariable protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object PageVariable {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.PageVariable")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderSourceVariable(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidget): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent MicroflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  /* static member */
  inline def createInMicroflowParameterMappingUnderVariable(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowParameterMapping): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent NanoflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  /* static member */
  inline def createInNanoflowParameterMappingUnderVariable(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.NanoflowParameterMapping): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNanoflowParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent PageParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.7.0 and higher
    */
  /* static member */
  inline def createInPageParameterMappingUnderVariable(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageParameterMapping): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderSourceVariable(container: WidgetValue): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.PageVariable.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.PageVariable.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
