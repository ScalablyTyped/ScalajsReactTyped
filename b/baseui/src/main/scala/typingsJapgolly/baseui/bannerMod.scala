package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.ActionPosition
import typingsJapgolly.baseui.anon.BackgroundColor
import typingsJapgolly.baseui.anon.IncludesArtwork
import typingsJapgolly.baseui.anon.Nested
import typingsJapgolly.baseui.bannerTypesMod.ActionContent
import typingsJapgolly.baseui.bannerTypesMod.ArtworkContent
import typingsJapgolly.baseui.bannerTypesMod.BannerProps
import typingsJapgolly.baseui.baseuiStrings.button
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bannerMod {
  
  @JSImport("baseui/banner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<{ readonly below :'below',  readonly trailing :'trailing'}> */
  object ACTION_POSITION {
    
    @JSImport("baseui/banner", "ACTION_POSITION.below")
    @js.native
    val below: typingsJapgolly.baseui.baseuiStrings.below = js.native
    
    @JSImport("baseui/banner", "ACTION_POSITION.trailing")
    @js.native
    val trailing: typingsJapgolly.baseui.baseuiStrings.trailing = js.native
  }
  
  /* Inlined std.Readonly<{ readonly icon :'icon',  readonly badge :'badge'}> */
  object ARTWORK_TYPE {
    
    @JSImport("baseui/banner", "ARTWORK_TYPE.badge")
    @js.native
    val badge: typingsJapgolly.baseui.baseuiStrings.badge = js.native
    
    @JSImport("baseui/banner", "ARTWORK_TYPE.icon")
    @js.native
    val icon: typingsJapgolly.baseui.baseuiStrings.icon = js.native
  }
  
  inline def Banner(hasActionArtworkChildrenHierarchyKindOverridesNestedTitle: BannerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Banner")(hasActionArtworkChildrenHierarchyKindOverridesNestedTitle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Readonly<{ readonly low :'low',  readonly high :'high'}> */
  object HIERARCHY {
    
    @JSImport("baseui/banner", "HIERARCHY.high")
    @js.native
    val high: typingsJapgolly.baseui.baseuiStrings.high = js.native
    
    @JSImport("baseui/banner", "HIERARCHY.low")
    @js.native
    val low: typingsJapgolly.baseui.baseuiStrings.low = js.native
  }
  
  /* Inlined std.Readonly<{ readonly info :'info',  readonly negative :'negative',  readonly positive :'positive',  readonly warning :'warning'}> */
  object KIND {
    
    @JSImport("baseui/banner", "KIND.info")
    @js.native
    val info: typingsJapgolly.baseui.baseuiStrings.info = js.native
    
    @JSImport("baseui/banner", "KIND.negative")
    @js.native
    val negative: typingsJapgolly.baseui.baseuiStrings.negative = js.native
    
    @JSImport("baseui/banner", "KIND.positive")
    @js.native
    val positive: typingsJapgolly.baseui.baseuiStrings.positive = js.native
    
    @JSImport("baseui/banner", "KIND.warning")
    @js.native
    val warning: typingsJapgolly.baseui.baseuiStrings.warning = js.native
  }
  
  @JSImport("baseui/banner", "StyledBelowContent")
  @js.native
  val StyledBelowContent: StyletronComponent[div, ActionPosition] = js.native
  
  @JSImport("baseui/banner", "StyledLeadingContent")
  @js.native
  val StyledLeadingContent: StyletronComponent[div, IncludesArtwork] = js.native
  
  @JSImport("baseui/banner", "StyledMessage")
  @js.native
  val StyledMessage: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/banner", "StyledMessageContent")
  @js.native
  val StyledMessageContent: StyletronComponent[div, ActionPosition] = js.native
  
  @JSImport("baseui/banner", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, BackgroundColor] = js.native
  
  @JSImport("baseui/banner", "StyledTitle")
  @js.native
  val StyledTitle: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/banner", "StyledTrailingButtonContainer")
  @js.native
  val StyledTrailingButtonContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/banner", "StyledTrailingContent")
  @js.native
  val StyledTrailingContent: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/banner", "StyledTrailingIconButton")
  @js.native
  val StyledTrailingIconButton: StyletronComponent[button, Nested] = js.native
  
  type ActionContentT = ActionContent
  
  type ArtworkContentT = ArtworkContent
  
  type PropsT = BannerProps
}
