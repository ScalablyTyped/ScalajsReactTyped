package typingsJapgolly.materialLineRipple

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialLineRipple.adapterMod.MDCLineRippleAdapter
import typingsJapgolly.materialLineRipple.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/line-ripple", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCLineRipple ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCLineRippleAdapter, default] {
    /**
      * Activates the line ripple
      */
    def activate(): Unit = js.native
    /**
      * Deactivates the line ripple
      */
    def deactivate(): Unit = js.native
    /**
      * Sets the transform origin given a user's click location. The `rippleCenter` is the
      * x-coordinate of the middle of the ripple.
      */
    def setRippleCenter(xCoordinate: Double): Unit = js.native
  }
  
  @js.native
  class MDCLineRippleFoundation () extends default
  
  /* static members */
  @js.native
  object MDCLineRipple extends js.Object {
    def attachTo(root: Element): MDCLineRipple = js.native
  }
  
  /* static members */
  @js.native
  object MDCLineRippleFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialLineRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCLineRippleAdapter = js.native
  }
  
}

