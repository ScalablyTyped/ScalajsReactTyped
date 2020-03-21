package typingsJapgolly.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGPathSegList")
@js.native
class SVGPathSegList protected () extends js.Object {
  @JSName("MSHTML.SVGPathSegList_typekey")
  var MSHTMLDotSVGPathSegList_typekey: SVGPathSegList = js.native
  var numberOfItems: Double = js.native
  def appendItem(newItem: SVGPathSeg): SVGPathSeg = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): SVGPathSeg = js.native
  def initialize(newItem: SVGPathSeg): SVGPathSeg = js.native
  def insertItemBefore(newItem: SVGPathSeg, index: Double): SVGPathSeg = js.native
  def removeItem(index: Double): SVGPathSeg = js.native
  def replaceItem(newItem: SVGPathSeg, index: Double): SVGPathSeg = js.native
}

