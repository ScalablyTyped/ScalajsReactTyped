package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.LineOfSight
import typingsJapgolly.arcgisJsApi.esri.LineOfSightConstructor
import typingsJapgolly.arcgisJsApi.esri.LineOfSightProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsLineOfSightMod extends Shortcut {
  
  @JSImport("esri/widgets/LineOfSight", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LineOfSightConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/LineOfSight", JSImport.Namespace)
  @js.native
  /**
    * The LineOfSight widget is a 3D analysis tool that allows you to perform visibility analysis in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight.html)
    */
  open class Class ()
    extends StObject
       with LineOfSight {
    def this(properties: LineOfSightProperties) = this()
  }
  
  type _To = js.Object & LineOfSightConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsLineOfSightMod.foo` */
  override def _to: js.Object & LineOfSightConstructor = ^
}
