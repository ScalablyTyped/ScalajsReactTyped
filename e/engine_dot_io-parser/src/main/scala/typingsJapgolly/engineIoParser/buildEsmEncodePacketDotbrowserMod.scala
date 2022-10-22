package typingsJapgolly.engineIoParser

import typingsJapgolly.engineIoParser.buildEsmCommonsMod.Packet
import typingsJapgolly.engineIoParser.buildEsmCommonsMod.RawData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmEncodePacketDotbrowserMod {
  
  @JSImport("engine.io-parser/build/esm/encodePacket.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasTypeData: Packet,
    supportsBinary: Boolean,
    callback: js.Function1[/* encodedPacket */ RawData, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeData.asInstanceOf[js.Any], supportsBinary.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
