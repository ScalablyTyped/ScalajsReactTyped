package typingsJapgolly.jenkins

import typingsJapgolly.jenkins.jenkinsStrings.list
import typingsJapgolly.jenkins.jenkinsStrings.my
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDestroy extends js.Object {
  def add(name: String, job: String): js.Promise[Unit] = js.native
  def config(name: String): js.Promise[_] = js.native
  def config(name: String, xml: String): js.Promise[_] = js.native
  @JSName("create")
  def create_list(name: String, `type`: list): js.Promise[Unit] = js.native
  @JSName("create")
  def create_my(name: String, `type`: my): js.Promise[Unit] = js.native
  def destroy(name: String): js.Promise[Unit] = js.native
  def exists(name: String): js.Promise[Boolean] = js.native
  def get(name: String): js.Promise[_] = js.native
  def list(): js.Promise[_] = js.native
  def remove(name: String, job: String): js.Promise[Unit] = js.native
}

