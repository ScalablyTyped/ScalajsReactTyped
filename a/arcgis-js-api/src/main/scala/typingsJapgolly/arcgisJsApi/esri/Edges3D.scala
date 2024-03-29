package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edges3D
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The color of the edges.
    *
    * @default black
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#color)
    */
  var color: Color_ = js.native
  
  /**
    * A size in points by which to extend edges beyond their original end points.
    *
    * @default "0"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#extensionLength)
    */
  var extensionLength: Double = js.native
  
  /**
    * The size of the edges in points.
    *
    * @default 1px
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#size)
    */
  var size: Double = js.native
}
