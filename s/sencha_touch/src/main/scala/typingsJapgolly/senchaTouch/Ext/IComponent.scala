package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.data.IModel
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponent extends IEvented {
  /** [Method] Adds a CSS class or classes to this Component s rendered element
  		* @param cls String The CSS class to add.
  		* @param prefix String Optional prefix to add to each class.
  		* @param suffix String Optional suffix to add to each class.
  		*/
  var addCls: js.UndefOr[
    js.Function3[
      /* cls */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var baseCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number/String) */
  var border: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var bottom: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var centered: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/String[]) */
  var cls: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var componentCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.Element/HTMLElement/String) */
  var contentEl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.undefined
  /** [Method] Disables this Component */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var disabledCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dock: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var docked: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Enables this Component */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String/Mixed) */
  var enterAnimation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Mixed) */
  var exitAnimation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var flex: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var floating: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var floatingCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /** [Method] Prepares information on aligning this to component using alignment
  		* @param component Object
  		* @param alignment Object
  		*/
  var getAlignmentInfo: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Returns the value of baseCls
  		* @returns String
  		*/
  var getBaseCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of border
  		* @returns Number/String
  		*/
  var getBorder: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of bottom
  		* @returns any
  		*/
  var getBottom: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of centered
  		* @returns Boolean
  		*/
  var getCentered: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns any
  		*/
  var getCls: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of contentEl
  		* @returns Ext.Element/HTMLElement/String
  		*/
  var getContentEl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of disabled
  		* @returns Boolean
  		*/
  var getDisabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of disabledCls
  		* @returns String
  		*/
  var getDisabledCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of docked
  		* @returns String
  		*/
  var getDocked: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Retrieves the top level element representing this component
  		* @returns Ext.dom.Element
  		*/
  var getEl: js.UndefOr[js.Function0[typingsJapgolly.senchaTouch.Ext.dom.IElement]] = js.undefined
  /** [Method] Returns the value of enterAnimation
  		* @returns String/Mixed
  		*/
  var getEnterAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of exitAnimation
  		* @returns String/Mixed
  		*/
  var getExitAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of flex
  		* @returns Number
  		*/
  var getFlex: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of floatingCls
  		* @returns String
  		*/
  var getFloatingCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of height
  		* @returns Number/String
  		*/
  var getHeight: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of hidden
  		* @returns Boolean
  		*/
  var getHidden: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of hiddenCls
  		* @returns String
  		*/
  var getHiddenCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of hideAnimation
  		* @returns String/Mixed
  		*/
  var getHideAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of html
  		* @returns String/Ext.Element/HTMLElement
  		*/
  var getHtml: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of itemId
  		* @returns String
  		*/
  var getItemId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of left
  		* @returns Number/String
  		*/
  var getLeft: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of margin
  		* @returns Number/String
  		*/
  var getMargin: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of maxHeight
  		* @returns Number/String
  		*/
  var getMaxHeight: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of maxWidth
  		* @returns Number/String
  		*/
  var getMaxWidth: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of minHeight
  		* @returns Number/String
  		*/
  var getMinHeight: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of minWidth
  		* @returns Number/String
  		*/
  var getMinWidth: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of padding
  		* @returns Number/String
  		*/
  var getPadding: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the parent of this component if it has one
  		* @returns Ext.Component The parent of this component.
  		*/
  var getParent: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the value of plugins
  		* @returns Object/Array
  		*/
  var getPlugins: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of record
  		* @returns Ext.data.Model
  		*/
  var getRecord: js.UndefOr[js.Function0[IModel]] = js.undefined
  /** [Method] Returns the value of renderTo
  		* @returns Ext.Element
  		*/
  var getRenderTo: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Returns the value of right
  		* @returns Number/String
  		*/
  var getRight: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of showAnimation
  		* @returns String/Mixed
  		*/
  var getShowAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the height and width of the Component
  		* @returns Object The current height and width of the Component.
  		*/
  var getSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of style
  		* @returns String/Object
  		*/
  var getStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of styleHtmlCls
  		* @returns String
  		*/
  var getStyleHtmlCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of styleHtmlContent
  		* @returns Boolean
  		*/
  var getStyleHtmlContent: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of top
  		* @returns Number/String
  		*/
  var getTop: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of tpl
  		* @returns String/String[]/Ext.Template/Ext.XTemplate[]
  		*/
  var getTpl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of tplWriteMode
  		* @returns String
  		*/
  var getTplWriteMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of ui
  		* @returns String
  		*/
  var getUi: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of width
  		* @returns Number/String
  		*/
  var getWidth: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
  		* @returns String The xtype hierarchy string.
  		*/
  var getXTypes: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of zIndex
  		* @returns Number
  		*/
  var getZIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns true if this component has a parent
  		* @returns Boolean true if this component has a parent.
  		*/
  var hasParent: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Number/String) */
  var height: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var hiddenCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Hides this Component optionally using an animation
  		* @param animation Object/Boolean You can specify an animation here or a bool to use the hideAnimation config.
  		* @returns Ext.Component
  		*/
  var hide: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (String/Mixed) */
  var hideAnimation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hideOnMaskTap: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/Ext.Element/HTMLElement) */
  var html: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Allows addition of behavior to the rendering phase  */
  var initialize: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns true if this Component is currently disabled
  		* @returns Boolean true if currently disabled.
  		*/
  var isDisabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this Component is currently hidden
  		* @returns Boolean true if currently hidden.
  		*/
  var isHidden: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Tests whether or not this Component is of a specific xtype
  		* @param xtype String The xtype to check for this Component.
  		* @param shallow Boolean false to check whether this Component is descended from the xtype (this is the default), or true to check whether this Component is directly of the specified xtype.
  		* @returns Boolean true if this component descends from the specified xtype, false otherwise.
  		*/
  var isXType: js.UndefOr[
    js.Function2[/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean], Boolean]
  ] = js.undefined
  /** [Config Option] (String) */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var layoutOnOrientationChange: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number/String) */
  var left: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var maxHeight: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var maxWidth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var minHeight: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var minWidth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var modal: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var monitorOrientation: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number/String) */
  var padding: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/Array) */
  var plugins: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.data.Model) */
  var record: js.UndefOr[IModel] = js.undefined
  /** [Method] Removes the given CSS class es from this Component s rendered element
  		* @param cls String The class(es) to remove.
  		* @param prefix String Optional prefix to prepend before each class.
  		* @param suffix String Optional suffix to append to each class.
  		*/
  var removeCls: js.UndefOr[
    js.Function3[
      /* cls */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Ext.Element) */
  var renderTo: js.UndefOr[IElement] = js.undefined
  /** [Method] Replaces specified classes with the newly specified classes
  		* @param oldCls String The class(es) to remove.
  		* @param newCls String The class(es) to add.
  		* @param prefix String Optional prefix to prepend before each class.
  		* @param suffix String Optional suffix to append to each class.
  		*/
  var replaceCls: js.UndefOr[
    js.Function4[
      /* oldCls */ js.UndefOr[java.lang.String], 
      /* newCls */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Resets top right bottom and left configurations to null which will un float this component  */
  var resetFloating: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number/String) */
  var right: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean/String/Object) */
  var scroll: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of baseCls
  		* @param baseCls String The new value.
  		*/
  var setBaseCls: js.UndefOr[js.Function1[/* baseCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of border
  		* @param border Number/String The new value.
  		*/
  var setBorder: js.UndefOr[js.Function1[/* border */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of bottom
  		* @param bottom Number/String The new value.
  		*/
  var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of centered
  		* @param centered Boolean The new value.
  		*/
  var setCentered: js.UndefOr[js.Function1[/* centered */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String/String[] The new value.
  		*/
  var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of contentEl
  		* @param contentEl Ext.Element/HTMLElement/String The new value.
  		*/
  var setContentEl: js.UndefOr[js.Function1[/* contentEl */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of disabled
  		* @param disabled Boolean The new value.
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of disabledCls
  		* @param disabledCls String The new value.
  		*/
  var setDisabledCls: js.UndefOr[js.Function1[/* disabledCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of docked
  		* @param docked String The new value.
  		*/
  var setDocked: js.UndefOr[js.Function1[/* docked */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of draggable
  		* @param draggable Object The new value.
  		*/
  var setDraggable: js.UndefOr[js.Function1[/* draggable */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of enterAnimation
  		* @param enterAnimation String/Mixed The new value.
  		*/
  var setEnterAnimation: js.UndefOr[js.Function1[/* enterAnimation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of exitAnimation
  		* @param exitAnimation String/Mixed The new value.
  		*/
  var setExitAnimation: js.UndefOr[js.Function1[/* exitAnimation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of flex
  		* @param flex Number The new value.
  		*/
  var setFlex: js.UndefOr[js.Function1[/* flex */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Used to update the floating state of this component
  		* @param floating Boolean true if you want to float this component.
  		*/
  var setFloating: js.UndefOr[js.Function1[/* floating */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of floatingCls
  		* @param floatingCls String The new value.
  		*/
  var setFloatingCls: js.UndefOr[js.Function1[/* floatingCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of height
  		* @param height Number/String The new value.
  		*/
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean The new value.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of hiddenCls
  		* @param hiddenCls String The new value.
  		*/
  var setHiddenCls: js.UndefOr[js.Function1[/* hiddenCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of hideAnimation
  		* @param hideAnimation String/Mixed The new value.
  		*/
  var setHideAnimation: js.UndefOr[js.Function1[/* hideAnimation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of html
  		* @param html String/Ext.Element/HTMLElement The new value.
  		*/
  var setHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of itemId
  		* @param itemId String The new value.
  		*/
  var setItemId: js.UndefOr[js.Function1[/* itemId */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of left
  		* @param left Number/String The new value.
  		*/
  var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of margin
  		* @param margin Number/String The new value.
  		*/
  var setMargin: js.UndefOr[js.Function1[/* margin */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of maxHeight
  		* @param maxHeight Number/String The new value.
  		*/
  var setMaxHeight: js.UndefOr[js.Function1[/* maxHeight */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of maxWidth
  		* @param maxWidth Number/String The new value.
  		*/
  var setMaxWidth: js.UndefOr[js.Function1[/* maxWidth */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of minHeight
  		* @param minHeight Number/String The new value.
  		*/
  var setMinHeight: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of minWidth
  		* @param minWidth Number/String The new value.
  		*/
  var setMinWidth: js.UndefOr[js.Function1[/* minWidth */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of padding
  		* @param padding Number/String The new value.
  		*/
  var setPadding: js.UndefOr[js.Function1[/* padding */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of plugins
  		* @param plugins Object/Array The new value.
  		*/
  var setPlugins: js.UndefOr[js.Function1[/* plugins */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of record
  		* @param record Ext.data.Model The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Unit]] = js.undefined
  /** [Method] Sets the value of renderTo
  		* @param renderTo Ext.Element The new value.
  		*/
  var setRenderTo: js.UndefOr[js.Function1[/* renderTo */ js.UndefOr[IElement], Unit]] = js.undefined
  /** [Method] Sets the value of right
  		* @param right Number/String The new value.
  		*/
  var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This method has moved to Ext Container  */
  var setScrollable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of showAnimation
  		* @param showAnimation String/Mixed The new value.
  		*/
  var setShowAnimation: js.UndefOr[js.Function1[/* showAnimation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the size of the Component
  		* @param width Number The new width for the Component.
  		* @param height Number The new height for the Component.
  		*/
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] Sets the value of style
  		* @param style String/Object The new value.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of styleHtmlCls
  		* @param styleHtmlCls String The new value.
  		*/
  var setStyleHtmlCls: js.UndefOr[js.Function1[/* styleHtmlCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of styleHtmlContent
  		* @param styleHtmlContent Boolean The new value.
  		*/
  var setStyleHtmlContent: js.UndefOr[js.Function1[/* styleHtmlContent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of top
  		* @param top Number/String The new value.
  		*/
  var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of tpl
  		* @param tpl String/String[]/Ext.Template/Ext.XTemplate[] The new value.
  		*/
  var setTpl: js.UndefOr[js.Function1[/* tpl */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of tplWriteMode
  		* @param tplWriteMode String The new value.
  		*/
  var setTplWriteMode: js.UndefOr[js.Function1[/* tplWriteMode */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of ui
  		* @param ui String The new value.
  		*/
  var setUi: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of width
  		* @param width Number/String The new value.
  		*/
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of zIndex
  		* @param zIndex Number The new value.
  		*/
  var setZIndex: js.UndefOr[js.Function1[/* zIndex */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Shows this component optionally using an animation
  		* @param animation Object/Boolean You can specify an animation here or a bool to use the showAnimation config.
  		* @returns Ext.Component
  		*/
  var show: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (String/Mixed) */
  var showAnimation: js.UndefOr[js.Any] = js.undefined
  /** [Method] Shows this component by another component
  		* @param component Ext.Component The target component to show this component by.
  		* @param alignment String The specific alignment.
  		*/
  var showBy: js.UndefOr[
    js.Function2[
      /* component */ js.UndefOr[this.type], 
      /* alignment */ js.UndefOr[java.lang.String], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var stopMaskTapEvent: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var styleHtmlCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var styleHtmlContent: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number/String) */
  var top: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/String[]/Ext.Template/Ext.XTemplate[]) */
  var tpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var tplWriteMode: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var ui: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Walks up the ownerCt axis looking for an ancestor Container which matches the passed simple selector
  		* @param selector String The simple selector to test.
  		* @returns Ext.Container The matching ancestor Container (or undefined if no match was found).
  		*/
  var up: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IContainer]] = js.undefined
  /** [Method] Updates the HTML content of the Component  */
  var update: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Updates the styleHtmlCls configuration
  		* @param newHtmlCls Object
  		* @param oldHtmlCls Object
  		*/
  var updateStyleHtmlCls: js.UndefOr[
    js.Function2[/* newHtmlCls */ js.UndefOr[js.Any], /* oldHtmlCls */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Number/String) */
  var width: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String[]) */
  var xtype: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IComponent {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addCls: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    baseCls: java.lang.String = null,
    border: js.Any = null,
    bottom: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    cls: js.Any = null,
    componentCls: java.lang.String = null,
    config: js.Any = null,
    contentEl: js.Any = null,
    data: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    disable: js.UndefOr[Callback] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledCls: java.lang.String = null,
    dock: java.lang.String = null,
    docked: java.lang.String = null,
    enable: js.UndefOr[Callback] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    enterAnimation: js.Any = null,
    exitAnimation: js.Any = null,
    extend: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    flex: Int | Double = null,
    floating: js.UndefOr[Boolean] = js.undefined,
    floatingCls: java.lang.String = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    getAlignmentInfo: (/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any]) => Callback = null,
    getBaseCls: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getBorder: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBottom: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getCentered: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getCls: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getContentEl: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDisabled: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getDisabledCls: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getDocked: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getEl: js.UndefOr[CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement]] = js.undefined,
    getEnterAnimation: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getExitAnimation: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getFlex: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getFloatingCls: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getHeight: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getHidden: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getHiddenCls: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getHideAnimation: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getHtml: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    getItemId: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getLeft: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMargin: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMaxHeight: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMaxWidth: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMinHeight: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMinWidth: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getPadding: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getParent: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    getPlugins: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getRecord: js.UndefOr[CallbackTo[IModel]] = js.undefined,
    getRenderTo: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    getRight: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getShowAnimation: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getStyle: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getStyleHtmlCls: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getStyleHtmlContent: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getTop: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTpl: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTplWriteMode: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getUi: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getWidth: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getXTypes: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getZIndex: js.UndefOr[CallbackTo[Double]] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => CallbackTo[Boolean] = null,
    hasParent: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    height: js.Any = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hiddenCls: java.lang.String = null,
    hide: /* animation */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    hideAnimation: js.Any = null,
    hideOnMaskTap: js.UndefOr[Boolean] = js.undefined,
    html: js.Any = null,
    id: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    initialize: js.UndefOr[Callback] = js.undefined,
    isDisabled: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isHidden: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isXType: (/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean]) => CallbackTo[Boolean] = null,
    itemId: java.lang.String = null,
    layoutOnOrientationChange: js.UndefOr[Boolean] = js.undefined,
    left: js.Any = null,
    listeners: js.Any = null,
    margin: js.Any = null,
    maxHeight: js.Any = null,
    maxWidth: js.Any = null,
    minHeight: js.Any = null,
    minWidth: js.Any = null,
    mixins: js.Any = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    monitorOrientation: js.UndefOr[Boolean] = js.undefined,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    padding: js.Any = null,
    platformConfig: js.Any = null,
    plugins: js.Any = null,
    record: IModel = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeCls: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    renderTo: IElement = null,
    replaceCls: (/* oldCls */ js.UndefOr[java.lang.String], /* newCls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Callback = null,
    resetFloating: js.UndefOr[Callback] = js.undefined,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    right: js.Any = null,
    scroll: js.Any = null,
    self: IClass = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Callback = null,
    setBorder: /* border */ js.UndefOr[js.Any] => Callback = null,
    setBottom: /* bottom */ js.UndefOr[js.Any] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setCentered: /* centered */ js.UndefOr[Boolean] => Callback = null,
    setCls: /* cls */ js.UndefOr[js.Any] => Callback = null,
    setContentEl: /* contentEl */ js.UndefOr[js.Any] => Callback = null,
    setData: /* data */ js.UndefOr[js.Any] => Callback = null,
    setDisabled: /* disabled */ js.UndefOr[Boolean] => Callback = null,
    setDisabledCls: /* disabledCls */ js.UndefOr[java.lang.String] => Callback = null,
    setDocked: /* docked */ js.UndefOr[java.lang.String] => Callback = null,
    setDraggable: /* draggable */ js.UndefOr[js.Any] => Callback = null,
    setEnterAnimation: /* enterAnimation */ js.UndefOr[js.Any] => Callback = null,
    setExitAnimation: /* exitAnimation */ js.UndefOr[js.Any] => Callback = null,
    setFlex: /* flex */ js.UndefOr[Double] => Callback = null,
    setFloating: /* floating */ js.UndefOr[Boolean] => Callback = null,
    setFloatingCls: /* floatingCls */ js.UndefOr[java.lang.String] => Callback = null,
    setHeight: /* height */ js.UndefOr[js.Any] => Callback = null,
    setHidden: /* hidden */ js.UndefOr[Boolean] => Callback = null,
    setHiddenCls: /* hiddenCls */ js.UndefOr[java.lang.String] => Callback = null,
    setHideAnimation: /* hideAnimation */ js.UndefOr[js.Any] => Callback = null,
    setHtml: /* html */ js.UndefOr[js.Any] => Callback = null,
    setItemId: /* itemId */ js.UndefOr[java.lang.String] => Callback = null,
    setLeft: /* left */ js.UndefOr[js.Any] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setMargin: /* margin */ js.UndefOr[js.Any] => Callback = null,
    setMaxHeight: /* maxHeight */ js.UndefOr[js.Any] => Callback = null,
    setMaxWidth: /* maxWidth */ js.UndefOr[js.Any] => Callback = null,
    setMinHeight: /* minHeight */ js.UndefOr[js.Any] => Callback = null,
    setMinWidth: /* minWidth */ js.UndefOr[js.Any] => Callback = null,
    setPadding: /* padding */ js.UndefOr[js.Any] => Callback = null,
    setPlugins: /* plugins */ js.UndefOr[js.Any] => Callback = null,
    setRecord: /* record */ js.UndefOr[IModel] => Callback = null,
    setRenderTo: /* renderTo */ js.UndefOr[IElement] => Callback = null,
    setRight: /* right */ js.UndefOr[js.Any] => Callback = null,
    setScrollable: js.UndefOr[Callback] = js.undefined,
    setShowAnimation: /* showAnimation */ js.UndefOr[js.Any] => Callback = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback = null,
    setStyle: /* style */ js.UndefOr[js.Any] => Callback = null,
    setStyleHtmlCls: /* styleHtmlCls */ js.UndefOr[java.lang.String] => Callback = null,
    setStyleHtmlContent: /* styleHtmlContent */ js.UndefOr[Boolean] => Callback = null,
    setTop: /* top */ js.UndefOr[js.Any] => Callback = null,
    setTpl: /* tpl */ js.UndefOr[js.Any] => Callback = null,
    setTplWriteMode: /* tplWriteMode */ js.UndefOr[java.lang.String] => Callback = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => Callback = null,
    setWidth: /* width */ js.UndefOr[js.Any] => Callback = null,
    setZIndex: /* zIndex */ js.UndefOr[Double] => Callback = null,
    show: /* animation */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    showAnimation: js.Any = null,
    showBy: (/* component */ js.UndefOr[IComponent], /* alignment */ js.UndefOr[java.lang.String]) => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stopMaskTapEvent: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    styleHtmlCls: java.lang.String = null,
    styleHtmlContent: js.UndefOr[Boolean] = js.undefined,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    top: js.Any = null,
    tpl: js.Any = null,
    tplWriteMode: java.lang.String = null,
    ui: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    up: /* selector */ js.UndefOr[java.lang.String] => CallbackTo[IContainer] = null,
    update: js.UndefOr[Callback] = js.undefined,
    updateStyleHtmlCls: (/* newHtmlCls */ js.UndefOr[js.Any], /* oldHtmlCls */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null,
    width: js.Any = null,
    xtype: java.lang.String = null,
    zIndex: Int | Double = null
  ): IComponent = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction3((t0: /* cls */ js.UndefOr[java.lang.String], t1: /* prefix */ js.UndefOr[java.lang.String], t2: /* suffix */ js.UndefOr[java.lang.String]) => addCls(t0, t1, t2).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (componentCls != null) __obj.updateDynamic("componentCls")(componentCls.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contentEl != null) __obj.updateDynamic("contentEl")(contentEl.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    disable.foreach(p => __obj.updateDynamic("disable")(p.toJsFn))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledCls != null) __obj.updateDynamic("disabledCls")(disabledCls.asInstanceOf[js.Any])
    if (dock != null) __obj.updateDynamic("dock")(dock.asInstanceOf[js.Any])
    if (docked != null) __obj.updateDynamic("docked")(docked.asInstanceOf[js.Any])
    enable.foreach(p => __obj.updateDynamic("enable")(p.toJsFn))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation.asInstanceOf[js.Any])
    if (exitAnimation != null) __obj.updateDynamic("exitAnimation")(exitAnimation.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    if (floatingCls != null) __obj.updateDynamic("floatingCls")(floatingCls.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (getAlignmentInfo != null) __obj.updateDynamic("getAlignmentInfo")(js.Any.fromFunction2((t0: /* component */ js.UndefOr[js.Any], t1: /* alignment */ js.UndefOr[js.Any]) => getAlignmentInfo(t0, t1).runNow()))
    getBaseCls.foreach(p => __obj.updateDynamic("getBaseCls")(p.toJsFn))
    getBorder.foreach(p => __obj.updateDynamic("getBorder")(p.toJsFn))
    getBottom.foreach(p => __obj.updateDynamic("getBottom")(p.toJsFn))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getCentered.foreach(p => __obj.updateDynamic("getCentered")(p.toJsFn))
    getCls.foreach(p => __obj.updateDynamic("getCls")(p.toJsFn))
    getContentEl.foreach(p => __obj.updateDynamic("getContentEl")(p.toJsFn))
    getData.foreach(p => __obj.updateDynamic("getData")(p.toJsFn))
    getDisabled.foreach(p => __obj.updateDynamic("getDisabled")(p.toJsFn))
    getDisabledCls.foreach(p => __obj.updateDynamic("getDisabledCls")(p.toJsFn))
    getDocked.foreach(p => __obj.updateDynamic("getDocked")(p.toJsFn))
    getEl.foreach(p => __obj.updateDynamic("getEl")(p.toJsFn))
    getEnterAnimation.foreach(p => __obj.updateDynamic("getEnterAnimation")(p.toJsFn))
    getExitAnimation.foreach(p => __obj.updateDynamic("getExitAnimation")(p.toJsFn))
    getFlex.foreach(p => __obj.updateDynamic("getFlex")(p.toJsFn))
    getFloatingCls.foreach(p => __obj.updateDynamic("getFloatingCls")(p.toJsFn))
    getHeight.foreach(p => __obj.updateDynamic("getHeight")(p.toJsFn))
    getHidden.foreach(p => __obj.updateDynamic("getHidden")(p.toJsFn))
    getHiddenCls.foreach(p => __obj.updateDynamic("getHiddenCls")(p.toJsFn))
    getHideAnimation.foreach(p => __obj.updateDynamic("getHideAnimation")(p.toJsFn))
    getHtml.foreach(p => __obj.updateDynamic("getHtml")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getItemId.foreach(p => __obj.updateDynamic("getItemId")(p.toJsFn))
    getLeft.foreach(p => __obj.updateDynamic("getLeft")(p.toJsFn))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    getMargin.foreach(p => __obj.updateDynamic("getMargin")(p.toJsFn))
    getMaxHeight.foreach(p => __obj.updateDynamic("getMaxHeight")(p.toJsFn))
    getMaxWidth.foreach(p => __obj.updateDynamic("getMaxWidth")(p.toJsFn))
    getMinHeight.foreach(p => __obj.updateDynamic("getMinHeight")(p.toJsFn))
    getMinWidth.foreach(p => __obj.updateDynamic("getMinWidth")(p.toJsFn))
    getPadding.foreach(p => __obj.updateDynamic("getPadding")(p.toJsFn))
    getParent.foreach(p => __obj.updateDynamic("getParent")(p.toJsFn))
    getPlugins.foreach(p => __obj.updateDynamic("getPlugins")(p.toJsFn))
    getRecord.foreach(p => __obj.updateDynamic("getRecord")(p.toJsFn))
    getRenderTo.foreach(p => __obj.updateDynamic("getRenderTo")(p.toJsFn))
    getRight.foreach(p => __obj.updateDynamic("getRight")(p.toJsFn))
    getShowAnimation.foreach(p => __obj.updateDynamic("getShowAnimation")(p.toJsFn))
    getSize.foreach(p => __obj.updateDynamic("getSize")(p.toJsFn))
    getStyle.foreach(p => __obj.updateDynamic("getStyle")(p.toJsFn))
    getStyleHtmlCls.foreach(p => __obj.updateDynamic("getStyleHtmlCls")(p.toJsFn))
    getStyleHtmlContent.foreach(p => __obj.updateDynamic("getStyleHtmlContent")(p.toJsFn))
    getTop.foreach(p => __obj.updateDynamic("getTop")(p.toJsFn))
    getTpl.foreach(p => __obj.updateDynamic("getTpl")(p.toJsFn))
    getTplWriteMode.foreach(p => __obj.updateDynamic("getTplWriteMode")(p.toJsFn))
    getUi.foreach(p => __obj.updateDynamic("getUi")(p.toJsFn))
    getWidth.foreach(p => __obj.updateDynamic("getWidth")(p.toJsFn))
    getXTypes.foreach(p => __obj.updateDynamic("getXTypes")(p.toJsFn))
    getZIndex.foreach(p => __obj.updateDynamic("getZIndex")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    hasParent.foreach(p => __obj.updateDynamic("hasParent")(p.toJsFn))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hiddenCls != null) __obj.updateDynamic("hiddenCls")(hiddenCls.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: /* animation */ js.UndefOr[js.Any]) => hide(t0).runNow()))
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnMaskTap)) __obj.updateDynamic("hideOnMaskTap")(hideOnMaskTap.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initialize.foreach(p => __obj.updateDynamic("initialize")(p.toJsFn))
    isDisabled.foreach(p => __obj.updateDynamic("isDisabled")(p.toJsFn))
    isHidden.foreach(p => __obj.updateDynamic("isHidden")(p.toJsFn))
    if (isXType != null) __obj.updateDynamic("isXType")(js.Any.fromFunction2((t0: /* xtype */ js.UndefOr[java.lang.String], t1: /* shallow */ js.UndefOr[scala.Boolean]) => isXType(t0, t1).runNow()))
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (!js.isUndefined(layoutOnOrientationChange)) __obj.updateDynamic("layoutOnOrientationChange")(layoutOnOrientationChange.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (!js.isUndefined(monitorOrientation)) __obj.updateDynamic("monitorOrientation")(monitorOrientation.asInstanceOf[js.Any])
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction3((t0: /* cls */ js.UndefOr[java.lang.String], t1: /* prefix */ js.UndefOr[java.lang.String], t2: /* suffix */ js.UndefOr[java.lang.String]) => removeCls(t0, t1, t2).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (renderTo != null) __obj.updateDynamic("renderTo")(renderTo.asInstanceOf[js.Any])
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction4((t0: /* oldCls */ js.UndefOr[java.lang.String], t1: /* newCls */ js.UndefOr[java.lang.String], t2: /* prefix */ js.UndefOr[java.lang.String], t3: /* suffix */ js.UndefOr[java.lang.String]) => replaceCls(t0, t1, t2, t3).runNow()))
    resetFloating.foreach(p => __obj.updateDynamic("resetFloating")(p.toJsFn))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1((t0: /* baseCls */ js.UndefOr[java.lang.String]) => setBaseCls(t0).runNow()))
    if (setBorder != null) __obj.updateDynamic("setBorder")(js.Any.fromFunction1((t0: /* border */ js.UndefOr[js.Any]) => setBorder(t0).runNow()))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1((t0: /* bottom */ js.UndefOr[js.Any]) => setBottom(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setCentered != null) __obj.updateDynamic("setCentered")(js.Any.fromFunction1((t0: /* centered */ js.UndefOr[scala.Boolean]) => setCentered(t0).runNow()))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[js.Any]) => setCls(t0).runNow()))
    if (setContentEl != null) __obj.updateDynamic("setContentEl")(js.Any.fromFunction1((t0: /* contentEl */ js.UndefOr[js.Any]) => setContentEl(t0).runNow()))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[js.Any]) => setData(t0).runNow()))
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1((t0: /* disabled */ js.UndefOr[scala.Boolean]) => setDisabled(t0).runNow()))
    if (setDisabledCls != null) __obj.updateDynamic("setDisabledCls")(js.Any.fromFunction1((t0: /* disabledCls */ js.UndefOr[java.lang.String]) => setDisabledCls(t0).runNow()))
    if (setDocked != null) __obj.updateDynamic("setDocked")(js.Any.fromFunction1((t0: /* docked */ js.UndefOr[java.lang.String]) => setDocked(t0).runNow()))
    if (setDraggable != null) __obj.updateDynamic("setDraggable")(js.Any.fromFunction1((t0: /* draggable */ js.UndefOr[js.Any]) => setDraggable(t0).runNow()))
    if (setEnterAnimation != null) __obj.updateDynamic("setEnterAnimation")(js.Any.fromFunction1((t0: /* enterAnimation */ js.UndefOr[js.Any]) => setEnterAnimation(t0).runNow()))
    if (setExitAnimation != null) __obj.updateDynamic("setExitAnimation")(js.Any.fromFunction1((t0: /* exitAnimation */ js.UndefOr[js.Any]) => setExitAnimation(t0).runNow()))
    if (setFlex != null) __obj.updateDynamic("setFlex")(js.Any.fromFunction1((t0: /* flex */ js.UndefOr[scala.Double]) => setFlex(t0).runNow()))
    if (setFloating != null) __obj.updateDynamic("setFloating")(js.Any.fromFunction1((t0: /* floating */ js.UndefOr[scala.Boolean]) => setFloating(t0).runNow()))
    if (setFloatingCls != null) __obj.updateDynamic("setFloatingCls")(js.Any.fromFunction1((t0: /* floatingCls */ js.UndefOr[java.lang.String]) => setFloatingCls(t0).runNow()))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[js.Any]) => setHeight(t0).runNow()))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1((t0: /* hidden */ js.UndefOr[scala.Boolean]) => setHidden(t0).runNow()))
    if (setHiddenCls != null) __obj.updateDynamic("setHiddenCls")(js.Any.fromFunction1((t0: /* hiddenCls */ js.UndefOr[java.lang.String]) => setHiddenCls(t0).runNow()))
    if (setHideAnimation != null) __obj.updateDynamic("setHideAnimation")(js.Any.fromFunction1((t0: /* hideAnimation */ js.UndefOr[js.Any]) => setHideAnimation(t0).runNow()))
    if (setHtml != null) __obj.updateDynamic("setHtml")(js.Any.fromFunction1((t0: /* html */ js.UndefOr[js.Any]) => setHtml(t0).runNow()))
    if (setItemId != null) __obj.updateDynamic("setItemId")(js.Any.fromFunction1((t0: /* itemId */ js.UndefOr[java.lang.String]) => setItemId(t0).runNow()))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1((t0: /* left */ js.UndefOr[js.Any]) => setLeft(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setMargin != null) __obj.updateDynamic("setMargin")(js.Any.fromFunction1((t0: /* margin */ js.UndefOr[js.Any]) => setMargin(t0).runNow()))
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1((t0: /* maxHeight */ js.UndefOr[js.Any]) => setMaxHeight(t0).runNow()))
    if (setMaxWidth != null) __obj.updateDynamic("setMaxWidth")(js.Any.fromFunction1((t0: /* maxWidth */ js.UndefOr[js.Any]) => setMaxWidth(t0).runNow()))
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1((t0: /* minHeight */ js.UndefOr[js.Any]) => setMinHeight(t0).runNow()))
    if (setMinWidth != null) __obj.updateDynamic("setMinWidth")(js.Any.fromFunction1((t0: /* minWidth */ js.UndefOr[js.Any]) => setMinWidth(t0).runNow()))
    if (setPadding != null) __obj.updateDynamic("setPadding")(js.Any.fromFunction1((t0: /* padding */ js.UndefOr[js.Any]) => setPadding(t0).runNow()))
    if (setPlugins != null) __obj.updateDynamic("setPlugins")(js.Any.fromFunction1((t0: /* plugins */ js.UndefOr[js.Any]) => setPlugins(t0).runNow()))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IModel]) => setRecord(t0).runNow()))
    if (setRenderTo != null) __obj.updateDynamic("setRenderTo")(js.Any.fromFunction1((t0: /* renderTo */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.IElement]) => setRenderTo(t0).runNow()))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1((t0: /* right */ js.UndefOr[js.Any]) => setRight(t0).runNow()))
    setScrollable.foreach(p => __obj.updateDynamic("setScrollable")(p.toJsFn))
    if (setShowAnimation != null) __obj.updateDynamic("setShowAnimation")(js.Any.fromFunction1((t0: /* showAnimation */ js.UndefOr[js.Any]) => setShowAnimation(t0).runNow()))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2((t0: /* width */ js.UndefOr[scala.Double], t1: /* height */ js.UndefOr[scala.Double]) => setSize(t0, t1).runNow()))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1((t0: /* style */ js.UndefOr[js.Any]) => setStyle(t0).runNow()))
    if (setStyleHtmlCls != null) __obj.updateDynamic("setStyleHtmlCls")(js.Any.fromFunction1((t0: /* styleHtmlCls */ js.UndefOr[java.lang.String]) => setStyleHtmlCls(t0).runNow()))
    if (setStyleHtmlContent != null) __obj.updateDynamic("setStyleHtmlContent")(js.Any.fromFunction1((t0: /* styleHtmlContent */ js.UndefOr[scala.Boolean]) => setStyleHtmlContent(t0).runNow()))
    if (setTop != null) __obj.updateDynamic("setTop")(js.Any.fromFunction1((t0: /* top */ js.UndefOr[js.Any]) => setTop(t0).runNow()))
    if (setTpl != null) __obj.updateDynamic("setTpl")(js.Any.fromFunction1((t0: /* tpl */ js.UndefOr[js.Any]) => setTpl(t0).runNow()))
    if (setTplWriteMode != null) __obj.updateDynamic("setTplWriteMode")(js.Any.fromFunction1((t0: /* tplWriteMode */ js.UndefOr[java.lang.String]) => setTplWriteMode(t0).runNow()))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1((t0: /* ui */ js.UndefOr[java.lang.String]) => setUi(t0).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[js.Any]) => setWidth(t0).runNow()))
    if (setZIndex != null) __obj.updateDynamic("setZIndex")(js.Any.fromFunction1((t0: /* zIndex */ js.UndefOr[scala.Double]) => setZIndex(t0).runNow()))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1((t0: /* animation */ js.UndefOr[js.Any]) => show(t0).runNow()))
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation.asInstanceOf[js.Any])
    if (showBy != null) __obj.updateDynamic("showBy")(js.Any.fromFunction2((t0: /* component */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.IComponent], t1: /* alignment */ js.UndefOr[java.lang.String]) => showBy(t0, t1).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(stopMaskTapEvent)) __obj.updateDynamic("stopMaskTapEvent")(stopMaskTapEvent.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styleHtmlCls != null) __obj.updateDynamic("styleHtmlCls")(styleHtmlCls.asInstanceOf[js.Any])
    if (!js.isUndefined(styleHtmlContent)) __obj.updateDynamic("styleHtmlContent")(styleHtmlContent.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (tplWriteMode != null) __obj.updateDynamic("tplWriteMode")(tplWriteMode.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => up(t0).runNow()))
    update.foreach(p => __obj.updateDynamic("update")(p.toJsFn))
    if (updateStyleHtmlCls != null) __obj.updateDynamic("updateStyleHtmlCls")(js.Any.fromFunction2((t0: /* newHtmlCls */ js.UndefOr[js.Any], t1: /* oldHtmlCls */ js.UndefOr[js.Any]) => updateStyleHtmlCls(t0, t1).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xtype != null) __obj.updateDynamic("xtype")(xtype.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponent]
  }
}

