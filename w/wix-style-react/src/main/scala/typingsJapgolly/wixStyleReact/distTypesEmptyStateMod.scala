package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEmptyStateMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/EmptyState", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<EmptyStateProps> */ Any = js.native
  
  @JSImport("wix-style-react/dist/types/EmptyState", "EmptyState")
  @js.native
  val EmptyState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<EmptyStateProps> */ Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.start
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.end
  */
  trait EmptyStateAlign extends StObject
  object EmptyStateAlign {
    
    inline def center: typingsJapgolly.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.center]
    
    inline def end: typingsJapgolly.wixStyleReact.wixStyleReactStrings.end = "end".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.end]
    
    inline def start: typingsJapgolly.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait EmptyStateProps extends StObject {
    
    var align: js.UndefOr[EmptyStateAlign] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classNames: js.UndefOr[`5`] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[String | Element] = js.undefined
    
    var subtitle: js.UndefOr[String | Node] = js.undefined
    
    var theme: js.UndefOr[EmptyStateTheme] = js.undefined
    
    var title: js.UndefOr[String | Node] = js.undefined
  }
  object EmptyStateProps {
    
    inline def apply(): EmptyStateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmptyStateProps]
    }
    
    extension [Self <: EmptyStateProps](x: Self) {
      
      inline def setAlign(value: EmptyStateAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNames(value: `5`): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setImage(value: String | Element): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: String | Node): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "subtitle", js.Array(value*))
      
      inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: EmptyStateTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: String | Node): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.page
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.`page-no-border`
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.section
  */
  trait EmptyStateTheme extends StObject
  object EmptyStateTheme {
    
    inline def page: typingsJapgolly.wixStyleReact.wixStyleReactStrings.page = "page".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.page]
    
    inline def `page-no-border`: typingsJapgolly.wixStyleReact.wixStyleReactStrings.`page-no-border` = "page-no-border".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.`page-no-border`]
    
    inline def section: typingsJapgolly.wixStyleReact.wixStyleReactStrings.section = "section".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.section]
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<EmptyStateProps> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distTypesEmptyStateMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<EmptyStateProps> */ Any = default
}
