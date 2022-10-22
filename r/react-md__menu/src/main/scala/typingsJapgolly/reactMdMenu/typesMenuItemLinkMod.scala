package typingsJapgolly.reactMdMenu

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdList.typesListItemLinkMod.ListItemLinkProps
import typingsJapgolly.reactMdMenu.anon.ReadonlyHTMLAttributesHTM
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.menuitem
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuItemLinkMod {
  
  @JSImport("@react-md/menu/types/MenuItemLink", "MenuItemLink")
  @js.native
  val MenuItemLink: ForwardRefExoticComponent[
    (MenuItemLinkProps & RefAttributes[HTMLAnchorElement]) | ((Pick[MenuItemLinkWithComponentProps, String | Double]) & RefAttributes[HTMLAnchorElement])
  ] = js.native
  
  trait MenuItemLinkProps
    extends StObject
       with ListItemLinkProps {
    
    /**
      * Any additional props that should be provided to the `<li>` that wraps the
      * link component. You probably won't ever need to use this.
      *
      * @remarks \@since 5.0.0
      */
    var liProps: js.UndefOr[ReadonlyHTMLAttributesHTM] = js.undefined
    
    /**
      * The current role for the menu item. This will eventually be updated for
      * some of the other `menuitem*` widgets.
      */
    @JSName("role")
    var role_MenuItemLinkProps: js.UndefOr[menuitem] = js.undefined
  }
  object MenuItemLinkProps {
    
    inline def apply(): MenuItemLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemLinkProps]
    }
    
    extension [Self <: MenuItemLinkProps](x: Self) {
      
      inline def setLiProps(value: ReadonlyHTMLAttributesHTM): Self = StObject.set(x, "liProps", value.asInstanceOf[js.Any])
      
      inline def setLiPropsUndefined: Self = StObject.set(x, "liProps", js.undefined)
      
      inline def setRole(value: menuitem): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.reactMdList.typesListItemLinkMod.ListItemLinkProps because Already inherited
  - typingsJapgolly.reactMdList.typesListItemLinkMod.ListItemLinkWithComponentProps because var conflicts: about, accessKey, `aria-activedescendant`, `aria-atomic`, `aria-autocomplete`, `aria-busy`, `aria-checked`, `aria-colcount`, `aria-colindex`, `aria-colspan`, `aria-controls`, `aria-current`, `aria-describedby`, `aria-details`, `aria-disabled`, `aria-dropeffect`, `aria-errormessage`, `aria-expanded`, `aria-flowto`, `aria-grabbed`, `aria-haspopup`, `aria-hidden`, `aria-invalid`, `aria-keyshortcuts`, `aria-label`, `aria-labelledby`, `aria-level`, `aria-live`, `aria-modal`, `aria-multiline`, `aria-multiselectable`, `aria-orientation`, `aria-owns`, `aria-placeholder`, `aria-posinset`, `aria-pressed`, `aria-readonly`, `aria-relevant`, `aria-required`, `aria-roledescription`, `aria-rowcount`, `aria-rowindex`, `aria-rowspan`, `aria-selected`, `aria-setsize`, `aria-sort`, `aria-valuemax`, `aria-valuemin`, `aria-valuenow`, `aria-valuetext`, autoCapitalize, autoCorrect, autoSave, children, className, color, component, contentEditable, contextMenu, dangerouslySetInnerHTML, datatype, defaultChecked, defaultValue, dir, disableEnterClick, disablePressedFallback, disableProgrammaticRipple, disableRipple, disableSpacebarClick, disabled, download, draggable, enablePressedAndRipple, forceAddonWrap, handlers, height, hidden, href, hrefLang, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, leftAddon, leftAddonPosition, leftAddonType, media, onAbort, onAnimationEnd, onAnimationIteration, onAnimationStart, onAuxClick, onBeforeInput, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onCompositionEnd, onCompositionStart, onCompositionUpdate, onContextMenu, onCopy, onCut, onDoubleClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEncrypted, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPaste, onPause, onPlay, onPlaying, onPointerCancel, onPointerDown, onPointerEnter, onPointerLeave, onPointerMove, onPointerOut, onPointerOver, onPointerUp, onProgress, onRateChange, onReset, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, onTransitionEnd, onVolumeChange, onWaiting, onWheel, ping, placeholder, prefix, primaryText, property, radioGroup, referrerPolicy, rel, resource, results, rightAddon, rightAddonPosition, rightAddonType, rippleClassName, rippleClassNames, rippleContainerClassName, rippleTimeout, role, secondaryText, secondaryTextClassName, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, target, textChildren, textClassName, threeLines, title, translate, `type`, typeof, unselectable, vocab. Inlined component_ListItemLinkWithComponentProps */ trait MenuItemLinkWithComponentProps
    extends StObject
       with MenuItemLinkProps
       with /**
    * I'm not really sure of a good way to implement this, but when the
    * `component` prop is provided, all valid props from that component should
    * also be allowed.
    */
  /* key */ StringDictionary[Any] {
    
    @JSName("component")
    var component_ListItemLinkWithComponentProps: ElementType
  }
  object MenuItemLinkWithComponentProps {
    
    inline def apply(component: ElementType): MenuItemLinkWithComponentProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemLinkWithComponentProps]
    }
    
    extension [Self <: MenuItemLinkWithComponentProps](x: Self) {
      
      inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
}
