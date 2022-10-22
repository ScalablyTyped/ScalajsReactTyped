package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.GroundView
import typingsJapgolly.arcgisJsApi.esri.GroundViewConstructor
import typingsJapgolly.arcgisJsApi.esri.GroundViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsGroundViewMod extends Shortcut {
  
  @JSImport("esri/views/GroundView", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GroundViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/GroundView", JSImport.Namespace)
  @js.native
  /**
    * This class represents the view for the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) of a map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-GroundView.html)
    */
  open class Class ()
    extends StObject
       with GroundView {
    def this(properties: GroundViewProperties) = this()
  }
  
  type _To = js.Object & GroundViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsGroundViewMod.foo` */
  override def _to: js.Object & GroundViewConstructor = ^
}
