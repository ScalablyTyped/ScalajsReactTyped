package typingsJapgolly.marko.taglibLookupTaglibLookupMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.marko.AnonAttributeGroups
import typingsJapgolly.marko.AnonName
import typingsJapgolly.marko.tagMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaglibLookup extends js.Object {
  var merged: AnonAttributeGroups = js.native
  var taglibsById: StringDictionary[typingsJapgolly.marko.taglibMod.default] = js.native
  def addTaglib(taglib: typingsJapgolly.marko.taglibMod.default): Unit = js.native
  def forEachAttribute(
    tagName: String,
    callback: js.Function2[/* attrDef */ typingsJapgolly.marko.attributeMod.default, /* tag */ ^, Unit]
  ): Unit = js.native
  def forEachNodeTransformer(node: js.Any, callback: js.Function1[/* trans */ typingsJapgolly.marko.transformerMod.default, _]): Unit = js.native
  def forEachNodeTransformer(
    node: js.Any,
    callback: js.Function1[/* trans */ typingsJapgolly.marko.transformerMod.default, _],
    thisObj: js.Any
  ): Unit = js.native
  def forEachTag(callback: js.Function1[/* tag */ ^, Unit | Boolean]): Unit = js.native
  def forEachTagTransformer(
    element: String,
    callback: js.Function1[/* trans */ typingsJapgolly.marko.transformerMod.default, _]
  ): Unit = js.native
  def forEachTagTransformer(
    element: String,
    callback: js.Function1[/* trans */ typingsJapgolly.marko.transformerMod.default, _],
    thisObj: js.Any
  ): Unit = js.native
  def forEachTagTransformer(
    element: Element,
    callback: js.Function1[/* trans */ typingsJapgolly.marko.transformerMod.default, _]
  ): Unit = js.native
  def forEachTagTransformer(
    element: Element,
    callback: js.Function1[/* trans */ typingsJapgolly.marko.transformerMod.default, _],
    thisObj: js.Any
  ): Unit = js.native
  def forEachTemplateTransformer(callback: js.Function1[/* trans */ typingsJapgolly.marko.transformerMod.default, _]): Unit = js.native
  def forEachTemplateTransformer(
    callback: js.Function1[/* trans */ typingsJapgolly.marko.transformerMod.default, _],
    thisObj: js.Any
  ): Unit = js.native
  def forEachTextTransformer(callback: js.Function1[/* trans */ typingsJapgolly.marko.transformerMod.default, _]): Unit = js.native
  def forEachTextTransformer(
    callback: js.Function1[/* trans */ typingsJapgolly.marko.transformerMod.default, _],
    thisObj: js.Any
  ): Unit = js.native
  def getAttribute(element: String, attr: String): js.UndefOr[typingsJapgolly.marko.attributeMod.default] = js.native
  def getAttribute(element: String, attr: AnonName): js.UndefOr[typingsJapgolly.marko.attributeMod.default] = js.native
  def getAttribute(element: Element, attr: String): js.UndefOr[typingsJapgolly.marko.attributeMod.default] = js.native
  def getAttribute(element: Element, attr: AnonName): js.UndefOr[typingsJapgolly.marko.attributeMod.default] = js.native
  def getInputFiles(): js.Array[String] = js.native
  def getTag(element: String): js.UndefOr[^] = js.native
  def getTag(element: Element): js.UndefOr[^] = js.native
  def getTagsSorted(): js.Array[^] = js.native
  def hasTaglib(taglib: typingsJapgolly.marko.taglibMod.default): Boolean = js.native
}

