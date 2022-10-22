package typingsJapgolly.kafkaNode.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "KeyedMessage")
@js.native
open class KeyedMessage protected () extends StObject {
  def this(key: String, value: String) = this()
  def this(key: String, value: Buffer) = this()
  def this(key: Buffer, value: String) = this()
  def this(key: Buffer, value: Buffer) = this()
  
  var key: String | Buffer = js.native
  
  var value: String | Buffer = js.native
}
