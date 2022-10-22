package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexWord.Word.WdColor
import typingsJapgolly.activexWord.Word.WdFramesetNewFrameLocation
import typingsJapgolly.activexWord.Word.WdFramesetSizeType
import typingsJapgolly.activexWord.Word.WdFramesetType
import typingsJapgolly.activexWord.Word.WdScrollbarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Frameset")
@js.native
/* private */ open class Frameset ()
  extends StObject
     with typingsJapgolly.activexWord.Word.Frameset {
  
  /* CompleteClass */
  override def AddNewFrame(Where: WdFramesetNewFrameLocation): typingsJapgolly.activexWord.Word.Frameset = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val ChildFramesetCount: Double = js.native
  
  /* CompleteClass */
  override def ChildFramesetItem(Index: Double): typingsJapgolly.activexWord.Word.Frameset = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var FrameDefaultURL: String = js.native
  
  /* CompleteClass */
  var FrameDisplayBorders: Boolean = js.native
  
  /* CompleteClass */
  var FrameLinkToFile: Boolean = js.native
  
  /* CompleteClass */
  var FrameName: String = js.native
  
  /* CompleteClass */
  var FrameResizable: Boolean = js.native
  
  /* CompleteClass */
  var FrameScrollbarType: WdScrollbarType = js.native
  
  /* CompleteClass */
  var FramesetBorderColor: WdColor = js.native
  
  /* CompleteClass */
  var FramesetBorderWidth: Double = js.native
  
  /* CompleteClass */
  var Height: Double = js.native
  
  /* CompleteClass */
  var HeightType: WdFramesetSizeType = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val ParentFrameset: typingsJapgolly.activexWord.Word.Frameset = js.native
  
  /* CompleteClass */
  override val Type: WdFramesetType = js.native
  
  /* CompleteClass */
  var Width: Double = js.native
  
  /* CompleteClass */
  var WidthType: WdFramesetSizeType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.Frameset_typekey")
  var WordDotFrameset_typekey: typingsJapgolly.activexWord.Word.Frameset = js.native
}
