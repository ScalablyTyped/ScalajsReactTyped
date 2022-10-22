package typingsJapgolly.reactEmailEditor.mod

import typingsJapgolly.reactEmailEditor.reactEmailEditorStrings.displayCondition
import typingsJapgolly.reactEmailEditor.reactEmailEditorStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component
  extends typingsJapgolly.react.mod.Component[EmailEditorProps, js.Object, Any] {
  
  def addEventListener(`type`: String, callback: EventCallback): Unit = js.native
  
  def exportHtml(callback: ExportHtmlCallback): Unit = js.native
  
  def loadDesign(design: Design): Unit = js.native
  
  @JSName("registerCallback")
  def registerCallback_displayCondition(`type`: displayCondition, callback: DisplayConditionCallback): Unit = js.native
  @JSName("registerCallback")
  def registerCallback_image(`type`: image, callback: FileUploadCallback): Unit = js.native
  
  def saveDesign(callback: SaveDesignCallback): Unit = js.native
  
  def setMergeTags(mergeTags: js.Array[MergeTag]): Unit = js.native
  
  /* private */ def unlayerReady(): Unit = js.native
}
