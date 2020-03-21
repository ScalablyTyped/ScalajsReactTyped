package typingsJapgolly.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBranchResult extends js.Object {
  /**
    *  Branch structure for an Amplify App. 
    */
  var branch: Branch = js.native
}

object DeleteBranchResult {
  @scala.inline
  def apply(branch: Branch): DeleteBranchResult = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBranchResult]
  }
}

