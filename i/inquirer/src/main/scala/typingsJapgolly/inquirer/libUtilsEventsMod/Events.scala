package typingsJapgolly.inquirer.libUtilsEventsMod

import typingsJapgolly.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of events.
  */
trait Events extends js.Object {
  /**
    * The event-flow of the `aKey`-event.
    */
  var aKey: Observable[KeyDescriptor]
  /**
    * The event-flow of the `iKey`-event.
    */
  var iKey: Observable[KeyDescriptor]
  /**
    * The event-flow of the `keypress`-event of the readline-object.
    */
  var keypress: Observable[KeyDescriptor]
  /**
    * The event-flow of the `line`-event of the readline-object.
    */
  var line: Observable[String]
  /**
    * The event-flow of the `normalizedDownKey`-event.
    */
  var normalizedDownKey: Observable[KeyDescriptor]
  /**
    * The event-flow of the `normalizedUpKey`-event.
    */
  var normalizedUpKey: Observable[KeyDescriptor]
  /**
    * The event-flow of the `numberKey`-event.
    */
  var numberKey: Observable[KeyDescriptor]
  /**
    * The event-flow of the `spaceKey`-event.
    */
  var spaceKey: Observable[KeyDescriptor]
}

object Events {
  @scala.inline
  def apply(
    aKey: Observable[KeyDescriptor],
    iKey: Observable[KeyDescriptor],
    keypress: Observable[KeyDescriptor],
    line: Observable[String],
    normalizedDownKey: Observable[KeyDescriptor],
    normalizedUpKey: Observable[KeyDescriptor],
    numberKey: Observable[KeyDescriptor],
    spaceKey: Observable[KeyDescriptor]
  ): Events = {
    val __obj = js.Dynamic.literal(aKey = aKey.asInstanceOf[js.Any], iKey = iKey.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], normalizedDownKey = normalizedDownKey.asInstanceOf[js.Any], normalizedUpKey = normalizedUpKey.asInstanceOf[js.Any], numberKey = numberKey.asInstanceOf[js.Any], spaceKey = spaceKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Events]
  }
}

