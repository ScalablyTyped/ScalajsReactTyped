package typingsJapgolly.sipJs.libCoreMod

import typingsJapgolly.sipJs.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Parser {
  
  @JSImport("sip.js/lib/core", "Parser")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHeader(data: Any, headerStart: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeader")(data.asInstanceOf[js.Any], headerStart.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def parseHeader(
    message: typingsJapgolly.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage,
    data: Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | Error = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHeader")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headerStart.asInstanceOf[js.Any], headerEnd.asInstanceOf[js.Any])).asInstanceOf[Boolean | Error]
  inline def parseHeader(
    message: typingsJapgolly.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage,
    data: Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | Error = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHeader")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headerStart.asInstanceOf[js.Any], headerEnd.asInstanceOf[js.Any])).asInstanceOf[Boolean | Error]
  
  inline def parseMessage(data: String, logger: typingsJapgolly.sipJs.libCoreLogLoggerMod.Logger): js.UndefOr[
    typingsJapgolly.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage | typingsJapgolly.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMessage")(data.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    typingsJapgolly.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage | typingsJapgolly.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage
  ]]
}
