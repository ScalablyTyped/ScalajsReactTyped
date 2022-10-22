package typingsJapgolly.tabris.mod

import typingsJapgolly.tabris.anon.X
import typingsJapgolly.tabris.tabrisStrings.cancel
import typingsJapgolly.tabris.tabrisStrings.change
import typingsJapgolly.tabris.tabrisStrings.end
import typingsJapgolly.tabris.tabrisStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetPanEvent[Target] extends EventObject[Target] {
  
  val state: start | change | end | cancel = js.native
  
  val touches: js.Array[X] = js.native
  
  val translationX: Double = js.native
  
  val translationY: Double = js.native
  
  val velocityX: Double = js.native
  
  val velocityY: Double = js.native
}
