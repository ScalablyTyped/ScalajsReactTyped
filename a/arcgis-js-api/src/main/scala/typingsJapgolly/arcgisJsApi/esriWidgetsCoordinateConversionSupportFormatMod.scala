package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Format
import typingsJapgolly.arcgisJsApi.esri.FormatConstructor
import typingsJapgolly.arcgisJsApi.esri.FormatProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsCoordinateConversionSupportFormatMod extends Shortcut {
  
  @JSImport("esri/widgets/CoordinateConversion/support/Format", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FormatConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/CoordinateConversion/support/Format", JSImport.Namespace)
  @js.native
  /**
    * The Format class represents one of the [formats](esri-widgets-CoordinateConversion.html#formats) in the [Coordinate Conversion widget](esri-widgets-CoordinateConversion.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html)
    */
  open class Class ()
    extends StObject
       with Format {
    def this(properties: FormatProperties) = this()
  }
  
  type _To = js.Object & FormatConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsCoordinateConversionSupportFormatMod.foo` */
  override def _to: js.Object & FormatConstructor = ^
}
