package typingsJapgolly.eggMock.mod

import typingsJapgolly.egg.mod.Application
import typingsJapgolly.egg.mod.Context
import typingsJapgolly.eggMock.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockApplication extends Application {
  /**
    * mock Context
    */
  def mockContext(): Context = js.native
  def mockContext(data: js.Any): Context = js.native
  def mockCookies(cookies: js.Any): MockApplication = js.native
  def mockHeaders(headers: js.Any): MockApplication = js.native
  def mockHttpclient(mockUrl: String, mockMethod: String, mockResult: AnonData): MockApplication = js.native
  def mockHttpclient(mockUrl: String, mockMethod: js.Array[String], mockResult: AnonData): MockApplication = js.native
  /**
    * Mock service
    */
  def mockService(service: String, methodName: String, fn: js.Any): MockApplication = js.native
  /**
    * mock service that return error
    */
  def mockServiceError(service: String, methodName: String): MockApplication = js.native
  def mockServiceError(service: String, methodName: String, err: js.Error): MockApplication = js.native
  /**
    * mock cookie session
    */
  def mockSession(data: js.Any): MockApplication = js.native
}

