package typingsJapgolly.activexFaxcomexlib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxDocument
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("FaxComEx.FaxDocument")
  var FaxComExDotFaxDocument: FaxDocument
  
  @JSName("FaxComEx.FaxServer")
  var FaxComExDotFaxServer: FaxServer
}
object ActiveXObjectNameMap {
  
  inline def apply(FaxComExDotFaxDocument: FaxDocument, FaxComExDotFaxServer: FaxServer): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FaxComEx.FaxDocument")(FaxComExDotFaxDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("FaxComEx.FaxServer")(FaxComExDotFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  extension [Self <: ActiveXObjectNameMap](x: Self) {
    
    inline def setFaxComExDotFaxDocument(value: FaxDocument): Self = StObject.set(x, "FaxComEx.FaxDocument", value.asInstanceOf[js.Any])
    
    inline def setFaxComExDotFaxServer(value: FaxServer): Self = StObject.set(x, "FaxComEx.FaxServer", value.asInstanceOf[js.Any])
  }
}
