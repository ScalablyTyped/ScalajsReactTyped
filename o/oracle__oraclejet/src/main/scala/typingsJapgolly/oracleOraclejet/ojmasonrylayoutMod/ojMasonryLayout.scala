package typingsJapgolly.oracleOraclejet.ojmasonrylayoutMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.oracleOraclejet.AnonLabelCut
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeInsert
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeRemove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeReorder
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeResize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojInsert
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojRemove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojReorder
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojResize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.reorderHandle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.reorderHandleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMasonryLayout extends baseComponent[ojMasonryLayoutSettableProperties] {
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeInsert: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeRemove: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeReorder: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeResize: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjInsert: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjRemove: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjReorder: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjResize: (js.Function1[CustomEvent, _]) | Null = js.native
  var onReorderHandleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var reorderHandle: String | Null = js.native
  @JSName("translations")
  var translations_ojMasonryLayout: AnonLabelCut = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(`type`: ojAnimateEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(`type`: ojAnimateStart, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeInsert(`type`: ojBeforeInsert, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeInsert(
    `type`: ojBeforeInsert,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(`type`: ojBeforeRemove, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: ojBeforeRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeReorder(`type`: ojBeforeReorder, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeReorder(
    `type`: ojBeforeReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeResize(`type`: ojBeforeResize, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeResize(
    `type`: ojBeforeResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojInsert(`type`: ojInsert, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojInsert(
    `type`: ojInsert,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(`type`: ojRemove, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: ojRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(`type`: ojReorder, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: ojReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(`type`: ojResize, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: ojResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reorderHandleChanged(`type`: reorderHandleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reorderHandleChanged(
    `type`: reorderHandleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_reorderHandle(property: reorderHandle): String | Null = js.native
  def insertTile(selector: String, index: Double): Unit = js.native
  def removeTile(selector: String): Unit = js.native
  def resizeTile(selector: String, sizeStyleClass: String): Unit = js.native
  def setProperties(properties: ojMasonryLayoutSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_reorderHandle(property: reorderHandle): Unit = js.native
  @JSName("setProperty")
  def setProperty_reorderHandle(property: reorderHandle, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelCut): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojmasonrylayout", "ojMasonryLayout")
@js.native
object ojMasonryLayout extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
  type ojBeforeInsert = CustomEvent
  type ojBeforeRemove = CustomEvent
  type ojBeforeReorder = CustomEvent
  type ojBeforeResize = CustomEvent
  type ojInsert = CustomEvent
  type ojRemove = CustomEvent
  type ojReorder = CustomEvent
  type ojResize = CustomEvent
}

