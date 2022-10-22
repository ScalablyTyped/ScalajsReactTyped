package typingsJapgolly.inboxsdk.mod.Router

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRouteView
  extends StObject
     with RouteView {
  
  def addCollapsibleSection(options: SectionDescriptor): CollapsibleSectionView
  
  // addCollapsibleSection(options: Stream<SectionDescriptor>): CollapsibleSectionView;
  def addSection(options: SectionDescriptor): SectionView
  
  // addSection(options: Stream<SectionDescriptor>): SectionView;
  def refresh(): Unit
}
object ListRouteView {
  
  inline def apply(
    addCollapsibleSection: SectionDescriptor => CollapsibleSectionView,
    addSection: SectionDescriptor => SectionView,
    destroyed: Boolean,
    getParams: CallbackTo[RouteParams],
    getRouteID: CallbackTo[String],
    getRouteType: CallbackTo[RouteTypes],
    on: (destroy, js.Function0[Unit]) => Callback,
    refresh: Callback
  ): ListRouteView = {
    val __obj = js.Dynamic.literal(addCollapsibleSection = js.Any.fromFunction1(addCollapsibleSection), addSection = js.Any.fromFunction1(addSection), destroyed = destroyed.asInstanceOf[js.Any], getParams = getParams.toJsFn, getRouteID = getRouteID.toJsFn, getRouteType = getRouteType.toJsFn, on = js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), refresh = refresh.toJsFn)
    __obj.asInstanceOf[ListRouteView]
  }
  
  extension [Self <: ListRouteView](x: Self) {
    
    inline def setAddCollapsibleSection(value: SectionDescriptor => CollapsibleSectionView): Self = StObject.set(x, "addCollapsibleSection", js.Any.fromFunction1(value))
    
    inline def setAddSection(value: SectionDescriptor => SectionView): Self = StObject.set(x, "addSection", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
  }
}
