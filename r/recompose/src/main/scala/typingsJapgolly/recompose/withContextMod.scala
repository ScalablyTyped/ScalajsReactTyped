package typingsJapgolly.recompose

import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.recompose.mod.InferableComponentEnhancer
import typingsJapgolly.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withcontext
object withContextMod {
  
  @JSImport("recompose/withContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TContext, TProps](childContextTypes: ValidationMap[TContext], getChildContext: mapper[TProps, Any]): InferableComponentEnhancer[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(childContextTypes.asInstanceOf[js.Any], getChildContext.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancer[js.Object]]
}
