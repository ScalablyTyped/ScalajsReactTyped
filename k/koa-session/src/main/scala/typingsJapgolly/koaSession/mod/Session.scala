package typingsJapgolly.koaSession.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.koaSession.koaSessionStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Session model.
  */
trait Session
  extends /**
  * allow to put any value on session object
  */
/* _ */ StringDictionary[js.Any] {
  /**
    * Return how many values there are in the session object.
    * Used to see if it"s "populated".
    */
  val length: Double
  /**
    * get/set session maxAge
    */
  var maxAge: js.UndefOr[Double | session] = js.undefined
  /**
    * populated flag, which is just a boolean alias of .length.
    */
  val populated: Boolean
  /**
    * alias to `toJSON`
    */
  def inspect(): js.Object
  /**
    * save this session no matter whether it is populated
    */
  def save(): Unit
  /**
    * JSON representation of the session.
    */
  def toJSON(): js.Object
}

object Session {
  @scala.inline
  def apply(
    inspect: CallbackTo[js.Object],
    length: Double,
    populated: Boolean,
    save: Callback,
    toJSON: CallbackTo[js.Object],
    StringDictionary: /**
    * allow to put any value on session object
    */
  /* _ */ StringDictionary[js.Any] = null,
    maxAge: Double | session = null
  ): Session = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], populated = populated.asInstanceOf[js.Any])
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.updateDynamic("save")(save.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

