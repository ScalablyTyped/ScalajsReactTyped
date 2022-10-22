package typingsJapgolly.reactMdLink

import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdLink.anon.PickLinkWithComponentProp
import typingsJapgolly.reactMdLink.typesLinkMod.LinkProps
import typingsJapgolly.reactMdLink.typesSkipToMainContentMod.SkipToMainContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/link", "Link")
  @js.native
  val Link: ForwardRefExoticComponent[
    (LinkProps & (RefAttributes[HTMLAnchorElement | ElementType])) | PickLinkWithComponentProp
  ] = js.native
  
  @JSImport("@react-md/link", "SkipToMainContent")
  @js.native
  val SkipToMainContent: ForwardRefExoticComponent[SkipToMainContentProps & RefAttributes[HTMLAnchorElement]] = js.native
}
