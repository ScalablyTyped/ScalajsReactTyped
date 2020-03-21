package typingsJapgolly.createError

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-error", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Error[T /* <: js.Error */]
    extends typingsJapgolly.std.Error
       with Instantiable0[T]
       with Instantiable1[/* message */ String, T]
       with Instantiable2[/* message */ String, /* obj */ js.Any, T]
  
  def apply(): Error[Error[js.Error]] = js.native
  def apply[T /* <: Error[Error[js.Error]] */](Target: Error[Error[Err]]): T = js.native
  def apply[T /* <: Error[Error[js.Error]] */](Target: Error[Error[Err]], name: String): T = js.native
  def apply[T /* <: Error[Error[js.Error]] */](Target: Error[Error[Err]], name: String, properties: js.Any): T = js.native
  def apply[T /* <: Error[Error[js.Error]] */](name: String): T = js.native
  def apply[T /* <: Error[Error[js.Error]] */](name: String, properties: js.Any): T = js.native
  type Err = js.Error
}

