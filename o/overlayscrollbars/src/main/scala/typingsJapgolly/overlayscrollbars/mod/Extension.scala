package typingsJapgolly.overlayscrollbars.mod

import org.scalajs.dom.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension extends StObject {
  
  def added(): Unit = js.native
  def added(options: js.Object): Unit = js.native
  
  def contract(global: Any): Boolean = js.native
  
  def on(callbackName: String): Unit = js.native
  def on(callbackName: String, callbackArgs: UIEvent): Unit = js.native
  def on(callbackName: String, callbackArgs: DirectionChangedArgs): Unit = js.native
  def on(callbackName: String, callbackArgs: OverflowAmountChangedArgs): Unit = js.native
  def on(callbackName: String, callbackArgs: OverflowChangedArgs): Unit = js.native
  def on(callbackName: String, callbackArgs: SizeChangedArgs): Unit = js.native
  def on(callbackName: String, callbackArgs: UpdatedArgs): Unit = js.native
  
  def removed(): Unit = js.native
}
