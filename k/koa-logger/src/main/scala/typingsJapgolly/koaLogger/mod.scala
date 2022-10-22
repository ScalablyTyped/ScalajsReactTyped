package typingsJapgolly.koaLogger

import japgolly.scalajs.react.Callback
import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(opts: Transporter): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(opts: TransporterOpts): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Transporter = js.Function2[
    /* str */ String, 
    /* args */ js.Tuple6[String, String, String, js.UndefOr[Double], js.UndefOr[String], js.UndefOr[String]], 
    Unit
  ]
  
  trait TransporterOpts extends StObject {
    
    def transporter(
      str: String,
      args: js.Tuple6[String, String, String, js.UndefOr[Double], js.UndefOr[String], js.UndefOr[String]]
    ): Unit
    @JSName("transporter")
    var transporter_Original: Transporter
  }
  object TransporterOpts {
    
    inline def apply(
      transporter: (/* str */ String, /* args */ js.Tuple6[String, String, String, js.UndefOr[Double], js.UndefOr[String], js.UndefOr[String]]) => Callback
    ): TransporterOpts = {
      val __obj = js.Dynamic.literal(transporter = js.Any.fromFunction2((t0: /* str */ String, t1: /* args */ js.Tuple6[String, String, String, js.UndefOr[Double], js.UndefOr[String], js.UndefOr[String]]) => (transporter(t0, t1)).runNow()))
      __obj.asInstanceOf[TransporterOpts]
    }
    
    extension [Self <: TransporterOpts](x: Self) {
      
      inline def setTransporter(
        value: (/* str */ String, /* args */ js.Tuple6[String, String, String, js.UndefOr[Double], js.UndefOr[String], js.UndefOr[String]]) => Callback
      ): Self = StObject.set(x, "transporter", js.Any.fromFunction2((t0: /* str */ String, t1: /* args */ js.Tuple6[String, String, String, js.UndefOr[Double], js.UndefOr[String], js.UndefOr[String]]) => (value(t0, t1)).runNow()))
    }
  }
}
