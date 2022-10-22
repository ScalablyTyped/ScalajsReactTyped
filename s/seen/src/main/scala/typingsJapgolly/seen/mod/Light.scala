package typingsJapgolly.seen.mod

import typingsJapgolly.seen.seenStrings.ambient
import typingsJapgolly.seen.seenStrings.directional
import typingsJapgolly.seen.seenStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Light")
@js.native
open class Light protected () extends Transformable {
  def this(`type`: point | directional | ambient) = this()
  def this(`type`: point | directional | ambient, options: LightOptions) = this()
  
  var color: Color = js.native
  
  var defaults: LightOptions = js.native
  
  var enabled: Boolean = js.native
  
  var id: String = js.native
  
  var intensity: Double = js.native
  
  var normal: Point = js.native
  
  var point: Point = js.native
  
  def render(): Unit = js.native
  
  var `type`: String = js.native
}
