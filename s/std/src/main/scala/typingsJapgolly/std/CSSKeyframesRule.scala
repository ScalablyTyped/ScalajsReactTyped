package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object representing a complete set of keyframes for a CSS animation. It corresponds to the contains of a whole @keyframes at-rule. It implements the CSSRule interface with a type value of 7 (CSSRule.KEYFRAMES_RULE). */
trait CSSKeyframesRule
  extends StObject
     with CSSRule {
  
  /* standard dom */
  def appendRule(rule: java.lang.String): Unit
  
  /* standard dom */
  val cssRules: org.scalajs.dom.CSSRuleList
  
  /* standard dom */
  def deleteRule(select: java.lang.String): Unit
  
  /* standard dom */
  def findRule(select: java.lang.String): org.scalajs.dom.CSSKeyframeRule | Null
  
  /* standard dom */
  var name: java.lang.String
}
object CSSKeyframesRule {
  
  inline def apply(
    CHARSET_RULE: Double,
    FONT_FACE_RULE: Double,
    IMPORT_RULE: Double,
    KEYFRAMES_RULE: Double,
    KEYFRAME_RULE: Double,
    MEDIA_RULE: Double,
    NAMESPACE_RULE: Double,
    PAGE_RULE: Double,
    STYLE_RULE: Double,
    SUPPORTS_RULE: Double,
    appendRule: java.lang.String => Callback,
    cssRules: org.scalajs.dom.CSSRuleList,
    cssText: java.lang.String,
    deleteRule: java.lang.String => Callback,
    findRule: java.lang.String => org.scalajs.dom.CSSKeyframeRule | Null,
    name: java.lang.String,
    `type`: Double
  ): CSSKeyframesRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], appendRule = js.Any.fromFunction1((t0: java.lang.String) => appendRule(t0).runNow()), cssRules = cssRules.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], deleteRule = js.Any.fromFunction1((t0: java.lang.String) => deleteRule(t0).runNow()), findRule = js.Any.fromFunction1(findRule), name = name.asInstanceOf[js.Any], parentRule = null, parentStyleSheet = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSKeyframesRule]
  }
  
  extension [Self <: CSSKeyframesRule](x: Self) {
    
    inline def setAppendRule(value: java.lang.String => Callback): Self = StObject.set(x, "appendRule", js.Any.fromFunction1((t0: java.lang.String) => value(t0).runNow()))
    
    inline def setCssRules(value: org.scalajs.dom.CSSRuleList): Self = StObject.set(x, "cssRules", value.asInstanceOf[js.Any])
    
    inline def setDeleteRule(value: java.lang.String => Callback): Self = StObject.set(x, "deleteRule", js.Any.fromFunction1((t0: java.lang.String) => value(t0).runNow()))
    
    inline def setFindRule(value: java.lang.String => org.scalajs.dom.CSSKeyframeRule | Null): Self = StObject.set(x, "findRule", js.Any.fromFunction1(value))
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
