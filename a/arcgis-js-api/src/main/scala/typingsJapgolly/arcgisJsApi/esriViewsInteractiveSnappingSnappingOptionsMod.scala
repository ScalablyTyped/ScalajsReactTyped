package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SnappingOptions
import typingsJapgolly.arcgisJsApi.esri.SnappingOptionsConstructor
import typingsJapgolly.arcgisJsApi.esri.SnappingOptionsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsInteractiveSnappingSnappingOptionsMod extends Shortcut {
  
  @JSImport("esri/views/interactive/snapping/SnappingOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SnappingOptionsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/interactive/snapping/SnappingOptions", JSImport.Namespace)
  @js.native
  /**
    * The `SnappingOptions` allows users to configure snapping for their editing or drawing experience in both the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#snappingOptions) and [Editor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#snappingOptions) widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html)
    */
  open class Class ()
    extends StObject
       with SnappingOptions {
    def this(properties: SnappingOptionsProperties) = this()
  }
  
  type _To = js.Object & SnappingOptionsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsInteractiveSnappingSnappingOptionsMod.foo` */
  override def _to: js.Object & SnappingOptionsConstructor = ^
}
