package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureFilter extends StObject
@JSGlobal("__esri.CIM.TextureFilter")
@js.native
object TextureFilter extends StObject {
  
  /**
    * Low draft quality.
    */
  @js.native
  sealed trait Draft
    extends StObject
       with TextureFilter
  
  /**
    * Higher quality, recommended for pictures.
    */
  @js.native
  sealed trait Picture
    extends StObject
       with TextureFilter
  
  /**
    * Higher quality, recommended when it is important to preserve edges for zoomed in images.
    */
  @js.native
  sealed trait Text
    extends StObject
       with TextureFilter
}
