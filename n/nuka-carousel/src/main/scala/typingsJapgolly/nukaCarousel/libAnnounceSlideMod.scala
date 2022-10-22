package typingsJapgolly.nukaCarousel

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.nukaCarousel.anon.AriaLive
import typingsJapgolly.nukaCarousel.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnounceSlideMod {
  
  @JSImport("nuka-carousel/lib/announce-slide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasMessageAriaLive: AriaLive): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasMessageAriaLive.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def defaultRenderAnnounceSlideMessage(hasCurrentSlideCount: Count): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRenderAnnounceSlideMessage")(hasCurrentSlideCount.asInstanceOf[js.Any]).asInstanceOf[String]
}
