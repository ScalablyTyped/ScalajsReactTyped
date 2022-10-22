package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.BackgroundColorType
import typingsJapgolly.baseui.anon.BackgroundPosition
import typingsJapgolly.baseui.baseuiStrings.button
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.messageCardTypesMod.MessageCardProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageCardMod {
  
  @JSImport("baseui/message-card", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<{ readonly light :'light',  readonly dark :'dark'}> */
  object BACKGROUND_COLOR_TYPE {
    
    @JSImport("baseui/message-card", "BACKGROUND_COLOR_TYPE.dark")
    @js.native
    val dark: typingsJapgolly.baseui.baseuiStrings.dark = js.native
    
    @JSImport("baseui/message-card", "BACKGROUND_COLOR_TYPE.light")
    @js.native
    val light: typingsJapgolly.baseui.baseuiStrings.light = js.native
  }
  
  /* Inlined std.Readonly<{ readonly secondary :'secondary',  readonly tertiary :'tertiary'}> */
  object BUTTON_KIND {
    
    @JSImport("baseui/message-card", "BUTTON_KIND.secondary")
    @js.native
    val secondary: typingsJapgolly.baseui.baseuiStrings.secondary = js.native
    
    @JSImport("baseui/message-card", "BUTTON_KIND.tertiary")
    @js.native
    val tertiary: typingsJapgolly.baseui.baseuiStrings.tertiary = js.native
  }
  
  /* Inlined std.Readonly<{ readonly top :'top',  readonly trailing :'trailing'}> */
  object IMAGE_LAYOUT {
    
    @JSImport("baseui/message-card", "IMAGE_LAYOUT.top")
    @js.native
    val top: typingsJapgolly.baseui.baseuiStrings.top = js.native
    
    @JSImport("baseui/message-card", "IMAGE_LAYOUT.trailing")
    @js.native
    val trailing: typingsJapgolly.baseui.baseuiStrings.trailing = js.native
  }
  
  inline def MessageCard(
    hasBackgroundColorBackgroundColorTypePropButtonKindButtonLabelHeadingImageOnClickOverridesParagraph: MessageCardProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MessageCard")(hasBackgroundColorBackgroundColorTypePropButtonKindButtonLabelHeadingImageOnClickOverridesParagraph.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/message-card", "StyledContentContainer")
  @js.native
  val StyledContentContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/message-card", "StyledHeadingContainer")
  @js.native
  val StyledHeadingContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/message-card", "StyledImage")
  @js.native
  val StyledImage: StyletronComponent[div, BackgroundPosition] = js.native
  
  @JSImport("baseui/message-card", "StyledParagraphContainer")
  @js.native
  val StyledParagraphContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/message-card", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[button, BackgroundColorType] = js.native
}
