package typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.Expression
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.FormDataPart")
@js.native
open class FormDataPart protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsFormDataRequestHandling: FormDataRequestHandling = js.native
  
  /**
    * In version 9.2.0: introduced
    */
  def headerEntries: IList[HttpHeaderEntry] = js.native
  
  def key: String = js.native
  def key_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def value: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.8.0: deleted
    */
  def valueModel: Expression = js.native
  def valueModel_=(newValue: Expression): Unit = js.native
  
  def value_=(newValue: String): Unit = js.native
}
object FormDataPart {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.FormDataPart")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new FormDataPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): FormDataPart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[FormDataPart]
  
  /**
    * Creates and returns a new FormDataPart instance in the SDK and on the server.
    * The new FormDataPart will be automatically stored in the 'parts' property
    * of the parent FormDataRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createIn(container: FormDataRequestHandling): FormDataPart = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[FormDataPart]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.FormDataPart.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.FormDataPart.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
