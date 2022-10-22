package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.`raster-dem`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.canvas
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.geojson
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.image_
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.raster
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.vector
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas
}
object Source {
  
  inline def apply(`type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setType(value: vector | raster | `raster-dem` | geojson | image_ | video | canvas): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
