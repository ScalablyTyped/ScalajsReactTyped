package typingsJapgolly.typeformEmbed

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLIFrameElement
import org.scalajs.dom.MessageEvent
import typingsJapgolly.std.Record
import typingsJapgolly.typeformEmbed.anon.EmbedId
import typingsJapgolly.typeformEmbed.typesBaseEmbedTypesMod.EmbedType
import typingsJapgolly.typeformEmbed.typesUtilsBuildIframeSrcMod.BuildIframeSrcOptions
import typingsJapgolly.typeformEmbed.typesUtilsCreateCustomLaunchOptionsMod.RemoveHandler
import typingsJapgolly.typeformEmbed.typesUtilsCreateIframeCreateIframeMod.CreateIframeOptions
import typingsJapgolly.typeformEmbed.typesUtilsLazyInitMod.fn
import typingsJapgolly.typeformEmbed.typesUtilsLoadOptionsFromAttributesMod.Transformation
import typingsJapgolly.typeformEmbed.typesUtilsSetElementSizeMod.ElementSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  @JSImport("@typeform/embed/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCustomKeyboardListener(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomKeyboardListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def buildIframeSrc(params: BuildIframeSrcOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildIframeSrc")(params.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def camelCaseToKebabCase(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCaseToKebabCase")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def changeColorOpacity(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("changeColorOpacity")().asInstanceOf[String]
  inline def changeColorOpacity(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("changeColorOpacity")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def changeColorOpacity(color: String, opacity: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeColorOpacity")(color.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def changeColorOpacity(color: Unit, opacity: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeColorOpacity")(color.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createIframe(formId: String, `type`: EmbedType, options: CreateIframeOptions): EmbedId = (^.asInstanceOf[js.Dynamic].applyDynamic("createIframe")(formId.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EmbedId]
  
  inline def dispatchCustomKeyEventFromIframe(evt: MessageEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchCustomKeyEventFromIframe")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getTextColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextColor")().asInstanceOf[String]
  inline def getTextColor(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def handleCustomOpen(open: js.Function0[Unit], openType: String): RemoveHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("handleCustomOpen")(open.asInstanceOf[js.Any], openType.asInstanceOf[js.Any])).asInstanceOf[RemoveHandler]
  inline def handleCustomOpen(open: js.Function0[Unit], openType: String, value: Double): RemoveHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("handleCustomOpen")(open.asInstanceOf[js.Any], openType.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RemoveHandler]
  
  inline def hasDom(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDom")().asInstanceOf[Boolean]
  
  inline def includeCss(filename: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("includeCss")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isBigScreen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigScreen")().asInstanceOf[Boolean]
  
  inline def isDefined[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")().asInstanceOf[/* is T */ Boolean]
  inline def isDefined[T](value: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isFullscreen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullscreen")().asInstanceOf[Boolean]
  
  inline def isInPage(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInPage")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMobile(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobile")().asInstanceOf[Boolean]
  
  inline def isOpen(element: HTMLElement): /* is @typeform/embed.@typeform/embed/types/utils/is-open.HTMLElementWithParentNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")(element.asInstanceOf[js.Any]).asInstanceOf[/* is @typeform/embed.@typeform/embed/types/utils/is-open.HTMLElementWithParentNode */ Boolean]
  
  inline def isVisible(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lazyInitialize(target: Element, onIntersection: fn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lazyInitialize")(target.asInstanceOf[js.Any], onIntersection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loadOptionsFromAttributes(element: HTMLElement, transform: Record[String, Transformation]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("loadOptionsFromAttributes")(element.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeAutoResize(wrapperElm: HTMLElement): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAutoResize")(wrapperElm.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def removeCustomKeyboardListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCustomKeyboardListener")().asInstanceOf[Unit]
  
  inline def removeUndefinedKeys(obj: Record[String, Any]): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUndefinedKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  inline def sendGaIdMessage(embedId: String, gaClientId: String, iframe: HTMLIFrameElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendGaIdMessage")(embedId.asInstanceOf[js.Any], gaClientId.asInstanceOf[js.Any], iframe.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setAutoClose(embedId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoClose")(embedId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setAutoClose(embedId: String, autoClose: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutoClose")(embedId.asInstanceOf[js.Any], autoClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setAutoClose(embedId: String, autoClose: Boolean, closeCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutoClose")(embedId.asInstanceOf[js.Any], autoClose.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setAutoClose(embedId: String, autoClose: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutoClose")(embedId.asInstanceOf[js.Any], autoClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setAutoClose(embedId: String, autoClose: Double, closeCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutoClose")(embedId.asInstanceOf[js.Any], autoClose.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setAutoClose(embedId: String, autoClose: Unit, closeCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutoClose")(embedId.asInstanceOf[js.Any], autoClose.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setElementSize(element: HTMLElement, hasWidthHeight: ElementSize): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementSize")(element.asInstanceOf[js.Any], hasWidthHeight.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def setupGaInstance(iframe: HTMLIFrameElement, embedId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupGaInstance")(iframe.asInstanceOf[js.Any], embedId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setupGaInstance(iframe: HTMLIFrameElement, embedId: String, shareGaInstance: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupGaInstance")(iframe.asInstanceOf[js.Any], embedId.asInstanceOf[js.Any], shareGaInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setupGaInstance(iframe: HTMLIFrameElement, embedId: String, shareGaInstance: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupGaInstance")(iframe.asInstanceOf[js.Any], embedId.asInstanceOf[js.Any], shareGaInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transformAttributeValue(value: String, transformation: Transformation): js.UndefOr[
    String | Double | Boolean | js.Function | (Record[String, String]) | js.Array[String]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAttributeValue")(value.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    String | Double | Boolean | js.Function | (Record[String, String]) | js.Array[String]
  ]]
  inline def transformAttributeValue(value: Null, transformation: Transformation): js.UndefOr[
    String | Double | Boolean | js.Function | (Record[String, String]) | js.Array[String]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAttributeValue")(value.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    String | Double | Boolean | js.Function | (Record[String, String]) | js.Array[String]
  ]]
  
  inline def unmountElement(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
