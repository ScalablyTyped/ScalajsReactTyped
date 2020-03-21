package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ContactResult
  * @classdesc Object holding the result of a contact between two Entities.
  * @description Create a new ContactResult.
  * @param {pc.Entity} other - The entity that was involved in the contact with this entity.
  * @param {pc.ContactPoint[]} contacts - An array of ContactPoints with the other entity.
  * @property {pc.Entity} other The entity that was involved in the contact with this entity.
  * @property {pc.ContactPoint[]} contacts An array of ContactPoints with the other entity.
  */
@JSImport("playcanvas", "ContactResult")
@js.native
class ContactResult protected ()
  extends typingsJapgolly.playcanvas.pc.ContactResult {
  def this(
    other: typingsJapgolly.playcanvas.pc.Entity,
    contacts: js.Array[typingsJapgolly.playcanvas.pc.ContactPoint]
  ) = this()
}

