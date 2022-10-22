package typingsJapgolly.matterJs.global.Matter

import typingsJapgolly.matterJs.mod.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Contact")
@js.native
open class Contact ()
  extends typingsJapgolly.matterJs.mod.Contact
/* static members */
object Contact {
  
  @JSGlobal("Matter.Contact")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new contact.
    * @method create
    * @param {Vertex} vertex
    * @returns {contact} A new contact
    */
  inline def create(vertex: Vertex): typingsJapgolly.matterJs.mod.Contact = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vertex.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.matterJs.mod.Contact]
}
