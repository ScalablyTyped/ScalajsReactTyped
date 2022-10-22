package typingsJapgolly.webix.mod

import typingsJapgolly.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBar extends StObject {
  
  def hideProgress(): Unit = js.native
  
  def showProgress(): Unit = js.native
  def showProgress(config: Any): Unit = js.native
}
object ProgressBar {
  
  inline def apply: ProgressBar = ^.asInstanceOf[js.Dynamic].selectDynamic("ProgressBar").asInstanceOf[ProgressBar]
}
