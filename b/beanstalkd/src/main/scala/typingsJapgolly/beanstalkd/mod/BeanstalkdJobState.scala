package typingsJapgolly.beanstalkd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.beanstalkd.beanstalkdStrings.ready
  - typingsJapgolly.beanstalkd.beanstalkdStrings.delayed
  - typingsJapgolly.beanstalkd.beanstalkdStrings.reserved
  - typingsJapgolly.beanstalkd.beanstalkdStrings.buried
*/
trait BeanstalkdJobState extends js.Object

object BeanstalkdJobState {
  @scala.inline
  def buried: typingsJapgolly.beanstalkd.beanstalkdStrings.buried = this.cast("buried")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delayed: typingsJapgolly.beanstalkd.beanstalkdStrings.delayed = this.cast("delayed")
  @scala.inline
  def ready: typingsJapgolly.beanstalkd.beanstalkdStrings.ready = this.cast("ready")
  @scala.inline
  def reserved: typingsJapgolly.beanstalkd.beanstalkdStrings.reserved = this.cast("reserved")
}

