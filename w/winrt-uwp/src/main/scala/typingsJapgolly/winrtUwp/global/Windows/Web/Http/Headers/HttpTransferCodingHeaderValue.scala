package typingsJapgolly.winrtUwp.global.Windows.Web.Http.Headers

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.anon.TransferCodingHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents transfer coding information used in the Transfer-Encoding HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpTransferCodingHeaderValue")
@js.native
open class HttpTransferCodingHeaderValue protected ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue {
  /**
    * Initializes a new instance of the HttpProductInfoHeaderValue class.
    * @param input The transfer-coding information to initialize the HttpProductInfoHeaderValue object.
    */
  def this(input: String) = this()
  
  /** Gets a set of parameters used in the Transfer-Encoding HTTP header. */
  /* CompleteClass */
  var parameters: IVector[typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue] = js.native
  
  /** Gets the transfer-coding value used in the Transfer-Encoding HTTP header. */
  /* CompleteClass */
  var value: String = js.native
}
object HttpTransferCodingHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpTransferCodingHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpTransferCodingHeaderValue instance.
    * @param input A string that represents the transfer-coding information.
    * @return An HttpProductInfoHeaderValue instance.
    */
  /* static member */
  inline def parse(input: String): typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue]
  
  /**
    * Determines whether a string is valid HttpTransferCodingHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  inline def tryParse(input: String): TransferCodingHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[TransferCodingHeaderValue]
}
