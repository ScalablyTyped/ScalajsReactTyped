package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.Elements
import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeElementActions extends StObject {
  
  /**
    * Adjust slider to position.
    * @example await element(by.id('slider')).adjustSliderToPosition(0.75);
    */
  def adjustSliderToPosition(newPosition: Double): js.Promise[Unit] = js.native
  
  /**
    * Clear text from a text field.
    * @example await element(by.id('textField')).clearText();
    */
  def clearText(): js.Promise[Unit] = js.native
  
  /**
    * Gets the native (OS-dependent) attributes of the element.
    * For more information, see {@link https://wix.github.io/Detox/docs/api/actions-on-element/#getattributes}
    *
    * @example
    * test('Get the attributes for my text element', async () => {
    *    const attributes = await element(by.id('myText')).getAttributes()
    *    const jestExpect = require('expect');
    *    // 'visible' attribute available on both iOS and Android
    *    jestExpect(attributes.visible).toBe(true);
    *    // 'activationPoint' attribute available on iOS only
    *    jestExpect(attributes.activationPoint.x).toHaveValue(50);
    *    // 'width' attribute available on Android only
    *    jestExpect(attributes.width).toHaveValue(100);
    * })
    */
  def getAttributes(): js.Promise[IosElementAttributes | AndroidElementAttributes | Elements] = js.native
  
  /**
    * Simulate long press on an element
    * @param duration (iOS only) custom press duration time, in milliseconds. Optional (default is 1000ms).
    * @example await element(by.id('tappable')).longPress();
    */
  def longPress(): js.Promise[Unit] = js.native
  def longPress(duration: Double): js.Promise[Unit] = js.native
  
  /**
    * Simulate long press on an element and then drag it to the position of the target element. (iOS Only)
    * @example await element(by.id('draggable')).longPressAndDrag(2000, NaN, NaN, element(by.id('target')), NaN, NaN, 'fast', 0);
    */
  def longPressAndDrag(
    duration: Double,
    normalizedPositionX: Double,
    normalizedPositionY: Double,
    targetElement: NativeElement,
    normalizedTargetPositionX: Double,
    normalizedTargetPositionY: Double,
    speed: Speed,
    holdDuration: Double
  ): js.Promise[Unit] = js.native
  
  /**
    * Simulate multiple taps on an element.
    * @param times number of times to tap
    * @example await element(by.id('tappable')).multiTap(3);
    */
  def multiTap(times: Double): js.Promise[Unit] = js.native
  
  /**
    * Pinches with the given scale, speed, and angle. (iOS only)
    * @param speed default is `fast`
    * @param angle value in radiant, default is `0`
    * @example
    * await element(by.id('PinchableScrollView')).pinch(1.1);
    * await element(by.id('PinchableScrollView')).pinch(2.0);
    * await element(by.id('PinchableScrollView')).pinch(0.001);
    */
  def pinch(scale: Double): js.Promise[Unit] = js.native
  def pinch(scale: Double, speed: Unit, angle: Double): js.Promise[Unit] = js.native
  def pinch(scale: Double, speed: Speed): js.Promise[Unit] = js.native
  def pinch(scale: Double, speed: Speed, angle: Double): js.Promise[Unit] = js.native
  
  /**
    * Pinches in the given direction with speed and angle. (iOS only)
    * @param angle value in radiant, default is `0`
    * @example
    * await expect(element(by.id('PinchableScrollView'))).toBeVisible();
    * await element(by.id('PinchableScrollView')).pinchWithAngle('outward', 'slow', 0);
    * @deprecated Use `.pinch()` instead.
    */
  def pinchWithAngle(direction: PinchDirection, speed: Speed, angle: Double): js.Promise[Unit] = js.native
  
  /**
    * Paste text into a text field.
    * @example await element(by.id('textField')).replaceText('passcode again');
    */
  def replaceText(text: String): js.Promise[Unit] = js.native
  
  /**
    * Scrolls a given amount of pixels in the provided direction, starting from the provided start positions.
    * @param pixels - independent device pixels
    * @param direction - left/right/up/down
    * @param startPositionX - the X starting scroll position, in percentage; valid input: `[0.0, 1.0]`, `NaN`; default: `NaN`—choose the best value automatically
    * @param startPositionY - the Y starting scroll position, in percentage; valid input: `[0.0, 1.0]`, `NaN`; default: `NaN`—choose the best value automatically
    * @example await element(by.id('scrollView')).scroll(100, 'down', NaN, 0.85);
    * @example await element(by.id('scrollView')).scroll(100, 'up');
    */
  def scroll(pixels: Double, direction: Direction): js.Promise[Unit] = js.native
  def scroll(pixels: Double, direction: Direction, startPositionX: Double): js.Promise[Unit] = js.native
  def scroll(pixels: Double, direction: Direction, startPositionX: Double, startPositionY: Double): js.Promise[Unit] = js.native
  def scroll(pixels: Double, direction: Direction, startPositionX: Unit, startPositionY: Double): js.Promise[Unit] = js.native
  
  /**
    * Scroll to edge.
    * @example await element(by.id('scrollView')).scrollTo('bottom');
    * @example await element(by.id('scrollView')).scrollTo('top');
    */
  def scrollTo(edge: Direction): js.Promise[Unit] = js.native
  
  /**
    * Scroll to index.
    * @example await element(by.id('scrollView')).scrollToIndex(10);
    */
  def scrollToIndex(index: Number): js.Promise[Unit] = js.native
  
  /**
    * Sets a picker view’s column to the given value. This function supports both date pickers and general picker views. (iOS Only)
    * Note: When working with date pickers, you should always set an explicit locale when launching your app in order to prevent flakiness from different date and time styles.
    * See [here](https://wix.github.io/Detox/docs/api/device-object-api#9-launch-with-a-specific-language-ios-only) for more information.
    *
    * @param column number of datepicker column (starts from 0)
    * @param value string value in set column (must be correct)
    * @example
    * await expect(element(by.type('UIPickerView'))).toBeVisible();
    * await element(by.type('UIPickerView')).setColumnToValue(1,"6");
    * await element(by.type('UIPickerView')).setColumnToValue(2,"34");
    */
  def setColumnToValue(column: Double, value: String): js.Promise[Unit] = js.native
  
  /**
    * Sets the date of a date picker to a date generated from the provided string and date format. (iOS only)
    * @param dateString string representing a date in the supplied `dateFormat`
    * @param dateFormat format for the `dateString` supplied
    * @example
    * await expect(element(by.id('datePicker'))).toBeVisible();
    * await element(by.id('datePicker')).setDatePickerDate('2019-02-06T05:10:00-08:00', "yyyy-MM-dd'T'HH:mm:ssZZZZZ");
    */
  def setDatePickerDate(dateString: String, dateFormat: String): js.Promise[Unit] = js.native
  
  /**
    * Swipes in the provided direction at the provided speed, started from percentage.
    * @param speed default: `fast`
    * @param percentage screen percentage to swipe; valid input: `[0.0, 1.0]`
    * @param optional normalizedStartingPointX X coordinate of swipe starting point, relative to the view width; valid input: `[0.0, 1.0]`
    * @param normalizedStartingPointY Y coordinate of swipe starting point, relative to the view height; valid input: `[0.0, 1.0]`
    * @example await element(by.id('scrollView')).swipe('down');
    * @example await element(by.id('scrollView')).swipe('down', 'fast');
    * @example await element(by.id('scrollView')).swipe('down', 'fast', 0.5);
    * @example await element(by.id('scrollView')).swipe('down', 'fast', 0.5, 0.2);
    * @example await element(by.id('scrollView')).swipe('down', 'fast', 0.5, 0.2, 0.5);
    */
  def swipe(direction: Direction): js.Promise[Unit] = js.native
  def swipe(direction: Direction, speed: Unit, percentage: Double): js.Promise[Unit] = js.native
  def swipe(direction: Direction, speed: Unit, percentage: Double, normalizedStartingPointX: Double): js.Promise[Unit] = js.native
  def swipe(
    direction: Direction,
    speed: Unit,
    percentage: Double,
    normalizedStartingPointX: Double,
    normalizedStartingPointY: Double
  ): js.Promise[Unit] = js.native
  def swipe(
    direction: Direction,
    speed: Unit,
    percentage: Double,
    normalizedStartingPointX: Unit,
    normalizedStartingPointY: Double
  ): js.Promise[Unit] = js.native
  def swipe(direction: Direction, speed: Unit, percentage: Unit, normalizedStartingPointX: Double): js.Promise[Unit] = js.native
  def swipe(
    direction: Direction,
    speed: Unit,
    percentage: Unit,
    normalizedStartingPointX: Double,
    normalizedStartingPointY: Double
  ): js.Promise[Unit] = js.native
  def swipe(
    direction: Direction,
    speed: Unit,
    percentage: Unit,
    normalizedStartingPointX: Unit,
    normalizedStartingPointY: Double
  ): js.Promise[Unit] = js.native
  def swipe(direction: Direction, speed: Speed): js.Promise[Unit] = js.native
  def swipe(direction: Direction, speed: Speed, percentage: Double): js.Promise[Unit] = js.native
  def swipe(direction: Direction, speed: Speed, percentage: Double, normalizedStartingPointX: Double): js.Promise[Unit] = js.native
  def swipe(
    direction: Direction,
    speed: Speed,
    percentage: Double,
    normalizedStartingPointX: Double,
    normalizedStartingPointY: Double
  ): js.Promise[Unit] = js.native
  def swipe(
    direction: Direction,
    speed: Speed,
    percentage: Double,
    normalizedStartingPointX: Unit,
    normalizedStartingPointY: Double
  ): js.Promise[Unit] = js.native
  def swipe(direction: Direction, speed: Speed, percentage: Unit, normalizedStartingPointX: Double): js.Promise[Unit] = js.native
  def swipe(
    direction: Direction,
    speed: Speed,
    percentage: Unit,
    normalizedStartingPointX: Double,
    normalizedStartingPointY: Double
  ): js.Promise[Unit] = js.native
  def swipe(
    direction: Direction,
    speed: Speed,
    percentage: Unit,
    normalizedStartingPointX: Unit,
    normalizedStartingPointY: Double
  ): js.Promise[Unit] = js.native
  
  /**
    * Takes a screenshot of the element and schedules putting it in the artifacts folder upon completion of the current test.
    * For more information, see {@link https://wix.github.io/Detox/docs/api/screenshots#element-level-screenshots}
    * @param {string} name for the screenshot artifact
    * @returns {Promise<string>} a temporary path to the screenshot.
    * @example
    * test('Menu items should have logout', async () => {
    *   const imagePath = await element(by.id('menuRoot')).takeScreenshot('tap on menu');
    *   // The temporary path will remain valid until the test completion.
    *   // Afterwards, the screenshot will be moved, e.g.:
    *   // * on success, to: <artifacts-location>/✓ Menu items should have Logout/tap on menu.png
    *   // * on failure, to: <artifacts-location>/✗ Menu items should have Logout/tap on menu.png
    * });
    */
  def takeScreenshot(name: String): js.Promise[String] = js.native
  
  /**
    * Simulate tap on an element
    * @param point relative coordinates to the matched element (the element size could changes on different devices or even when changing the device font size)
    * @example await element(by.id('tappable')).tap();
    * @example await element(by.id('tappable')).tap({ x:5, y:10 });
    */
  def tap(): js.Promise[Unit] = js.native
  def tap(point: Point2D): js.Promise[Unit] = js.native
  
  /**
    * Simulate tap at a specific point on an element.
    * Note: The point coordinates are relative to the matched element and the element size could changes on different devices or even when changing the device font size.
    * @example await element(by.id('tappable')).tapAtPoint({ x:5, y:10 });
    * @deprecated Use `.tap()` instead.
    */
  def tapAtPoint(point: Point2D): js.Promise[Unit] = js.native
  
  /**
    * Taps the backspace key on the built-in keyboard.
    * @example await element(by.id('textField')).tapBackspaceKey();
    */
  def tapBackspaceKey(): js.Promise[Unit] = js.native
  
  /**
    * Taps the return key on the built-in keyboard.
    * @example await element(by.id('textField')).tapReturnKey();
    */
  def tapReturnKey(): js.Promise[Unit] = js.native
  
  /**
    * Use the builtin keyboard to type text into a text field.
    * @example await element(by.id('textField')).typeText('passcode');
    */
  def typeText(text: String): js.Promise[Unit] = js.native
}
