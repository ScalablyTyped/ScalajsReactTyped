package typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VMValidationStatusCode extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatusCode")
@js.native
object VMValidationStatusCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMValidationStatusCode & Double] = js.native
  
  @js.native
  sealed trait EXCEEDEDMAXTRANSACTIONSIZE
    extends StObject
       with VMValidationStatusCode
  /* 10 */ val EXCEEDEDMAXTRANSACTIONSIZE: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.EXCEEDEDMAXTRANSACTIONSIZE & Double = js.native
  
  @js.native
  sealed trait GASUNITPRICEABOVEMAXBOUND
    extends StObject
       with VMValidationStatusCode
  /* 16 */ val GASUNITPRICEABOVEMAXBOUND: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.GASUNITPRICEABOVEMAXBOUND & Double = js.native
  
  @js.native
  sealed trait GASUNITPRICEBELOWMINBOUND
    extends StObject
       with VMValidationStatusCode
  /* 15 */ val GASUNITPRICEBELOWMINBOUND: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.GASUNITPRICEBELOWMINBOUND & Double = js.native
  
  @js.native
  sealed trait INSUFFICIENTBALANCEFORTRANSACTIONFEE
    extends StObject
       with VMValidationStatusCode
  /* 5 */ val INSUFFICIENTBALANCEFORTRANSACTIONFEE: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.INSUFFICIENTBALANCEFORTRANSACTIONFEE & Double = js.native
  
  @js.native
  sealed trait INVALIDAUTHKEY
    extends StObject
       with VMValidationStatusCode
  /* 2 */ val INVALIDAUTHKEY: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.INVALIDAUTHKEY & Double = js.native
  
  @js.native
  sealed trait INVALIDSIGNATURE
    extends StObject
       with VMValidationStatusCode
  /* 1 */ val INVALIDSIGNATURE: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.INVALIDSIGNATURE & Double = js.native
  
  @js.native
  sealed trait INVALIDWRITESET
    extends StObject
       with VMValidationStatusCode
  /* 9 */ val INVALIDWRITESET: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.INVALIDWRITESET & Double = js.native
  
  @js.native
  sealed trait MAXGASUNITSBELOWMINTRANSACTIONGASUNITS
    extends StObject
       with VMValidationStatusCode
  /* 14 */ val MAXGASUNITSBELOWMINTRANSACTIONGASUNITS: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.MAXGASUNITSBELOWMINTRANSACTIONGASUNITS & Double = js.native
  
  @js.native
  sealed trait MAXGASUNITSEXCEEDSMAXGASUNITSBOUND
    extends StObject
       with VMValidationStatusCode
  /* 13 */ val MAXGASUNITSEXCEEDSMAXGASUNITSBOUND: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.MAXGASUNITSEXCEEDSMAXGASUNITSBOUND & Double = js.native
  
  @js.native
  sealed trait REJECTEDWRITESET
    extends StObject
       with VMValidationStatusCode
  /* 8 */ val REJECTEDWRITESET: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.REJECTEDWRITESET & Double = js.native
  
  @js.native
  sealed trait SENDINGACCOUNTDOESNOTEXIST
    extends StObject
       with VMValidationStatusCode
  /* 7 */ val SENDINGACCOUNTDOESNOTEXIST: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.SENDINGACCOUNTDOESNOTEXIST & Double = js.native
  
  @js.native
  sealed trait SEQUENCENUMBERTOONEW
    extends StObject
       with VMValidationStatusCode
  /* 4 */ val SEQUENCENUMBERTOONEW: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.SEQUENCENUMBERTOONEW & Double = js.native
  
  @js.native
  sealed trait SEQUENCENUMBERTOOOLD
    extends StObject
       with VMValidationStatusCode
  /* 3 */ val SEQUENCENUMBERTOOOLD: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.SEQUENCENUMBERTOOOLD & Double = js.native
  
  @js.native
  sealed trait TRANSACTIONEXPIRED
    extends StObject
       with VMValidationStatusCode
  /* 6 */ val TRANSACTIONEXPIRED: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.TRANSACTIONEXPIRED & Double = js.native
  
  @js.native
  sealed trait UNKNOWNMODULE
    extends StObject
       with VMValidationStatusCode
  /* 12 */ val UNKNOWNMODULE: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.UNKNOWNMODULE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNSCRIPT
    extends StObject
       with VMValidationStatusCode
  /* 11 */ val UNKNOWNSCRIPT: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.UNKNOWNSCRIPT & Double = js.native
  
  @js.native
  sealed trait UNKNOWNVALIDATIONSTATUS
    extends StObject
       with VMValidationStatusCode
  /* 0 */ val UNKNOWNVALIDATIONSTATUS: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatusCode.UNKNOWNVALIDATIONSTATUS & Double = js.native
}
