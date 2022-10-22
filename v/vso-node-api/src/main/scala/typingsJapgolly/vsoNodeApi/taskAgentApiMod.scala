package typingsJapgolly.vsoNodeApi

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IHeaders
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.taskAgentApiBaseMod.ITaskAgentApiBase
import typingsJapgolly.vsoNodeApi.taskAgentApiBaseMod.TaskAgentApiBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskAgentApiMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase because Already inherited
  - typingsJapgolly.vsoNodeApi.taskAgentApiBaseMod.ITaskAgentApiBase because Already inherited
  - typingsJapgolly.vsoNodeApi.taskAgentApiMod.ITaskAgentApi because var conflicts: baseUrl, http, rest, userAgent, vsoClient. Inlined uploadTaskDefinition */ @JSImport("vso-node-api/TaskAgentApi", "TaskAgentApi")
  @js.native
  open class TaskAgentApi protected () extends TaskAgentApiBase {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
    
    /* private */ var _fallbackClient: Any = js.native
    
    /* private */ def _getAccountUrl(collectionUrl: Any): Any = js.native
    
    /* private */ def _getFallbackClient(baseUrl: Any): Any = js.native
    
    /* private */ var _handlers: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /**
      * @param {NodeJS.ReadableStream} contentStream
      * @param {string} taskId
      * @param {boolean} overwrite
      * @param onResult callback function
      */
    def uploadTaskDefinition(customHeaders: IHeaders, contentStream: ReadableStream, taskId: String, overwrite: Boolean): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait ITaskAgentApi extends ITaskAgentApiBase {
    
    def uploadTaskDefinition(customHeaders: IHeaders, contentStream: ReadableStream, taskId: String, overwrite: Boolean): js.Promise[Unit] = js.native
  }
}
