package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single CSS @media rule. It implements the CSSConditionRule interface, and therefore the CSSGroupingRule and the CSSRule interface with a type value of 4 (CSSRule.MEDIA_RULE). */
@js.native
trait CSSMediaRule
  extends StObject
     with CSSConditionRule {
  
  /* standard dom */
  val media: org.scalajs.dom.MediaList = js.native
}
