package typingsJapgolly.atvlegacycontentkit

import typingsJapgolly.atvlegacycontentkit.atvlegacycontentkitStrings.`truncate-head`
import typingsJapgolly.atvlegacycontentkit.atvlegacycontentkitStrings.`truncate-middle`
import typingsJapgolly.atvlegacycontentkit.atvlegacycontentkitStrings.`truncate-tail`
import typingsJapgolly.atvlegacycontentkit.atvlegacycontentkitStrings.`word-wrap`
import typingsJapgolly.atvlegacycontentkit.atvlegacycontentkitStrings.center
import typingsJapgolly.atvlegacycontentkit.atvlegacycontentkitStrings.clip
import typingsJapgolly.atvlegacycontentkit.atvlegacycontentkitStrings.heavy
import typingsJapgolly.atvlegacycontentkit.atvlegacycontentkitStrings.justify
import typingsJapgolly.atvlegacycontentkit.atvlegacycontentkitStrings.left
import typingsJapgolly.atvlegacycontentkit.atvlegacycontentkitStrings.light
import typingsJapgolly.atvlegacycontentkit.atvlegacycontentkitStrings.normal
import typingsJapgolly.atvlegacycontentkit.atvlegacycontentkitStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:strict-export-declare-modifiers
trait AttributeContainer extends StObject {
  
  /**
    * The alignment of the text.
    */
  var alignment: js.UndefOr[left | right | center | justify] = js.undefined
  
  /**
    * The way the text should break.
    */
  var breakMode: js.UndefOr[clip | `word-wrap` | `truncate-head` | `truncate-tail` | `truncate-middle`] = js.undefined
  
  /**
    * The colour of the text.
    */
  var color: ATVColor
  
  /**
    * The size of the text.
    */
  var pointSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The weight of the text.
    */
  var weight: js.UndefOr[normal | light | heavy] = js.undefined
}
object AttributeContainer {
  
  inline def apply(color: ATVColor): AttributeContainer = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeContainer]
  }
  
  extension [Self <: AttributeContainer](x: Self) {
    
    inline def setAlignment(value: left | right | center | justify): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setBreakMode(value: clip | `word-wrap` | `truncate-head` | `truncate-tail` | `truncate-middle`): Self = StObject.set(x, "breakMode", value.asInstanceOf[js.Any])
    
    inline def setBreakModeUndefined: Self = StObject.set(x, "breakMode", js.undefined)
    
    inline def setColor(value: ATVColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    inline def setWeight(value: normal | light | heavy): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
