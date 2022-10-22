package typingsJapgolly.jss.mod

import typingsJapgolly.jss.anon.Next
import typingsJapgolly.jss.anon.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimalObservable[T] extends StObject {
  
  def subscribe(nextOrObserver: js.Function1[/* value */ T, Unit]): Unsubscribe = js.native
  def subscribe(nextOrObserver: Next[T]): Unsubscribe = js.native
}
