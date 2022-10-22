package typingsJapgolly.reactHelmetAsync.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactHelmetAsync.mod.BodyProps
import typingsJapgolly.reactHelmetAsync.mod.HelmetData
import typingsJapgolly.reactHelmetAsync.mod.HelmetProps
import typingsJapgolly.reactHelmetAsync.mod.HelmetTags
import typingsJapgolly.reactHelmetAsync.mod.HtmlProps
import typingsJapgolly.reactHelmetAsync.mod.LinkProps
import typingsJapgolly.reactHelmetAsync.mod.MetaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Helmet {
  
  @JSImport("react-helmet-async", "Helmet")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactHelmetAsync.mod.Helmet] {
    
    inline def async(value: Boolean): this.type = set("async", value.asInstanceOf[js.Any])
    
    inline def base(value: Any): this.type = set("base", value.asInstanceOf[js.Any])
    
    inline def bodyAttributes(value: BodyProps): this.type = set("bodyAttributes", value.asInstanceOf[js.Any])
    
    inline def defaultTitle(value: String): this.type = set("defaultTitle", value.asInstanceOf[js.Any])
    
    inline def defer(value: Boolean): this.type = set("defer", value.asInstanceOf[js.Any])
    
    inline def encodeSpecialCharacters(value: Boolean): this.type = set("encodeSpecialCharacters", value.asInstanceOf[js.Any])
    
    inline def helmetData(value: HelmetData): this.type = set("helmetData", value.asInstanceOf[js.Any])
    
    inline def htmlAttributes(value: HtmlProps): this.type = set("htmlAttributes", value.asInstanceOf[js.Any])
    
    inline def link(value: js.Array[LinkProps]): this.type = set("link", value.asInstanceOf[js.Any])
    
    inline def linkVarargs(value: LinkProps*): this.type = set("link", js.Array(value*))
    
    inline def meta(value: js.Array[MetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
    
    inline def metaVarargs(value: MetaProps*): this.type = set("meta", js.Array(value*))
    
    inline def noscript(value: js.Array[Any]): this.type = set("noscript", value.asInstanceOf[js.Any])
    
    inline def noscriptVarargs(value: Any*): this.type = set("noscript", js.Array(value*))
    
    inline def onChangeClientState(value: (/* newState */ Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags) => Callback): this.type = set("onChangeClientState", js.Any.fromFunction3((t0: /* newState */ Any, t1: /* addedTags */ HelmetTags, t2: /* removedTags */ HelmetTags) => (value(t0, t1, t2)).runNow()))
    
    inline def prioritizeSeoTags(value: Boolean): this.type = set("prioritizeSeoTags", value.asInstanceOf[js.Any])
    
    inline def script(value: js.Array[Any]): this.type = set("script", value.asInstanceOf[js.Any])
    
    inline def scriptVarargs(value: Any*): this.type = set("script", js.Array(value*))
    
    inline def style(value: js.Array[Any]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleVarargs(value: Any*): this.type = set("style", js.Array(value*))
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleAttributes(value: js.Object): this.type = set("titleAttributes", value.asInstanceOf[js.Any])
    
    inline def titleTemplate(value: String): this.type = set("titleTemplate", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Helmet.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[HelmetProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
