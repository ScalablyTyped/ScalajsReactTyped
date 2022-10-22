package typingsJapgolly.baidumapWebSdk.global.BMap

import org.scalajs.dom.HTMLElement
import typingsJapgolly.baidumapWebSdk.BMap.ControlAnchor
import typingsJapgolly.baidumapWebSdk.BMap.NavigationControlOptions
import typingsJapgolly.baidumapWebSdk.BMap.NavigationControlType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.NavigationControl")
@js.native
open class NavigationControl ()
  extends StObject
     with typingsJapgolly.baidumapWebSdk.BMap.NavigationControl {
  def this(opts: NavigationControlOptions) = this()
  
  /* CompleteClass */
  var defaultAnchor: ControlAnchor = js.native
  
  /* CompleteClass */
  var defaultOffset: typingsJapgolly.baidumapWebSdk.BMap.Size = js.native
  
  /* CompleteClass */
  override def getAnchor(): ControlAnchor = js.native
  
  /** 自定义Control在add之后立马能读取到Container, 内置Control不能 */
  /* CompleteClass */
  override def getContainer(): js.UndefOr[HTMLElement] = js.native
  
  /* CompleteClass */
  override def getOffset(): typingsJapgolly.baidumapWebSdk.BMap.Size = js.native
  
  /* CompleteClass */
  override def getType(): NavigationControlOptions = js.native
  
  /* CompleteClass */
  override def hide(): Unit = js.native
  
  /* CompleteClass */
  override def initialize(map: typingsJapgolly.baidumapWebSdk.BMap.Map): HTMLElement = js.native
  
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  
  /* CompleteClass */
  override def setAnchor(anchor: ControlAnchor): Unit = js.native
  
  /* CompleteClass */
  override def setOffset(offset: typingsJapgolly.baidumapWebSdk.BMap.Size): Unit = js.native
  
  /* CompleteClass */
  override def setType(`type`: NavigationControlType): Unit = js.native
  
  /* CompleteClass */
  override def show(): Unit = js.native
}
