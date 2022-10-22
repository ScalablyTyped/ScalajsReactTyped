package typingsJapgolly.ldapjs.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("ldapjs", "LDAPMessage")
@js.native
open class LDAPMessage () extends StObject {
  
  var controls: js.Array[Control] = js.native
  
  val dn: String = js.native
  
  val id: Double = js.native
  
  /** A plain object with main properties */
  val json: LDAPMessageJsonObject = js.native
  
  var log: Any = js.native
  
  var messageID: Double = js.native
  
  def parse(ber: Buffer): Boolean = js.native
  
  var protocolOp: js.UndefOr[String] = js.native
  
  def toBer(): Buffer = js.native
  
  val `type`: String = js.native
}
