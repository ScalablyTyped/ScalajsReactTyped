package typingsJapgolly.koaIgnore

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.koaIgnore.anon.If
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(middleware: (Middleware[DefaultState, DefaultContext, Any])*): If = ^.asInstanceOf[js.Dynamic].apply(middleware.asInstanceOf[Seq[js.Any]]*).asInstanceOf[If]
  
  @JSImport("koa-ignore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
