package typingsJapgolly.asana.mod

import typingsJapgolly.asana.mod.^
import typingsJapgolly.asana.mod.auth.App
import typingsJapgolly.asana.mod.auth.OauthAuthenticatorOptions
import typingsJapgolly.asana.mod.resources.Attachments
import typingsJapgolly.asana.mod.resources.CustomFields
import typingsJapgolly.asana.mod.resources.Events
import typingsJapgolly.asana.mod.resources.Projects
import typingsJapgolly.asana.mod.resources.Sections
import typingsJapgolly.asana.mod.resources.Stories
import typingsJapgolly.asana.mod.resources.Tags
import typingsJapgolly.asana.mod.resources.Tasks
import typingsJapgolly.asana.mod.resources.Teams
import typingsJapgolly.asana.mod.resources.Typeahead
import typingsJapgolly.asana.mod.resources.UserTaskLists
import typingsJapgolly.asana.mod.resources.Users
import typingsJapgolly.asana.mod.resources.Webhooks
import typingsJapgolly.asana.mod.resources.Workspaces
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends StObject {
  
  /**
    * Store off Oauth info.
    */
  var app: App = js.native
  
  /**
    * An instance of the Attachments resource.
    * @type {Attachments}
    */
  var attachments: Attachments = js.native
  
  /**
    * Ensures the client is authorized to make requests. Kicks off the
    * configured Oauth flow, if any.
    *
    * @returns {Promise<Client>} A promise that resolves to this client when
    *     authorization is complete.
    */
  def authorize(): typingsJapgolly.bluebird.mod.^[Client] = js.native
  
  /**
    * An instance of the CustomFields resource.
    * @type {CustomFields}
    */
  var customFields: CustomFields = js.native
  
  /**
    * The internal dispatcher. This is mostly used by the resources but provided
    * for custom requests to the API or API features that have not yet been added
    * to the client.
    * @type {Dispatcher}
    */
  var dispatcher: Dispatcher = js.native
  
  /**
    * An instance of the Events resource.
    * @type {Events}
    */
  var events: Events = js.native
  
  /**
    * An instance of the Projects resource.
    * @type {Projects}
    */
  var projects: Projects = js.native
  
  /**
    * An instance of the Sections resource.
    * @type {Sections}
    */
  var sections: Sections = js.native
  
  /**
    * An instance of the Stories resource.
    * @type {Stories}
    */
  var stories: Stories = js.native
  
  /**
    * An instance of the Tags resource.
    * @type {Tags}
    */
  var tags: Tags = js.native
  
  /**
    * An instance of the Tasks resource.
    * @type {Tasks}
    */
  var tasks: Tasks = js.native
  
  /**
    * An instance of the Teams resource.
    * @type {Teams}
    */
  var teams: Teams = js.native
  
  /**
    * An instance of the Typeahead resource.
    * @type {Typeahead}
    */
  var typeahead: Typeahead = js.native
  
  /**
    * Configure the client to authenticate using a Personal Access Token.
    * @param  {String} accessToken The Personal Access Token to use for
    * authenticating requests.
    * @return {Client}             this
    * @param accessToken
    * @return
    */
  def useAccessToken(accessToken: String): this.type = js.native
  
  /**
    * Configure the Client to use a user's API Key and then authenticate
    * through HTTP Basic Authentication. This should only be done for testing,
    * as requests using Oauth can provide more security, higher rate limits, and
    * more features.
    * @param  {String} apiKey The Asana Api Key of the user
    * @return {Client}        this
    * @param apiKey
    * @return
    */
  def useBasicAuth(apiKey: String): this.type = js.native
  
  /**
    * Configure the client to authenticate via Oauth. Credentials can be
    * supplied, or they can be obtained by running an Oauth flow.
    * @param  {Object} options Options for Oauth. Includes any options for
    *     the selected flow.
    * @option {Function} [flowType]  Type of OauthFlow to use to obtain user
    *     authorization. Defaults to autodetect based on environment.
    * @option {Object} [credentials] Credentials to use; no flow required to
    *     obtain authorization. This object should at a minimum contain an
    *     `access_token` string field.
    * @return {Client} this
    * @param options
    * @return
    */
  def useOauth(): this.type = js.native
  def useOauth(options: OauthAuthenticatorOptions): this.type = js.native
  
  /**
    * An instance of the UserTaskLists resource.
    * @type {UserTaskLists}
    */
  var userTaskLists: UserTaskLists = js.native
  
  /**
    * An instance of the Users resource.
    * @type {Users}
    */
  var users: Users = js.native
  
  /**
    * An instance of the Webhooks resource.
    * @type {Webhooks}
    */
  var webhooks: Webhooks = js.native
  
  /**
    * An instance of the Workspaces resource.
    * @type {Workspaces}
    */
  var workspaces: Workspaces = js.native
}
object Client {
  
  inline def apply: ClientStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("Client").asInstanceOf[ClientStatic]
}
