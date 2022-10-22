package typingsJapgolly.postmanCollection.mod

import typingsJapgolly.postmanCollection.anon.Key
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typingsJapgolly.postmanCollection.mod.PropertyDefinition because Already inherited
- typingsJapgolly.postmanCollection.mod.RequestAuthDefinition because var conflicts: description, disabled, id, name. Inlined `type`, oauth2, hawk, basic, oauth1, apikey, digest, bearer, awsv4, edgegrid, ntlm */ @JSImport("postman-collection", "RequestAuth")
@js.native
open class RequestAuth protected () extends Property[RequestAuthDefinition] {
  def this(options: RequestAuthDefinition) = this()
  def this(options: RequestAuthDefinition, parent: Property[PropertyDefinition]) = this()
  def this(options: RequestAuthDefinition, parent: PropertyList[RequestAuth]) = this()
  
  var apikey: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var awsv4: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var basic: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var bearer: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  def clear(`type`: String): Unit = js.native
  
  def current(): Any = js.native
  
  var digest: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var edgegrid: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var hawk: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var ntlm: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var oauth1: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var oauth2: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  def parameters(): VariableList = js.native
  
  var `type`: js.UndefOr[
    (NonNullable[
      js.UndefOr[
        oauth2 | hawk | noauth | basic | oauth1 | apikey | digest | bearer | awsv4 | edgegrid | ntlm
      ]
    ]) | apikey | awsv4 | basic | bearer | digest | edgegrid | hawk | noauth | ntlm | oauth1 | oauth2
  ] = js.native
  
  def update(options: js.Array[Key]): Unit = js.native
  def update(options: js.Array[Key], `type`: String): Unit = js.native
  def update(options: Key): Unit = js.native
  def update(options: Key, `type`: String): Unit = js.native
  def update(options: VariableList): Unit = js.native
  def update(options: VariableList, `type`: String): Unit = js.native
  
  def use(`type`: String, options: js.Array[Key]): Unit = js.native
  def use(`type`: String, options: Key): Unit = js.native
  def use(`type`: String, options: VariableList): Unit = js.native
}
/* static members */
object RequestAuth {
  
  @JSImport("postman-collection", "RequestAuth")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidType(`type`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
