package typingsJapgolly.baidumapWebSdk.global.BMap

import org.scalajs.dom.HTMLElement
import typingsJapgolly.baidumapWebSdk.BMap.ControlAnchor
import typingsJapgolly.baidumapWebSdk.BMap.Copyright
import typingsJapgolly.baidumapWebSdk.BMap.CopyrightControlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.CopyrightControl")
@js.native
open class CopyrightControl ()
  extends StObject
     with typingsJapgolly.baidumapWebSdk.BMap.CopyrightControl {
  def this(opts: CopyrightControlOptions) = this()
  
  /* CompleteClass */
  override def addCopyright(copyright: Copyright): Unit = js.native
  
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
  override def getCopyright(id: Double): Copyright = js.native
  
  /* CompleteClass */
  override def getCopyrightCollection(): js.Array[Copyright] = js.native
  
  /* CompleteClass */
  override def getOffset(): typingsJapgolly.baidumapWebSdk.BMap.Size = js.native
  
  /* CompleteClass */
  override def hide(): Unit = js.native
  
  /* CompleteClass */
  override def initialize(map: typingsJapgolly.baidumapWebSdk.BMap.Map): HTMLElement = js.native
  
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  
  /* CompleteClass */
  override def removeCopyright(id: Double): Unit = js.native
  
  /* CompleteClass */
  override def setAnchor(anchor: ControlAnchor): Unit = js.native
  
  /* CompleteClass */
  override def setOffset(offset: typingsJapgolly.baidumapWebSdk.BMap.Size): Unit = js.native
  
  /* CompleteClass */
  override def show(): Unit = js.native
}
