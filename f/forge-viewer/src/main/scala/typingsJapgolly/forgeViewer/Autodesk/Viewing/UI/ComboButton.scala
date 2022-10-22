package typingsJapgolly.forgeViewer.Autodesk.Viewing.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComboButton
  extends StObject
     with Button {
  
  def addControl(button: Button): Unit = js.native
  
  def removeControl(button: Button): Unit = js.native
  
  def restoreDefault(): Unit = js.native
  
  def saveAsDefault(): Unit = js.native
  
  var subMenu: ControlGroup = js.native
}
