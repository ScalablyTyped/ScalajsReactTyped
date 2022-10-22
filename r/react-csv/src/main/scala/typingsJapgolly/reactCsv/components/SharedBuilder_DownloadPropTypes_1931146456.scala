package typingsJapgolly.reactCsv.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactCsv.componentsCommonPropTypesMod.AsyncClickHandler
import typingsJapgolly.reactCsv.componentsCommonPropTypesMod.Headers
import typingsJapgolly.reactCsv.componentsCommonPropTypesMod.LabelKeyObject
import typingsJapgolly.reactCsv.componentsCommonPropTypesMod.SyncClickHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DownloadPropTypes_1931146456[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def asyncOnClick(value: Boolean): this.type = set("asyncOnClick", value.asInstanceOf[js.Any])
  
  inline def enclosingCharacter(value: String): this.type = set("enclosingCharacter", value.asInstanceOf[js.Any])
  
  inline def filename(value: String): this.type = set("filename", value.asInstanceOf[js.Any])
  
  inline def headers(value: Headers): this.type = set("headers", value.asInstanceOf[js.Any])
  
  inline def headersVarargs(value: (LabelKeyObject | String)*): this.type = set("headers", js.Array(value*))
  
  inline def onClick(value: SyncClickHandler | AsyncClickHandler): this.type = set("onClick", value.asInstanceOf[js.Any])
  
  inline def onClickFunction1(value: /* event */ MouseEventHandler[HTMLAnchorElement] => Boolean | Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  inline def onClickFunction2(
    value: (/* event */ MouseEventHandler[HTMLAnchorElement], /* done */ js.Function1[/* proceed */ js.UndefOr[Boolean], Unit]) => Callback
  ): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ MouseEventHandler[HTMLAnchorElement], t1: /* done */ js.Function1[/* proceed */ js.UndefOr[Boolean], Unit]) => (value(t0, t1)).runNow()))
  
  inline def separator(value: String): this.type = set("separator", value.asInstanceOf[js.Any])
  
  inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
  
  inline def uFEFF(value: Boolean): this.type = set("uFEFF", value.asInstanceOf[js.Any])
}
