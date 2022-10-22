package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.anon.Highlight
import typingsJapgolly.antDesignReactNative.libListViewMod.ListViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListView {
  
  inline def apply[T](
    onFetch: (Double, js.Function2[/* rows */ js.Array[T], /* limit */ Double, Any], js.Function0[Unit]) => Callback,
    renderItem: (T, Double, Highlight) => Element | Null
  ): Builder[T] = {
    val __props = js.Dynamic.literal(onFetch = js.Any.fromFunction3((t0: Double, t1: js.Function2[/* rows */ js.Array[T], /* limit */ Double, Any], t2: js.Function0[Unit]) => (onFetch(t0, t1, t2)).runNow()), renderItem = js.Any.fromFunction3(renderItem))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ListViewProps[T]]))
  }
  
  @JSImport("@ant-design/react-native", "ListView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.mod.ListView[T]] {
    
    inline def allLoadedText(value: Any): this.type = set("allLoadedText", value.asInstanceOf[js.Any])
    
    inline def arrowImageSource(value: Any): this.type = set("arrowImageSource", value.asInstanceOf[js.Any])
    
    inline def arrowImageStyle(value: Any): this.type = set("arrowImageStyle", value.asInstanceOf[js.Any])
    
    inline def autoPagination(value: Any): this.type = set("autoPagination", value.asInstanceOf[js.Any])
    
    inline def customRefreshControl(value: Any): this.type = set("customRefreshControl", value.asInstanceOf[js.Any])
    
    inline def customRefreshView(value: Any): this.type = set("customRefreshView", value.asInstanceOf[js.Any])
    
    inline def dateFormat(value: Any): this.type = set("dateFormat", value.asInstanceOf[js.Any])
    
    inline def dateStyle(value: Any): this.type = set("dateStyle", value.asInstanceOf[js.Any])
    
    inline def dateTitle(value: Any): this.type = set("dateTitle", value.asInstanceOf[js.Any])
    
    inline def displayDate(value: Any): this.type = set("displayDate", value.asInstanceOf[js.Any])
    
    inline def emptyView(value: Any): this.type = set("emptyView", value.asInstanceOf[js.Any])
    
    inline def enableEmptySections(value: Any): this.type = set("enableEmptySections", value.asInstanceOf[js.Any])
    
    inline def fetchingSpinnerSize(value: Any): this.type = set("fetchingSpinnerSize", value.asInstanceOf[js.Any])
    
    inline def firstLoader(value: Any): this.type = set("firstLoader", value.asInstanceOf[js.Any])
    
    inline def header(value: Any): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Any): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def initialNumToRender(value: Any): this.type = set("initialNumToRender", value.asInstanceOf[js.Any])
    
    inline def keyExtractor(value: (T, /* index */ Double) => String): this.type = set("keyExtractor", js.Any.fromFunction2(value))
    
    inline def numColumns(value: Double): this.type = set("numColumns", value.asInstanceOf[js.Any])
    
    inline def pagination(value: Any): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    inline def paginationAllLoadedView(value: Any): this.type = set("paginationAllLoadedView", value.asInstanceOf[js.Any])
    
    inline def paginationBtnText(value: Any): this.type = set("paginationBtnText", value.asInstanceOf[js.Any])
    
    inline def paginationFetchingView(value: Any): this.type = set("paginationFetchingView", value.asInstanceOf[js.Any])
    
    inline def paginationWaitingView(value: Any): this.type = set("paginationWaitingView", value.asInstanceOf[js.Any])
    
    inline def refreshViewHeight(value: Any): this.type = set("refreshViewHeight", value.asInstanceOf[js.Any])
    
    inline def refreshViewStyle(value: Any): this.type = set("refreshViewStyle", value.asInstanceOf[js.Any])
    
    inline def refreshable(value: Any): this.type = set("refreshable", value.asInstanceOf[js.Any])
    
    inline def refreshableColors(value: Any): this.type = set("refreshableColors", value.asInstanceOf[js.Any])
    
    inline def refreshableMode(value: Any): this.type = set("refreshableMode", value.asInstanceOf[js.Any])
    
    inline def refreshableProgressBackgroundColor(value: Any): this.type = set("refreshableProgressBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def refreshableSize(value: Any): this.type = set("refreshableSize", value.asInstanceOf[js.Any])
    
    inline def refreshableTintColor(value: Any): this.type = set("refreshableTintColor", value.asInstanceOf[js.Any])
    
    inline def refreshableTitle(value: Any): this.type = set("refreshableTitle", value.asInstanceOf[js.Any])
    
    inline def refreshableTitlePull(value: Any): this.type = set("refreshableTitlePull", value.asInstanceOf[js.Any])
    
    inline def refreshableTitleRefreshing(value: Any): this.type = set("refreshableTitleRefreshing", value.asInstanceOf[js.Any])
    
    inline def refreshableTitleRelease(value: Any): this.type = set("refreshableTitleRelease", value.asInstanceOf[js.Any])
    
    inline def scrollEnabled(value: Any): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def separator(value: Any): this.type = set("separator", value.asInstanceOf[js.Any])
    
    inline def spinnerColor(value: Any): this.type = set("spinnerColor", value.asInstanceOf[js.Any])
    
    inline def waitingSpinnerSize(value: Any): this.type = set("waitingSpinnerSize", value.asInstanceOf[js.Any])
    
    inline def waitingSpinnerText(value: Any): this.type = set("waitingSpinnerText", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: ListViewProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
