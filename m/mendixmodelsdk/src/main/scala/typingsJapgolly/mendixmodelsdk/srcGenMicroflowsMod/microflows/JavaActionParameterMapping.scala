package typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.IJavaActionParameter
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaActionParameterMapping")
@js.native
open class JavaActionParameterMapping protected () extends CodeActionParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 6.7.0: deleted
    */
  def argument: String = js.native
  def argument_=(newValue: String): Unit = js.native
  
  def parameter: IJavaActionParameter = js.native
  
  def parameterQualifiedName: String = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def parameterValue: CodeActionParameterValue = js.native
  def parameterValue_=(newValue: CodeActionParameterValue): Unit = js.native
  
  def parameter_=(newValue: IJavaActionParameter): Unit = js.native
  
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  def value: JavaActionParameterValue = js.native
  def value_=(newValue: JavaActionParameterValue): Unit = js.native
}
object JavaActionParameterMapping {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaActionParameterMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new JavaActionParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): JavaActionParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[JavaActionParameterMapping]
  
  /**
    * Creates and returns a new JavaActionParameterMapping instance in the SDK and on the server.
    * The new JavaActionParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent JavaActionCallAction element passed as argument.
    */
  /* static member */
  inline def createIn(container: JavaActionCallAction): JavaActionParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[JavaActionParameterMapping]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaActionParameterMapping.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaActionParameterMapping.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
