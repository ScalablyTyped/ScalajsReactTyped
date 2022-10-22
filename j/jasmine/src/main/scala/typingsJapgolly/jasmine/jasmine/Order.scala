package typingsJapgolly.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.jasmine.anon.Random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order
  extends StObject
     with Instantiable1[/* options */ Random, scala.Any] {
  
  var random: Boolean = js.native
  
  var seed: Double | String = js.native
  
  def sort[T](items: js.Array[T]): js.Array[T] = js.native
}
