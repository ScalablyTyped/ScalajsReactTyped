package typingsJapgolly.bmapgl.global.BMapGL

import org.scalajs.dom.HTMLElement
import typingsJapgolly.bmapgl.BMapGL.ControlAnchor
import typingsJapgolly.bmapgl.BMapGL.NavigationControlOptions
import typingsJapgolly.bmapgl.BMapGL.NavigationControlType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.NavigationControl")
@js.native
open class NavigationControl ()
  extends StObject
     with typingsJapgolly.bmapgl.BMapGL.NavigationControl {
  def this(opts: NavigationControlOptions) = this()
  
  /* CompleteClass */
  var defaultAnchor: ControlAnchor = js.native
  
  /* CompleteClass */
  var defaultOffset: typingsJapgolly.bmapgl.BMapGL.Size = js.native
  
  /* CompleteClass */
  override def getAnchor(): ControlAnchor = js.native
  
  /** 自定义Control在add之后立马能读取到Container, 内置Control不能 */
  /* CompleteClass */
  override def getContainer(): js.UndefOr[HTMLElement] = js.native
  
  /* CompleteClass */
  override def getOffset(): typingsJapgolly.bmapgl.BMapGL.Size = js.native
  
  /* CompleteClass */
  override def getType(): NavigationControlOptions = js.native
  
  /* CompleteClass */
  override def hide(): Unit = js.native
  
  /* CompleteClass */
  override def initialize(map: typingsJapgolly.bmapgl.BMapGL.Map): HTMLElement = js.native
  
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  
  /* CompleteClass */
  override def setAnchor(anchor: ControlAnchor): Unit = js.native
  
  /* CompleteClass */
  override def setOffset(offset: typingsJapgolly.bmapgl.BMapGL.Size): Unit = js.native
  
  /* CompleteClass */
  override def setType(`type`: NavigationControlType): Unit = js.native
  
  /* CompleteClass */
  override def show(): Unit = js.native
}
