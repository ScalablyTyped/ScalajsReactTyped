package typingsJapgolly.jenkins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jenkins.jenkinsBooleans.`false`
import typingsJapgolly.jenkins.jenkinsBooleans.`true`
import typingsJapgolly.jenkins.jenkinsStrings.html
import typingsJapgolly.jenkins.jenkinsStrings.list
import typingsJapgolly.jenkins.jenkinsStrings.my
import typingsJapgolly.jenkins.jenkinsStrings.text
import typingsJapgolly.jenkins.mod.JobBuildOptions
import typingsJapgolly.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Add extends StObject {
    
    def add(name: String, job: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def config(name: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    def config(name: String, xml: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    
    def create(name: String, `type`: list | my, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def destroy(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def exists(name: String, callback: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]): Unit = js.native
    
    def get(name: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    
    def list(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    
    def remove(name: String, job: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  }
  
  trait BaseUrl extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var crumbIssuer: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var promisify: js.UndefOr[`false`] = js.undefined
  }
  object BaseUrl {
    
    inline def apply(): BaseUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseUrl]
    }
    
    extension [Self <: BaseUrl](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setCrumbIssuer(value: Boolean): Self = StObject.set(x, "crumbIssuer", value.asInstanceOf[js.Any])
      
      inline def setCrumbIssuerUndefined: Self = StObject.set(x, "crumbIssuer", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setPromisify(value: `false`): Self = StObject.set(x, "promisify", value.asInstanceOf[js.Any])
      
      inline def setPromisifyUndefined: Self = StObject.set(x, "promisify", js.undefined)
    }
  }
  
  @js.native
  trait Build extends StObject {
    
    def build(name: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    def build(name: String, parameters: Any, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    def build(
      name: String,
      parameters: Any,
      token: String,
      callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
    ): Unit = js.native
    def build(name: JobBuildOptions, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    
    def config(name: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    def config(name: String, xml: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    
    def copy(name: String, from: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def create(name: String, xml: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def destroy(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def disable(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def enable(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def exists(name: String, callback: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]): Unit = js.native
    
    def get(name: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    
    def list(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  }
  
  trait Cancel extends StObject {
    
    def cancel(n: Double, callback: js.Function1[/* err */ js.Error, Unit]): Unit
    
    def item(n: Double, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit
    
    def list(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit
  }
  object Cancel {
    
    inline def apply(
      cancel: (Double, js.Function1[/* err */ js.Error, Unit]) => Callback,
      item: (Double, js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => Callback,
      list: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Callback
    ): Cancel = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction2((t0: Double, t1: js.Function1[/* err */ js.Error, Unit]) => (cancel(t0, t1)).runNow()), item = js.Any.fromFunction2((t0: Double, t1: js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => (item(t0, t1)).runNow()), list = js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => list(t0).runNow()))
      __obj.asInstanceOf[Cancel]
    }
    
    extension [Self <: Cancel](x: Self) {
      
      inline def setCancel(value: (Double, js.Function1[/* err */ js.Error, Unit]) => Callback): Self = StObject.set(x, "cancel", js.Any.fromFunction2((t0: Double, t1: js.Function1[/* err */ js.Error, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setItem(value: (Double, js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => Callback): Self = StObject.set(x, "item", js.Any.fromFunction2((t0: Double, t1: js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setList(value: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Callback): Self = StObject.set(x, "list", js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    def config(name: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    
    def create(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def destroy(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def disable(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def disable(name: String, message: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def disconnect(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def disconnect(name: String, message: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def enable(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def exists(name: String, callback: js.Function2[/* err */ js.Error, /* data */ Boolean, Unit]): Unit = js.native
    
    def get(name: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    
    def list(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    def list(full: Boolean, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  }
  
  @js.native
  trait Copy extends StObject {
    
    def build(name: String): js.Promise[Any] = js.native
    def build(name: String, parameters: Any): js.Promise[Any] = js.native
    def build(name: String, parameters: Any, token: String): js.Promise[Any] = js.native
    def build(name: String, parameters: Unit, token: String): js.Promise[Any] = js.native
    def build(opts: JobBuildOptions): js.Promise[Any] = js.native
    
    def config(name: String): js.Promise[Any] = js.native
    def config(name: String, xml: String): js.Promise[Any] = js.native
    
    def copy(name: String, from: String): js.Promise[Unit] = js.native
    
    def create(name: String, xml: String): js.Promise[Unit] = js.native
    
    def destroy(name: String): js.Promise[Unit] = js.native
    
    def disable(name: String): js.Promise[Unit] = js.native
    
    def enable(name: String): js.Promise[Unit] = js.native
    
    def exists(name: String): js.Promise[Boolean] = js.native
    
    def get(name: String): js.Promise[Any] = js.native
    
    def list(): js.Promise[Any] = js.native
    def list(folder: String): js.Promise[Any] = js.native
  }
  
  @js.native
  trait Create extends StObject {
    
    def config(name: String): js.Promise[Any] = js.native
    
    def create(name: String): js.Promise[Unit] = js.native
    
    def destroy(name: String): js.Promise[Unit] = js.native
    
    def disable(name: String): js.Promise[Unit] = js.native
    def disable(name: String, message: String): js.Promise[Unit] = js.native
    
    def disconnect(name: String): js.Promise[Unit] = js.native
    def disconnect(name: String, message: String): js.Promise[Unit] = js.native
    
    def enable(name: String): js.Promise[Unit] = js.native
    
    def exists(name: String): js.Promise[Boolean] = js.native
    
    def get(name: String): js.Promise[Any] = js.native
    
    def list(): js.Promise[Any] = js.native
    def list(full: Boolean): js.Promise[Any] = js.native
  }
  
  trait CrumbIssuer extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var crumbIssuer: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var promisify: `true`
  }
  object CrumbIssuer {
    
    inline def apply(): CrumbIssuer = {
      val __obj = js.Dynamic.literal(promisify = true)
      __obj.asInstanceOf[CrumbIssuer]
    }
    
    extension [Self <: CrumbIssuer](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setCrumbIssuer(value: Boolean): Self = StObject.set(x, "crumbIssuer", value.asInstanceOf[js.Any])
      
      inline def setCrumbIssuerUndefined: Self = StObject.set(x, "crumbIssuer", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setPromisify(value: `true`): Self = StObject.set(x, "promisify", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delay extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[text | html] = js.undefined
  }
  object Delay {
    
    inline def apply(): Delay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delay]
    }
    
    extension [Self <: Delay](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setType(value: text | html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Destroy extends StObject {
    
    def add(name: String, job: String): js.Promise[Unit] = js.native
    
    def config(name: String): js.Promise[Any] = js.native
    def config(name: String, xml: String): js.Promise[Any] = js.native
    
    def create(name: String, `type`: list | my): js.Promise[Unit] = js.native
    
    def destroy(name: String): js.Promise[Unit] = js.native
    
    def exists(name: String): js.Promise[Boolean] = js.native
    
    def get(name: String): js.Promise[Any] = js.native
    
    def list(): js.Promise[Any] = js.native
    
    def remove(name: String, job: String): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Get extends StObject {
    
    def get(name: String, n: Double, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    
    def log(name: String, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    def log(name: String, n: Double, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    def log(
      name: String,
      n: Double,
      start: Double,
      callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
    ): Unit = js.native
    def log(
      name: String,
      n: Double,
      start: Double,
      `type`: text | html,
      callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
    ): Unit = js.native
    def log(
      name: String,
      n: Double,
      start: Double,
      `type`: text | html,
      meta: Boolean,
      callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
    ): Unit = js.native
    
    def logStream(name: String, n: Double): ReadableStream = js.native
    def logStream(name: String, n: Double, options: Delay): ReadableStream = js.native
    
    def stop(name: String, n: Double, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def term(name: String, n: Double, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  }
  
  trait Item extends StObject {
    
    def cancel(n: Double): js.Promise[Unit]
    
    def item(n: Double): js.Promise[Any]
    
    def list(): js.Promise[Any]
  }
  object Item {
    
    inline def apply(
      cancel: Double => js.Promise[Unit],
      item: Double => js.Promise[Any],
      list: CallbackTo[js.Promise[Any]]
    ): Item = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), item = js.Any.fromFunction1(item), list = list.toJsFn)
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setCancel(value: Double => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setItem(value: Double => js.Promise[Any]): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setList(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "list", value.toJsFn)
    }
  }
  
  @js.native
  trait Log extends StObject {
    
    def get(name: String, n: Double): js.Promise[Any] = js.native
    
    def log(name: String, n: Double): js.Promise[Any] = js.native
    def log(name: String, n: Double, start: Double): js.Promise[Any] = js.native
    def log(name: String, n: Double, start: Double, `type`: text | html): js.Promise[Any] = js.native
    def log(name: String, n: Double, start: Double, `type`: text | html, meta: Boolean): js.Promise[Any] = js.native
    def log(name: String, n: Double, start: Double, `type`: Unit, meta: Boolean): js.Promise[Any] = js.native
    def log(name: String, n: Double, start: Unit, `type`: text | html): js.Promise[Any] = js.native
    def log(name: String, n: Double, start: Unit, `type`: text | html, meta: Boolean): js.Promise[Any] = js.native
    def log(name: String, n: Double, start: Unit, `type`: Unit, meta: Boolean): js.Promise[Any] = js.native
    
    def logStream(name: String, n: Double): js.Promise[Any] = js.native
    def logStream(name: String, n: Double, `type`: text | html): js.Promise[Any] = js.native
    def logStream(name: String, n: Double, `type`: text | html, delay: Double): js.Promise[Any] = js.native
    def logStream(name: String, n: Double, `type`: Unit, delay: Double): js.Promise[Any] = js.native
    
    def stop(name: String, n: Double): js.Promise[Unit] = js.native
    
    def term(name: String, n: Double): js.Promise[Unit] = js.native
  }
}
