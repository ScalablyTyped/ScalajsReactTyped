package typingsJapgolly.reactMdList

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListItemAddonMod {
  
  @JSImport("@react-md/list/types/ListItemAddon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ListItemAddon(hasClassNameChildrenAddonAddonAfterTypePositionForceAddonWrapProps: ListItemAddonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemAddon")(hasClassNameChildrenAddonAddonAfterTypePositionForceAddonWrapProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdList.reactMdListStrings.top
    - typingsJapgolly.reactMdList.reactMdListStrings.middle
    - typingsJapgolly.reactMdList.reactMdListStrings.bottom
  */
  trait ListItemAddonPosition extends StObject
  object ListItemAddonPosition {
    
    inline def bottom: typingsJapgolly.reactMdList.reactMdListStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.reactMdList.reactMdListStrings.bottom]
    
    inline def middle: typingsJapgolly.reactMdList.reactMdListStrings.middle = "middle".asInstanceOf[typingsJapgolly.reactMdList.reactMdListStrings.middle]
    
    inline def top: typingsJapgolly.reactMdList.reactMdListStrings.top = "top".asInstanceOf[typingsJapgolly.reactMdList.reactMdListStrings.top]
  }
  
  /* Inlined parent std.Omit<@react-md/icon.@react-md/icon.TextIconSpacingProps, 'icon' | 'iconAfter' | 'forceIconWrap'> */
  trait ListItemAddonProps extends StObject {
    
    var aboveClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The addon that should be rendered.
      */
    var addon: Node | Element
    
    /**
      * Boolean if the addon should appear after the `children`.
      */
    var addonAfter: js.UndefOr[Boolean] = js.undefined
    
    var afterClassName: js.UndefOr[String] = js.undefined
    
    var beforeClassName: js.UndefOr[String] = js.undefined
    
    var belowClassName: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var flexReverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the addon should be forced into a `<span>` with the class names
      * applied instead of attempting to clone into the provided icon. If the
      * `type` is set to `"media"` or `"large-media"`, this will default to `true`.
      */
    var forceAddonWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The vertical position to use for the addon.
      */
    var position: js.UndefOr[ListItemAddonPosition] = js.undefined
    
    var stacked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The addon type that is used to adjust the spacing styles.
      */
    var `type`: js.UndefOr[ListItemAddonType] = js.undefined
  }
  object ListItemAddonProps {
    
    inline def apply(): ListItemAddonProps = {
      val __obj = js.Dynamic.literal(addon = null)
      __obj.asInstanceOf[ListItemAddonProps]
    }
    
    extension [Self <: ListItemAddonProps](x: Self) {
      
      inline def setAboveClassName(value: String): Self = StObject.set(x, "aboveClassName", value.asInstanceOf[js.Any])
      
      inline def setAboveClassNameUndefined: Self = StObject.set(x, "aboveClassName", js.undefined)
      
      inline def setAddon(value: Node | Element): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
      
      inline def setAddonAfter(value: Boolean): Self = StObject.set(x, "addonAfter", value.asInstanceOf[js.Any])
      
      inline def setAddonAfterUndefined: Self = StObject.set(x, "addonAfter", js.undefined)
      
      inline def setAddonNull: Self = StObject.set(x, "addon", null)
      
      inline def setAddonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "addon", js.Array(value*))
      
      inline def setAddonVdomElement(value: VdomElement): Self = StObject.set(x, "addon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setAfterClassName(value: String): Self = StObject.set(x, "afterClassName", value.asInstanceOf[js.Any])
      
      inline def setAfterClassNameUndefined: Self = StObject.set(x, "afterClassName", js.undefined)
      
      inline def setBeforeClassName(value: String): Self = StObject.set(x, "beforeClassName", value.asInstanceOf[js.Any])
      
      inline def setBeforeClassNameUndefined: Self = StObject.set(x, "beforeClassName", js.undefined)
      
      inline def setBelowClassName(value: String): Self = StObject.set(x, "belowClassName", value.asInstanceOf[js.Any])
      
      inline def setBelowClassNameUndefined: Self = StObject.set(x, "belowClassName", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFlexReverse(value: Boolean): Self = StObject.set(x, "flexReverse", value.asInstanceOf[js.Any])
      
      inline def setFlexReverseUndefined: Self = StObject.set(x, "flexReverse", js.undefined)
      
      inline def setForceAddonWrap(value: Boolean): Self = StObject.set(x, "forceAddonWrap", value.asInstanceOf[js.Any])
      
      inline def setForceAddonWrapUndefined: Self = StObject.set(x, "forceAddonWrap", js.undefined)
      
      inline def setPosition(value: ListItemAddonPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      inline def setType(value: ListItemAddonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdList.reactMdListStrings.icon
    - typingsJapgolly.reactMdList.reactMdListStrings.avatar
    - typingsJapgolly.reactMdList.reactMdListStrings.media
    - typingsJapgolly.reactMdList.reactMdListStrings.`large-media`
  */
  trait ListItemAddonType extends StObject
  object ListItemAddonType {
    
    inline def avatar: typingsJapgolly.reactMdList.reactMdListStrings.avatar = "avatar".asInstanceOf[typingsJapgolly.reactMdList.reactMdListStrings.avatar]
    
    inline def icon: typingsJapgolly.reactMdList.reactMdListStrings.icon = "icon".asInstanceOf[typingsJapgolly.reactMdList.reactMdListStrings.icon]
    
    inline def `large-media`: typingsJapgolly.reactMdList.reactMdListStrings.`large-media` = "large-media".asInstanceOf[typingsJapgolly.reactMdList.reactMdListStrings.`large-media`]
    
    inline def media: typingsJapgolly.reactMdList.reactMdListStrings.media = "media".asInstanceOf[typingsJapgolly.reactMdList.reactMdListStrings.media]
  }
}
