package typingsJapgolly.jupyterlabServices.libKernelMessagesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jupyterlabServices.anon.TargetnameString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommInfoReply
  extends StObject
     with IReplyOkContent {
  
  /**
    * Mapping of comm ids to target names.
    */
  var comms: StringDictionary[TargetnameString]
}
object ICommInfoReply {
  
  inline def apply(comms: StringDictionary[TargetnameString]): ICommInfoReply = {
    val __obj = js.Dynamic.literal(comms = comms.asInstanceOf[js.Any], status = "ok")
    __obj.asInstanceOf[ICommInfoReply]
  }
  
  extension [Self <: ICommInfoReply](x: Self) {
    
    inline def setComms(value: StringDictionary[TargetnameString]): Self = StObject.set(x, "comms", value.asInstanceOf[js.Any])
  }
}
