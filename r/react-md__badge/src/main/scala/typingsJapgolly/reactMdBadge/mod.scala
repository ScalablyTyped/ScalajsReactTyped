package typingsJapgolly.reactMdBadge

import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdBadge.typesBadgeContainerMod.BadgeContainerProps
import typingsJapgolly.reactMdBadge.typesBadgeMod.BadgeProps
import typingsJapgolly.reactMdBadge.typesBadgedButtonMod.BadgedButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/badge", "Badge")
  @js.native
  val Badge: ForwardRefExoticComponent[BadgeProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/badge", "BadgeContainer")
  @js.native
  val BadgeContainer: ForwardRefExoticComponent[BadgeContainerProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/badge", "BadgedButton")
  @js.native
  val BadgedButton: ForwardRefExoticComponent[BadgedButtonProps & RefAttributes[HTMLButtonElement]] = js.native
}
