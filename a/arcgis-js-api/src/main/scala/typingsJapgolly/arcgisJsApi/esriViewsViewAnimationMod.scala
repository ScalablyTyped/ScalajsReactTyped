package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ViewAnimation
import typingsJapgolly.arcgisJsApi.esri.ViewAnimationConstructor
import typingsJapgolly.arcgisJsApi.esri.ViewAnimationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsViewAnimationMod extends Shortcut {
  
  @JSImport("esri/views/ViewAnimation", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ViewAnimationConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/ViewAnimation", JSImport.Namespace)
  @js.native
  /**
    * Contains a [state](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#state) property used for checking the state of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html)
    */
  open class Class ()
    extends StObject
       with ViewAnimation {
    def this(properties: ViewAnimationProperties) = this()
  }
  
  type _To = js.Object & ViewAnimationConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsViewAnimationMod.foo` */
  override def _to: js.Object & ViewAnimationConstructor = ^
}
