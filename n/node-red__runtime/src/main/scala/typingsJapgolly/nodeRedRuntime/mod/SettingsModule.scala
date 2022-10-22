package typingsJapgolly.nodeRedRuntime.mod

import typingsJapgolly.nodeRedRuntime.anon.Comment
import typingsJapgolly.nodeRedRuntime.anon.IdReqUser
import typingsJapgolly.nodeRedRuntime.anon.Settings
import typingsJapgolly.nodeRedRuntime.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsModule extends StObject {
  
  /**
    * Generates a new ssh key pair
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.name - the id of the key to return
    * @param opts.password - (optional) the password for the key pair
    * @param opts.comment - (option) a comment to associate with the key pair
    * @param opts.size - (optional) the size of the key. Default: 2048
    * @param opts.req - the request to log (optional)
    * @returns the id of the generated key
    */
  def generateUserKey(opts: Comment): js.Promise[String]
  
  /**
    * Gets the runtime settings object
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.req - the request to log (optional)
    * @returns the runtime settings
    */
  def getRuntimeSettings(opts: `1`): js.Promise[js.Object]
  
  /**
    * Gets a user's ssh public key
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the key to return
    * @param opts.req - the request to log (optional)
    * @returns the user's ssh public key
    */
  def getUserKey(opts: IdReqUser): js.Promise[String]
  
  /**
    * Gets a list of a user's ssh keys
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.req - the request to log (optional)
    * @returns the user's ssh keys
    */
  def getUserKeys(opts: `1`): js.Promise[js.Object]
  
  /**
    * Gets an individual user's settings object
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.req - the request to log (optional)
    * @returns the user settings
    */
  def getUserSettings(opts: `1`): js.Promise[js.Object]
  
  /**
    * Deletes a user's ssh key pair
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the key to delete
    * @param opts.req - the request to log (optional)
    * @returns resolves when deleted
    */
  def removeUserKey(opts: IdReqUser): js.Promise[Unit]
  
  /**
    * Updates an individual user's settings object.
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.settings - the updates to the user settings
    * @param opts.req - the request to log (optional)
    * @returns the user settings
    */
  def updateUserSettings(opts: Settings): js.Promise[js.Object]
}
object SettingsModule {
  
  inline def apply(
    generateUserKey: Comment => js.Promise[String],
    getRuntimeSettings: `1` => js.Promise[js.Object],
    getUserKey: IdReqUser => js.Promise[String],
    getUserKeys: `1` => js.Promise[js.Object],
    getUserSettings: `1` => js.Promise[js.Object],
    removeUserKey: IdReqUser => js.Promise[Unit],
    updateUserSettings: Settings => js.Promise[js.Object]
  ): SettingsModule = {
    val __obj = js.Dynamic.literal(generateUserKey = js.Any.fromFunction1(generateUserKey), getRuntimeSettings = js.Any.fromFunction1(getRuntimeSettings), getUserKey = js.Any.fromFunction1(getUserKey), getUserKeys = js.Any.fromFunction1(getUserKeys), getUserSettings = js.Any.fromFunction1(getUserSettings), removeUserKey = js.Any.fromFunction1(removeUserKey), updateUserSettings = js.Any.fromFunction1(updateUserSettings))
    __obj.asInstanceOf[SettingsModule]
  }
  
  extension [Self <: SettingsModule](x: Self) {
    
    inline def setGenerateUserKey(value: Comment => js.Promise[String]): Self = StObject.set(x, "generateUserKey", js.Any.fromFunction1(value))
    
    inline def setGetRuntimeSettings(value: `1` => js.Promise[js.Object]): Self = StObject.set(x, "getRuntimeSettings", js.Any.fromFunction1(value))
    
    inline def setGetUserKey(value: IdReqUser => js.Promise[String]): Self = StObject.set(x, "getUserKey", js.Any.fromFunction1(value))
    
    inline def setGetUserKeys(value: `1` => js.Promise[js.Object]): Self = StObject.set(x, "getUserKeys", js.Any.fromFunction1(value))
    
    inline def setGetUserSettings(value: `1` => js.Promise[js.Object]): Self = StObject.set(x, "getUserSettings", js.Any.fromFunction1(value))
    
    inline def setRemoveUserKey(value: IdReqUser => js.Promise[Unit]): Self = StObject.set(x, "removeUserKey", js.Any.fromFunction1(value))
    
    inline def setUpdateUserSettings(value: Settings => js.Promise[js.Object]): Self = StObject.set(x, "updateUserSettings", js.Any.fromFunction1(value))
  }
}
