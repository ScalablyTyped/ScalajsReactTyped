package typingsJapgolly.expo

import typingsJapgolly.expoConstants.constantsTypesMod.AppManifest
import typingsJapgolly.fbemitter.mod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/Updates/Updates", JSImport.Namespace)
@js.native
object updatesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expo.AnonIsAvailable
    - typingsJapgolly.expo.AnonManifest
  */
  trait UpdateCheckResult extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expo.Anon0
    - typingsJapgolly.expo.AnonManifestType
    - typingsJapgolly.expo.AnonMessage
  */
  trait UpdateEvent extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expo.AnonIsNew
    - typingsJapgolly.expo.AnonIsNewManifest
  */
  trait UpdateFetchResult extends js.Object
  
  def addListener(listener: js.Function): EventSubscription = js.native
  def checkForUpdateAsync(): js.Promise[UpdateCheckResult] = js.native
  def clearUpdateCacheExperimentalAsync(abiVersion: String): js.Promise[Unit] = js.native
  def fetchUpdateAsync(): js.Promise[UpdateFetchResult] = js.native
  def fetchUpdateAsync(hasEventListener: AnonEventListener): js.Promise[UpdateFetchResult] = js.native
  def reload(): js.Promise[Unit] = js.native
  def reloadFromCache(): js.Promise[Unit] = js.native
  @js.native
  object EventType extends js.Object {
    var DOWNLOAD_FINISHED: String = js.native
    var DOWNLOAD_PROGRESS: String = js.native
    var DOWNLOAD_STARTED: String = js.native
    var ERROR: String = js.native
    var NO_UPDATE_AVAILABLE: String = js.native
  }
  
  type Manifest = AppManifest
  type UpdateEventListener = js.Function1[/* event */ UpdateEvent, Unit]
}

