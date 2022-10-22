package typingsJapgolly.pageFlip

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.pageFlip.distCollectionPageCollectionMod.PageCollection
import typingsJapgolly.pageFlip.distPageFlipMod.PageFlip
import typingsJapgolly.pageFlip.distRenderRenderMod.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionHtmlpagecollectionMod {
  
  @JSImport("page-flip/dist/Collection/HTMLPageCollection", "HTMLPageCollection")
  @js.native
  open class HTMLPageCollection protected () extends PageCollection {
    def this(app: PageFlip, render: Render, element: HTMLElement, items: js.Array[HTMLElement]) = this()
    def this(app: PageFlip, render: Render, element: HTMLElement, items: NodeList[HTMLElement & Node]) = this()
    
    /* private */ val element: Any = js.native
    
    /* private */ val pagesElement: Any = js.native
  }
}
