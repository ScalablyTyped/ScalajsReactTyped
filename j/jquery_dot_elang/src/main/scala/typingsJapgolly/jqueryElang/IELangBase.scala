package typingsJapgolly.jqueryElang

import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IELangBase extends StObject {
  
  def appendAsLastChild(node: JQuery[HTMLElement], element: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  
  def createContent(): Unit = js.native
  
  def createRadioGroup(
    node: JQuery[HTMLElement],
    isMethodAppend: Boolean,
    buttonNumber: Double,
    defaultButton: Double,
    btnLabels: js.Array[String],
    clickHandler: js.Function
  ): Unit = js.native
  def createRadioGroup(
    node: JQuery[HTMLElement],
    isMethodAppend: Boolean,
    buttonNumber: Double,
    defaultButton: Double,
    btnLabels: js.Array[String],
    clickHandler: js.Function,
    btnTooltips: js.Array[String]
  ): Unit = js.native
  
  var defaults: IELangBaseDefaults = js.native
  
  var delegates: Any = js.native
  
  var description: String = js.native
  
  var element: JQuery[HTMLElement] = js.native
  
  var events: Any = js.native
  
  def getLastChild(node: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  
  def initialize(target: HTMLElement, options: Any): Unit = js.native
  
  def isRdoChecked(eSrc: HTMLElement, rdoId: String): Boolean = js.native
  
  var name: String = js.native
  
  var options: Any = js.native
  
  def processCommand(command: String): JQuery[HTMLElement] = js.native
  
  def setOptions(options: Any): Unit = js.native
}
