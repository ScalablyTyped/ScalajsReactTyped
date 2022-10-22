package typingsJapgolly.reactNativeViewPdf.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeViewPdf.anon.Message
import typingsJapgolly.reactNativeViewPdf.libMod.PDFViewProps
import typingsJapgolly.reactNativeViewPdf.libMod.PDFViewUrlProps
import typingsJapgolly.reactNativeViewPdf.libMod.default
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-16`
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-8`
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.base64
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.bundle
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.cachesDirectory
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.documentsDirectory
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.file
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.libraryDirectory
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.tempDirectory
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Lib {
  
  inline def apply(resource: String): Builder = {
    val __props = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PDFViewProps]))
  }
  
  @JSImport("react-native-view-pdf/lib", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def enableAnnotations(value: Boolean): this.type = set("enableAnnotations", value.asInstanceOf[js.Any])
    
    inline def fadeInDuration(value: Double): this.type = set("fadeInDuration", value.asInstanceOf[js.Any])
    
    inline def fileFrom(value: bundle | documentsDirectory | libraryDirectory | cachesDirectory | tempDirectory): this.type = set("fileFrom", value.asInstanceOf[js.Any])
    
    inline def onError(value: /* error */ Message => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* error */ Message) => value(t0).runNow()))
    
    inline def onLoad(value: Callback): this.type = set("onLoad", value.toJsFn)
    
    inline def onPageChanged(value: (/* page */ Double, /* pageCount */ Double) => Callback): this.type = set("onPageChanged", js.Any.fromFunction2((t0: /* page */ Double, t1: /* pageCount */ Double) => (value(t0, t1)).runNow()))
    
    inline def onScrolled(value: /* offset */ Double => Callback): this.type = set("onScrolled", js.Any.fromFunction1((t0: /* offset */ Double) => value(t0).runNow()))
    
    inline def resourceType(value: url | base64 | file): this.type = set("resourceType", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def textEncoding(value: `utf-8` | `utf-16`): this.type = set("textEncoding", value.asInstanceOf[js.Any])
    
    inline def urlProps(value: PDFViewUrlProps): this.type = set("urlProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PDFViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
