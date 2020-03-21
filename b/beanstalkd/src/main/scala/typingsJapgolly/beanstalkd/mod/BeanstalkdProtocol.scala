package typingsJapgolly.beanstalkd.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdProtocol extends js.Object {
  def add(signature: String, key: String): Unit
  def addCommand(signature: String): Unit
  def addReply(signature: String): Unit
  def addType(key: String, `type`: js.Any): Unit
  def build(identifier: String, args: js.Array[_], key: String): Buffer
  def buildCommand(command: String, args: js.Array[_]): Buffer
  def buildPut(args: js.Array[_]): Buffer
  def buildreply(reply: String, args: js.Array[_]): Buffer
  def parse(buffer: Buffer, key: String): js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | BeanstalkdProtocolReply | Null]
  def parseCommand(buffer: Buffer): js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | Null]
  def parseReply(buffer: Buffer): js.Tuple2[Buffer | Null, BeanstalkdProtocolReply | Null]
  def reset(): Unit
}

object BeanstalkdProtocol {
  @scala.inline
  def apply(
    add: (String, String) => Callback,
    addCommand: String => Callback,
    addReply: String => Callback,
    addType: (String, js.Any) => Callback,
    build: (String, js.Array[js.Any], String) => CallbackTo[Buffer],
    buildCommand: (String, js.Array[js.Any]) => CallbackTo[Buffer],
    buildPut: js.Array[js.Any] => CallbackTo[Buffer],
    buildreply: (String, js.Array[js.Any]) => CallbackTo[Buffer],
    parse: (Buffer, String) => CallbackTo[
      js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | BeanstalkdProtocolReply | Null]
    ],
    parseCommand: Buffer => CallbackTo[js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | Null]],
    parseReply: Buffer => CallbackTo[js.Tuple2[Buffer | Null, BeanstalkdProtocolReply | Null]],
    reset: Callback
  ): BeanstalkdProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => add(t0, t1).runNow()))
    __obj.updateDynamic("addCommand")(js.Any.fromFunction1((t0: java.lang.String) => addCommand(t0).runNow()))
    __obj.updateDynamic("addReply")(js.Any.fromFunction1((t0: java.lang.String) => addReply(t0).runNow()))
    __obj.updateDynamic("addType")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => addType(t0, t1).runNow()))
    __obj.updateDynamic("build")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Array[js.Any], t2: java.lang.String) => build(t0, t1, t2).runNow()))
    __obj.updateDynamic("buildCommand")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => buildCommand(t0, t1).runNow()))
    __obj.updateDynamic("buildPut")(js.Any.fromFunction1((t0: js.Array[js.Any]) => buildPut(t0).runNow()))
    __obj.updateDynamic("buildreply")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => buildreply(t0, t1).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: typingsJapgolly.node.Buffer, t1: java.lang.String) => parse(t0, t1).runNow()))
    __obj.updateDynamic("parseCommand")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => parseCommand(t0).runNow()))
    __obj.updateDynamic("parseReply")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => parseReply(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[BeanstalkdProtocol]
  }
}

