package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.settings

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenSettingsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Settings`.
  */
/**
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "settings.ActionActivityDefaultColor")
@js.native
open class ActionActivityDefaultColor protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenSettingsMod.settings.ActionActivityDefaultColor {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ActionActivityDefaultColor {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "settings.ActionActivityDefaultColor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ActionActivityDefaultColor instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenSettingsMod.settings.ActionActivityDefaultColor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSettingsMod.settings.ActionActivityDefaultColor]
  
  /**
    * Creates and returns a new ActionActivityDefaultColor instance in the SDK and on the server.
    * The new ActionActivityDefaultColor will be automatically stored in the 'actionActivityDefaultColors' property
    * of the parent ModelerSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenSettingsMod.settings.ModelerSettings): typingsJapgolly.mendixmodelsdk.srcGenSettingsMod.settings.ActionActivityDefaultColor = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSettingsMod.settings.ActionActivityDefaultColor]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "settings.ActionActivityDefaultColor.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "settings.ActionActivityDefaultColor.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
