package typingsJapgolly.jenkins.mod

import typingsJapgolly.jenkins.AnonBaseUrl
import typingsJapgolly.jenkins.AnonCrumbIssuer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jenkins", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): JenkinsAPI = js.native
  def apply(opts: AnonBaseUrl): JenkinsAPI = js.native
  def apply(opts: AnonCrumbIssuer): JenkinsPromisifiedAPI = js.native
}

