package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object holding the result of a contact between two Entities.
  */
@JSGlobal("pc.ContactResult")
@js.native
open class ContactResult protected ()
  extends typingsJapgolly.playcanvas.mod.ContactResult {
  /**
    * Create a new ContactResult instance.
    *
    * @param {Entity} other - The entity that was involved in the contact with this entity.
    * @param {ContactPoint[]} contacts - An array of ContactPoints with the other entity.
    * @hideconstructor
    */
  def this(
    other: typingsJapgolly.playcanvas.mod.Entity,
    contacts: js.Array[typingsJapgolly.playcanvas.mod.ContactPoint]
  ) = this()
}
