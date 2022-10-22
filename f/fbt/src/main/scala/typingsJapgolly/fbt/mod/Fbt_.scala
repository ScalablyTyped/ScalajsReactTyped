package typingsJapgolly.fbt.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fbt.fbtStrings.END_TO_END
import typingsJapgolly.fbt.fbtStrings.END_TO_START
import typingsJapgolly.fbt.fbtStrings.START_TO_END
import typingsJapgolly.fbt.fbtStrings.START_TO_START
import typingsJapgolly.fbt.fbtStrings.cloneContents
import typingsJapgolly.fbt.fbtStrings.cloneRange
import typingsJapgolly.fbt.fbtStrings.collapse
import typingsJapgolly.fbt.fbtStrings.collapsed
import typingsJapgolly.fbt.fbtStrings.commonAncestorContainer
import typingsJapgolly.fbt.fbtStrings.compareBoundaryPoints
import typingsJapgolly.fbt.fbtStrings.comparePoint
import typingsJapgolly.fbt.fbtStrings.createContextualFragment
import typingsJapgolly.fbt.fbtStrings.deleteContents
import typingsJapgolly.fbt.fbtStrings.detach
import typingsJapgolly.fbt.fbtStrings.endContainer
import typingsJapgolly.fbt.fbtStrings.endOffset
import typingsJapgolly.fbt.fbtStrings.extractContents
import typingsJapgolly.fbt.fbtStrings.getBoundingClientRect
import typingsJapgolly.fbt.fbtStrings.getClientRects
import typingsJapgolly.fbt.fbtStrings.insertNode
import typingsJapgolly.fbt.fbtStrings.intersectsNode
import typingsJapgolly.fbt.fbtStrings.isPointInRange
import typingsJapgolly.fbt.fbtStrings.selectNode
import typingsJapgolly.fbt.fbtStrings.selectNodeContents
import typingsJapgolly.fbt.fbtStrings.setEnd
import typingsJapgolly.fbt.fbtStrings.setEndAfter
import typingsJapgolly.fbt.fbtStrings.setEndBefore
import typingsJapgolly.fbt.fbtStrings.setStart
import typingsJapgolly.fbt.fbtStrings.setStartAfter
import typingsJapgolly.fbt.fbtStrings.setStartBefore
import typingsJapgolly.fbt.fbtStrings.startContainer
import typingsJapgolly.fbt.fbtStrings.startOffset
import typingsJapgolly.fbt.fbtStrings.surroundContents
import typingsJapgolly.fbt.fbtStrings.toString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fbt_ extends StObject {
  
  def apply(text: String, description: String): js.Array[String] = js.native
  def apply(text: String, description: String, options: FbtOptions): js.Array[String] = js.native
  
  //
  /**
    * To use the strings at runtime, there is the `fbt.c(...)` function call or the <fbt common=true>...</fbt> JSX API.
    * NOTE: The transform will throw if it encounters a common string not in the map provided.
    * https://facebook.github.io/fbt/docs/common#runtime-api
    */
  def c(text: String): js.Array[String] = js.native
  
  // Only used in React Native in fbsource
  def disableJsonExportMode(): Unit = js.native
  
  // https://github.com/facebook/fbt/blob/d14af3e7dcf775562d4c4d27e62861bd9394ea6b/runtime/shared/fbt.js#L453-L455
  // Only used in React Native in fbsource
  def enableJsonExportMode(): Unit = js.native
  
  def `enum`(index: String, range: js.Array[String]): String = js.native
  def `enum`[Range /* <: StringDictionary[String] */](
    enumKey: /* keyof Range */ commonAncestorContainer | cloneContents | cloneRange | collapse | compareBoundaryPoints | comparePoint | createContextualFragment | deleteContents | detach | extractContents | getBoundingClientRect | getClientRects | insertNode | intersectsNode | isPointInRange | selectNode | selectNodeContents | setEnd | setEndAfter | setEndBefore | setStart | setStartAfter | setStartBefore | surroundContents | toString | END_TO_END | END_TO_START | START_TO_END | START_TO_START | collapsed | endContainer | endOffset | startContainer | startOffset,
    enumRange: Range
  ): String = js.native
  
  def isFbtInstance(value: Any): Boolean = js.native
  
  def name(tokenName: String, value: Any, gender: IntlVariationsGender): String = js.native
  
  def param(name: String, value: Any): String = js.native
  def param(name: String, value: Any, options: ParamOptions): String = js.native
  
  def plural(singularPhrase: String, count: Double): String = js.native
  def plural(singularPhrase: String, count: Double, options: PluralOptions): String = js.native
  
  def pronoun(`type`: PronounType, gender: GenderConst): String = js.native
  def pronoun(`type`: PronounType, gender: GenderConst, options: PronounOptions): String = js.native
  
  def sameParam(name: String): String = js.native
}
