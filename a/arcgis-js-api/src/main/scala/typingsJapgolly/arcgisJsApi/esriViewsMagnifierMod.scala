package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Magnifier
import typingsJapgolly.arcgisJsApi.esri.MagnifierConstructor
import typingsJapgolly.arcgisJsApi.esri.MagnifierProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsMagnifierMod extends Shortcut {
  
  @JSImport("esri/views/Magnifier", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MagnifierConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/Magnifier", JSImport.Namespace)
  @js.native
  /**
    * The Magnifier allows end users to show a portion of the view as a magnified image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html)
    */
  open class Class ()
    extends StObject
       with Magnifier {
    def this(properties: MagnifierProperties) = this()
  }
  
  type _To = js.Object & MagnifierConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsMagnifierMod.foo` */
  override def _to: js.Object & MagnifierConstructor = ^
}
