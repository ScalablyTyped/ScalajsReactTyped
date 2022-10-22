package typingsJapgolly.storybookAddonNotes

import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPanelMod {
  
  @JSImport("@storybook/addon-notes/dist/Panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasActive: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasActive.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def NotesLink(hasHrefChildrenProps: NotesLinkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NotesLink")(hasHrefChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SyntaxHighlighter(hasClassNameChildrenProps: SyntaxHighlighterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SyntaxHighlighter")(hasClassNameChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait NotesLinkProps extends StObject {
    
    var children: japgolly.scalajs.react.facade.React.Element
    
    var href: String
  }
  object NotesLinkProps {
    
    inline def apply(children: VdomElement, href: String): NotesLinkProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotesLinkProps]
    }
    
    extension [Self <: NotesLinkProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var active: Boolean
    
    var api: API
  }
  object Props {
    
    inline def apply(active: Boolean, api: API): Props = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyntaxHighlighterProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var children: japgolly.scalajs.react.facade.React.Element
    
    var className: js.UndefOr[String] = js.undefined
  }
  object SyntaxHighlighterProps {
    
    inline def apply(children: VdomElement): SyntaxHighlighterProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyntaxHighlighterProps]
    }
    
    extension [Self <: SyntaxHighlighterProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
