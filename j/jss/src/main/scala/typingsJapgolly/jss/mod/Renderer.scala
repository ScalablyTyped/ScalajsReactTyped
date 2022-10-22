package typingsJapgolly.jss.mod

import org.scalajs.dom.CSSRule
import org.scalajs.dom.CSSRuleList
import org.scalajs.dom.CSSStyleRule
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jss.jssBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer extends StObject {
  
  def attach(): Unit = js.native
  
  def deleteRule(cssRule: CSSRule): Boolean = js.native
  
  def deploy(sheet: StyleSheet[String | Double | js.Symbol]): Unit = js.native
  
  def detach(): Unit = js.native
  
  def getPropertyValue(cssRule: CSSStyleRule, prop: String): String = js.native
  def getPropertyValue(cssRule: HTMLElement, prop: String): String = js.native
  
  def getRules(): CSSRuleList | Unit = js.native
  
  def indexOf(cssRule: CSSRule): Double = js.native
  
  def insertRule(rule: Rule): `false` | CSSRule = js.native
  
  def removeProperty(cssRule: CSSStyleRule, prop: String): Unit = js.native
  def removeProperty(cssRule: HTMLElement, prop: String): Unit = js.native
  
  def replaceRule(cssRule: CSSRule, rule: Rule): `false` | CSSRule = js.native
  
  def setProperty(cssRule: CSSStyleRule, prop: String, value: JssValue): Boolean = js.native
  def setProperty(cssRule: HTMLElement, prop: String, value: JssValue): Boolean = js.native
  
  def setSelector(cssRule: CSSStyleRule, selectorText: String): Boolean = js.native
}
