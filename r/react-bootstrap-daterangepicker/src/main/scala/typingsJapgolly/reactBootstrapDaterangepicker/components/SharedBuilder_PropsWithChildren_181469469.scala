package typingsJapgolly.reactBootstrapDaterangepicker.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.daterangepicker.mod.DateOrString
import typingsJapgolly.daterangepicker.mod.Options
import typingsJapgolly.jquery.JQuery.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PropsWithChildren_181469469[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def initialSettings(value: Options): this.type = set("initialSettings", value.asInstanceOf[js.Any])
  
  inline def onApply(
    value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
  ): this.type = set("onApply", js.Any.fromFunction2(value))
  
  inline def onCallback(
    value: (/* start */ js.UndefOr[DateOrString], /* end */ js.UndefOr[DateOrString], /* label */ js.UndefOr[String]) => Any
  ): this.type = set("onCallback", js.Any.fromFunction3(value))
  
  inline def onCancel(
    value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
  ): this.type = set("onCancel", js.Any.fromFunction2(value))
  
  inline def onEvent(
    value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
  ): this.type = set("onEvent", js.Any.fromFunction2(value))
  
  inline def onHide(
    value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
  ): this.type = set("onHide", js.Any.fromFunction2(value))
  
  inline def onHideCalendar(
    value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
  ): this.type = set("onHideCalendar", js.Any.fromFunction2(value))
  
  inline def onShow(
    value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
  ): this.type = set("onShow", js.Any.fromFunction2(value))
  
  inline def onShowCalendar(
    value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
  ): this.type = set("onShowCalendar", js.Any.fromFunction2(value))
}
