package typingsJapgolly.paper.paperCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper/dist/paper-core", "Style")
@js.native
class Style protected ()
  extends typingsJapgolly.paper.paper.Style {
  /** 
    * Style objects don't need to be created directly. Just pass an object to
    * {@link Item#style} or {@link Project#currentStyle}, it will be converted
    * to a Style object internally.
    */
  def this(style: js.Object) = this()
}

