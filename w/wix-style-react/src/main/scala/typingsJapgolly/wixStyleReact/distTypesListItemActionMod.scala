package typingsJapgolly.wixStyleReact

import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.AnchorHTMLAttributes
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.std.Partial
import typingsJapgolly.wixStyleReact.anon.As
import typingsJapgolly.wixStyleReact.anon.DictadditionalProps
import typingsJapgolly.wixStyleReact.anon.DictadditionalPropsAs
import typingsJapgolly.wixStyleReact.anon.DisabledIdOverrideOptionStyleValue
import typingsJapgolly.wixStyleReact.anon.Highlighted
import typingsJapgolly.wixStyleReact.anon.OnClick
import typingsJapgolly.wixStyleReact.anon.PrefixIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemActionMod {
  
  @JSImport("wix-style-react/dist/types/ListItemAction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/ListItemAction", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[ListItemActionProps, js.Object, Any]
  
  inline def listItemActionBuilder[T /* <: Partial[ListItemActionProps] */](data: PrefixIcon): DisabledIdOverrideOptionStyleValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("listItemActionBuilder")(data.asInstanceOf[js.Any]).asInstanceOf[DisabledIdOverrideOptionStyleValue[T]]
  
  type ListItemAction = PureComponent[ListItemActionProps, js.Object, Any]
  
  type ListItemActionAsAnchorProps[T] = AnchorHTMLAttributes[HTMLAnchorElement] & T & As
  
  type ListItemActionAsButtonProps[T] = ButtonHTMLAttributes[HTMLButtonElement] & T & OnClick
  
  type ListItemActionAsComponentProps[T] = T & DictadditionalProps
  
  type ListItemActionGenericProps[T] = T & DictadditionalPropsAs
  
  type ListItemActionProps = ListItemActionWithAsProp[Highlighted]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
  */
  trait ListItemActionSize extends StObject
  object ListItemActionSize {
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive
  */
  trait ListItemActionSkin extends StObject
  object ListItemActionSkin {
    
    inline def dark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def destructive: typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
  }
  
  type ListItemActionWithAsProp[T] = ListItemActionAsButtonProps[T] | ListItemActionAsAnchorProps[T] | ListItemActionGenericProps[T] | ListItemActionAsComponentProps[T]
}
