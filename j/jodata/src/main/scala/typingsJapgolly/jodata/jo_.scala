package typingsJapgolly.jodata

import typingsJapgolly.jodata.jo.ExpandSettings
import typingsJapgolly.jodata.jo.FilterClause
import typingsJapgolly.jodata.jo.FormatOptions
import typingsJapgolly.jodata.jo.FormatSettings
import typingsJapgolly.jodata.jo.InlineCountOptions
import typingsJapgolly.jodata.jo.InlineCountSettings
import typingsJapgolly.jodata.jo.OrderBySettings
import typingsJapgolly.jodata.jo.PrecedenceGroup
import typingsJapgolly.jodata.jo.SelectSettings
import typingsJapgolly.jodata.jo.SkipSettings
import typingsJapgolly.jodata.jo.TopSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jo")
@js.native
class jo_ protected () extends js.Object {
  def this(baseUri: String) = this()
  var ExpandSettings: ExpandSettings = js.native
  var FilterSettings: InlineCountSettings = js.native
  var FormatSettings: FormatSettings = js.native
  var InlineCountSettings: InlineCountSettings = js.native
  var OrderBySettings: OrderBySettings = js.native
  var SelectSettings: SelectSettings = js.native
  var SkipSettings: SkipSettings = js.native
  var TopSettings: TopSettings = js.native
  var baseUri: String = js.native
  var currentHashRoute: String = js.native
  def andFilter(filterClause: FilterClause): jo = js.native
  def andFilter(filterClause: PrecedenceGroup): jo = js.native
  def asc(): jo = js.native
  def captureFilter(): Unit = js.native
  def defaultAndFilter(filterClause: FilterClause): jo = js.native
  def defaultFilter(filterClause: FilterClause): jo = js.native
  def defaultOrFilter(filterClause: FilterClause): jo = js.native
  def desc(): jo = js.native
  def expand(expand: String): jo = js.native
  // Filter
  def filter(filterClause: FilterClause): jo = js.native
  def filter(filterClause: PrecedenceGroup): jo = js.native
  // Format
  def format(): FormatOptions = js.native
  def formatDefault(): FormatOptions = js.native
  // Inline count
  def inlineCount(): InlineCountOptions = js.native
  def inlineCountDefault(): InlineCountOptions = js.native
  def orFilter(filterClause: FilterClause): jo = js.native
  def orFilter(filterClause: PrecedenceGroup): jo = js.native
  def orderBy(property: String): jo = js.native
  def removeFilter(property: String): jo = js.native
  def resetExpand(): jo = js.native
  def resetFilter(): jo = js.native
  def resetFormat(): Unit = js.native
  def resetInlineCount(): Unit = js.native
  def resetOrderBy(): jo = js.native
  def resetSelect(): jo = js.native
  def resetSkip(): jo = js.native
  def resetToCapturedFilter(): jo = js.native
  def resetTop(): jo = js.native
  def saveLocal(): Unit = js.native
  def saveLocal(key: String): Unit = js.native
  def select(select: js.Array[String]): jo = js.native
  // Expand
  def setExpandDefault(expand: String): jo = js.native
  // Order by
  def setOrderByDefault(property: String): jo = js.native
  def setOrderByDefault(property: String, order: String): jo = js.native
  // Select
  def setSelectDefault(select: js.Array[String]): jo = js.native
  // Skip
  def setSkipDefault(skip: Double): jo = js.native
  // Top
  def setTopDefault(top: Double): jo = js.native
  def skip(skip: Double): jo = js.native
  def toJson(): String = js.native
  def toggleOrderBy(property: String): jo = js.native
  def toggleOrderBy(property: String, callback: js.Function): jo = js.native
  def top(top: Double): jo = js.native
  def updateHashRoute(hashRoute: String): Unit = js.native
}

