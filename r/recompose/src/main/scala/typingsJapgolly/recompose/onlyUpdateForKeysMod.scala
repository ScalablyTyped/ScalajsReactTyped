package typingsJapgolly.recompose

import typingsJapgolly.recompose.mod.InferableComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#onlyupdateforkeys
object onlyUpdateForKeysMod {
  
  @JSImport("recompose/onlyUpdateForKeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(propKeys: js.Array[String]): InferableComponentEnhancer[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propKeys.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[js.Object]]
  
  inline def default_T[T](propKeys: js.Array[/* keyof T */ String]): InferableComponentEnhancer[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propKeys.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[js.Object]]
}
