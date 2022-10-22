package typingsJapgolly.shakacodeRecompose

import typingsJapgolly.shakacodeRecompose.mod.InferableComponentEnhancer
import typingsJapgolly.shakacodeRecompose.mod.predicateDiff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#shouldupdate
object shouldUpdateMod {
  
  @JSImport("@shakacode/recompose/shouldUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TProps](test: predicateDiff[TProps]): InferableComponentEnhancer[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(test.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[js.Object]]
}
