package typingsJapgolly.easeljs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.Shadow")
@js.native
open class Shadow protected ()
  extends StObject
     with typingsJapgolly.easeljs.createjs.Shadow {
  def this(color: String, offsetX: Double, offsetY: Double, blur: Double) = this()
  
  // properties
  /* CompleteClass */
  var blur: Double = js.native
  
  /* CompleteClass */
  var color: String = js.native
  
  /* CompleteClass */
  var offsetX: Double = js.native
  
  /* CompleteClass */
  var offsetY: Double = js.native
}
/* static members */
object Shadow {
  
  @JSGlobal("createjs.Shadow")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("createjs.Shadow.identity")
  @js.native
  def identity: typingsJapgolly.easeljs.createjs.Shadow = js.native
  inline def identity_=(x: typingsJapgolly.easeljs.createjs.Shadow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
}
