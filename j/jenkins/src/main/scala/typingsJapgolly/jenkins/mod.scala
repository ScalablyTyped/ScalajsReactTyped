package typingsJapgolly.jenkins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jenkins.anon.Add
import typingsJapgolly.jenkins.anon.BaseUrl
import typingsJapgolly.jenkins.anon.Build
import typingsJapgolly.jenkins.anon.Cancel
import typingsJapgolly.jenkins.anon.Config
import typingsJapgolly.jenkins.anon.Copy
import typingsJapgolly.jenkins.anon.Create
import typingsJapgolly.jenkins.anon.CrumbIssuer
import typingsJapgolly.jenkins.anon.Destroy
import typingsJapgolly.jenkins.anon.Get
import typingsJapgolly.jenkins.anon.Item
import typingsJapgolly.jenkins.anon.Log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): JenkinsAPI = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[JenkinsAPI]
  inline def apply(opts: BaseUrl): JenkinsAPI = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[JenkinsAPI]
  inline def apply(opts: CrumbIssuer): JenkinsPromisifiedAPI = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[JenkinsPromisifiedAPI]
  
  @JSImport("jenkins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JenkinsAPI extends StObject {
    
    var build: Get
    
    def info(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit
    
    var job: Build
    
    var node: Config
    
    var queue: Cancel
    
    var view: Add
  }
  object JenkinsAPI {
    
    inline def apply(
      build: Get,
      info: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Callback,
      job: Build,
      node: Config,
      queue: Cancel,
      view: Add
    ): JenkinsAPI = {
      val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => info(t0).runNow()), job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[JenkinsAPI]
    }
    
    extension [Self <: JenkinsAPI](x: Self) {
      
      inline def setBuild(value: Get): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => value(t0).runNow()))
      
      inline def setJob(value: Build): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Config): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: Cancel): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setView(value: Add): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  trait JenkinsClientOptions extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var crumbIssuer: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var promisify: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Any])] = js.undefined
  }
  object JenkinsClientOptions {
    
    inline def apply(): JenkinsClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JenkinsClientOptions]
    }
    
    extension [Self <: JenkinsClientOptions](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setCrumbIssuer(value: Boolean): Self = StObject.set(x, "crumbIssuer", value.asInstanceOf[js.Any])
      
      inline def setCrumbIssuerUndefined: Self = StObject.set(x, "crumbIssuer", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setPromisify(value: Boolean | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "promisify", value.asInstanceOf[js.Any])
      
      inline def setPromisifyFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "promisify", js.Any.fromFunction1(value))
      
      inline def setPromisifyUndefined: Self = StObject.set(x, "promisify", js.undefined)
    }
  }
  
  trait JenkinsPromisifiedAPI extends StObject {
    
    var build: Log
    
    def info(): js.Promise[Any]
    
    var job: Copy
    
    var node: Create
    
    var queue: Item
    
    var view: Destroy
  }
  object JenkinsPromisifiedAPI {
    
    inline def apply(build: Log, info: CallbackTo[js.Promise[Any]], job: Copy, node: Create, queue: Item, view: Destroy): JenkinsPromisifiedAPI = {
      val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = info.toJsFn, job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[JenkinsPromisifiedAPI]
    }
    
    extension [Self <: JenkinsPromisifiedAPI](x: Self) {
      
      inline def setBuild(value: Log): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "info", value.toJsFn)
      
      inline def setJob(value: Copy): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Create): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: Item): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setView(value: Destroy): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  trait JobBuildOptions extends StObject {
    
    var name: String
    
    var parameters: js.UndefOr[Any] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object JobBuildOptions {
    
    inline def apply(name: String): JobBuildOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobBuildOptions]
    }
    
    extension [Self <: JobBuildOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
