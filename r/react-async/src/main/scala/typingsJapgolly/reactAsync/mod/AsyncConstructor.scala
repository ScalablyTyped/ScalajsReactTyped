package typingsJapgolly.reactAsync.mod

import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncConstructor[T]
  extends StObject
     with ComponentClass[AsyncProps[T], js.Object] {
  
  var Fulfilled: FC[FulfilledProps[T]] = js.native
  
  var Initial: FC[InitialProps[T]] = js.native
  
  var Loading: FC[PendingProps[T]] = js.native
  
  var Pending: FC[PendingProps[T]] = js.native
  
  var Rejected: FC[RejectedProps[T]] = js.native
  
  var Resolved: FC[FulfilledProps[T]] = js.native
  
  var Settled: FC[SettledProps[T]] = js.native
}
