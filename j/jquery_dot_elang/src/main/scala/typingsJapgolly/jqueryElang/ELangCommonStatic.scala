package typingsJapgolly.jqueryElang

import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ELangCommonStatic extends StObject {
  
  def getLabel(labelid: String): String = js.native
  def getLabel(labelid: String, langid: String): String = js.native
  
  var resource: IPageResource = js.native
  
  def setLang(langid: String): Unit = js.native
  def setLang(langid: String, node: JQuery[HTMLElement]): Unit = js.native
}
