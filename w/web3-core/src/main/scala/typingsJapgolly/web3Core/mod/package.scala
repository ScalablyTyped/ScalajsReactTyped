package typingsJapgolly.web3Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typingsJapgolly.bnJs.mod.^
    - / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigNumber * / js.Any
    - typingsJapgolly.web3Core.web3CoreStrings.latest
    - typingsJapgolly.web3Core.web3CoreStrings.pending
    - typingsJapgolly.web3Core.web3CoreStrings.earliest
    - typingsJapgolly.web3Core.web3CoreStrings.genesis
  */
  type BlockNumber = typingsJapgolly.web3Core.mod._BlockNumber | java.lang.String | scala.Double | typingsJapgolly.bnJs.mod.^  | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigNumber */ js.Any)
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.web3Core.mod.HttpProvider
    - typingsJapgolly.web3Core.mod.IpcProvider
    - typingsJapgolly.web3Core.mod.WebsocketProvider
    - java.lang.String
    - scala.Null
  */
  type provider = typingsJapgolly.web3Core.mod._provider | java.lang.String | scala.Null
}
