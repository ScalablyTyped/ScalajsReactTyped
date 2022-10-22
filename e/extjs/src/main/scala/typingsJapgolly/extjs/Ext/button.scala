package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.menu.ICheckItem
import typingsJapgolly.extjs.Ext.menu.IMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object button {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.extjs.Ext.IClass because Already inherited
  - typingsJapgolly.extjs.Ext.IBase because Already inherited
  - typingsJapgolly.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ trait IButton
    extends StObject
       with IComponent {
    
    /** [Config Option] (Boolean) */
    var allowDepress: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var arrowAlign: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var arrowCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Object) */
    var baseParams: js.UndefOr[Any] = js.undefined
    
    /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
      * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
      * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
      */
    var child: js.UndefOr[js.Function1[js.UndefOr[Any], Any]] = js.undefined
    
    /** [Config Option] (String) */
    var clickEvent: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var destroyMenu: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] inherit docs
      * @param silent Object
      */
    @JSName("disable")
    var disable_IButton: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Retrieves the first descendant of this container which matches the passed selector
      * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
      * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
      */
    var down: js.UndefOr[js.Function1[js.UndefOr[Any], Any]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var enableToggle: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] inherit docs
      * @param silent Object
      */
    @JSName("enable")
    var enable_IButton: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var focusCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] This method returns an object which provides substitution parameters for the XTemplate used to create this Button s D
      * @returns Object Substitution data for a Template. The default implementation which provides data for the default template returns an Object containing the following properties:
      */
    var getTemplateArgs: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Gets the text for this Button
      * @returns String The button text
      */
    var getText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Config Option] (Number/String) */
    var glyph: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var handleMouseEvents: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Function) */
    var handler: js.UndefOr[Any] = js.undefined
    
    /** [Method] Returns true if the button has a menu and it is visible
      * @returns Boolean
      */
    var hasVisibleMenu: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Hides this button s menu if it has one
      * @returns Ext.button.Button this
      */
    var hideMenu: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Config Option] (String) */
    var href: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var hrefTarget: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var icon: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var iconAlign: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var iconCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Property] (Boolean) */
    var isAction: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Ext.menu.Menu/String/Object) */
    var menu: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var menuActiveCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var menuAlign: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var overflowText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Object) */
    var params: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var pressed: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var pressedCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var preventDefault: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Retrieves all descendant components which match the passed selector
      * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
      * @returns Ext.Component[] Components which matched the selector
      */
    var query: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Array]] = js.undefined
    
    /** [Method] Retrieves all descendant components which match the passed function
      * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
      * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
      * @returns Ext.Component[] Components matched by the passed function
      */
    var queryBy: js.UndefOr[js.Function2[js.UndefOr[Any], js.UndefOr[Any], Array]] = js.undefined
    
    /** [Method] Finds a component at any level under this container matching the id itemId
      * @param id String The id to find
      * @returns Ext.Component The matching id, null if not found
      */
    var queryById: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], IComponent]] = js.undefined
    
    /** [Config Option] (Boolean/Object) */
    var repeat: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] ("small"/"medium"/"large") */
    var scale: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var scope: js.UndefOr[Any] = js.undefined
    
    /** [Method] Sets this button s glyph
      * @param glyph Number/String the numeric charCode or string charCode/font-family. This parameter expects a format consistent with that of glyph
      * @returns Ext.button.Button this
      */
    var setGlyph: js.UndefOr[js.Function1[/* glyph */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Assigns this Button s click handler
      * @param handler Function The function to call when the button is clicked
      * @param scope Object The scope (this reference) in which the handler function is executed. Defaults to this Button.
      * @returns Ext.button.Button this
      */
    var setHandler: js.UndefOr[
        js.Function2[/* handler */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], this.type]
      ] = js.undefined
    
    /** [Method] Sets the href of the embedded anchor element to the passed URL
      * @param href String The URL to set in the anchor element.
      */
    var setHref: js.UndefOr[js.Function1[/* href */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the background image inline style of the button
      * @param icon String The path to an image to display in the button
      * @returns Ext.button.Button this
      */
    var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], this.type]] = js.undefined
    
    /** [Method] Sets the CSS class that provides a background image to use as the button s icon
      * @param cls String The CSS class providing the icon image
      * @returns Ext.button.Button this
      */
    var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], this.type]] = js.undefined
    
    /** [Method] Sets the href of the link dynamically according to the params passed and any baseParams configured
      * @param params Object Parameters to use in the href URL.
      */
    var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Method to change the scale of the button
      * @param scale String The scale to change to.
      */
    var setScale: js.UndefOr[js.Function1[/* scale */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets this Button s text
      * @param text String The button text
      * @returns Ext.button.Button this
      */
    var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], this.type]] = js.undefined
    
    /** [Method] Sets the text alignment for this button
      * @param align String The new alignment of the button text. See textAlign.
      */
    var setTextAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the tooltip for this Button
      * @param tooltip String/Object This may be:  String : A string to be used as innerHTML (html tags are accepted) to show in a tooltip Object : A configuration object for Ext.tip.QuickTipManager.register.
      * @returns Ext.button.Button this
      */
    var setTooltip: js.UndefOr[js.Function1[/* tooltip */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] inherit docs
      * @param ui Object
      */
    @JSName("setUI")
    var setUI_IButton: js.UndefOr[js.Function1[/* ui */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var showEmptyMenu: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Shows this button s menu if it has one
      * @param fromEvent Object
      */
    var showMenu: js.UndefOr[js.Function1[/* fromEvent */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Ext.Template) */
    var template: js.UndefOr[ITemplate] = js.undefined
    
    /** [Config Option] (String) */
    var text: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var textAlign: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] If a state it passed it becomes the pressed state otherwise the current state is toggled
      * @param state Boolean Force a particular state
      * @param suppressEvent Boolean True to stop events being fired when calling this method.
      * @returns Ext.button.Button this
      */
    var toggle: js.UndefOr[
        js.Function2[/* state */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean], this.type]
      ] = js.undefined
    
    /** [Config Option] (String) */
    var toggleGroup: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Function) */
    var toggleHandler: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String/Object) */
    var tooltip: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var tooltipType: js.UndefOr[java.lang.String] = js.undefined
  }
  object IButton {
    
    inline def apply(): typingsJapgolly.extjs.Ext.button.IButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.extjs.Ext.button.IButton]
    }
    
    extension [Self <: typingsJapgolly.extjs.Ext.button.IButton](x: Self) {
      
      inline def setAllowDepress(value: Boolean): Self = StObject.set(x, "allowDepress", value.asInstanceOf[js.Any])
      
      inline def setAllowDepressUndefined: Self = StObject.set(x, "allowDepress", js.undefined)
      
      inline def setArrowAlign(value: java.lang.String): Self = StObject.set(x, "arrowAlign", value.asInstanceOf[js.Any])
      
      inline def setArrowAlignUndefined: Self = StObject.set(x, "arrowAlign", js.undefined)
      
      inline def setArrowCls(value: java.lang.String): Self = StObject.set(x, "arrowCls", value.asInstanceOf[js.Any])
      
      inline def setArrowClsUndefined: Self = StObject.set(x, "arrowCls", js.undefined)
      
      inline def setBaseParams(value: Any): Self = StObject.set(x, "baseParams", value.asInstanceOf[js.Any])
      
      inline def setBaseParamsUndefined: Self = StObject.set(x, "baseParams", js.undefined)
      
      inline def setChild(value: js.UndefOr[Any] => Any): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setClickEvent(value: java.lang.String): Self = StObject.set(x, "clickEvent", value.asInstanceOf[js.Any])
      
      inline def setClickEventUndefined: Self = StObject.set(x, "clickEvent", js.undefined)
      
      inline def setDestroyMenu(value: Boolean): Self = StObject.set(x, "destroyMenu", value.asInstanceOf[js.Any])
      
      inline def setDestroyMenuUndefined: Self = StObject.set(x, "destroyMenu", js.undefined)
      
      inline def setDisable(value: /* silent */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "disable", js.Any.fromFunction1((t0: /* silent */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDown(value: js.UndefOr[Any] => Any): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setEnable(value: /* silent */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "enable", js.Any.fromFunction1((t0: /* silent */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setEnableToggle(value: Boolean): Self = StObject.set(x, "enableToggle", value.asInstanceOf[js.Any])
      
      inline def setEnableToggleUndefined: Self = StObject.set(x, "enableToggle", js.undefined)
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setFocusCls(value: java.lang.String): Self = StObject.set(x, "focusCls", value.asInstanceOf[js.Any])
      
      inline def setFocusClsUndefined: Self = StObject.set(x, "focusCls", js.undefined)
      
      inline def setGetTemplateArgs(value: CallbackTo[Any]): Self = StObject.set(x, "getTemplateArgs", value.toJsFn)
      
      inline def setGetTemplateArgsUndefined: Self = StObject.set(x, "getTemplateArgs", js.undefined)
      
      inline def setGetText(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setGetTextUndefined: Self = StObject.set(x, "getText", js.undefined)
      
      inline def setGlyph(value: Any): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      inline def setHandleMouseEvents(value: Boolean): Self = StObject.set(x, "handleMouseEvents", value.asInstanceOf[js.Any])
      
      inline def setHandleMouseEventsUndefined: Self = StObject.set(x, "handleMouseEvents", js.undefined)
      
      inline def setHandler(value: Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setHasVisibleMenu(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasVisibleMenu", value.toJsFn)
      
      inline def setHasVisibleMenuUndefined: Self = StObject.set(x, "hasVisibleMenu", js.undefined)
      
      inline def setHideMenu(value: CallbackTo[typingsJapgolly.extjs.Ext.button.IButton]): Self = StObject.set(x, "hideMenu", value.toJsFn)
      
      inline def setHideMenuUndefined: Self = StObject.set(x, "hideMenu", js.undefined)
      
      inline def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefTarget(value: java.lang.String): Self = StObject.set(x, "hrefTarget", value.asInstanceOf[js.Any])
      
      inline def setHrefTargetUndefined: Self = StObject.set(x, "hrefTarget", js.undefined)
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconAlign(value: java.lang.String): Self = StObject.set(x, "iconAlign", value.asInstanceOf[js.Any])
      
      inline def setIconAlignUndefined: Self = StObject.set(x, "iconAlign", js.undefined)
      
      inline def setIconCls(value: java.lang.String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
      
      inline def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsAction(value: Boolean): Self = StObject.set(x, "isAction", value.asInstanceOf[js.Any])
      
      inline def setIsActionUndefined: Self = StObject.set(x, "isAction", js.undefined)
      
      inline def setMenu(value: Any): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuActiveCls(value: java.lang.String): Self = StObject.set(x, "menuActiveCls", value.asInstanceOf[js.Any])
      
      inline def setMenuActiveClsUndefined: Self = StObject.set(x, "menuActiveCls", js.undefined)
      
      inline def setMenuAlign(value: java.lang.String): Self = StObject.set(x, "menuAlign", value.asInstanceOf[js.Any])
      
      inline def setMenuAlignUndefined: Self = StObject.set(x, "menuAlign", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setOverflowText(value: java.lang.String): Self = StObject.set(x, "overflowText", value.asInstanceOf[js.Any])
      
      inline def setOverflowTextUndefined: Self = StObject.set(x, "overflowText", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      inline def setPressedCls(value: java.lang.String): Self = StObject.set(x, "pressedCls", value.asInstanceOf[js.Any])
      
      inline def setPressedClsUndefined: Self = StObject.set(x, "pressedCls", js.undefined)
      
      inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setQuery(value: js.UndefOr[java.lang.String] => Array): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      inline def setQueryBy(value: (js.UndefOr[Any], js.UndefOr[Any]) => Array): Self = StObject.set(x, "queryBy", js.Any.fromFunction2(value))
      
      inline def setQueryById(value: js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "queryById", js.Any.fromFunction1(value))
      
      inline def setQueryByIdUndefined: Self = StObject.set(x, "queryById", js.undefined)
      
      inline def setQueryByUndefined: Self = StObject.set(x, "queryBy", js.undefined)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRepeat(value: Any): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setScale(value: Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSetGlyph(value: /* glyph */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.button.IButton): Self = StObject.set(x, "setGlyph", js.Any.fromFunction1(value))
      
      inline def setSetGlyphUndefined: Self = StObject.set(x, "setGlyph", js.undefined)
      
      inline def setSetHandler(
        value: (/* handler */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.button.IButton
      ): Self = StObject.set(x, "setHandler", js.Any.fromFunction2(value))
      
      inline def setSetHandlerUndefined: Self = StObject.set(x, "setHandler", js.undefined)
      
      inline def setSetHref(value: /* href */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setHref", js.Any.fromFunction1((t0: /* href */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetHrefUndefined: Self = StObject.set(x, "setHref", js.undefined)
      
      inline def setSetIcon(value: /* icon */ js.UndefOr[java.lang.String] => typingsJapgolly.extjs.Ext.button.IButton): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
      
      inline def setSetIconCls(value: /* cls */ js.UndefOr[java.lang.String] => typingsJapgolly.extjs.Ext.button.IButton): Self = StObject.set(x, "setIconCls", js.Any.fromFunction1(value))
      
      inline def setSetIconClsUndefined: Self = StObject.set(x, "setIconCls", js.undefined)
      
      inline def setSetIconUndefined: Self = StObject.set(x, "setIcon", js.undefined)
      
      inline def setSetParams(value: /* params */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setParams", js.Any.fromFunction1((t0: /* params */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetParamsUndefined: Self = StObject.set(x, "setParams", js.undefined)
      
      inline def setSetScale(value: /* scale */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setScale", js.Any.fromFunction1((t0: /* scale */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetScaleUndefined: Self = StObject.set(x, "setScale", js.undefined)
      
      inline def setSetText(value: /* text */ js.UndefOr[java.lang.String] => typingsJapgolly.extjs.Ext.button.IButton): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
      
      inline def setSetTextAlign(value: /* align */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setTextAlign", js.Any.fromFunction1((t0: /* align */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetTextAlignUndefined: Self = StObject.set(x, "setTextAlign", js.undefined)
      
      inline def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
      
      inline def setSetTooltip(value: /* tooltip */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.button.IButton): Self = StObject.set(x, "setTooltip", js.Any.fromFunction1(value))
      
      inline def setSetTooltipUndefined: Self = StObject.set(x, "setTooltip", js.undefined)
      
      inline def setSetUI(value: /* ui */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setUI", js.Any.fromFunction1((t0: /* ui */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetUIUndefined: Self = StObject.set(x, "setUI", js.undefined)
      
      inline def setShowEmptyMenu(value: Boolean): Self = StObject.set(x, "showEmptyMenu", value.asInstanceOf[js.Any])
      
      inline def setShowEmptyMenuUndefined: Self = StObject.set(x, "showEmptyMenu", js.undefined)
      
      inline def setShowMenu(value: /* fromEvent */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "showMenu", js.Any.fromFunction1((t0: /* fromEvent */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setShowMenuUndefined: Self = StObject.set(x, "showMenu", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTemplate(value: ITemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(value: java.lang.String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setToggle(
        value: (/* state */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => typingsJapgolly.extjs.Ext.button.IButton
      ): Self = StObject.set(x, "toggle", js.Any.fromFunction2(value))
      
      inline def setToggleGroup(value: java.lang.String): Self = StObject.set(x, "toggleGroup", value.asInstanceOf[js.Any])
      
      inline def setToggleGroupUndefined: Self = StObject.set(x, "toggleGroup", js.undefined)
      
      inline def setToggleHandler(value: Any): Self = StObject.set(x, "toggleHandler", value.asInstanceOf[js.Any])
      
      inline def setToggleHandlerUndefined: Self = StObject.set(x, "toggleHandler", js.undefined)
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setTooltip(value: Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipType(value: java.lang.String): Self = StObject.set(x, "tooltipType", value.asInstanceOf[js.Any])
      
      inline def setTooltipTypeUndefined: Self = StObject.set(x, "tooltipType", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait ICycle
    extends StObject
       with ISplit {
    
    /** [Config Option] (Function) */
    var changeHandler: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number/String) */
    var forceGlyph: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var forceIcon: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Gets the currently active menu item
      * @returns Ext.menu.CheckItem The active item
      */
    var getActiveItem: js.UndefOr[js.Function0[ICheckItem]] = js.undefined
    
    /** [Config Option] (Object[]) */
    var items: js.UndefOr[Array] = js.undefined
    
    /** [Property] (Ext.menu.Menu) */
    @JSName("menu")
    var menu_ICycle: js.UndefOr[IMenu] = js.undefined
    
    /** [Config Option] (String) */
    var prependText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Sets the button s active menu item
      * @param item Ext.menu.CheckItem The item to activate
      * @param suppressEvent Boolean True to prevent the button's change event from firing.
      */
    var setActiveItem: js.UndefOr[
        js.Function2[/* item */ js.UndefOr[ICheckItem], /* suppressEvent */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var showText: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] This is normally called internally on button click but can be called externally to advance the button s active item */
    var toggleSelected: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ICycle {
    
    inline def apply(): ICycle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICycle]
    }
    
    extension [Self <: ICycle](x: Self) {
      
      inline def setChangeHandler(value: Any): Self = StObject.set(x, "changeHandler", value.asInstanceOf[js.Any])
      
      inline def setChangeHandlerUndefined: Self = StObject.set(x, "changeHandler", js.undefined)
      
      inline def setForceGlyph(value: Any): Self = StObject.set(x, "forceGlyph", value.asInstanceOf[js.Any])
      
      inline def setForceGlyphUndefined: Self = StObject.set(x, "forceGlyph", js.undefined)
      
      inline def setForceIcon(value: java.lang.String): Self = StObject.set(x, "forceIcon", value.asInstanceOf[js.Any])
      
      inline def setForceIconUndefined: Self = StObject.set(x, "forceIcon", js.undefined)
      
      inline def setGetActiveItem(value: CallbackTo[ICheckItem]): Self = StObject.set(x, "getActiveItem", value.toJsFn)
      
      inline def setGetActiveItemUndefined: Self = StObject.set(x, "getActiveItem", js.undefined)
      
      inline def setItems(value: Array): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setMenu(value: IMenu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setPrependText(value: java.lang.String): Self = StObject.set(x, "prependText", value.asInstanceOf[js.Any])
      
      inline def setPrependTextUndefined: Self = StObject.set(x, "prependText", js.undefined)
      
      inline def setSetActiveItem(value: (/* item */ js.UndefOr[ICheckItem], /* suppressEvent */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "setActiveItem", js.Any.fromFunction2((t0: /* item */ js.UndefOr[ICheckItem], t1: /* suppressEvent */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
      
      inline def setSetActiveItemUndefined: Self = StObject.set(x, "setActiveItem", js.undefined)
      
      inline def setShowText(value: Boolean): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
      
      inline def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
      
      inline def setToggleSelected(value: Callback): Self = StObject.set(x, "toggleSelected", value.toJsFn)
      
      inline def setToggleSelectedUndefined: Self = StObject.set(x, "toggleSelected", js.undefined)
    }
  }
  
  type IManager = IBase
  
  trait ISplit
    extends StObject
       with typingsJapgolly.extjs.Ext.button.IButton {
    
    /** [Config Option] (Function) */
    var arrowHandler: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var arrowTooltip: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Sets this button s arrow click handler
      * @param handler Function The function to call when the arrow is clicked.
      * @param scope Object Scope for the function passed above.
      */
    var setArrowHandler: js.UndefOr[js.Function2[/* handler */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object ISplit {
    
    inline def apply(): ISplit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISplit]
    }
    
    extension [Self <: ISplit](x: Self) {
      
      inline def setArrowHandler(value: Any): Self = StObject.set(x, "arrowHandler", value.asInstanceOf[js.Any])
      
      inline def setArrowHandlerUndefined: Self = StObject.set(x, "arrowHandler", js.undefined)
      
      inline def setArrowTooltip(value: java.lang.String): Self = StObject.set(x, "arrowTooltip", value.asInstanceOf[js.Any])
      
      inline def setArrowTooltipUndefined: Self = StObject.set(x, "arrowTooltip", js.undefined)
      
      inline def setSetArrowHandler(value: (/* handler */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "setArrowHandler", js.Any.fromFunction2((t0: /* handler */ js.UndefOr[Any], t1: /* scope */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setSetArrowHandlerUndefined: Self = StObject.set(x, "setArrowHandler", js.undefined)
    }
  }
  
  trait Manager extends StObject
}
