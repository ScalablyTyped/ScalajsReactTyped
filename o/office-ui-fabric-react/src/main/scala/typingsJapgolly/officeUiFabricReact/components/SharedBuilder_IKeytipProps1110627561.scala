package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IKeytipProps1110627561[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def calloutProps(value: ICalloutProps): this.type = set("calloutProps", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def hasDynamicChildren(value: Boolean): this.type = set("hasDynamicChildren", value.asInstanceOf[js.Any])
  
  inline def hasMenu(value: Boolean): this.type = set("hasMenu", value.asInstanceOf[js.Any])
  
  inline def offset(value: Point): this.type = set("offset", value.asInstanceOf[js.Any])
  
  inline def onExecute(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Callback): this.type = set("onExecute", js.Any.fromFunction2((t0: /* executeTarget */ HTMLElement | Null, t1: /* target */ HTMLElement | Null) => (value(t0, t1)).runNow()))
  
  inline def onReturn(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Callback): this.type = set("onReturn", js.Any.fromFunction2((t0: /* executeTarget */ HTMLElement | Null, t1: /* target */ HTMLElement | Null) => (value(t0, t1)).runNow()))
  
  inline def overflowSetSequence(value: js.Array[String]): this.type = set("overflowSetSequence", value.asInstanceOf[js.Any])
  
  inline def overflowSetSequenceVarargs(value: String*): this.type = set("overflowSetSequence", js.Array(value*))
  
  inline def styles(value: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def stylesFunction1(value: IKeytipStyleProps => DeepPartial[IKeytipStyles]): this.type = set("styles", js.Any.fromFunction1(value))
  
  inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  
  inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}
