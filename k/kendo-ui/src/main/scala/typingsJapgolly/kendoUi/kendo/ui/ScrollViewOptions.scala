package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollViewOptions extends StObject {
  
  var ARIATemplate: js.UndefOr[String] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var bounceVelocityThreshold: js.UndefOr[Double] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ ScrollViewChangeEvent, Unit]] = js.undefined
  
  var contentHeight: js.UndefOr[Double | String] = js.undefined
  
  var dataSource: js.UndefOr[DataSource | Any] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var emptyTemplate: js.UndefOr[String] = js.undefined
  
  var enablePager: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[ScrollViewMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigatable: js.UndefOr[Boolean] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var pageable: js.UndefOr[Boolean | ScrollViewPageable] = js.undefined
  
  var refresh: js.UndefOr[js.Function1[/* e */ ScrollViewRefreshEvent, Unit]] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var velocityThreshold: js.UndefOr[Double] = js.undefined
}
object ScrollViewOptions {
  
  inline def apply(): ScrollViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollViewOptions]
  }
  
  extension [Self <: ScrollViewOptions](x: Self) {
    
    inline def setARIATemplate(value: String): Self = StObject.set(x, "ARIATemplate", value.asInstanceOf[js.Any])
    
    inline def setARIATemplateUndefined: Self = StObject.set(x, "ARIATemplate", js.undefined)
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setBounceVelocityThreshold(value: Double): Self = StObject.set(x, "bounceVelocityThreshold", value.asInstanceOf[js.Any])
    
    inline def setBounceVelocityThresholdUndefined: Self = StObject.set(x, "bounceVelocityThreshold", js.undefined)
    
    inline def setChange(value: /* e */ ScrollViewChangeEvent => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* e */ ScrollViewChangeEvent) => value(t0).runNow()))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setContentHeight(value: Double | String): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
    
    inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
    
    inline def setDataSource(value: DataSource | Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEmptyTemplate(value: String): Self = StObject.set(x, "emptyTemplate", value.asInstanceOf[js.Any])
    
    inline def setEmptyTemplateUndefined: Self = StObject.set(x, "emptyTemplate", js.undefined)
    
    inline def setEnablePager(value: Boolean): Self = StObject.set(x, "enablePager", value.asInstanceOf[js.Any])
    
    inline def setEnablePagerUndefined: Self = StObject.set(x, "enablePager", js.undefined)
    
    inline def setMessages(value: ScrollViewMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigatable(value: Boolean): Self = StObject.set(x, "navigatable", value.asInstanceOf[js.Any])
    
    inline def setNavigatableUndefined: Self = StObject.set(x, "navigatable", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPageable(value: Boolean | ScrollViewPageable): Self = StObject.set(x, "pageable", value.asInstanceOf[js.Any])
    
    inline def setPageableUndefined: Self = StObject.set(x, "pageable", js.undefined)
    
    inline def setRefresh(value: /* e */ ScrollViewRefreshEvent => Callback): Self = StObject.set(x, "refresh", js.Any.fromFunction1((t0: /* e */ ScrollViewRefreshEvent) => value(t0).runNow()))
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setVelocityThreshold(value: Double): Self = StObject.set(x, "velocityThreshold", value.asInstanceOf[js.Any])
    
    inline def setVelocityThresholdUndefined: Self = StObject.set(x, "velocityThreshold", js.undefined)
  }
}
