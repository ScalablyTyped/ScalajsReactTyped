package typingsJapgolly.googleProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleProtobuf.anon.TypeofMessage
import typingsJapgolly.googleProtobuf.mod.Message.StaticToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf", "ExtensionFieldInfo")
@js.native
open class ExtensionFieldInfo[T] protected () extends StObject {
  def this(
    fieldIndex: Double,
    fieldName: StringDictionary[Double],
    ctor: TypeofMessage,
    toObjectFn: StaticToObject,
    isRepeated: Double
  ) = this()
  
  var ctor: TypeofMessage = js.native
  
  var fieldIndex: Double = js.native
  
  var fieldName: Double = js.native
  
  def isMessageType(): Boolean = js.native
  
  var isRepeated: Double = js.native
  
  def toObjectFn(includeInstance: Boolean, msg: Message): js.Object = js.native
  @JSName("toObjectFn")
  var toObjectFn_Original: StaticToObject = js.native
}
