package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expect[R] extends StObject {
  
  /**
    * Negate the expectation.
    * @example await expect(element(by.id('UniqueId205'))).not.toBeVisible();
    */
  var not: this.type = js.native
  
  /**
    * Expect the view to be focused.
    * @example await expect(element(by.id('loginInput'))).toBeFocused();
    */
  def toBeFocused(): R = js.native
  
  /**
    * Expect the view not to be focused.
    * @example await expect(element(by.id('passwordInput'))).toBeNotFocused();
    * @deprecated Use `.not.toBeFocused()` instead.
    */
  def toBeNotFocused(): R = js.native
  
  /**
    * Expect the view to not be visible.
    * @example await expect(element(by.id('UniqueId205'))).toBeNotVisible();
    * @deprecated Use `.not.toBeVisible()` instead.
    */
  def toBeNotVisible(): R = js.native
  
  /**
    * Expect the view to be at least N% visible. If no number is provided then defaults to 75%. Negating this
    * expectation with a `not` expects the view's visible area to be smaller than N%.
    * @param pct optional integer ranging from 1 to 100, indicating how much percent of the view should be
    *  visible to the user to be accepted.
    * @example await expect(element(by.id('UniqueId204'))).toBeVisible(35);
    */
  def toBeVisible(): R = js.native
  def toBeVisible(pct: Double): R = js.native
  
  /**
    * Expect the view to exist in the UI hierarchy.
    * @example await expect(element(by.id('UniqueId205'))).toExist();
    */
  def toExist(): R = js.native
  
  /**
    * In React Native apps, expect UI component to have testID with that id.
    * In native iOS apps, expect UI element to have accessibilityIdentifier with that id.
    * @example await expect(element(by.text('I contain some text'))).toHaveId('UniqueId204');
    */
  def toHaveId(id: String): R = js.native
  
  /**
    * It searches by accessibilityLabel on iOS, or by contentDescription on Android.
    * In React Native it can be set for both platforms by defining an accessibilityLabel on the view.
    * @example await expect(element(by.id('UniqueId204'))).toHaveLabel('Done');
    */
  def toHaveLabel(label: String): R = js.native
  
  /**
    * Expect Slider to have a position (0 - 1).
    * Can have an optional tolerance to take into account rounding issues on ios
    * @example await expect(element(by.id('SliderId'))).toHavePosition(0.75);
    * @example await expect(element(by.id('SliderId'))).toHavePosition(0.74, 0.1);
    */
  def toHaveSliderPosition(position: Double): js.Promise[Unit] = js.native
  def toHaveSliderPosition(position: Double, tolerance: Double): js.Promise[Unit] = js.native
  
  /**
    * In React Native apps, expect UI component of type <Text> to have text.
    * In native iOS apps, expect UI elements of type UIButton, UILabel, UITextField or UITextViewIn to have inputText with text.
    * @example await expect(element(by.id('UniqueId204'))).toHaveText('I contain some text');
    */
  def toHaveText(text: String): R = js.native
  
  /**
    * Expects a toggle-able element (e.g. a Switch or a Check-Box) to be on/checked or off/unchecked.
    * As a reference, in react-native, this is the equivalent switch component.
    * @example await expect(element(by.id('switch'))).toHaveToggleValue(true);
    */
  def toHaveToggleValue(value: Boolean): R = js.native
  
  /**
    * Expect components like a Switch to have a value ('0' for off, '1' for on).
    * @example await expect(element(by.id('UniqueId533'))).toHaveValue('0');
    */
  def toHaveValue(value: Any): R = js.native
  
  /**
    * Expect the view to not exist in the UI hierarchy.
    * @example await expect(element(by.id('RandomJunk959'))).toNotExist();
    * @deprecated Use `.not.toExist()` instead.
    */
  def toNotExist(): R = js.native
}
