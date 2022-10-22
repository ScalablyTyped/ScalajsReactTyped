package typingsJapgolly.mapboxGl.mod

import typingsJapgolly.mapboxGl.mapboxGlStrings.webglcontextlost
import typingsJapgolly.mapboxGl.mapboxGlStrings.webglcontextrestored
import typingsJapgolly.std.WebGLContextEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapContextEvent extends MapboxEvent[WebGLContextEvent] {
  
  @JSName("type")
  var type_MapContextEvent: webglcontextlost | webglcontextrestored = js.native
}
