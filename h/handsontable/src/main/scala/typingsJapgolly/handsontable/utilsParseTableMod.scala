package typingsJapgolly.handsontable

import org.scalajs.dom.Document
import org.scalajs.dom.HTMLTableElement
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.settingsMod.GridSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsParseTableMod {
  
  @JSImport("handsontable/utils/parseTable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def htmlToGridSettings(element: String): GridSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlToGridSettings")(element.asInstanceOf[js.Any]).asInstanceOf[GridSettings]
  inline def htmlToGridSettings(element: String, rootDocument: Document): GridSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlToGridSettings")(element.asInstanceOf[js.Any], rootDocument.asInstanceOf[js.Any])).asInstanceOf[GridSettings]
  inline def htmlToGridSettings(element: HTMLTableElement): GridSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlToGridSettings")(element.asInstanceOf[js.Any]).asInstanceOf[GridSettings]
  inline def htmlToGridSettings(element: HTMLTableElement, rootDocument: Document): GridSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlToGridSettings")(element.asInstanceOf[js.Any], rootDocument.asInstanceOf[js.Any])).asInstanceOf[GridSettings]
  
  inline def instanceToHTML(instance: default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceToHTML")(instance.asInstanceOf[js.Any]).asInstanceOf[String]
}
