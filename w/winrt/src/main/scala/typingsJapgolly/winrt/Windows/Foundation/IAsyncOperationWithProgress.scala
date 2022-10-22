package typingsJapgolly.winrt.Windows.Foundation

import typingsJapgolly.winrt.anon.Completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsyncOperationWithProgress[TResult, TProgress]
  extends StObject
     with IPromise[TResult] {
  
  var operation: Completed[TResult, TProgress] = js.native
}
