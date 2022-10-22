package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SegmentDrawAction
import typingsJapgolly.arcgisJsApi.esri.SegmentDrawActionConstructor
import typingsJapgolly.arcgisJsApi.esri.SegmentDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsDrawSegmentDrawActionMod extends Shortcut {
  
  @JSImport("esri/views/draw/SegmentDrawAction", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SegmentDrawActionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/draw/SegmentDrawAction", JSImport.Namespace)
  @js.native
  /**
    * This class uses different [events](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#events-summary) to generate a set of vertices to create a geometry with [drag mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#mode) or with two clicks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html)
    */
  open class Class ()
    extends StObject
       with SegmentDrawAction {
    def this(properties: SegmentDrawActionProperties) = this()
  }
  
  type _To = js.Object & SegmentDrawActionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsDrawSegmentDrawActionMod.foo` */
  override def _to: js.Object & SegmentDrawActionConstructor = ^
}
