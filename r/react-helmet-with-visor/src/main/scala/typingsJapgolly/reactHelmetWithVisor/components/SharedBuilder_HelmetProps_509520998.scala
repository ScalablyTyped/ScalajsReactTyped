package typingsJapgolly.reactHelmetWithVisor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactHelmetWithVisor.mod.BodyProps
import typingsJapgolly.reactHelmetWithVisor.mod.HelmetTags
import typingsJapgolly.reactHelmetWithVisor.mod.HtmlProps
import typingsJapgolly.reactHelmetWithVisor.mod.LinkProps
import typingsJapgolly.reactHelmetWithVisor.mod.MetaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_HelmetProps_509520998[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def async(value: Boolean): this.type = set("async", value.asInstanceOf[js.Any])
  
  inline def base(value: Any): this.type = set("base", value.asInstanceOf[js.Any])
  
  inline def bodyAttributes(value: BodyProps): this.type = set("bodyAttributes", value.asInstanceOf[js.Any])
  
  inline def defaultTitle(value: String): this.type = set("defaultTitle", value.asInstanceOf[js.Any])
  
  inline def defer(value: Boolean): this.type = set("defer", value.asInstanceOf[js.Any])
  
  inline def encodeSpecialCharacters(value: Boolean): this.type = set("encodeSpecialCharacters", value.asInstanceOf[js.Any])
  
  inline def htmlAttributes(value: HtmlProps): this.type = set("htmlAttributes", value.asInstanceOf[js.Any])
  
  inline def link(value: js.Array[LinkProps]): this.type = set("link", value.asInstanceOf[js.Any])
  
  inline def linkVarargs(value: LinkProps*): this.type = set("link", js.Array(value*))
  
  inline def meta(value: js.Array[MetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
  
  inline def metaVarargs(value: MetaProps*): this.type = set("meta", js.Array(value*))
  
  inline def noscript(value: js.Array[Any]): this.type = set("noscript", value.asInstanceOf[js.Any])
  
  inline def noscriptVarargs(value: Any*): this.type = set("noscript", js.Array(value*))
  
  inline def onChangeClientState(value: (/* newState */ Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags) => Callback): this.type = set("onChangeClientState", js.Any.fromFunction3((t0: /* newState */ Any, t1: /* addedTags */ HelmetTags, t2: /* removedTags */ HelmetTags) => (value(t0, t1, t2)).runNow()))
  
  inline def script(value: js.Array[Any]): this.type = set("script", value.asInstanceOf[js.Any])
  
  inline def scriptVarargs(value: Any*): this.type = set("script", js.Array(value*))
  
  inline def style(value: js.Array[Any]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleVarargs(value: Any*): this.type = set("style", js.Array(value*))
  
  inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  
  inline def titleAttributes(value: js.Object): this.type = set("titleAttributes", value.asInstanceOf[js.Any])
  
  inline def titleTemplate(value: String): this.type = set("titleTemplate", value.asInstanceOf[js.Any])
}
