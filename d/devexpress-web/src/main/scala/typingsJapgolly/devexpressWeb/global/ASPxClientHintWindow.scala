package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxHint's window.
  */
@JSGlobal("ASPxClientHintWindow")
@js.native
open class ASPxClientHintWindow ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientHintWindow {
  
  /**
    * Sets the hint's content.
    * @param html An object that specifies the hint content.
    * @param options An  object that specifies the hint's options.
    */
  /* CompleteClass */
  override def SetContent(html: Any, options: typingsJapgolly.devexpressWeb.ASPxClientHintOptions): Unit = js.native
  
  /**
    * Set the hint's loading animation
    */
  /* CompleteClass */
  override def SetContentLoading(): Unit = js.native
  
  /**
    * Forces the ASPxClientHint's window to recalculate its position.
    */
  /* CompleteClass */
  override def UpdatePosition(): Unit = js.native
}
