package typingsJapgolly.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection
  extends StObject
     with Query {
  
  def add(options: CommonOption[Any]): js.Promise[AddCollectionResult] = js.native
  
  def aggregate(): Aggregate = js.native
  
  def doc(id: String): Document = js.native
  def doc(id: Double): Document = js.native
  
  def where(rule: js.Object): Query = js.native
}
