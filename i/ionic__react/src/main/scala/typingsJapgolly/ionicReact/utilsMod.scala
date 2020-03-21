package typingsJapgolly.ionicReact

import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.mod.Config_
import typingsJapgolly.ionicReact.ionicReactPropsMod.IonicReactProps
import typingsJapgolly.ionicReact.ionicReactStrings.android
import typingsJapgolly.ionicReact.ionicReactStrings.capacitor
import typingsJapgolly.ionicReact.ionicReactStrings.cordova
import typingsJapgolly.ionicReact.ionicReactStrings.desktop
import typingsJapgolly.ionicReact.ionicReactStrings.electron
import typingsJapgolly.ionicReact.ionicReactStrings.hybrid
import typingsJapgolly.ionicReact.ionicReactStrings.ios
import typingsJapgolly.ionicReact.ionicReactStrings.ipad
import typingsJapgolly.ionicReact.ionicReactStrings.iphone
import typingsJapgolly.ionicReact.ionicReactStrings.mobile
import typingsJapgolly.ionicReact.ionicReactStrings.mobileweb
import typingsJapgolly.ionicReact.ionicReactStrings.phablet
import typingsJapgolly.ionicReact.ionicReactStrings.pwa
import typingsJapgolly.ionicReact.ionicReactStrings.style
import typingsJapgolly.ionicReact.ionicReactStrings.tablet
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Event_
import typingsJapgolly.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def attachProps(node: HTMLElement, newProps: js.Any): Unit = js.native
  def attachProps(node: HTMLElement, newProps: js.Any, oldProps: js.Any): Unit = js.native
  def camelToDashCase(str: String): String = js.native
  def createForwardRef[PropType, ElementType](ReactComponent: js.Any, displayName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
  def dashToPascalCase(str: String): String = js.native
  def getClassName(classList: DOMTokenList, newProps: js.Any, oldProps: js.Any): String = js.native
  def getConfig(): Config_ | Null = js.native
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def isCoveredByReact(eventNameSuffix: String): Boolean = js.native
  def isCoveredByReact(eventNameSuffix: String, doc: Document_): Boolean = js.native
  def isPlatform(
    platform: ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ): Boolean = js.native
  def syncEvent(node: ElementeventskeystringeEv, eventName: String): Unit = js.native
  def syncEvent(
    node: ElementeventskeystringeEv,
    eventName: String,
    newEventHandler: js.Function1[/* e */ Event_, _]
  ): Unit = js.native
  type IonicReactExternalProps[PropType, ElementType] = PropType with (Omit[HTMLAttributes[ElementType], style]) with IonicReactProps
}

