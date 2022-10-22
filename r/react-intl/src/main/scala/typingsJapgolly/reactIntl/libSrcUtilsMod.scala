package typingsJapgolly.reactIntl

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcUtilsMod {
  
  @JSImport("react-intl/lib/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Pick<react-intl.react-intl/lib/src/types.ResolvedIntlConfig, 'fallbackOnEmptyString' | 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
  object DEFAULT_INTL_CONFIG {
    
    @JSImport("react-intl/lib/src/utils", "DEFAULT_INTL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/lib/src/utils", "DEFAULT_INTL_CONFIG.defaultFormats")
    @js.native
    def defaultFormats: js.UndefOr[Any] = js.native
    inline def defaultFormats_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib/src/utils", "DEFAULT_INTL_CONFIG.defaultLocale")
    @js.native
    def defaultLocale: js.UndefOr[Any] = js.native
    inline def defaultLocale_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib/src/utils", "DEFAULT_INTL_CONFIG.fallbackOnEmptyString")
    @js.native
    def fallbackOnEmptyString: js.UndefOr[Any] = js.native
    inline def fallbackOnEmptyString_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbackOnEmptyString")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib/src/utils", "DEFAULT_INTL_CONFIG.formats")
    @js.native
    def formats: js.UndefOr[Any] = js.native
    inline def formats_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib/src/utils", "DEFAULT_INTL_CONFIG.messages")
    @js.native
    def messages: js.UndefOr[Any] = js.native
    inline def messages_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib/src/utils", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError: js.UndefOr[Any] = js.native
    inline def onError_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib/src/utils", "DEFAULT_INTL_CONFIG.textComponent")
    @js.native
    def textComponent: js.UndefOr[Any] = js.native
    inline def textComponent_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib/src/utils", "DEFAULT_INTL_CONFIG.timeZone")
    @js.native
    def timeZone: js.UndefOr[Any] = js.native
    inline def timeZone_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])
  }
  
  inline def assignUniqueKeysToParts(formatXMLElementFn: FormatXMLElementFn[Node, String | Node | (js.Array[String | Node])]): FormatXMLElementFn[Node, String | Node | (js.Array[String | Node])] = ^.asInstanceOf[js.Dynamic].applyDynamic("assignUniqueKeysToParts")(formatXMLElementFn.asInstanceOf[js.Any]).asInstanceOf[FormatXMLElementFn[Node, String | Node | (js.Array[String | Node])]]
  
  inline def invariantIntlContext(): /* asserts intl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invariantIntlContext")().asInstanceOf[/* asserts intl */ Boolean]
  inline def invariantIntlContext(intl: Any): /* asserts intl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invariantIntlContext")(intl.asInstanceOf[js.Any]).asInstanceOf[/* asserts intl */ Boolean]
  
  inline def shallowEqual[T /* <: Record[String, Any] */](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")().asInstanceOf[Boolean]
  inline def shallowEqual[T /* <: Record[String, Any] */](objA: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shallowEqual[T /* <: Record[String, Any] */](objA: T, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowEqual[T /* <: Record[String, Any] */](objA: Unit, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
