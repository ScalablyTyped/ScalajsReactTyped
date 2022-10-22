package typingsJapgolly.activexFaxcomexlib.anon

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BstrMessageIdPFaxServer extends StObject {
  
  val bstrMessageId: String
  
  val pFaxServer: FaxServer
}
object BstrMessageIdPFaxServer {
  
  inline def apply(bstrMessageId: String, pFaxServer: FaxServer): BstrMessageIdPFaxServer = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrMessageIdPFaxServer]
  }
  
  extension [Self <: BstrMessageIdPFaxServer](x: Self) {
    
    inline def setBstrMessageId(value: String): Self = StObject.set(x, "bstrMessageId", value.asInstanceOf[js.Any])
    
    inline def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
  }
}
