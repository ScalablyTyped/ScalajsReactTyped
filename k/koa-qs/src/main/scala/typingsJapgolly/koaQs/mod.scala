package typingsJapgolly.koaQs

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(app: typingsJapgolly.koa.mod.^[DefaultState, DefaultContext]): typingsJapgolly.koa.mod.^[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.koa.mod.^[DefaultState, DefaultContext]]
  inline def apply(app: typingsJapgolly.koa.mod.^[DefaultState, DefaultContext], mode: ParseMode): typingsJapgolly.koa.mod.^[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.koa.mod.^[DefaultState, DefaultContext]]
  
  @JSImport("koa-qs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.koaQs.koaQsStrings.extended
    - typingsJapgolly.koaQs.koaQsStrings.strict
    - typingsJapgolly.koaQs.koaQsStrings.first
  */
  trait ParseMode extends StObject
  object ParseMode {
    
    inline def extended: typingsJapgolly.koaQs.koaQsStrings.extended = "extended".asInstanceOf[typingsJapgolly.koaQs.koaQsStrings.extended]
    
    inline def first: typingsJapgolly.koaQs.koaQsStrings.first = "first".asInstanceOf[typingsJapgolly.koaQs.koaQsStrings.first]
    
    inline def strict: typingsJapgolly.koaQs.koaQsStrings.strict = "strict".asInstanceOf[typingsJapgolly.koaQs.koaQsStrings.strict]
  }
}
