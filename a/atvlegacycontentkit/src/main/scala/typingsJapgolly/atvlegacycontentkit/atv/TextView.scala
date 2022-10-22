package typingsJapgolly.atvlegacycontentkit.atv

import japgolly.scalajs.react.Callback
import typingsJapgolly.atvlegacycontentkit.ATVAnimation
import typingsJapgolly.atvlegacycontentkit.ATVColor
import typingsJapgolly.atvlegacycontentkit.ATVFrame
import typingsJapgolly.atvlegacycontentkit.AttributedString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A view that shows a piece of text.
  */
trait TextView
  extends StObject
     with View {
  
  /**
    * The string to display, including formatting.
    */
  var attributedString: AttributedString
}
object TextView {
  
  inline def apply(
    addAnimation: (ATVAnimation, String) => Callback,
    attributedString: AttributedString,
    backgroundColor: ATVColor,
    frame: ATVFrame,
    removeAllAnimations: Callback,
    removeAnimation: String => Callback,
    subviews: js.Array[View]
  ): TextView = {
    val __obj = js.Dynamic.literal(addAnimation = js.Any.fromFunction2((t0: ATVAnimation, t1: String) => (addAnimation(t0, t1)).runNow()), attributedString = attributedString.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], removeAllAnimations = removeAllAnimations.toJsFn, removeAnimation = js.Any.fromFunction1((t0: String) => removeAnimation(t0).runNow()), subviews = subviews.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextView]
  }
  
  extension [Self <: TextView](x: Self) {
    
    inline def setAttributedString(value: AttributedString): Self = StObject.set(x, "attributedString", value.asInstanceOf[js.Any])
  }
}
