package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.content
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.metadata
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.source_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapSourceDataEvent
  extends MapEvent[Unit]
     with MapDataEvent {
  
  var coord: Coordinate = js.native
  
  var dataType: source_ = js.native
  
  var isSourceLoaded: Boolean = js.native
  
  var source: Source = js.native
  
  var sourceDataType: metadata | content = js.native
  
  var sourceId: String = js.native
  
  var tile: Any = js.native
}
