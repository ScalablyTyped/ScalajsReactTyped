package typingsJapgolly.mendixmodelsdk.microflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.Expression
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.restMod.rest.ConsumedODataService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.HttpConfiguration")
@js.native
class HttpConfiguration protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FHttpConfiguration: IModel = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def authenticationPassword(): String = js.native
  def authenticationPassword(newValue: String): js.Any = js.native
  def containerAsConsumedODataService(): ConsumedODataService = js.native
  def containerAsRestCallAction(): RestCallAction = js.native
  def containerAsWebServiceCallAction(): WebServiceCallAction = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def customLocation(): String = js.native
  def customLocation(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def customLocationModel(): Expression = js.native
  def customLocationModel(newValue: Expression): js.Any = js.native
  def customLocationTemplate(): js.Any = js.native
  def customLocationTemplate(newValue: StringTemplate): js.Any = js.native
  /**
    * In version 6.6.0: introduced
    */
  @JSName("customLocationTemplate")
  def customLocationTemplate_Union(): StringTemplate | Null = js.native
  def headerEntries(): IList[HttpHeaderEntry] = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def httpAuthenticationUserName(): String = js.native
  def httpAuthenticationUserName(newValue: String): js.Any = js.native
  /**
    * In version 7.7.0: deleted
    * In version 6.6.0: introduced
    */
  def httpMethod(): HttpMethod = js.native
  def httpMethod(newValue: HttpMethod): js.Any = js.native
  /**
    * In version 7.7.0: introduced
    */
  def newHttpMethod(): typingsJapgolly.mendixmodelsdk.servicesMod.services.HttpMethod = js.native
  def newHttpMethod(newValue: typingsJapgolly.mendixmodelsdk.servicesMod.services.HttpMethod): js.Any = js.native
  def overrideLocation(): Boolean = js.native
  def overrideLocation(newValue: Boolean): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def password(): Expression = js.native
  def password(newValue: Expression): js.Any = js.native
  def useAuthentication(): Boolean = js.native
  def useAuthentication(newValue: Boolean): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def username(): Expression = js.native
  def username(newValue: Expression): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.HttpConfiguration")
@js.native
object HttpConfiguration extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): HttpConfiguration = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.5.0
    */
  def createIn(container: WebServiceCallAction): HttpConfiguration = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInConsumedODataServiceUnderHttpConfiguration(container: ConsumedODataService): HttpConfiguration = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  def createInRestCallActionUnderHttpConfiguration(container: RestCallAction): HttpConfiguration = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  def createInWebServiceCallActionUnderHttpConfiguration(container: WebServiceCallAction): HttpConfiguration = js.native
}

