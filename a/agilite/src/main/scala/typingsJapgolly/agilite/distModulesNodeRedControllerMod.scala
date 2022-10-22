package typingsJapgolly.agilite

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.agilite.distAgiliteInterfaceMod.ConfigInterface
import typingsJapgolly.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModulesNodeRedControllerMod {
  
  @JSImport("agilite/dist/modules/node-red/controller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NodeRED {
    def this(config: ConfigInterface) = this()
    
    /* CompleteClass */
    var apiKey: String = js.native
    
    /* CompleteClass */
    var apiServerUrl: String = js.native
    
    /* CompleteClass */
    override def getCredentials(): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /* CompleteClass */
    override def getFlowData(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /* CompleteClass */
    override def getFlows(): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /* CompleteClass */
    override def getSessions(): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /* CompleteClass */
    override def getSettings(): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /* CompleteClass */
    override def saveCredentials(data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /* CompleteClass */
    override def saveFlows(data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /* CompleteClass */
    override def saveSessions(data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /* CompleteClass */
    override def saveSettings(data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    /* CompleteClass */
    var teamId: String = js.native
  }
  
  trait NodeRED extends StObject {
    
    var apiKey: String
    
    var apiServerUrl: String
    
    def getCredentials(): js.Promise[AxiosResponse[Any, Any]]
    
    def getFlowData(profileKey: String): js.Promise[AxiosResponse[Any, Any]]
    
    def getFlows(): js.Promise[AxiosResponse[Any, Any]]
    
    def getSessions(): js.Promise[AxiosResponse[Any, Any]]
    
    def getSettings(): js.Promise[AxiosResponse[Any, Any]]
    
    def saveCredentials(data: Any): js.Promise[AxiosResponse[Any, Any]]
    
    def saveFlows(data: Any): js.Promise[AxiosResponse[Any, Any]]
    
    def saveSessions(data: Any): js.Promise[AxiosResponse[Any, Any]]
    
    def saveSettings(data: Any): js.Promise[AxiosResponse[Any, Any]]
    
    var teamId: String
  }
  object NodeRED {
    
    inline def apply(
      apiKey: String,
      apiServerUrl: String,
      getCredentials: CallbackTo[js.Promise[AxiosResponse[Any, Any]]],
      getFlowData: String => js.Promise[AxiosResponse[Any, Any]],
      getFlows: CallbackTo[js.Promise[AxiosResponse[Any, Any]]],
      getSessions: CallbackTo[js.Promise[AxiosResponse[Any, Any]]],
      getSettings: CallbackTo[js.Promise[AxiosResponse[Any, Any]]],
      saveCredentials: Any => js.Promise[AxiosResponse[Any, Any]],
      saveFlows: Any => js.Promise[AxiosResponse[Any, Any]],
      saveSessions: Any => js.Promise[AxiosResponse[Any, Any]],
      saveSettings: Any => js.Promise[AxiosResponse[Any, Any]],
      teamId: String
    ): NodeRED = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], apiServerUrl = apiServerUrl.asInstanceOf[js.Any], getCredentials = getCredentials.toJsFn, getFlowData = js.Any.fromFunction1(getFlowData), getFlows = getFlows.toJsFn, getSessions = getSessions.toJsFn, getSettings = getSettings.toJsFn, saveCredentials = js.Any.fromFunction1(saveCredentials), saveFlows = js.Any.fromFunction1(saveFlows), saveSessions = js.Any.fromFunction1(saveSessions), saveSettings = js.Any.fromFunction1(saveSettings), teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeRED]
    }
    
    extension [Self <: NodeRED](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiServerUrl(value: String): Self = StObject.set(x, "apiServerUrl", value.asInstanceOf[js.Any])
      
      inline def setGetCredentials(value: CallbackTo[js.Promise[AxiosResponse[Any, Any]]]): Self = StObject.set(x, "getCredentials", value.toJsFn)
      
      inline def setGetFlowData(value: String => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "getFlowData", js.Any.fromFunction1(value))
      
      inline def setGetFlows(value: CallbackTo[js.Promise[AxiosResponse[Any, Any]]]): Self = StObject.set(x, "getFlows", value.toJsFn)
      
      inline def setGetSessions(value: CallbackTo[js.Promise[AxiosResponse[Any, Any]]]): Self = StObject.set(x, "getSessions", value.toJsFn)
      
      inline def setGetSettings(value: CallbackTo[js.Promise[AxiosResponse[Any, Any]]]): Self = StObject.set(x, "getSettings", value.toJsFn)
      
      inline def setSaveCredentials(value: Any => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "saveCredentials", js.Any.fromFunction1(value))
      
      inline def setSaveFlows(value: Any => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "saveFlows", js.Any.fromFunction1(value))
      
      inline def setSaveSessions(value: Any => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "saveSessions", js.Any.fromFunction1(value))
      
      inline def setSaveSettings(value: Any => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "saveSettings", js.Any.fromFunction1(value))
      
      inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
}
