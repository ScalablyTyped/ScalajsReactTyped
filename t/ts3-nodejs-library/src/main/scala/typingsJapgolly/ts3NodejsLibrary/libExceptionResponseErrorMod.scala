package typingsJapgolly.ts3NodejsLibrary

import typingsJapgolly.std.Error
import typingsJapgolly.ts3NodejsLibrary.anon.ExtraMsg
import typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod.QueryErrorMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExceptionResponseErrorMod {
  
  @JSImport("ts3-nodejs-library/lib/exception/ResponseError", "ResponseError")
  @js.native
  open class ResponseError protected ()
    extends StObject
       with Error {
    def this(error: QueryErrorMessage, stack: String) = this()
    
    val extraMsg: js.UndefOr[String] = js.native
    
    val failedPermid: js.UndefOr[Double] = js.native
    
    val id: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    val msg: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * returns a json encodeable object for this error
      */
    def toJSON(): ExtraMsg = js.native
  }
}
