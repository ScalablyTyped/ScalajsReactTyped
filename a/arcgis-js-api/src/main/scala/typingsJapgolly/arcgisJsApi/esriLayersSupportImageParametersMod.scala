package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ImageParameters
import typingsJapgolly.arcgisJsApi.esri.ImageParametersConstructor
import typingsJapgolly.arcgisJsApi.esri.ImageParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportImageParametersMod extends Shortcut {
  
  @JSImport("esri/layers/support/ImageParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImageParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/ImageParameters", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with ImageParameters {
    def this(properties: ImageParametersProperties) = this()
  }
  
  type _To = js.Object & ImageParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportImageParametersMod.foo` */
  override def _to: js.Object & ImageParametersConstructor = ^
}
