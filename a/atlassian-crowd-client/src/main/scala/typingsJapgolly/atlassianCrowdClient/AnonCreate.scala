package typingsJapgolly.atlassianCrowdClient

import typingsJapgolly.atlassianCrowdClient.sessionMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreate extends js.Object {
  def create(username: String, password: String): js.Promise[^] = js.native
  def create(
    username: String,
    password: String,
    validationFactors: typingsJapgolly.atlassianCrowdClient.validationFactorsMod.^
  ): js.Promise[^] = js.native
  def create(
    username: String,
    password: String,
    validationFactors: typingsJapgolly.atlassianCrowdClient.validationFactorsMod.^,
    duration: Double
  ): js.Promise[^] = js.native
  def createUnvalidated(username: String): js.Promise[^] = js.native
  def createUnvalidated(username: String, validationFactors: typingsJapgolly.atlassianCrowdClient.validationFactorsMod.^): js.Promise[^] = js.native
  def createUnvalidated(
    username: String,
    validationFactors: typingsJapgolly.atlassianCrowdClient.validationFactorsMod.^,
    duration: Double
  ): js.Promise[^] = js.native
  def getUser(token: String): js.Promise[typingsJapgolly.atlassianCrowdClient.userMod.^] = js.native
  def remove(token: String): js.Promise[Unit] = js.native
  def removeAll(username: String): js.Promise[Unit] = js.native
  def removeAll(username: String, exclude: String): js.Promise[Unit] = js.native
  def validate(token: String): js.Promise[^] = js.native
  def validate(token: String, validationFactors: typingsJapgolly.atlassianCrowdClient.validationFactorsMod.^): js.Promise[^] = js.native
}

