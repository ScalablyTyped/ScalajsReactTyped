package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTabPanel.ItemLike
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTabPanel.TitleClickEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTabPanel.TitleHoldEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTabPanel.TitleRenderedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTabPanelOptions[TItem /* <: ItemLike */, TKey]
  extends StObject
     with dxMultiViewBaseOptions[dxTabPanel[TItem, TKey], TItem, TKey] {
  
  /**
    * Specifies a custom template for item titles.
    */
  var itemTitleTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ TItem, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * A function that is executed when a tab is clicked or tapped.
    */
  var onTitleClick: js.UndefOr[(js.Function1[/* e */ TitleClickEvent[TItem, TKey], Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a tab has been held for a specified period.
    */
  var onTitleHold: js.UndefOr[js.Function1[/* e */ TitleHoldEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after a tab is rendered.
    */
  var onTitleRendered: js.UndefOr[js.Function1[/* e */ TitleRenderedEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * Specifies whether to repaint only those elements whose data changed.
    */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying if tabs in the title are scrolled by content.
    */
  var scrollByContent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean indicating whether or not to add scrolling support for tabs in the title.
    */
  var scrollingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether navigation buttons should be available when tabs exceed the UI component&apos;s width.
    */
  var showNavButtons: js.UndefOr[Boolean] = js.undefined
}
object dxTabPanelOptions {
  
  inline def apply[TItem /* <: ItemLike */, TKey](): dxTabPanelOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTabPanelOptions[TItem, TKey]]
  }
  
  extension [Self <: dxTabPanelOptions[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (dxTabPanelOptions[TItem, TKey])) {
    
    inline def setItemTitleTemplate(
      value: template | (js.Function3[
          /* itemData */ TItem, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "itemTitleTemplate", value.asInstanceOf[js.Any])
    
    inline def setItemTitleTemplateFunction3(
      value: (/* itemData */ TItem, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "itemTitleTemplate", js.Any.fromFunction3(value))
    
    inline def setItemTitleTemplateUndefined: Self = StObject.set(x, "itemTitleTemplate", js.undefined)
    
    inline def setOnTitleClick(value: (js.Function1[/* e */ TitleClickEvent[TItem, TKey], Unit]) | String): Self = StObject.set(x, "onTitleClick", value.asInstanceOf[js.Any])
    
    inline def setOnTitleClickFunction1(value: /* e */ TitleClickEvent[TItem, TKey] => Callback): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction1((t0: /* e */ TitleClickEvent[TItem, TKey]) => value(t0).runNow()))
    
    inline def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
    
    inline def setOnTitleHold(value: /* e */ TitleHoldEvent[TItem, TKey] => Callback): Self = StObject.set(x, "onTitleHold", js.Any.fromFunction1((t0: /* e */ TitleHoldEvent[TItem, TKey]) => value(t0).runNow()))
    
    inline def setOnTitleHoldUndefined: Self = StObject.set(x, "onTitleHold", js.undefined)
    
    inline def setOnTitleRendered(value: /* e */ TitleRenderedEvent[TItem, TKey] => Callback): Self = StObject.set(x, "onTitleRendered", js.Any.fromFunction1((t0: /* e */ TitleRenderedEvent[TItem, TKey]) => value(t0).runNow()))
    
    inline def setOnTitleRenderedUndefined: Self = StObject.set(x, "onTitleRendered", js.undefined)
    
    inline def setRepaintChangesOnly(value: Boolean): Self = StObject.set(x, "repaintChangesOnly", value.asInstanceOf[js.Any])
    
    inline def setRepaintChangesOnlyUndefined: Self = StObject.set(x, "repaintChangesOnly", js.undefined)
    
    inline def setScrollByContent(value: Boolean): Self = StObject.set(x, "scrollByContent", value.asInstanceOf[js.Any])
    
    inline def setScrollByContentUndefined: Self = StObject.set(x, "scrollByContent", js.undefined)
    
    inline def setScrollingEnabled(value: Boolean): Self = StObject.set(x, "scrollingEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollingEnabledUndefined: Self = StObject.set(x, "scrollingEnabled", js.undefined)
    
    inline def setShowNavButtons(value: Boolean): Self = StObject.set(x, "showNavButtons", value.asInstanceOf[js.Any])
    
    inline def setShowNavButtonsUndefined: Self = StObject.set(x, "showNavButtons", js.undefined)
  }
}
