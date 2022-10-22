package typingsJapgolly.next

import typingsJapgolly.next.anon.Col
import typingsJapgolly.next.anon.FinishedBoolean
import typingsJapgolly.next.anon.LoadStaticPaths
import typingsJapgolly.next.anon.MiddlewareList
import typingsJapgolly.next.anon.Params
import typingsJapgolly.next.anon.Pathname
import typingsJapgolly.next.distServerBaseHttpNodeMod.NodeNextRequest
import typingsJapgolly.next.distServerBaseHttpNodeMod.NodeNextResponse
import typingsJapgolly.next.distServerBaseServerMod.FindComponentsResult
import typingsJapgolly.next.distServerConfigSharedMod.NextConfig
import typingsJapgolly.next.distServerWebTypesMod.FetchEventResult
import typingsJapgolly.node.urlMod.UrlWithParsedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerDevNextDevServerMod {
  
  @JSImport("next/dist/server/dev/next-dev-server", JSImport.Default)
  @js.native
  open class default protected () extends DevServer {
    def this(options: Options) = this()
  }
  
  @js.native
  trait DevServer
    extends typingsJapgolly.next.distServerNextServerMod.default {
    
    /* private */ var _devCachedPreviewProps: Any = js.native
    
    def _filterAmpDevelopmentScript(html: String, event: Col): Boolean = js.native
    
    /* private */ var actualMiddlewareFile: Any = js.native
    
    def addExportPathMapRoutes(): js.Promise[Unit] = js.native
    
    /* private */ var addedUpgradeListener: Any = js.native
    
    /* private */ var appDir: Any = js.native
    
    /* private */ var devReady: Any = js.native
    
    /* private */ var edgeFunctions: Any = js.native
    
    /* protected */ def findPageComponents(hasPathnameQueryParamsIsAppPathAppPaths: Pathname): js.Promise[FindComponentsResult | Null] = js.native
    
    def getCompilationError(page: String): js.Promise[Any] = js.native
    
    /* private */ var getStaticPathsWorker: Any = js.native
    
    /* protected */ def hasMiddleware(): js.Promise[Boolean] = js.native
    
    def hasPublicFile(path: String): js.Promise[Boolean] = js.native
    
    /* private */ var hotReloader: Any = js.native
    
    /* private */ var isCustomServer: Any = js.native
    
    /* private */ var logErrorWithOriginalStack: Any = js.native
    
    /* private */ var middleware: Any = js.native
    
    /* private */ var pagesDir: Any = js.native
    
    def run(req: NodeNextRequest, res: NodeNextResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
    
    def runEdgeFunction(params: Params): js.Promise[FetchEventResult | Null] = js.native
    
    def runMiddleware(params: MiddlewareList): js.Promise[FetchEventResult | FinishedBoolean] = js.native
    
    /* private */ var servePublic: Any = js.native
    
    /* private */ var setDevReady: Any = js.native
    
    /* private */ var setupWebSocketHandler: Any = js.native
    
    /* protected */ var sortedRoutes: js.UndefOr[js.Array[String]] = js.native
    
    def startWatcher(): js.Promise[Unit] = js.native
    
    /* protected */ var staticPathsWorker: js.UndefOr[LoadStaticPaths] = js.native
    
    def stopWatcher(): js.Promise[Unit] = js.native
    
    /* private */ var usingTypeScript: Any = js.native
    
    /* private */ var verifyTypeScript: Any = js.native
    
    /* private */ var verifyingTypeScript: Any = js.native
    
    /* private */ var webpackWatcher: Any = js.native
  }
  
  trait Options
    extends StObject
       with typingsJapgolly.next.distServerBaseServerMod.Options {
    
    /**
      * Tells of Next.js is running from the `next dev` command
      */
    var isNextDevCommand: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(conf: NextConfig): Options = {
      val __obj = js.Dynamic.literal(conf = conf.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIsNextDevCommand(value: Boolean): Self = StObject.set(x, "isNextDevCommand", value.asInstanceOf[js.Any])
      
      inline def setIsNextDevCommandUndefined: Self = StObject.set(x, "isNextDevCommand", js.undefined)
    }
  }
}
