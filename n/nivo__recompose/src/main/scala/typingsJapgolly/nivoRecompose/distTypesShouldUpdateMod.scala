package typingsJapgolly.nivoRecompose

import typingsJapgolly.nivoRecompose.distTypesTypesMod.InferableComponentEnhancer
import typingsJapgolly.nivoRecompose.distTypesTypesMod.PredicateDiff
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesShouldUpdateMod {
  
  @JSImport("@nivo/recompose/dist/types/shouldUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shouldUpdate[TProps /* <: Record[String, Any] */](test: PredicateDiff[TProps]): InferableComponentEnhancer[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldUpdate")(test.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[js.Object]]
}
