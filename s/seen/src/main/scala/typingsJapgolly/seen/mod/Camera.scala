package typingsJapgolly.seen.mod

import typingsJapgolly.seen.anon.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Camera")
@js.native
open class Camera () extends Transformable {
  def this(transform: Matrix) = this()
  
  var defaults: Projection = js.native
  
  var projection: Matrix = js.native
}
