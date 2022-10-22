package typingsJapgolly.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.EnclosingTypeWalkerState")
@js.native
open class EnclosingTypeWalkerState ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.EnclosingTypeWalkerState {
  
  /* CompleteClass */
  var _currentSymbols: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSymbol] = js.native
  
  /* CompleteClass */
  var _hasSetEnclosingType: Boolean = js.native
}
object EnclosingTypeWalkerState {
  
  @JSGlobal("TypeScript.EnclosingTypeWalkerState")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getDefaultEnclosingTypeWalkerState(): typingsJapgolly.typescriptServices.TypeScript.EnclosingTypeWalkerState = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultEnclosingTypeWalkerState")().asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.EnclosingTypeWalkerState]
  
  /* static member */
  inline def getGenericEnclosingTypeWalkerState(genericEnclosingType: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol): typingsJapgolly.typescriptServices.TypeScript.EnclosingTypeWalkerState = ^.asInstanceOf[js.Dynamic].applyDynamic("getGenericEnclosingTypeWalkerState")(genericEnclosingType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.EnclosingTypeWalkerState]
  
  /* static member */
  inline def getNonGenericEnclosingTypeWalkerState(): typingsJapgolly.typescriptServices.TypeScript.EnclosingTypeWalkerState = ^.asInstanceOf[js.Dynamic].applyDynamic("getNonGenericEnclosingTypeWalkerState")().asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.EnclosingTypeWalkerState]
}
