package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.carouselMod.CarouselOptions
import typingsJapgolly.actionsOnGoogle.listMod.ListOptions
import typingsJapgolly.actionsOnGoogle.optionOptionMod.ApiOptionItem
import typingsJapgolly.actionsOnGoogle.optionOptionMod.OptionItem
import typingsJapgolly.actionsOnGoogle.optionOptionMod.OptionItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", JSImport.Namespace)
@js.native
object optionMod extends js.Object {
  @js.native
  class Carousel protected ()
    extends typingsJapgolly.actionsOnGoogle.carouselMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @js.native
  class List protected ()
    extends typingsJapgolly.actionsOnGoogle.listMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  def convert(items: OptionItems[String | OptionItem]): js.Array[ApiOptionItem] = js.native
}

