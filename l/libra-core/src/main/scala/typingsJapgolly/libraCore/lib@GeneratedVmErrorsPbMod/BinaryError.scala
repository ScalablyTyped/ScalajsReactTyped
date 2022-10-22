package typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinaryError extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "BinaryError")
@js.native
object BinaryError extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinaryError & Double] = js.native
  
  @js.native
  sealed trait BADHEADERTABLE
    extends StObject
       with BinaryError
  /* 8 */ val BADHEADERTABLE: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.BinaryError.BADHEADERTABLE & Double = js.native
  
  @js.native
  sealed trait BADMAGIC
    extends StObject
       with BinaryError
  /* 2 */ val BADMAGIC: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.BinaryError.BADMAGIC & Double = js.native
  
  @js.native
  sealed trait DUPLICATETABLE
    extends StObject
       with BinaryError
  /* 10 */ val DUPLICATETABLE: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.BinaryError.DUPLICATETABLE & Double = js.native
  
  @js.native
  sealed trait MALFORMED
    extends StObject
       with BinaryError
  /* 1 */ val MALFORMED: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.BinaryError.MALFORMED & Double = js.native
  
  @js.native
  sealed trait UNEXPECTEDSIGNATURETYPE
    extends StObject
       with BinaryError
  /* 9 */ val UNEXPECTEDSIGNATURETYPE: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.BinaryError.UNEXPECTEDSIGNATURETYPE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNBINARYERROR
    extends StObject
       with BinaryError
  /* 0 */ val UNKNOWNBINARYERROR: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.BinaryError.UNKNOWNBINARYERROR & Double = js.native
  
  @js.native
  sealed trait UNKNOWNOPCODE
    extends StObject
       with BinaryError
  /* 7 */ val UNKNOWNOPCODE: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.BinaryError.UNKNOWNOPCODE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNSERIALIZEDTYPE
    extends StObject
       with BinaryError
  /* 6 */ val UNKNOWNSERIALIZEDTYPE: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.BinaryError.UNKNOWNSERIALIZEDTYPE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNSIGNATURETYPE
    extends StObject
       with BinaryError
  /* 5 */ val UNKNOWNSIGNATURETYPE: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.BinaryError.UNKNOWNSIGNATURETYPE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNTABLETYPE
    extends StObject
       with BinaryError
  /* 4 */ val UNKNOWNTABLETYPE: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.BinaryError.UNKNOWNTABLETYPE & Double = js.native
  
  @js.native
  sealed trait UNKNOWNVERSION
    extends StObject
       with BinaryError
  /* 3 */ val UNKNOWNVERSION: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.BinaryError.UNKNOWNVERSION & Double = js.native
}
