package typingsJapgolly.reactNativeWindows.rntypesMod.Animated

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeWindows.anon.TranslateX
import typingsJapgolly.reactNativeWindows.anon.TranslateY
import typingsJapgolly.reactNativeWindows.anon.X
import typingsJapgolly.reactNativeWindows.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows/rntypes", "Animated.ValueXY")
@js.native
open class ValueXY () extends AnimatedWithChildren {
  def this(valueIn: Y) = this()
  
  def extractOffset(): Unit = js.native
  
  def flattenOffset(): Unit = js.native
  
  /**
    * Converts `{x, y}` into `{left, top}` for use in style, e.g.
    *
    *```javascript
    *  style={this.state.anim.getLayout()}
    *```
    */
  def getLayout(): StringDictionary[AnimatedValue] = js.native
  
  /**
    * Converts `{x, y}` into a useable translation transform, e.g.
    *
    *```javascript
    *  style={{
    *    transform: this.state.anim.getTranslateTransform()
    *  }}
    *```
    */
  def getTranslateTransform(): js.Tuple2[TranslateX, TranslateY] = js.native
  
  def setOffset(offset: X): Unit = js.native
  
  def setValue(value: X): Unit = js.native
  
  def stopAnimation(): Unit = js.native
  def stopAnimation(callback: js.Function1[/* value */ X, Unit]): Unit = js.native
  
  var x: AnimatedValue = js.native
  
  var y: AnimatedValue = js.native
}
