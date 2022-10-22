package typingsJapgolly.reactIntl.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactIntl.libSrcComponentsProviderMod.default
import typingsJapgolly.reactIntl.libSrcTypesMod.IntlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("react-intl/lib/src/components/provider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def defaultFormats(value: Any): this.type = set("defaultFormats", value.asInstanceOf[js.Any])
    
    inline def defaultLocale(value: Any): this.type = set("defaultLocale", value.asInstanceOf[js.Any])
    
    inline def fallbackOnEmptyString(value: Any): this.type = set("fallbackOnEmptyString", value.asInstanceOf[js.Any])
    
    inline def formats(value: Any): this.type = set("formats", value.asInstanceOf[js.Any])
    
    inline def messages(value: Any): this.type = set("messages", value.asInstanceOf[js.Any])
    
    inline def onError(value: Any): this.type = set("onError", value.asInstanceOf[js.Any])
    
    inline def textComponent(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with typingsJapgolly.react.mod.ComponentType[js.Object], typingsJapgolly.reactIntl.reactIntlStrings.a, typingsJapgolly.reactIntl.reactIntlStrings.abbr */ Any
    ): this.type = set("textComponent", value.asInstanceOf[js.Any])
    
    inline def timeZone(value: Any): this.type = set("timeZone", value.asInstanceOf[js.Any])
    
    inline def wrapRichTextChunksInFragment(value: Boolean): this.type = set("wrapRichTextChunksInFragment", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[IntlConfig]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
