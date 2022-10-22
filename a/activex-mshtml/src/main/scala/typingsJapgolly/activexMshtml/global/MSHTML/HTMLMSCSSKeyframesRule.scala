package typingsJapgolly.activexMshtml.global.MSHTML

import typingsJapgolly.activexMshtml.MSHTML.IHTMLStyleSheetRulesCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.HTMLMSCSSKeyframesRule")
@js.native
/* private */ open class HTMLMSCSSKeyframesRule ()
  extends StObject
     with typingsJapgolly.activexMshtml.MSHTML.HTMLMSCSSKeyframesRule {
  
  /* private */ /* CompleteClass */
  @JSName("MSHTML.HTMLMSCSSKeyframesRule_typekey")
  var MSHTMLDotHTMLMSCSSKeyframesRule_typekey: typingsJapgolly.activexMshtml.MSHTML.HTMLMSCSSKeyframesRule = js.native
  
  /* CompleteClass */
  override def appendRule(bstrRule: String): Unit = js.native
  
  /* CompleteClass */
  override def cssRules(index: Double): typingsJapgolly.activexMshtml.MSHTML.IHTMLStyleSheetRule = js.native
  /* CompleteClass */
  @JSName("cssRules")
  override val cssRules_Original: IHTMLStyleSheetRulesCollection = js.native
  
  /* CompleteClass */
  var cssText: String = js.native
  
  /* CompleteClass */
  override def deleteRule(bstrKey: String): Unit = js.native
  
  /* CompleteClass */
  override def findRule(bstrKey: String): typingsJapgolly.activexMshtml.MSHTML.IHTMLMSCSSKeyframeRule = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override val parentRule: typingsJapgolly.activexMshtml.MSHTML.IHTMLCSSRule = js.native
  
  /* CompleteClass */
  override val parentStyleSheet: typingsJapgolly.activexMshtml.MSHTML.IHTMLStyleSheet = js.native
  
  /* CompleteClass */
  override val `type`: Double = js.native
}
