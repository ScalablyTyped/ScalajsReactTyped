package typingsJapgolly.zui

import typingsJapgolly.std.Event
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * selectable
  */
@js.native
trait SelectableEvent
  extends StObject
     with Event {
  
  var selected: js.Array[Double] = js.native
  
  var selections: Map[Double, Boolean] = js.native
}
