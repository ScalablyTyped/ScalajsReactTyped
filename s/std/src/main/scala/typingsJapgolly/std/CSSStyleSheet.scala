package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single CSS style sheet. It inherits properties and methods from its parent, StyleSheet. */
@js.native
trait CSSStyleSheet extends StyleSheet {
  val cssRules: org.scalajs.dom.raw.CSSRuleList = js.native
  /** @deprecated */
  var cssText: java.lang.String = js.native
  /** @deprecated */
  val id: java.lang.String = js.native
  /** @deprecated */
  val imports: org.scalajs.dom.raw.StyleSheetList = js.native
  /** @deprecated */
  val isAlternate: scala.Boolean = js.native
  /** @deprecated */
  val isPrefAlternate: scala.Boolean = js.native
  val ownerRule: org.scalajs.dom.raw.CSSRule | Null = js.native
  /** @deprecated */
  val owningElement: org.scalajs.dom.raw.Element = js.native
  /** @deprecated */
  val pages: js.Any = js.native
  /** @deprecated */
  val readOnly: scala.Boolean = js.native
  val rules: org.scalajs.dom.raw.CSSRuleList = js.native
  /** @deprecated */
  def addImport(bstrURL: java.lang.String): Double = js.native
  def addImport(bstrURL: java.lang.String, lIndex: Double): Double = js.native
  /** @deprecated */
  def addPageRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String): Double = js.native
  def addPageRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String, lIndex: Double): Double = js.native
  def addRule(bstrSelector: java.lang.String): Double = js.native
  def addRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String): Double = js.native
  def addRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String, lIndex: Double): Double = js.native
  def deleteRule(): Unit = js.native
  def deleteRule(index: Double): Unit = js.native
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
  /** @deprecated */
  def removeImport(lIndex: Double): Unit = js.native
  def removeRule(lIndex: Double): Unit = js.native
}

@JSGlobal("CSSStyleSheet")
@js.native
object CSSStyleSheet extends Instantiable0[CSSStyleSheet]

