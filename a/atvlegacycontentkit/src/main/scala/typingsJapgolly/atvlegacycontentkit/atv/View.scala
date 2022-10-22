package typingsJapgolly.atvlegacycontentkit.atv

import japgolly.scalajs.react.Callback
import typingsJapgolly.atvlegacycontentkit.ATVAnimation
import typingsJapgolly.atvlegacycontentkit.ATVColor
import typingsJapgolly.atvlegacycontentkit.ATVFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  /**
    * Adds an animation to the view.
    * @param animation The animation to add.
    * @param key A unique key for this animation, so that it can be managed later.
    */
  def addAnimation(animation: ATVAnimation, key: String): Unit
  
  /**
    * The background colour of the view.
    */
  var backgroundColor: ATVColor
  
  /**
    * The frame for this view. This defines the width, height and position of the view.
    *
    * This doesn't apply for the root view in a scriptView.
    */
  var frame: ATVFrame
  
  /**
    * Remove all animations from an object.
    */
  def removeAllAnimations(): Unit
  
  /**
    * Remove a specific animation from the view.
    * @param key The key of the animation to remove.
    */
  def removeAnimation(key: String): Unit
  
  /**
    * Child views of this view. They are displayed on top of the view, in the order specified (e.g. the first being the lowest).
    *
    * The frame for these children views is set as (0, 0) as being at the bottom corner of the parent frame.
    */
  var subviews: js.Array[View]
}
object View {
  
  inline def apply(
    addAnimation: (ATVAnimation, String) => Callback,
    backgroundColor: ATVColor,
    frame: ATVFrame,
    removeAllAnimations: Callback,
    removeAnimation: String => Callback,
    subviews: js.Array[View]
  ): View = {
    val __obj = js.Dynamic.literal(addAnimation = js.Any.fromFunction2((t0: ATVAnimation, t1: String) => (addAnimation(t0, t1)).runNow()), backgroundColor = backgroundColor.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], removeAllAnimations = removeAllAnimations.toJsFn, removeAnimation = js.Any.fromFunction1((t0: String) => removeAnimation(t0).runNow()), subviews = subviews.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  extension [Self <: View](x: Self) {
    
    inline def setAddAnimation(value: (ATVAnimation, String) => Callback): Self = StObject.set(x, "addAnimation", js.Any.fromFunction2((t0: ATVAnimation, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setBackgroundColor(value: ATVColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: ATVFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllAnimations(value: Callback): Self = StObject.set(x, "removeAllAnimations", value.toJsFn)
    
    inline def setRemoveAnimation(value: String => Callback): Self = StObject.set(x, "removeAnimation", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSubviews(value: js.Array[View]): Self = StObject.set(x, "subviews", value.asInstanceOf[js.Any])
    
    inline def setSubviewsVarargs(value: View*): Self = StObject.set(x, "subviews", js.Array(value*))
  }
}
