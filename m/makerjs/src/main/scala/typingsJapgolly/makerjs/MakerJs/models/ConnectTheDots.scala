package typingsJapgolly.makerjs.MakerJs.models

import typingsJapgolly.makerjs.MakerJs.IModel
import typingsJapgolly.makerjs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectTheDots
  extends StObject
     with IModel {
  
  @JSName("paths")
  var paths_ConnectTheDots: IPathMap
}
object ConnectTheDots {
  
  inline def apply(paths: IPathMap): ConnectTheDots = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectTheDots]
  }
  
  extension [Self <: ConnectTheDots](x: Self) {
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
