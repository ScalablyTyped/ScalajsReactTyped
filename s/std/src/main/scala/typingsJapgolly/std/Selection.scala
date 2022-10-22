package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Selection object represents the range of text selected by the user or the current position of the caret. To obtain a Selection object for examination or modification, call Window.getSelection(). */
@js.native
trait Selection extends StObject {
  
  /* standard dom */
  def addRange(range: org.scalajs.dom.Range): Unit = js.native
  
  /* standard dom */
  val anchorNode: org.scalajs.dom.Node | Null = js.native
  
  /* standard dom */
  val anchorOffset: Double = js.native
  
  /* standard dom */
  def collapse(): Unit = js.native
  def collapse(node: org.scalajs.dom.Node): Unit = js.native
  def collapse(node: org.scalajs.dom.Node, offset: Double): Unit = js.native
  def collapse(node: Null, offset: Double): Unit = js.native
  
  /* standard dom */
  def collapseToEnd(): Unit = js.native
  
  /* standard dom */
  def collapseToStart(): Unit = js.native
  
  /* standard dom */
  def containsNode(node: org.scalajs.dom.Node): scala.Boolean = js.native
  def containsNode(node: org.scalajs.dom.Node, allowPartialContainment: scala.Boolean): scala.Boolean = js.native
  
  /* standard dom */
  def deleteFromDocument(): Unit = js.native
  
  /* standard dom */
  def empty(): Unit = js.native
  
  /* standard dom */
  def extend(node: org.scalajs.dom.Node): Unit = js.native
  def extend(node: org.scalajs.dom.Node, offset: Double): Unit = js.native
  
  /* standard dom */
  val focusNode: org.scalajs.dom.Node | Null = js.native
  
  /* standard dom */
  val focusOffset: Double = js.native
  
  /* standard dom */
  def getRangeAt(index: Double): org.scalajs.dom.Range = js.native
  
  /* standard dom */
  val isCollapsed: scala.Boolean = js.native
  
  /* standard dom */
  val rangeCount: Double = js.native
  
  /* standard dom */
  def removeAllRanges(): Unit = js.native
  
  /* standard dom */
  def removeRange(range: org.scalajs.dom.Range): Unit = js.native
  
  /* standard dom */
  def selectAllChildren(node: org.scalajs.dom.Node): Unit = js.native
  
  /* standard dom */
  def setBaseAndExtent(
    anchorNode: org.scalajs.dom.Node,
    anchorOffset: Double,
    focusNode: org.scalajs.dom.Node,
    focusOffset: Double
  ): Unit = js.native
  
  /* standard dom */
  def setPosition(): Unit = js.native
  def setPosition(node: org.scalajs.dom.Node): Unit = js.native
  def setPosition(node: org.scalajs.dom.Node, offset: Double): Unit = js.native
  def setPosition(node: Null, offset: Double): Unit = js.native
  
  /* standard dom */
  val `type`: java.lang.String = js.native
}
