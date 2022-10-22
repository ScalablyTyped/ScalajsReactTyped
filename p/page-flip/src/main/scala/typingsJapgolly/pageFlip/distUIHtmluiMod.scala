package typingsJapgolly.pageFlip

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.pageFlip.distPageFlipMod.PageFlip
import typingsJapgolly.pageFlip.distSettingsMod.FlipSetting
import typingsJapgolly.pageFlip.distUIUIMod.UI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUIHtmluiMod {
  
  @JSImport("page-flip/dist/UI/HTMLUI", "HTMLUI")
  @js.native
  open class HTMLUI protected () extends UI {
    def this(inBlock: HTMLElement, app: PageFlip, setting: FlipSetting, items: js.Array[HTMLElement]) = this()
    def this(inBlock: HTMLElement, app: PageFlip, setting: FlipSetting, items: NodeList[HTMLElement & Node]) = this()
    
    def updateItems(items: js.Array[HTMLElement]): Unit = js.native
    /**
      * Update page list from HTMLElements
      */
    def updateItems(items: NodeList[HTMLElement & Node]): Unit = js.native
  }
}
