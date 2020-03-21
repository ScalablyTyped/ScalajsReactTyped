package typingsJapgolly.postmanCollection.mod

import typingsJapgolly.postmanCollection.AnonKey
import typingsJapgolly.postmanCollection.postmanCollectionStrings.apikey
import typingsJapgolly.postmanCollection.postmanCollectionStrings.awsv4
import typingsJapgolly.postmanCollection.postmanCollectionStrings.basic
import typingsJapgolly.postmanCollection.postmanCollectionStrings.bearer
import typingsJapgolly.postmanCollection.postmanCollectionStrings.digest
import typingsJapgolly.postmanCollection.postmanCollectionStrings.edgegrid
import typingsJapgolly.postmanCollection.postmanCollectionStrings.hawk
import typingsJapgolly.postmanCollection.postmanCollectionStrings.noauth
import typingsJapgolly.postmanCollection.postmanCollectionStrings.ntlm
import typingsJapgolly.postmanCollection.postmanCollectionStrings.oauth1
import typingsJapgolly.postmanCollection.postmanCollectionStrings.oauth2
import typingsJapgolly.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typingsJapgolly.postmanCollection.mod.PropertyDefinition because Already inherited
- typingsJapgolly.postmanCollection.mod.RequestAuthDefinition because var conflicts: description, disabled, id, name. Inlined `type`, oauth2, hawk, basic, oauth1, apikey, digest, bearer, awsv4, edgegrid, ntlm */ @JSImport("postman-collection", "RequestAuth")
@js.native
class RequestAuth protected () extends Property[RequestAuthDefinition] {
  def this(options: RequestAuthDefinition) = this()
  def this(options: RequestAuthDefinition, parent: Property[PropertyDefinition]) = this()
  def this(options: RequestAuthDefinition, parent: PropertyList[RequestAuth]) = this()
  var apikey: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var awsv4: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var basic: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var bearer: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var digest: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var edgegrid: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var hawk: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var ntlm: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var oauth1: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var oauth2: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var `type`: js.UndefOr[
    (NonNullable[
      js.UndefOr[
        oauth2 | hawk | noauth | basic | oauth1 | apikey | digest | bearer | awsv4 | edgegrid | ntlm
      ]
    ]) | apikey | awsv4 | basic | bearer | digest | edgegrid | hawk | noauth | ntlm | oauth1 | oauth2
  ] = js.native
  def clear(`type`: String): Unit = js.native
  def current(): js.Any = js.native
  def parameters(): VariableList = js.native
  def update(options: js.Array[AnonKey]): Unit = js.native
  def update(options: js.Array[AnonKey], `type`: String): Unit = js.native
  def update(options: AnonKey): Unit = js.native
  def update(options: AnonKey, `type`: String): Unit = js.native
  def update(options: VariableList): Unit = js.native
  def update(options: VariableList, `type`: String): Unit = js.native
  def use(`type`: String, options: js.Array[AnonKey]): Unit = js.native
  def use(`type`: String, options: AnonKey): Unit = js.native
  def use(`type`: String, options: VariableList): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "RequestAuth")
@js.native
object RequestAuth extends js.Object {
  def isValidType(`type`: js.Any): Boolean = js.native
}

