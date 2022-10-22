package typingsJapgolly.reactMdMedia

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdMedia.typesMediaContainerMod.MediaContainerProps
import typingsJapgolly.reactMdMedia.typesMediaContainerMod.MediaContainerWithAspectRatioProps
import typingsJapgolly.reactMdMedia.typesMediaOverlayMod.MediaOverlayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/media", "MediaContainer")
  @js.native
  val MediaContainer: ForwardRefExoticComponent[
    (MediaContainerProps & RefAttributes[HTMLDivElement]) | (MediaContainerWithAspectRatioProps & RefAttributes[HTMLDivElement])
  ] = js.native
  
  @JSImport("@react-md/media", "MediaOverlay")
  @js.native
  val MediaOverlay: ForwardRefExoticComponent[MediaOverlayProps & RefAttributes[HTMLDivElement]] = js.native
}
