package typingsJapgolly.bip174

import typingsJapgolly.bip174.srcLibInterfacesMod.KeyValue
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibConverterToolsMod {
  
  @JSImport("bip174/src/lib/converter/tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keyValToBuffer(keyVal: KeyValue): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keyValToBuffer")(keyVal.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def keyValsToBuffer(keyVals: js.Array[KeyValue]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keyValsToBuffer")(keyVals.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def range(n: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def readUInt64LE(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reverseBuffer(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def writeUInt64LE(buffer: Buffer, value: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64LE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
}
