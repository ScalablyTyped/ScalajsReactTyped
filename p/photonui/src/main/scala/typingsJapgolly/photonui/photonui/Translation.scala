package typingsJapgolly.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Translation
  extends StObject
     with Base {
  
  def addCatalogs(catalogs: StringDictionary[Any]): Unit = js.native
  
  def enableDomScan(enable: Boolean): Unit = js.native
  
  def gettext(string: String): String = js.native
  def gettext(string: String, replacements: StringDictionary[String]): String = js.native
  
  def guessUserLanguage(): String = js.native
  
  def lazyGettext(string: String): String = js.native
  def lazyGettext(string: String, replacements: StringDictionary[String]): String = js.native
  
  var locale: String = js.native
  
  def updateDomTranslation(): Unit = js.native
}
