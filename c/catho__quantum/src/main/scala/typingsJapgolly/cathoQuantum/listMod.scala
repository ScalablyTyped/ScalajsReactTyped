package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.cathoQuantum.anon.BaseFontSize
import typingsJapgolly.cathoQuantum.anon.`16`
import typingsJapgolly.cathoQuantum.anon.`17`
import typingsJapgolly.cathoQuantum.anon.`18`
import typingsJapgolly.cathoQuantum.iconMod.IconNames
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@catho/quantum/List", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ListProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/List", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/List", "default.Content")
    @js.native
    def Content: typingsJapgolly.cathoQuantum.listMod.Content = js.native
    inline def Content_=(x: Content): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/List", "default.Header")
    @js.native
    def Header: typingsJapgolly.cathoQuantum.listMod.Header = js.native
    inline def Header_=(x: Header): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/List", "default.Item")
    @js.native
    def Item: typingsJapgolly.cathoQuantum.listMod.Item = js.native
    inline def Item_=(x: Item): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/List", "default.SubHeader")
    @js.native
    def SubHeader: typingsJapgolly.cathoQuantum.listMod.SubHeader = js.native
    inline def SubHeader_=(x: SubHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubHeader")(x.asInstanceOf[js.Any])
  }
  
  trait Content extends StObject {
    
    var children: js.UndefOr[Element | js.Array[Element]] = js.undefined
    
    var content: js.UndefOr[ItemContent] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var subheader: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[`16`] = js.undefined
  }
  object Content {
    
    inline def apply(): Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContent(value: ItemContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setSubheader(value: String): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
      
      inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
      
      inline def setTheme(value: `16`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait Header extends StObject {
    
    var theme: js.UndefOr[`17`] = js.undefined
  }
  object Header {
    
    inline def apply(): Header = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def setTheme(value: `17`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait Item extends StObject {
    
    var bullet: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Element | js.Array[Element]] = js.undefined
    
    var content: js.UndefOr[ItemContent] = js.undefined
    
    var icon: js.UndefOr[IconNames | String] = js.undefined
    
    var theme: js.UndefOr[`16`] = js.undefined
  }
  object Item {
    
    inline def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setBullet(value: String): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContent(value: ItemContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setIcon(value: IconNames | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTheme(value: `16`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ItemContent extends StObject {
    
    var header: js.UndefOr[String] = js.undefined
    
    var subheader: js.UndefOr[String] = js.undefined
  }
  object ItemContent {
    
    inline def apply(): ItemContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemContent]
    }
    
    extension [Self <: ItemContent](x: Self) {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setSubheader(value: String): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
      
      inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
    }
  }
  
  type List = japgolly.scalajs.react.facade.React.Component[ListProps & js.Object, js.Object]
  
  trait ListItem extends StObject {
    
    var content: js.UndefOr[ItemContent] = js.undefined
    
    var icon: js.UndefOr[IconNames | String] = js.undefined
  }
  object ListItem {
    
    inline def apply(): ListItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItem]
    }
    
    extension [Self <: ListItem](x: Self) {
      
      inline def setContent(value: ItemContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setIcon(value: IconNames | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
  
  trait ListProps extends StObject {
    
    var bullet: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Element | js.Array[Element]] = js.undefined
    
    var divided: js.UndefOr[Boolean] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var items: js.Array[ListItem | String]
    
    var ordered: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[BaseFontSize] = js.undefined
  }
  object ListProps {
    
    inline def apply(items: js.Array[ListItem | String]): ListProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListProps]
    }
    
    extension [Self <: ListProps](x: Self) {
      
      inline def setBullet(value: Boolean): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDivided(value: Boolean): Self = StObject.set(x, "divided", value.asInstanceOf[js.Any])
      
      inline def setDividedUndefined: Self = StObject.set(x, "divided", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setItems(value: js.Array[ListItem | String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: (ListItem | String)*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
      
      inline def setTheme(value: BaseFontSize): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait SubHeader extends StObject {
    
    var children: js.UndefOr[Element | js.Array[Element]] = js.undefined
    
    var theme: js.UndefOr[`18`] = js.undefined
  }
  object SubHeader {
    
    inline def apply(): SubHeader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubHeader]
    }
    
    extension [Self <: SubHeader](x: Self) {
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: `18`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
