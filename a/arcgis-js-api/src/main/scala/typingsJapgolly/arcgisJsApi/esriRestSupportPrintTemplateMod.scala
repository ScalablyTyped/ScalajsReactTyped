package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.PrintTemplate
import typingsJapgolly.arcgisJsApi.esri.PrintTemplateConstructor
import typingsJapgolly.arcgisJsApi.esri.PrintTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportPrintTemplateMod extends Shortcut {
  
  @JSImport("esri/rest/support/PrintTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PrintTemplateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/PrintTemplate", JSImport.Namespace)
  @js.native
  /**
    * Defines the layout template options used by [print](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-print.html) and the [PrintViewModel.print()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#print) method to generate the print page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html)
    */
  open class Class ()
    extends StObject
       with PrintTemplate {
    def this(properties: PrintTemplateProperties) = this()
  }
  
  type _To = js.Object & PrintTemplateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportPrintTemplateMod.foo` */
  override def _to: js.Object & PrintTemplateConstructor = ^
}
