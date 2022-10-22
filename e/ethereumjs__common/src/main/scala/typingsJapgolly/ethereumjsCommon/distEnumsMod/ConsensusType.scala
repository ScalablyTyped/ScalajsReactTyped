package typingsJapgolly.ethereumjsCommon.distEnumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConsensusType extends StObject
@JSImport("@ethereumjs/common/dist/enums", "ConsensusType")
@js.native
object ConsensusType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConsensusType & String] = js.native
  
  @js.native
  sealed trait ProofOfAuthority
    extends StObject
       with ConsensusType
  /* "poa" */ val ProofOfAuthority: typingsJapgolly.ethereumjsCommon.distEnumsMod.ConsensusType.ProofOfAuthority & String = js.native
  
  @js.native
  sealed trait ProofOfStake
    extends StObject
       with ConsensusType
  /* "pos" */ val ProofOfStake: typingsJapgolly.ethereumjsCommon.distEnumsMod.ConsensusType.ProofOfStake & String = js.native
  
  @js.native
  sealed trait ProofOfWork
    extends StObject
       with ConsensusType
  /* "pow" */ val ProofOfWork: typingsJapgolly.ethereumjsCommon.distEnumsMod.ConsensusType.ProofOfWork & String = js.native
}
