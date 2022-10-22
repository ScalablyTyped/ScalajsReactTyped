package typingsJapgolly.winrtUwp.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPromiseWithOperation[TResult, TOperation /* <: IAsyncAction */]
  extends StObject
     with IPromise[TResult] {
  
  var operation: TOperation = js.native
}
