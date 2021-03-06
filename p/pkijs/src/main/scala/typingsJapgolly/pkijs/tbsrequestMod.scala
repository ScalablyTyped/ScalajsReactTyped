package typingsJapgolly.pkijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/TBSRequest", JSImport.Namespace)
@js.native
object tbsrequestMod extends js.Object {
  @js.native
  trait TBSRequest extends js.Object {
    var requestExtensions: js.UndefOr[typingsJapgolly.pkijs.extensionMod.default] = js.native
    var requestList: js.Array[typingsJapgolly.pkijs.requestMod.default] = js.native
    var requestorName: js.UndefOr[typingsJapgolly.pkijs.generalNameMod.default] = js.native
    var tbs: scala.scalajs.js.typedarray.ArrayBuffer = js.native
    var version: js.UndefOr[Double] = js.native
    def fromSchema(schema: js.Any): Unit = js.native
    def toJSON(): js.Any = js.native
    /**
      * Convert current object to asn1js object and set correct values
      * 
      * @param {boolean} [encodeFlag]
      * @returns {*}
      */
    def toSchema(): js.Any = js.native
    def toSchema(encodeFlag: Boolean): js.Any = js.native
  }
  
  @js.native
  class default () extends TBSRequest {
    def this(params: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    def defaultValues(memberName: String): js.Any = js.native
    def schema(): js.Any = js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
}

