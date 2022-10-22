package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.FieldGroupConfig
import typingsJapgolly.arcgisJsApi.esri.FieldGroupConfigConstructor
import typingsJapgolly.arcgisJsApi.esri.FieldGroupConfigProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureFormFieldGroupConfigMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureForm/FieldGroupConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FieldGroupConfigConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureForm/FieldGroupConfig", JSImport.Namespace)
  @js.native
  /**
    * Configuration options for configuring grouped fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html)
    */
  open class Class ()
    extends StObject
       with FieldGroupConfig {
    def this(properties: FieldGroupConfigProperties) = this()
  }
  
  type _To = js.Object & FieldGroupConfigConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureFormFieldGroupConfigMod.foo` */
  override def _to: js.Object & FieldGroupConfigConstructor = ^
}
