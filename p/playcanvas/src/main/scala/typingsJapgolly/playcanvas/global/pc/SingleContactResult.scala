package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object holding the result of a contact between two rigid bodies.
  */
@JSGlobal("pc.SingleContactResult")
@js.native
open class SingleContactResult protected ()
  extends typingsJapgolly.playcanvas.mod.SingleContactResult {
  /**
    * Create a new SingleContactResult instance.
    *
    * @param {Entity} a - The first entity involved in the contact.
    * @param {Entity} b - The second entity involved in the contact.
    * @param {ContactPoint} contactPoint - The contact point between the two entities.
    * @hideconstructor
    */
  def this(
    a: typingsJapgolly.playcanvas.mod.Entity,
    b: typingsJapgolly.playcanvas.mod.Entity,
    contactPoint: typingsJapgolly.playcanvas.mod.ContactPoint,
    args: Any*
  ) = this()
}
