package typingsJapgolly.akuminaCore.mod.Digispace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("akumina-core", "Digispace.AppPart")
@js.native
object AppPart extends js.Object {
  @js.native
  class Data () extends js.Object {
    var Templates: typingsJapgolly.akuminaCore.mod.Templates = js.native
  }
  
  @js.native
  class Eventing () extends js.Object
  
  /* static members */
  @js.native
  object Eventing extends js.Object {
     /* Updated */ def Publish(t: String): Unit = js.native
    def Publish(t: String, data: js.Any): Unit = js.native
    def Subscribe(e: String, func: js.Any): Unit = js.native
    def Subscribe(e: String, func: js.Any, caller: js.Any): Unit = js.native
  }
  
}

