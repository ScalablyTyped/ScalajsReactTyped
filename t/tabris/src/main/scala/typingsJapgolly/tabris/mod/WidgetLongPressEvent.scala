package typingsJapgolly.tabris.mod

import typingsJapgolly.tabris.anon.X
import typingsJapgolly.tabris.tabrisStrings.cancel
import typingsJapgolly.tabris.tabrisStrings.end
import typingsJapgolly.tabris.tabrisStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetLongPressEvent[Target] extends EventObject[Target] {
  
  val state: start | end | cancel = js.native
  
  val touches: js.Array[X] = js.native
}
