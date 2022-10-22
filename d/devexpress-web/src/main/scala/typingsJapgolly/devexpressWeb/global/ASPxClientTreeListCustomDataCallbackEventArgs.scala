package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.CustomDataCallback event.
  */
@JSGlobal("ASPxClientTreeListCustomDataCallbackEventArgs")
@js.native
open class ASPxClientTreeListCustomDataCallbackEventArgs ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientTreeListCustomDataCallbackEventArgs {
  
  /**
    * Gets the information that has been collected on the client-side and sent to the  server-side ASPxClientTreeList.CustomDataCallback event.
    */
  /* CompleteClass */
  var arg: String = js.native
  
  /**
    * Gets the information passed from the server-side ASPxTreeList.CustomDataCallback event.
    */
  /* CompleteClass */
  var result: Any = js.native
}
