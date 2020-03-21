package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.basicMod.BasicCardOptions
import typingsJapgolly.actionsOnGoogle.buttonMod.ButtonOptions
import typingsJapgolly.actionsOnGoogle.richMod._RichResponseItem
import typingsJapgolly.actionsOnGoogle.tableMod.TableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", JSImport.Namespace)
@js.native
object cardMod extends js.Object {
  @js.native
  class BasicCard protected ()
    extends typingsJapgolly.actionsOnGoogle.basicMod.BasicCard
       with _RichResponseItem {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @js.native
  class Button protected ()
    extends typingsJapgolly.actionsOnGoogle.buttonMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @js.native
  class Table protected ()
    extends typingsJapgolly.actionsOnGoogle.tableMod.Table
       with _RichResponseItem {
    /** @public */
    def this(options: TableOptions) = this()
  }
  
}

