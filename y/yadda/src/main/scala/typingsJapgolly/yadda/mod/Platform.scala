package typingsJapgolly.yadda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "Platform")
@js.native
class Platform ()
  extends typingsJapgolly.yadda.platformMod.Platform {
  /* CompleteClass */
  override def get_container(): js.Any = js.native
  /* CompleteClass */
  override def is_browser(): Boolean = js.native
  /* CompleteClass */
  override def is_karma(): Boolean = js.native
   // Window | NodeJS.Global | Phantom
  /* CompleteClass */
  override def is_node(): Boolean = js.native
  /* CompleteClass */
  override def is_phantom(): Boolean = js.native
}

