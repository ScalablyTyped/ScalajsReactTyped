package typingsJapgolly.pageFlip

import typingsJapgolly.pageFlip.distPagePageMod.Page
import typingsJapgolly.pageFlip.distPagePageMod.PageDensity
import typingsJapgolly.pageFlip.distRenderRenderMod.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPageImagePageMod {
  
  @JSImport("page-flip/dist/Page/ImagePage", "ImagePage")
  @js.native
  open class ImagePage protected () extends Page {
    def this(render: Render, href: String, density: PageDensity) = this()
    
    /* private */ var drawLoader: Any = js.native
    
    /* private */ val image: Any = js.native
    
    /* private */ var isLoad: Any = js.native
    
    /* private */ var loadingAngle: Any = js.native
  }
}
