package typingsJapgolly.tcomb.mod

import typingsJapgolly.tcomb.anon.KindName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type[T]
  extends js.Function {
  
  def apply(value: T): T = js.native
  
  var displayName: java.lang.String = js.native
  
  def is(x: scala.Any): /* is T */ scala.Boolean = js.native
  @JSName("is")
  var is_Original: TypeGuardPredicate[T] = js.native
  
  var meta: KindName = js.native
  
  var t: T = js.native
}
