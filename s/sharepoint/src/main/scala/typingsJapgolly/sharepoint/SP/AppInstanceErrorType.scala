package typingsJapgolly.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppInstanceErrorType extends StObject
@JSGlobal("SP.AppInstanceErrorType")
@js.native
object AppInstanceErrorType extends StObject {
  
  @js.native
  sealed trait app
    extends StObject
       with AppInstanceErrorType
  
  @js.native
  sealed trait configuration
    extends StObject
       with AppInstanceErrorType
  
  @js.native
  sealed trait transient
    extends StObject
       with AppInstanceErrorType
}
