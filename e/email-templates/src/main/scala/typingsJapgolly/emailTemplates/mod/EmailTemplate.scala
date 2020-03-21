package typingsJapgolly.emailTemplates.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplate[T] extends js.Object {
  /**
    *   shorthand use of `juiceResources` with the config
    *   mainly for custom renders like from a database).
    */
  def juiceResources(html: String): js.Promise[String]
  /**
    *
    * @param view The Html pug to render
    * @param locals The template Variables
    */
  def render(view: String, locals: T): js.Promise[String]
  /**
    * Send the Email
    */
  def send(options: EmailOptions[T]): js.Any
}

object EmailTemplate {
  @scala.inline
  def apply[T](
    juiceResources: String => CallbackTo[js.Promise[String]],
    render: (String, T) => CallbackTo[js.Promise[String]],
    send: EmailOptions[T] => CallbackTo[js.Any]
  ): EmailTemplate[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("juiceResources")(js.Any.fromFunction1((t0: java.lang.String) => juiceResources(t0).runNow()))
    __obj.updateDynamic("render")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => render(t0, t1).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: typingsJapgolly.emailTemplates.mod.EmailOptions[T]) => send(t0).runNow()))
    __obj.asInstanceOf[EmailTemplate[T]]
  }
}

