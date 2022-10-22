package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ElevationProfileLine
import typingsJapgolly.arcgisJsApi.esri.ElevationProfileLineConstructor
import typingsJapgolly.arcgisJsApi.esri.ElevationProfileLineProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsElevationProfileElevationProfileLineMod extends Shortcut {
  
  @JSImport("esri/widgets/ElevationProfile/ElevationProfileLine", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ElevationProfileLineConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ElevationProfile/ElevationProfileLine", JSImport.Namespace)
  @js.native
  /**
    * Common interface for all the elevation profile lines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html)
    */
  open class Class ()
    extends StObject
       with ElevationProfileLine {
    def this(properties: ElevationProfileLineProperties) = this()
  }
  
  type _To = js.Object & ElevationProfileLineConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsElevationProfileElevationProfileLineMod.foo` */
  override def _to: js.Object & ElevationProfileLineConstructor = ^
}
