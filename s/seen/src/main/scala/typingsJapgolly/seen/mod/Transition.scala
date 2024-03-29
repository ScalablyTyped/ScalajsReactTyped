package typingsJapgolly.seen.mod

import typingsJapgolly.seen.anon.Duration
import typingsJapgolly.seen.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Transition")
@js.native
open class Transition () extends StObject {
  def this(options: `1`) = this()
  
  var defaults: Duration = js.native
  
  var duration: Double = js.native
  
  def firstFrame(): Unit = js.native
  
  def frame(): Unit = js.native
  
  def lastFrame(): Unit = js.native
  
  def update(): Boolean = js.native
  def update(t: Double): Boolean = js.native
}
