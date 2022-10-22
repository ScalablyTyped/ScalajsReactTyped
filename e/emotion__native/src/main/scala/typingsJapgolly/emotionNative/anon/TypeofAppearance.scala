package typingsJapgolly.emotionNative.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNative.mod.Appearance.AppearanceListener
import typingsJapgolly.reactNative.mod.ColorSchemeName
import typingsJapgolly.reactNative.mod.NativeEventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAppearance extends StObject {
  
  def addChangeListener(listener: AppearanceListener): NativeEventSubscription
  
  def getColorScheme(): ColorSchemeName
}
object TypeofAppearance {
  
  inline def apply(
    addChangeListener: AppearanceListener => NativeEventSubscription,
    getColorScheme: CallbackTo[ColorSchemeName]
  ): TypeofAppearance = {
    val __obj = js.Dynamic.literal(addChangeListener = js.Any.fromFunction1(addChangeListener), getColorScheme = getColorScheme.toJsFn)
    __obj.asInstanceOf[TypeofAppearance]
  }
  
  extension [Self <: TypeofAppearance](x: Self) {
    
    inline def setAddChangeListener(value: AppearanceListener => NativeEventSubscription): Self = StObject.set(x, "addChangeListener", js.Any.fromFunction1(value))
    
    inline def setGetColorScheme(value: CallbackTo[ColorSchemeName]): Self = StObject.set(x, "getColorScheme", value.toJsFn)
  }
}
