package typingsJapgolly.wixStyleReact.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.wixStyleReact.distTypesCardFolderTabsTabMod.CardFolderTabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "CardFolderTabs")
@js.native
open class CardFolderTabs ()
  extends typingsJapgolly.wixStyleReact.distTypesCardFolderTabsMod.default
/* static members */
object CardFolderTabs {
  
  @JSImport("wix-style-react", "CardFolderTabs")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Tab(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Tab")().asInstanceOf[Element]
  inline def Tab(props: CardFolderTabProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Tab")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
