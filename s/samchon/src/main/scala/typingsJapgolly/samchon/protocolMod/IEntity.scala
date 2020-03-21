package typingsJapgolly.samchon.protocolMod

import typingsJapgolly.sxml.mod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "IEntity")
@js.native
object IEntity extends js.Object {
  def construct(entity: typingsJapgolly.samchon.ientityMod.IEntity, xml: XML, prohibited_names: String*): Unit = js.native
  def toXML(entity: typingsJapgolly.samchon.ientityMod.IEntity, prohibited_names: String*): XML = js.native
}

