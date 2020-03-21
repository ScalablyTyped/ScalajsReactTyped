package typingsJapgolly.gaxios

import typingsJapgolly.gaxios.commonMod.GaxiosOptions
import typingsJapgolly.gaxios.commonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gaxios", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  /**
    * The Gaxios class is responsible for making HTTP requests.
    * @param defaults The default set of options to be used for this instance.
    */
  class Gaxios ()
    extends typingsJapgolly.gaxios.gaxiosMod.Gaxios {
    def this(defaults: GaxiosOptions) = this()
  }
  
  @js.native
  class GaxiosError[T] protected ()
    extends typingsJapgolly.gaxios.commonMod.GaxiosError[T] {
    def this(message: String, options: GaxiosOptions, response: GaxiosResponse[T]) = this()
  }
  
  val instance: typingsJapgolly.gaxios.gaxiosMod.Gaxios = js.native
  def request[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
}

