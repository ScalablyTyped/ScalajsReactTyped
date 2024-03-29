package typingsJapgolly.johnnyFive.mod

import typingsJapgolly.johnnyFive.anon.Abbr
import typingsJapgolly.johnnyFive.johnnyFiveStrings.change
import typingsJapgolly.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Compass")
@js.native
open class Compass protected () extends StObject {
  def this(option: CompassOption) = this()
  
  val bearing: Abbr = js.native
  
  val heading: Double = js.native
  
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ Any, Unit]): this.type = js.native
}
