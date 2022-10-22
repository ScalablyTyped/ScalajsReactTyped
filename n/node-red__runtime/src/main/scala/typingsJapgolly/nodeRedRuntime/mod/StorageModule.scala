package typingsJapgolly.nodeRedRuntime.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeRedRuntime.anon.CredentialsDirty
import typingsJapgolly.nodeRedRuntime.anon.CredentialsFlows
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageModule extends StObject {
  
  def getFlows(): js.Promise[CredentialsFlows]
  
  def getLibraryEntry(`type`: String, path: String): js.Promise[String | js.Array[String]]
  
  def getSessions(): js.Promise[js.Object | Null]
  
  def getSettings(): js.Promise[js.Object | Null]
  
  def init(runtime: InternalRuntimeAPI): Unit
  
  def saveCredentials(credentials: js.Object): js.Promise[Unit]
  
  def saveFlows(config: CredentialsDirty): js.Promise[Unit]
  
  def saveLibraryEntry(`type`: String, path: String, meta: Record[String, String], body: String): js.Promise[Unit]
  
  def saveSessions(sessions: js.Object): js.Promise[Unit]
  
  def saveSettings(settings: js.Object): js.Promise[Unit]
}
object StorageModule {
  
  inline def apply(
    getFlows: CallbackTo[js.Promise[CredentialsFlows]],
    getLibraryEntry: (String, String) => js.Promise[String | js.Array[String]],
    getSessions: CallbackTo[js.Promise[js.Object | Null]],
    getSettings: CallbackTo[js.Promise[js.Object | Null]],
    init: InternalRuntimeAPI => Callback,
    saveCredentials: js.Object => js.Promise[Unit],
    saveFlows: CredentialsDirty => js.Promise[Unit],
    saveLibraryEntry: (String, String, Record[String, String], String) => js.Promise[Unit],
    saveSessions: js.Object => js.Promise[Unit],
    saveSettings: js.Object => js.Promise[Unit]
  ): StorageModule = {
    val __obj = js.Dynamic.literal(getFlows = getFlows.toJsFn, getLibraryEntry = js.Any.fromFunction2(getLibraryEntry), getSessions = getSessions.toJsFn, getSettings = getSettings.toJsFn, init = js.Any.fromFunction1((t0: InternalRuntimeAPI) => init(t0).runNow()), saveCredentials = js.Any.fromFunction1(saveCredentials), saveFlows = js.Any.fromFunction1(saveFlows), saveLibraryEntry = js.Any.fromFunction4(saveLibraryEntry), saveSessions = js.Any.fromFunction1(saveSessions), saveSettings = js.Any.fromFunction1(saveSettings))
    __obj.asInstanceOf[StorageModule]
  }
  
  extension [Self <: StorageModule](x: Self) {
    
    inline def setGetFlows(value: CallbackTo[js.Promise[CredentialsFlows]]): Self = StObject.set(x, "getFlows", value.toJsFn)
    
    inline def setGetLibraryEntry(value: (String, String) => js.Promise[String | js.Array[String]]): Self = StObject.set(x, "getLibraryEntry", js.Any.fromFunction2(value))
    
    inline def setGetSessions(value: CallbackTo[js.Promise[js.Object | Null]]): Self = StObject.set(x, "getSessions", value.toJsFn)
    
    inline def setGetSettings(value: CallbackTo[js.Promise[js.Object | Null]]): Self = StObject.set(x, "getSettings", value.toJsFn)
    
    inline def setInit(value: InternalRuntimeAPI => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: InternalRuntimeAPI) => value(t0).runNow()))
    
    inline def setSaveCredentials(value: js.Object => js.Promise[Unit]): Self = StObject.set(x, "saveCredentials", js.Any.fromFunction1(value))
    
    inline def setSaveFlows(value: CredentialsDirty => js.Promise[Unit]): Self = StObject.set(x, "saveFlows", js.Any.fromFunction1(value))
    
    inline def setSaveLibraryEntry(value: (String, String, Record[String, String], String) => js.Promise[Unit]): Self = StObject.set(x, "saveLibraryEntry", js.Any.fromFunction4(value))
    
    inline def setSaveSessions(value: js.Object => js.Promise[Unit]): Self = StObject.set(x, "saveSessions", js.Any.fromFunction1(value))
    
    inline def setSaveSettings(value: js.Object => js.Promise[Unit]): Self = StObject.set(x, "saveSettings", js.Any.fromFunction1(value))
  }
}
