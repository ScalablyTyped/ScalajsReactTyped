package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.baseMod.Location
import typingsJapgolly.expressValidator.contextItemMod.ContextItem
import typingsJapgolly.expressValidator.contextMod.Context
import typingsJapgolly.expressValidator.contextMod.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-builder", JSImport.Namespace)
@js.native
object contextBuilderMod extends js.Object {
  @js.native
  class ContextBuilder () extends js.Object {
    var fields: js.Any = js.native
    var locations: js.Any = js.native
    var message: js.Any = js.native
    var optional: js.Any = js.native
    val stack: js.Any = js.native
    def addItem(items: ContextItem*): this.type = js.native
    def build(): Context = js.native
    def setFields(fields: js.Array[String]): this.type = js.native
    def setLocations(locations: js.Array[Location]): this.type = js.native
    def setMessage(message: js.Any): this.type = js.native
    def setOptional(options: Optional): this.type = js.native
  }
  
}

