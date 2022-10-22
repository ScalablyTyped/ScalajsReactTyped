package typingsJapgolly.reactMdTabs

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMdTabs.reactMdTabsStrings.horizontal
import typingsJapgolly.reactMdTabs.reactMdTabsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypesMod {
  
  trait TabConfig extends StObject {
    
    /**
      * The children to display in the tab. This is required and should normally
      * just be text or an icon.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * An optional className to apply to the tab.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * An optional className to apply to the `<span>` surrounding the `children`
      * of the `Tab`. You _probably_ won't need to use this.
      */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional style to apply to the `<span>` surrounding the `children` of
      * the `Tab`. You _probably_ won't need to use this.
      */
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Boolean if the tab should be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional icon to render in the `Tab` along with the normal text. If you
      * want to have an icon only tab, you should not use this prop and instead
      * just provide the icon as the tab's children.
      */
    var icon: js.UndefOr[Node] = js.undefined
    
    /**
      * Boolean if the icon should appear after the text instead of before. When
      * the `stacked` prop is also enabled, it will cause the icon to appear below
      * the text instead of above.
      */
    var iconAfter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional id to use for the tab if the default generated ids are not to
      * your liking.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if the icon and text should be stacked instead of rendered inline.
      * This is only valid when the `icon` prop has been provided.
      */
    var stacked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional style to apply to the tab.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TabConfig {
    
    inline def apply(): TabConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabConfig]
    }
    
    extension [Self <: TabConfig](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconAfter(value: Boolean): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
      
      inline def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdTabs.reactMdTabsStrings.left
    - typingsJapgolly.reactMdTabs.reactMdTabsStrings.center
    - typingsJapgolly.reactMdTabs.reactMdTabsStrings.right
  */
  trait TabsAlignment extends StObject
  object TabsAlignment {
    
    inline def center: typingsJapgolly.reactMdTabs.reactMdTabsStrings.center = "center".asInstanceOf[typingsJapgolly.reactMdTabs.reactMdTabsStrings.center]
    
    inline def left: typingsJapgolly.reactMdTabs.reactMdTabsStrings.left = "left".asInstanceOf[typingsJapgolly.reactMdTabs.reactMdTabsStrings.left]
    
    inline def right: typingsJapgolly.reactMdTabs.reactMdTabsStrings.right = "right".asInstanceOf[typingsJapgolly.reactMdTabs.reactMdTabsStrings.right]
  }
  
  trait TabsConfig extends StObject {
    
    /**
      * The alignment to use for the tabs.
      *
      * @defaultValue `"left"`
      */
    var align: js.UndefOr[TabsAlignment] = js.undefined
    
    /**
      * Boolean if the tab should automatically become active when the user
      * navigates to the tab with the arrow keys.
      *
      * @see https://www.w3.org/TR/wai-aria-practices/#kbd_selection_follows_focus
      * @defaultValue `false`
      */
    var automatic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The orientation for the tabs. When this is set to vertical, the keyboard
      * movement will be updated to use Up and Down arrow keys instead of Left and
      * Right.
      *
      * @defaultValue `"horizontal"`
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * Boolean if you know that the tabs will be scrollable which will add some
      * additional padding before the first tab to help users know that there's
      * additional tabs.
      *
      * @defaultValue `false`
      */
    var padded: js.UndefOr[Boolean] = js.undefined
  }
  object TabsConfig {
    
    inline def apply(): TabsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsConfig]
    }
    
    extension [Self <: TabsConfig](x: Self) {
      
      inline def setAlign(value: TabsAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAutomatic(value: Boolean): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
      
      inline def setAutomaticUndefined: Self = StObject.set(x, "automatic", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPadded(value: Boolean): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
      
      inline def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
    }
  }
}
