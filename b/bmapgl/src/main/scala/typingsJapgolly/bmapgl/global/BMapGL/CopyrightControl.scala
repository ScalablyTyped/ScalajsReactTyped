package typingsJapgolly.bmapgl.global.BMapGL

import org.scalajs.dom.HTMLElement
import typingsJapgolly.bmapgl.BMapGL.ControlAnchor
import typingsJapgolly.bmapgl.BMapGL.Copyright
import typingsJapgolly.bmapgl.BMapGL.CopyrightControlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.CopyrightControl")
@js.native
open class CopyrightControl ()
  extends StObject
     with typingsJapgolly.bmapgl.BMapGL.CopyrightControl {
  def this(opts: CopyrightControlOptions) = this()
  
  /* CompleteClass */
  override def addCopyright(copyright: Copyright): Unit = js.native
  
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
  override def getCopyright(id: Double): Copyright = js.native
  
  /* CompleteClass */
  override def getCopyrightCollection(): js.Array[Copyright] = js.native
  
  /* CompleteClass */
  override def getOffset(): typingsJapgolly.bmapgl.BMapGL.Size = js.native
  
  /* CompleteClass */
  override def hide(): Unit = js.native
  
  /* CompleteClass */
  override def initialize(map: typingsJapgolly.bmapgl.BMapGL.Map): HTMLElement = js.native
  
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  
  /* CompleteClass */
  override def removeCopyright(id: Double): Unit = js.native
  
  /* CompleteClass */
  override def setAnchor(anchor: ControlAnchor): Unit = js.native
  
  /* CompleteClass */
  override def setOffset(offset: typingsJapgolly.bmapgl.BMapGL.Size): Unit = js.native
  
  /* CompleteClass */
  override def show(): Unit = js.native
}
