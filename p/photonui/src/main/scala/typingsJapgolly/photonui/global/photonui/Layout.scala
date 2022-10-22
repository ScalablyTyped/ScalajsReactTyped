package typingsJapgolly.photonui.global.photonui

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("photonui.Layout")
@js.native
open class Layout ()
  extends StObject
     with typingsJapgolly.photonui.photonui.Layout {
  
  /* CompleteClass */
  var absolutePosition: X = js.native
  
  /* CompleteClass */
  override def addClass(className: String): Unit = js.native
  
  /* CompleteClass */
  var child: typingsJapgolly.photonui.photonui.Widget = js.native
  
  /* CompleteClass */
  var childName: String = js.native
  
  /* CompleteClass */
  var containerNode: HTMLElement = js.native
  
  // readonly
  /* CompleteClass */
  var contextMenu: typingsJapgolly.photonui.photonui.PopupWindow = js.native
  
  /* CompleteClass */
  var contextMenuName: String = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* CompleteClass */
  override def hide(): Unit = js.native
  
  // readonly
  /* CompleteClass */
  var horizontalChildExpansion: Boolean = js.native
  
  /* CompleteClass */
  var html: HTMLElement = js.native
  
  // readonly
  /* CompleteClass */
  var layoutOptions: StringDictionary[Any] = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  // readonly
  /* CompleteClass */
  var offsetHeight: Double = js.native
  
  /* CompleteClass */
  var offsetWidth: Double = js.native
  
  // readonly
  /* CompleteClass */
  var parent: typingsJapgolly.photonui.photonui.Widget = js.native
  
  /* CompleteClass */
  var parentName: String = js.native
  
  /* CompleteClass */
  override def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: Any): Unit = js.native
  
  /* CompleteClass */
  override def removeCallback(id: String): Unit = js.native
  
  /* CompleteClass */
  override def removeChild(widget: typingsJapgolly.photonui.photonui.Widget): Unit = js.native
  
  /* CompleteClass */
  override def removeClass(className: String): Unit = js.native
  
  /* CompleteClass */
  override def show(): Unit = js.native
  
  /* CompleteClass */
  var tooltip: String = js.native
  
  /* CompleteClass */
  override def unparent(): Unit = js.native
  
  /* CompleteClass */
  var verticalChildExpansion: Boolean = js.native
  
  /* CompleteClass */
  var visible: Boolean = js.native
}
