package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.CodesOfConductGetConductCodeParams
import typingsJapgolly.octokitRest.mod.Octokit.CodesOfConductGetConductCodeResponse
import typingsJapgolly.octokitRest.mod.Octokit.CodesOfConductGetForRepoParams
import typingsJapgolly.octokitRest.mod.Octokit.CodesOfConductGetForRepoResponse
import typingsJapgolly.octokitRest.mod.Octokit.CodesOfConductListConductCodesResponse
import typingsJapgolly.octokitRest.mod.Octokit.EmptyParams
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetConductCode extends js.Object {
  @JSName("getConductCode")
  var getConductCode_Original: Anon101 = js.native
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  @JSName("getForRepo")
  var getForRepo_Original: Anon102 = js.native
  @JSName("listConductCodes")
  var listConductCodes_Original: Anon103 = js.native
  def getConductCode(): js.Promise[Response[CodesOfConductGetConductCodeResponse]] = js.native
  def getConductCode(params: RequestOptions with CodesOfConductGetConductCodeParams): js.Promise[Response[CodesOfConductGetConductCodeResponse]] = js.native
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  def getForRepo(): js.Promise[Response[CodesOfConductGetForRepoResponse]] = js.native
  def getForRepo(params: RequestOptions with CodesOfConductGetForRepoParams): js.Promise[Response[CodesOfConductGetForRepoResponse]] = js.native
  def listConductCodes(): js.Promise[Response[CodesOfConductListConductCodesResponse]] = js.native
  def listConductCodes(params: RequestOptions with EmptyParams): js.Promise[Response[CodesOfConductListConductCodesResponse]] = js.native
}

