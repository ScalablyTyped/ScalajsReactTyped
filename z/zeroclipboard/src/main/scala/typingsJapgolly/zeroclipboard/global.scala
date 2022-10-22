package typingsJapgolly.zeroclipboard

import org.scalajs.dom.Element
import typingsJapgolly.zeroclipboard.ZC.ZeroClipboardClient
import typingsJapgolly.zeroclipboard.ZC.ZeroClipboardStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ZeroClipboard")
  @js.native
  open class ZeroClipboard ()
    extends StObject
       with ZeroClipboardClient {
    def this(elements: Element) = this()
    def this(elements: typingsJapgolly.zeroclipboard.ZC.List[Element]) = this()
  }
  /**
    * [ZeroClipboard description]
    * @type {ZC.ZeroClipboardStatic}
    */
  @JSGlobal("ZeroClipboard")
  @js.native
  def ZeroClipboard: ZeroClipboardStatic = js.native
  inline def ZeroClipboard_=(x: ZeroClipboardStatic): Unit = js.Dynamic.global.updateDynamic("ZeroClipboard")(x.asInstanceOf[js.Any])
}
