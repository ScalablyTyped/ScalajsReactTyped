package typingsJapgolly.oracleOraclejet.ojnavigationlistMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.AnonAccessibleReorderAfterItem
import typingsJapgolly.oracleOraclejet.AnonRendererSelectable
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojnavigationlistMod.ojTabBar.NodeContext
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.as
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.currentItem
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.currentItemChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.data
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.display
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.displayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.edge
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.edgeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.icons
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.item
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.itemChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentItem
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeDeselect
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeRemove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeSelect
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojDeselect
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojRemove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojReorder
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.overflow
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.overflowChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.popup
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.progressive
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.reorderable
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.reorderableChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selection
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.truncation
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.truncationChanged
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTabBar_[K, D] extends baseComponent[ojTabBarSettableProperties[K, D]] {
  var as: String = js.native
  var currentItem: js.Any = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var display: all | icons = js.native
  var edge: top | bottom | start | end = js.native
  var item: AnonRendererSelectable[K, D] = js.native
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCurrentItemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onEdgeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onItemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeCurrentItem: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeDeselect: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeRemove: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeSelect: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjDeselect: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjRemove: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjReorder: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOverflowChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onReorderableChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTruncationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var overflow: popup | hidden = js.native
  var reorderable: enabled | disabled = js.native
  var selection: js.Any = js.native
  @JSName("translations")
  var translations_ojTabBar_ : AnonAccessibleReorderAfterItem = js.native
  var truncation: none | progressive = js.native
  def addEventListener(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], _]
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: edgeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[top | bottom | start | end], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: edgeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[top | bottom | start | end], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: overflowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[popup | hidden], _]
  ): Unit = js.native
  def addEventListener(
    `type`: overflowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[popup | hidden], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: reorderableChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[enabled | disabled], _]
  ): Unit = js.native
  def addEventListener(
    `type`: reorderableChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[enabled | disabled], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: truncationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | progressive], _]
  ): Unit = js.native
  def addEventListener(
    `type`: truncationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | progressive], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: ojBeforeCurrentItem,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: ojBeforeCurrentItem,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: ojBeforeDeselect,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: ojBeforeDeselect,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: ojBeforeRemove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: ojBeforeRemove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: ojBeforeSelect,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: ojBeforeSelect,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: ojDeselect,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: ojDeselect,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: ojRemove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: ojRemove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: ojReorder,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: ojReorder,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): NodeContext[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: currentItem): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): all | icons = js.native
  @JSName("getProperty")
  def getProperty_edge(property: edge): top | bottom | start | end = js.native
  @JSName("getProperty")
  def getProperty_item(property: item): AnonRendererSelectable[K, D] = js.native
  @JSName("getProperty")
  def getProperty_overflow(property: overflow): popup | hidden = js.native
  @JSName("getProperty")
  def getProperty_reorderable(property: reorderable): enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_truncation(property: truncation): none | progressive = js.native
  def setProperties(properties: ojTabBarSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: display, value: all): Unit = js.native
  def setProperty(property: display, value: icons): Unit = js.native
  def setProperty(property: edge, value: bottom): Unit = js.native
  def setProperty(property: edge, value: end): Unit = js.native
  def setProperty(property: edge, value: start): Unit = js.native
  def setProperty(property: edge, value: top): Unit = js.native
  def setProperty(property: overflow, value: hidden): Unit = js.native
  def setProperty(property: overflow, value: popup): Unit = js.native
  def setProperty(property: reorderable, value: disabled): Unit = js.native
  def setProperty(property: reorderable, value: enabled): Unit = js.native
  def setProperty(property: truncation, value: none): Unit = js.native
  def setProperty(property: truncation, value: progressive): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: currentItem, value: js.Any): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_item(property: item, value: AnonRendererSelectable[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Any): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonAccessibleReorderAfterItem): Unit = js.native
}

