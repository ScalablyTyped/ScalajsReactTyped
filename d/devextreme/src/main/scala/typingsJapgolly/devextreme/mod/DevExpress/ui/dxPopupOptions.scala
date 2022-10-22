package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.PositionConfig
import typingsJapgolly.devextreme.mod.DevExpress.common.PositionAlignment
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxPopup.ResizeEndEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxPopup.ResizeEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxPopup.ResizeStartEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxPopup.TitleRenderedInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxPopup.ToolbarItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPopupOptions[TComponent]
  extends StObject
     with dxOverlayOptions[TComponent] {
  
  /**
    * Configures UI component visibility animations. This object contains two fields: show and hide.
    */
  @JSName("animation")
  var animation_dxPopupOptions: js.UndefOr[dxPopupAnimation] = js.undefined
  
  /**
    * Specifies the container in which to render the UI component.
    */
  var container: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * 
    */
  var dragAndResizeArea: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Specifies whether or not to allow a user to drag the popup window.
    */
  var dragEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var dragOutsideBoundary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the Popup in full-screen mode.
    */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that is executed each time the UI component is resized by one pixel.
    */
  var onResize: js.UndefOr[js.Function1[/* e */ ResizeEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when resizing ends.
    */
  var onResizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when resizing starts.
    */
  var onResizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component&apos;s title is rendered.
    */
  var onTitleRendered: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & TitleRenderedInfo, Unit]] = js.undefined
  
  /**
    * Positions the UI component.
    */
  @JSName("position")
  var position_dxPopupOptions: js.UndefOr[PositionAlignment | PositionConfig | js.Function] = js.undefined
  
  /**
    * Specifies whether or not an end user can resize the UI component.
    */
  var resizeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the widget at the initial position when users reopen it.
    */
  var restorePosition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the UI component displays the Close button.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to display the title in the popup window.
    */
  var showTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The title in the overlay window.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a custom template for the UI component title. Does not apply if the title is defined.
    */
  var titleTemplate: js.UndefOr[
    template | (js.Function1[/* titleElement */ DxElement_[HTMLElement], String | UserDefinedElement[Element]])
  ] = js.undefined
  
  /**
    * Configures toolbar items.
    */
  var toolbarItems: js.UndefOr[js.Array[ToolbarItem]] = js.undefined
}
object dxPopupOptions {
  
  inline def apply[TComponent](): dxPopupOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPopupOptions[TComponent]]
  }
  
  extension [Self <: dxPopupOptions[?], TComponent](x: Self & dxPopupOptions[TComponent]) {
    
    inline def setAnimation(value: dxPopupAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setContainer(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDragAndResizeArea(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "dragAndResizeArea", value.asInstanceOf[js.Any])
    
    inline def setDragAndResizeAreaUndefined: Self = StObject.set(x, "dragAndResizeArea", js.undefined)
    
    inline def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
    
    inline def setDragEnabledUndefined: Self = StObject.set(x, "dragEnabled", js.undefined)
    
    inline def setDragOutsideBoundary(value: Boolean): Self = StObject.set(x, "dragOutsideBoundary", value.asInstanceOf[js.Any])
    
    inline def setDragOutsideBoundaryUndefined: Self = StObject.set(x, "dragOutsideBoundary", js.undefined)
    
    inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
    inline def setOnResize(value: /* e */ ResizeEvent => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: /* e */ ResizeEvent) => value(t0).runNow()))
    
    inline def setOnResizeEnd(value: /* e */ ResizeEndEvent => Callback): Self = StObject.set(x, "onResizeEnd", js.Any.fromFunction1((t0: /* e */ ResizeEndEvent) => value(t0).runNow()))
    
    inline def setOnResizeEndUndefined: Self = StObject.set(x, "onResizeEnd", js.undefined)
    
    inline def setOnResizeStart(value: /* e */ ResizeStartEvent => Callback): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction1((t0: /* e */ ResizeStartEvent) => value(t0).runNow()))
    
    inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
    
    inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    inline def setOnTitleRendered(value: /* e */ EventInfo[TComponent] & TitleRenderedInfo => Callback): Self = StObject.set(x, "onTitleRendered", js.Any.fromFunction1((t0: /* e */ EventInfo[TComponent] & TitleRenderedInfo) => value(t0).runNow()))
    
    inline def setOnTitleRenderedUndefined: Self = StObject.set(x, "onTitleRendered", js.undefined)
    
    inline def setPosition(value: PositionAlignment | PositionConfig | js.Function): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setResizeEnabled(value: Boolean): Self = StObject.set(x, "resizeEnabled", value.asInstanceOf[js.Any])
    
    inline def setResizeEnabledUndefined: Self = StObject.set(x, "resizeEnabled", js.undefined)
    
    inline def setRestorePosition(value: Boolean): Self = StObject.set(x, "restorePosition", value.asInstanceOf[js.Any])
    
    inline def setRestorePositionUndefined: Self = StObject.set(x, "restorePosition", js.undefined)
    
    inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
    
    inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleTemplate(
      value: template | (js.Function1[/* titleElement */ DxElement_[HTMLElement], String | UserDefinedElement[Element]])
    ): Self = StObject.set(x, "titleTemplate", value.asInstanceOf[js.Any])
    
    inline def setTitleTemplateFunction1(value: /* titleElement */ DxElement_[HTMLElement] => String | UserDefinedElement[Element]): Self = StObject.set(x, "titleTemplate", js.Any.fromFunction1(value))
    
    inline def setTitleTemplateUndefined: Self = StObject.set(x, "titleTemplate", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToolbarItems(value: js.Array[ToolbarItem]): Self = StObject.set(x, "toolbarItems", value.asInstanceOf[js.Any])
    
    inline def setToolbarItemsUndefined: Self = StObject.set(x, "toolbarItems", js.undefined)
    
    inline def setToolbarItemsVarargs(value: ToolbarItem*): Self = StObject.set(x, "toolbarItems", js.Array(value*))
  }
}
