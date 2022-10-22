package typingsJapgolly.wixUiCore.anon

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationPaginationDotdriverMod.NavButtonName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeInput extends StObject {
  
  def blurInput(): Unit = js.native
  
  def changeInput(newValue: String): Unit = js.native
  
  def click(): Any = js.native
  
  def clickNavButton(name: NavButtonName): Unit = js.native
  
  def clickPage(page: Double): Unit = js.native
  
  def commitInput(): Unit = js.native
  
  def exists(): Boolean = js.native
  
  def getCurrentPage(): org.scalajs.dom.Element = js.native
  
  def getNavButton(name: NavButtonName): org.scalajs.dom.Element = js.native
  
  def getPageByIndex(): org.scalajs.dom.Element = js.native
  def getPageByIndex(idx: Double): org.scalajs.dom.Element = js.native
  
  def getPageByNumber(n: Double): org.scalajs.dom.Element = js.native
  
  def getPageInput(): HTMLInputElement = js.native
  
  def getPageLabels(): js.Array[String] = js.native
  
  def getPageStrip(): Any = js.native
  
  def getPages(): js.Array[org.scalajs.dom.Element] = js.native
  
  def getTotalPagesField(): org.scalajs.dom.Element = js.native
  
  def inputHasError(): Boolean = js.native
  
  var root: Any = js.native
  
  var simulate: Any = js.native
}
