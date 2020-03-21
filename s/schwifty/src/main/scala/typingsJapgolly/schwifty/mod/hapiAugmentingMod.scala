package typingsJapgolly.schwifty.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.knex.mod.Knex
import typingsJapgolly.schwifty.AnonKnex
import typingsJapgolly.schwifty.TypeofModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("hapi", JSImport.Namespace)
@js.native
object hapiAugmentingMod extends js.Object {
  @js.native
  trait Request extends js.Object {
    def knex(): Knex[_, js.Array[_]] = js.native
    def models(): StringDictionary[TypeofModel] = js.native
    def models(all: Boolean): StringDictionary[TypeofModel] = js.native
  }
  
  @js.native
  trait ResponseToolkit extends js.Object {
    def knex(): Knex[_, js.Array[_]] = js.native
    def models(): StringDictionary[TypeofModel] = js.native
    def models(all: Boolean): StringDictionary[TypeofModel] = js.native
  }
  
  @js.native
  trait Server extends js.Object {
    def knex(): Knex[_, js.Array[_]] = js.native
    def models(): StringDictionary[TypeofModel] = js.native
    def models(all: Boolean): StringDictionary[TypeofModel] = js.native
    def schwifty(config: js.Array[ModelClass]): Unit = js.native
    def schwifty(config: AnonKnex): Unit = js.native
    def schwifty(config: ModelClass): Unit = js.native
  }
  
}

