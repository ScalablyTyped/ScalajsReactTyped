package typingsJapgolly.reactSpringCore

import typingsJapgolly.reactSpringCore.anon.Cancelled
import typingsJapgolly.reactSpringCore.anon.Finished
import typingsJapgolly.reactSpringCore.anon.Noop
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesInternalMod.Readable
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesObjectsMod.AnimationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimationResultMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/AnimationResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCancelledResult(value: Any): Cancelled = ^.asInstanceOf[js.Dynamic].applyDynamic("getCancelledResult")(value.asInstanceOf[js.Any]).asInstanceOf[Cancelled]
  
  inline def getCombinedResult[T /* <: Readable[Any] */](target: T, results: js.Array[AnimationResult[T]]): AnimationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCombinedResult")(target.asInstanceOf[js.Any], results.asInstanceOf[js.Any])).asInstanceOf[AnimationResult[T]]
  
  inline def getFinishedResult(value: Any, finished: Boolean): Finished = (^.asInstanceOf[js.Dynamic].applyDynamic("getFinishedResult")(value.asInstanceOf[js.Any], finished.asInstanceOf[js.Any])).asInstanceOf[Finished]
  inline def getFinishedResult(value: Any, finished: Boolean, cancelled: Boolean): Finished = (^.asInstanceOf[js.Dynamic].applyDynamic("getFinishedResult")(value.asInstanceOf[js.Any], finished.asInstanceOf[js.Any], cancelled.asInstanceOf[js.Any])).asInstanceOf[Finished]
  
  inline def getNoopResult(value: Any): Noop = ^.asInstanceOf[js.Dynamic].applyDynamic("getNoopResult")(value.asInstanceOf[js.Any]).asInstanceOf[Noop]
}
