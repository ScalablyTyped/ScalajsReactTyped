package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByFacade extends StObject {
  
  /**
    * by.id will match an id that is given to the view via testID prop.
    * @example
    * // In a React Native component add testID like so:
    * <TouchableOpacity testID={'tap_me'}>
    * // Then match with by.id:
    * await element(by.id('tap_me'));
    */
  def id(id: String): NativeMatcher
  
  /**
    * Find an element by accessibilityLabel on iOS, or by contentDescription on Android.
    * @example await element(by.label('Welcome'));
    */
  def label(label: String): NativeMatcher
  
  /**
    * Find an element by text, useful for text fields, buttons.
    * @example await element(by.text('Tap Me'));
    */
  def text(text: String): NativeMatcher
  
  /**
    * Find an element with an accessibility trait. (iOS only)
    * @example await element(by.traits(['button']));
    */
  def traits(traits: js.Array[String]): NativeMatcher
  
  /**
    * Find an element by native view type.
    * @example await element(by.type('RCTImageView'));
    */
  def `type`(nativeViewType: String): NativeMatcher
  
  /**
    * Collection of web matchers
    */
  val web: ByWebFacade
}
object ByFacade {
  
  inline def apply(
    id: String => NativeMatcher,
    label: String => NativeMatcher,
    text: String => NativeMatcher,
    traits: js.Array[String] => NativeMatcher,
    `type`: String => NativeMatcher,
    web: ByWebFacade
  ): ByFacade = {
    val __obj = js.Dynamic.literal(id = js.Any.fromFunction1(id), label = js.Any.fromFunction1(label), text = js.Any.fromFunction1(text), traits = js.Any.fromFunction1(traits), web = web.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[ByFacade]
  }
  
  extension [Self <: ByFacade](x: Self) {
    
    inline def setId(value: String => NativeMatcher): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
    
    inline def setLabel(value: String => NativeMatcher): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setText(value: String => NativeMatcher): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    inline def setTraits(value: js.Array[String] => NativeMatcher): Self = StObject.set(x, "traits", js.Any.fromFunction1(value))
    
    inline def setType(value: String => NativeMatcher): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
    
    inline def setWeb(value: ByWebFacade): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
  }
}
