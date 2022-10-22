package typingsJapgolly.aliApp.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.aliApp.my.Component
import typingsJapgolly.aliApp.my.ComponentRelation
import typingsJapgolly.aliApp.my.CreateIntersectionObserverOption
import typingsJapgolly.aliApp.my.IntersectionObserver
import typingsJapgolly.aliApp.my.Options
import typingsJapgolly.aliApp.my.Page
import typingsJapgolly.aliApp.my.PageScrollToOptions
import typingsJapgolly.aliApp.my.SelectorQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.PageOptions & ali-app.my.Page> */
trait PartialPageOptionsPage extends StObject {
  
  var createIntersectionObserver: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[CreateIntersectionObserverOption], IntersectionObserver]
  ] = js.undefined
  
  var createSelectorQuery: js.UndefOr[js.Function0[SelectorQuery]] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var dataset: js.UndefOr[String] = js.undefined
  
  var forceUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var getRelationNodes: js.UndefOr[js.Function1[/* relationKey */ String, js.Array[ComponentRelation]]] = js.undefined
  
  var hasBehavior: js.UndefOr[js.Function1[/* behavior */ Any, Boolean]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var is: js.UndefOr[String] = js.undefined
  
  var onError: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
  
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
  
  var onLaunch: js.UndefOr[js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]] = js.undefined
  
  var onPullDownRefresh: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]] = js.undefined
  
  var pageScrollTo: js.UndefOr[js.Function1[/* option */ js.UndefOr[PageScrollToOptions], Unit]] = js.undefined
  
  var properties: js.UndefOr[Any] = js.undefined
  
  var route: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var selectAllComponents: js.UndefOr[js.Function1[/* selector */ String, js.Array[Component]]] = js.undefined
  
  var selectComponent: js.UndefOr[js.Function1[/* selector */ String, Component]] = js.undefined
  
  var setData: js.UndefOr[
    js.Function2[/* data */ Any, /* callback */ js.UndefOr[js.Function0[Unit]], Unit]
  ] = js.undefined
  
  var triggerEvent: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* details */ js.UndefOr[Any], 
      /* options */ js.UndefOr[Partialbubblesbooleancomp], 
      Unit
    ]
  ] = js.undefined
  
  var update: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object PartialPageOptionsPage {
  
  inline def apply(): PartialPageOptionsPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageOptionsPage]
  }
  
  extension [Self <: PartialPageOptionsPage](x: Self) {
    
    inline def setCreateIntersectionObserver(value: /* options */ js.UndefOr[CreateIntersectionObserverOption] => IntersectionObserver): Self = StObject.set(x, "createIntersectionObserver", js.Any.fromFunction1(value))
    
    inline def setCreateIntersectionObserverUndefined: Self = StObject.set(x, "createIntersectionObserver", js.undefined)
    
    inline def setCreateSelectorQuery(value: CallbackTo[SelectorQuery]): Self = StObject.set(x, "createSelectorQuery", value.toJsFn)
    
    inline def setCreateSelectorQueryUndefined: Self = StObject.set(x, "createSelectorQuery", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setForceUpdate(value: Callback): Self = StObject.set(x, "forceUpdate", value.toJsFn)
    
    inline def setForceUpdateUndefined: Self = StObject.set(x, "forceUpdate", js.undefined)
    
    inline def setGetRelationNodes(value: /* relationKey */ String => js.Array[ComponentRelation]): Self = StObject.set(x, "getRelationNodes", js.Any.fromFunction1(value))
    
    inline def setGetRelationNodesUndefined: Self = StObject.set(x, "getRelationNodes", js.undefined)
    
    inline def setHasBehavior(value: /* behavior */ Any => Boolean): Self = StObject.set(x, "hasBehavior", js.Any.fromFunction1(value))
    
    inline def setHasBehaviorUndefined: Self = StObject.set(x, "hasBehavior", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setOnError(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnHide(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnLaunch(value: js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]): Self = StObject.set(x, "onLaunch", value.asInstanceOf[js.Any])
    
    inline def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
    
    inline def setOnPullDownRefresh(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onPullDownRefresh", value.asInstanceOf[js.Any])
    
    inline def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
    
    inline def setOnShow(value: js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setPageScrollTo(value: /* option */ js.UndefOr[PageScrollToOptions] => Callback): Self = StObject.set(x, "pageScrollTo", js.Any.fromFunction1((t0: /* option */ js.UndefOr[PageScrollToOptions]) => value(t0).runNow()))
    
    inline def setPageScrollToUndefined: Self = StObject.set(x, "pageScrollTo", js.undefined)
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRoute(value: Callback): Self = StObject.set(x, "route", value.toJsFn)
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setSelectAllComponents(value: /* selector */ String => js.Array[Component]): Self = StObject.set(x, "selectAllComponents", js.Any.fromFunction1(value))
    
    inline def setSelectAllComponentsUndefined: Self = StObject.set(x, "selectAllComponents", js.undefined)
    
    inline def setSelectComponent(value: /* selector */ String => Component): Self = StObject.set(x, "selectComponent", js.Any.fromFunction1(value))
    
    inline def setSelectComponentUndefined: Self = StObject.set(x, "selectComponent", js.undefined)
    
    inline def setSetData(value: (/* data */ Any, /* callback */ js.UndefOr[js.Function0[Unit]]) => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction2((t0: /* data */ Any, t1: /* callback */ js.UndefOr[js.Function0[Unit]]) => (value(t0, t1)).runNow()))
    
    inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
    
    inline def setTriggerEvent(
      value: (/* name */ String, /* details */ js.UndefOr[Any], /* options */ js.UndefOr[Partialbubblesbooleancomp]) => Callback
    ): Self = StObject.set(x, "triggerEvent", js.Any.fromFunction3((t0: /* name */ String, t1: /* details */ js.UndefOr[Any], t2: /* options */ js.UndefOr[Partialbubblesbooleancomp]) => (value(t0, t1, t2)).runNow()))
    
    inline def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
