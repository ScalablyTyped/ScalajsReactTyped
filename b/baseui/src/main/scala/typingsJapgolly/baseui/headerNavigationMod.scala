package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.Align
import typingsJapgolly.baseui.baseuiStrings.`flex-end`
import typingsJapgolly.baseui.baseuiStrings.`flex-start`
import typingsJapgolly.baseui.baseuiStrings.li_
import typingsJapgolly.baseui.baseuiStrings.nav
import typingsJapgolly.baseui.baseuiStrings.ul
import typingsJapgolly.baseui.headerNavigationHeaderNavigationMod.default
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerNavigationMod {
  
  object ALIGN {
    
    @JSImport("baseui/header-navigation", "ALIGN.center")
    @js.native
    val center: typingsJapgolly.baseui.baseuiStrings.center = js.native
    
    @JSImport("baseui/header-navigation", "ALIGN.left")
    @js.native
    val left: `flex-start` = js.native
    
    @JSImport("baseui/header-navigation", "ALIGN.right")
    @js.native
    val right: `flex-end` = js.native
  }
  
  @JSImport("baseui/header-navigation", "HeaderNavigation")
  @js.native
  open class HeaderNavigation () extends default
  
  @JSImport("baseui/header-navigation", "StyledNavigationItem")
  @js.native
  val StyledNavigationItem: StyletronComponent[li_, js.Object] = js.native
  
  @JSImport("baseui/header-navigation", "StyledNavigationList")
  @js.native
  val StyledNavigationList: StyletronComponent[ul, Align] = js.native
  
  @JSImport("baseui/header-navigation", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[nav, js.Object] = js.native
}
