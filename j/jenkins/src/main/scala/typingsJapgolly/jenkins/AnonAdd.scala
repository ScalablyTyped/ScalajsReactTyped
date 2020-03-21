package typingsJapgolly.jenkins

import typingsJapgolly.jenkins.jenkinsStrings.list
import typingsJapgolly.jenkins.jenkinsStrings.my
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdd extends js.Object {
  def add(name: String, job: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def config(name: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def config(name: String, xml: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("create")
  def create_list(name: String, `type`: list, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  @JSName("create")
  def create_my(name: String, `type`: my, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def destroy(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def exists(name: String, callback: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]): Unit = js.native
  def get(name: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  def list(callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  def remove(name: String, job: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

