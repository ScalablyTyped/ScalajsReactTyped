package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ExceptionHandlingScope")
@js.native
open class ExceptionHandlingScope protected ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.ExceptionHandlingScope {
  def this(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext) = this()
  
  /* CompleteClass */
  override def get_errorMessage(): String = js.native
  
  /* CompleteClass */
  override def get_hasException(): Boolean = js.native
  
  /* CompleteClass */
  override def get_processed(): Boolean = js.native
  
  /* CompleteClass */
  override def get_serverErrorCode(): Double = js.native
  
  /* CompleteClass */
  override def get_serverErrorDetails(): Any = js.native
  
  /* CompleteClass */
  override def get_serverErrorTypeName(): String = js.native
  
  /* CompleteClass */
  override def get_serverErrorValue(): String = js.native
  
  /* CompleteClass */
  override def get_serverStackTrace(): String = js.native
  
  /* CompleteClass */
  override def startCatch(): Any = js.native
  
  /* CompleteClass */
  override def startFinally(): Any = js.native
  
  /* CompleteClass */
  override def startScope(): Any = js.native
  
  /* CompleteClass */
  override def startTry(): Any = js.native
}
