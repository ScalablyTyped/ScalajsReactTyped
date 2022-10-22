package typingsJapgolly.makerjs.MakerJs.models

import typingsJapgolly.makerjs.MakerJs.IModel
import typingsJapgolly.makerjs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Belt
  extends StObject
     with IModel {
  
  @JSName("paths")
  var paths_Belt: IPathMap
}
object Belt {
  
  inline def apply(paths: IPathMap): Belt = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Belt]
  }
  
  extension [Self <: Belt](x: Self) {
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
