package typingsJapgolly.intercomClient.mod

import typingsJapgolly.intercomClient.AnonSegmentid
import typingsJapgolly.intercomClient.PartialCompany
import typingsJapgolly.intercomClient.companyMod.Company
import typingsJapgolly.intercomClient.companyMod.CompanyIdentifier
import typingsJapgolly.intercomClient.companyMod.List
import typingsJapgolly.intercomClient.scrollMod.Scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Companies")
@js.native
class Companies () extends js.Object {
  var scroll: Scroll[Company] = js.native
  def archive(): js.Promise[Company] = js.native
  def create(company: CompanyIdentifier with PartialCompany): js.Promise[ApiResponse[Company]] = js.native
  def create(company: CompanyIdentifier with PartialCompany, cb: callback[ApiResponse[Company]]): Unit = js.native
  def find(identifier: CompanyIdentifier): js.Promise[ApiResponse[Company]] = js.native
  def find(identifier: CompanyIdentifier, cb: callback[ApiResponse[Company]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: AnonSegmentid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: AnonSegmentid, cb: callback[ApiResponse[List]]): Unit = js.native
  def update(company: CompanyIdentifier with PartialCompany): js.Promise[ApiResponse[Company]] = js.native
  def update(company: CompanyIdentifier with PartialCompany, cb: callback[ApiResponse[Company]]): Unit = js.native
}

