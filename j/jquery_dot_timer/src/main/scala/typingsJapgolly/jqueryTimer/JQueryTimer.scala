package typingsJapgolly.jqueryTimer

import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryTimer extends StObject {
  
  // #region Constructors
  def apply(): js.Object = js.native
  def apply(action: js.Function): js.Object = js.native
  def apply(action: js.Function, time: Unit, autostart: Boolean): js.Object = js.native
  def apply(action: js.Function, time: Number): js.Object = js.native
  def apply(action: js.Function, time: Number, autostart: Boolean): js.Object = js.native
  def apply(action: Unit, time: Unit, autostart: Boolean): js.Object = js.native
  def apply(action: Unit, time: Number): js.Object = js.native
  def apply(action: Unit, time: Number, autostart: Boolean): js.Object = js.native
  
  // #endregion
  // #region Properties
  var isActive: Boolean = js.native
  
  // #endregion
  // #region Actions
  def once(time: Number): js.Object = js.native
  
  def pause(): js.Object = js.native
  
  def play(): js.Object = js.native
  def play(reset: Boolean): js.Object = js.native
  
  var remaining: Number = js.native
  
  def set(x: Any): js.Object = js.native
  
  def stop(): js.Object = js.native
  
  def toggle(): js.Object = js.native
  def toggle(reset: Boolean): js.Object = js.native
}
