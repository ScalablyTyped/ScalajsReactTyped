package typingsJapgolly.bmapgl.global.BMapGL

import org.scalajs.dom.HTMLElement
import typingsJapgolly.bmapgl.BMapGL.ControlAnchor
import typingsJapgolly.bmapgl.BMapGL.OverviewMapControlOptions
import typingsJapgolly.bmapgl.anon.IsOpen
import typingsJapgolly.bmapgl.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.OverviewMapControl")
@js.native
open class OverviewMapControl protected ()
  extends StObject
     with typingsJapgolly.bmapgl.BMapGL.OverviewMapControl {
  def this(opts: OverviewMapControlOptions) = this()
  
  /* CompleteClass */
  override def changeView(): Unit = js.native
  
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
  override def getSize(): typingsJapgolly.bmapgl.BMapGL.Size = js.native
  
  /* CompleteClass */
  override def hide(): Unit = js.native
  
  /* CompleteClass */
  override def initialize(map: typingsJapgolly.bmapgl.BMapGL.Map): HTMLElement = js.native
  
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  
  /* CompleteClass */
  override def onviewchanged(event: IsOpen): Unit = js.native
  
  /* CompleteClass */
  override def onviewchanging(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def setAnchor(anchor: ControlAnchor): Unit = js.native
  
  /* CompleteClass */
  override def setOffset(offset: typingsJapgolly.bmapgl.BMapGL.Size): Unit = js.native
  
  /* CompleteClass */
  override def setSize(size: typingsJapgolly.bmapgl.BMapGL.Size): Unit = js.native
  
  /* CompleteClass */
  override def show(): Unit = js.native
}
